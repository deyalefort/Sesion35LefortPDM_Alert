package com.example.sesion35lefortpdm_alert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnProd1, btnProd2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnProd1 =  findViewById(R.id.btnProducto1);
        btnProd2 =  findViewById(R.id.btnProducto2);

        btnProd1.setOnClickListener(new OnClickListenerModal());
        btnProd2.setOnClickListener(new OnClickListenerModal2());
    }
}