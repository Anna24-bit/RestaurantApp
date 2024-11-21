package org.baltimorecityschools.restaurantapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;

public class menuActivity extends MainActivity2 {
    Button sendtote;
    Toast helper;
    Ndole Norder;
    EditText quantityet;
    int quantity;

    RadioButton chickenrb;
    RadioButton Shrimprb;
    RadioButton Beefrb;
    String protein;

    Button OrderButton;

    RadioButton cassavarb;
    RadioButton plantainrb;
    RadioButton bobolorb;
    String sides;

    double subTote;
    TextView Subnumtv;
    TextView Taxtnumtv;
    TextView Totenumtv;
    public static final double TAX_RATE= 0.06;
    double tax;
    double total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_activity);

        subTote=0.0;
        quantityet=findViewById(R.id.quant);
        chickenrb=findViewById(R.id.radio_chick);
        Shrimprb=findViewById(R.id.radio_shrim);
        Beefrb=findViewById(R.id.radio_beef);
        cassavarb=findViewById(R.id.radio_cass);
        plantainrb=findViewById(R.id.radio_plan);
        bobolorb=findViewById(R.id.radio_bob);
        OrderButton=findViewById(R.id.adOrd);
        Subnumtv=findViewById(R.id.sub);
        Taxtnumtv=findViewById(R.id.tax);
        Totenumtv=findViewById(R.id.tote);
        tax=0.0;
        total=0.0;
        sendtote=findViewById(R.id.sendTote);


        OrderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (quantityet.getText().toString().equals("")){
                    duration= Toast.LENGTH_SHORT;
                    myToast=Toast.makeText(menuActivity.this,getString(R.string.myString),duration);
                    myToast.show();
                }else {
                    quantity=Integer.parseInt(quantityet.getText().toString());
                }

                if(chickenrb.isChecked()){
                    protein ="chicken";

                }else if(Shrimprb.isChecked()){
                    protein="shrimp";


                }else if(Beefrb.isChecked()){
                    protein="beef";

                }else{
                    protein="nothing";
                }

                if(cassavarb.isChecked()){
                    sides ="Cassava";

                }else if(plantainrb.isChecked()){
                    sides="plantains";


                }else if(bobolorb.isChecked()){
                    sides="bobolo";

                }else{
                    sides="nothing";
                }

                Norder= new Ndole(protein,sides,quantity);

                subTote+=Norder.getPrice();
                Subnumtv.setText(String.valueOf(subTote));

                tax=TAX_RATE * subTote;
                Taxtnumtv.setText(String.valueOf(tax));

                total= subTote + tax;
                Totenumtv.setText(String.valueOf(total));



            }

        });

        sendtote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] addresses = new String[] {getString(R.string.stringaddress)};
                String subject = "total order";
                String body= "Your total is " + total ;
                composeEmail(addresses, subject,body);
            }
        });

    }

    private void composeEmail(String[] addresses, String subject, String body) {
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // Only email apps handle this.
        intent.putExtra(Intent.EXTRA_EMAIL, addresses);
        intent.putExtra(Intent.EXTRA_SUBJECT, subject);
        intent.putExtra(Intent.EXTRA_TEXT,body);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }


}

