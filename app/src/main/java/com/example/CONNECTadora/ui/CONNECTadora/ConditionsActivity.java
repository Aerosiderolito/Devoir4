package com.example.CONNECTadora.ui.CONNECTadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.CONNECTadora.R;

public class ConditionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conditions);

        final ImageView back = findViewById(R.id.b_backCond);

        back.setOnClickListener((View v) -> {
            this.finish();
        });
    }
}