package com.example.reseau_social_ecole.ui.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.reseau_social_ecole.R;

public class ConditionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conditions);

        final ImageView back = findViewById(R.id.b_backCond);

        back.setOnClickListener((View v) -> {
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
        });
    }


}