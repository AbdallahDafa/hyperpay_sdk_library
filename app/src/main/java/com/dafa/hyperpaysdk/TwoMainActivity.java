package com.dafa.hyperpaysdk;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.oppwa.mobile.connect.provider.Connect;

public class TwoMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView myTestText   = findViewById(R.id.myTestText);
        myTestText.setText( "hyperpay Connect: " + Connect.ProviderMode.LIVE );
    }
}