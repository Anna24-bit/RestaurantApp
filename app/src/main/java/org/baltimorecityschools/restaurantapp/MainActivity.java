package org.baltimorecityschools.restaurantapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class MainActivity extends AppCompatActivity {
    TextView tiTV;
    TextView intrTV;
    TextView hrTV;
    EditText UserET;
    Button nextBN;
    Intent goTopge;
    Button phoneApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);




        // inflated variables
        tiTV=findViewById(R.id.txtv);
        intrTV=findViewById(R.id.introtxt);
        hrTV=findViewById(R.id.hrinfotxt);
        UserET=findViewById(R.id.username);
        nextBN=findViewById(R.id.nxtbtn);
        phoneApp=findViewById(R.id.phbtn);

        nextBN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goTopge=new Intent(MainActivity.this, MainActivity2.class);
                startActivity(goTopge);
            }
        });


        phoneApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialPhoneNumber("443-224-3852");
            }
        });

    }

    public void dialPhoneNumber(String phoneNumber) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + phoneNumber));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }


}