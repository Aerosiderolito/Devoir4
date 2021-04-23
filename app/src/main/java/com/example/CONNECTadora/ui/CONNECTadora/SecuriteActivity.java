package com.example.CONNECTadora.ui.CONNECTadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.CONNECTadora.R;

public class SecuriteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_securite);

        final Button send = findViewById(R.id.b_confirm3);
        final ImageView back = findViewById(R.id.b_backParam);

        back.setOnClickListener((View v) -> {
            this.finish();

        });

        send.setOnClickListener((View v) -> {
            showPopUp();

        });
    }

    public void showPopUp() {
        PopUp popUp = new PopUp("Confirmation", "Youppi votre mot de passe est changé"+"\nVeuillez cliquer sur \"OK\"" +
                "et retour à la page précédente par la flèche en haut et gauche.");
        popUp.show(getSupportFragmentManager(), "popUp");
    }
}