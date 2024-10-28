package org.baltimorecityschools.restaurantapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    CheckBox check1;
    CheckBox check2;
    CheckBox check3;
    CheckBox check4;
    CheckBox check5;

    CheckBox check11;
    CheckBox check22;
    CheckBox check33;
    CheckBox check44;
    CheckBox check55;

    Toast myToast;
    String toastMsg;
    int duration;


    Intent welcomeTopg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

        check1=findViewById(R.id.checkone);
        check2=findViewById(R.id.checktoo);
        check3=findViewById(R.id.checkthri);
        check4=findViewById(R.id.checkfor);
        check5=findViewById(R.id.checkfiv);

        check11=findViewById(R.id.checko);
        check22=findViewById(R.id.checkto);
        check33=findViewById(R.id.checkthr);
        check44=findViewById(R.id.checkfo);
        check55=findViewById(R.id.checkfi);


        toastMsg="checked order";
        duration=0;

        welcomeTopg=getIntent();


        check1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toastMsg="checked order";
                duration= Toast.LENGTH_SHORT;
                myToast=Toast.makeText(MainActivity2.this,toastMsg,duration);
                myToast.show();
            }
        });

        check1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toastMsg="checked order";
                duration= Toast.LENGTH_SHORT;
                myToast=Toast.makeText(MainActivity2.this,toastMsg,duration);
                myToast.show();
            }
        });

        check2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toastMsg="checked order";
                duration= Toast.LENGTH_SHORT;
                myToast=Toast.makeText(MainActivity2.this,toastMsg,duration);
                myToast.show();
            }
        });

        check3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toastMsg="checked order";
                duration= Toast.LENGTH_SHORT;
                myToast=Toast.makeText(MainActivity2.this,toastMsg,duration);
                myToast.show();
            }
        });


        check4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toastMsg="checked order";
                duration= Toast.LENGTH_SHORT;
                myToast=Toast.makeText(MainActivity2.this,toastMsg,duration);
                myToast.show();
            }
        });

        check5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toastMsg="checked order";
                duration= Toast.LENGTH_SHORT;
                myToast=Toast.makeText(MainActivity2.this,toastMsg,duration);
                myToast.show();
            }
        });

// part two


        check11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toastMsg="checked order";
                duration= Toast.LENGTH_SHORT;
                myToast=Toast.makeText(MainActivity2.this,toastMsg,duration);
                myToast.show();
            }
        });

        check22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toastMsg="checked order";
                duration= Toast.LENGTH_SHORT;
                myToast=Toast.makeText(MainActivity2.this,toastMsg,duration);
                myToast.show();
            }
        });

        check33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toastMsg="checked order";
                duration= Toast.LENGTH_SHORT;
                myToast=Toast.makeText(MainActivity2.this,toastMsg,duration);
                myToast.show();
            }
        });


        check44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toastMsg="checked order";
                duration= Toast.LENGTH_SHORT;
                myToast=Toast.makeText(MainActivity2.this,toastMsg,duration);
                myToast.show();
            }
        });

        check55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toastMsg="checked order";
                duration= Toast.LENGTH_SHORT;
                myToast=Toast.makeText(MainActivity2.this,toastMsg,duration);
                myToast.show();
            }
        });



    }
}