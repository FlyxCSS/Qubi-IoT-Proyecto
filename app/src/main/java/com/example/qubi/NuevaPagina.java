package com.example.qubi;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class NuevaPagina extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Asigna el layout de tu home page
        setContentView(R.layout.home_page);
    }
}
