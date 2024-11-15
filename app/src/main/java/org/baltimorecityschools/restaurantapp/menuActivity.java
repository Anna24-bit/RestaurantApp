package org.baltimorecityschools.restaurantapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;

public class menuActivity extends MainActivity2 {
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
        OrderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                quantity=Integer.parseInt(quantityet.getText().toString());

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

                subTote=Norder.getPrice();
                Subnumtv.setText(String.valueOf(subTote));

            }

        });



    }
}

