package com.example.CONNECTadora.ui.CONNECTadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.CONNECTadora.R;

public class PassForgotActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pass_forgot);
        final Button confirmer = findViewById(R.id.b_confirm);

        final ImageView back = findViewById(R.id.b_backCond);

        back.setOnClickListener((View v) -> {

            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);

        });

        confirmer.setOnClickListener((View v) -> {

            showPopUp();

        });
    }

    public void showPopUp() {

        PopUp popUp = new PopUp("Confirmation", "Youppi votre mot de passe temporaire" +
                " est envoyé par sms sur votre numéro de téléphone.");
        popUp.show(getSupportFragmentManager(), "popUp");

    }
}