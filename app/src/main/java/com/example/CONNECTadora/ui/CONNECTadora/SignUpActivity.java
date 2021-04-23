package com.example.CONNECTadora.ui.CONNECTadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.CONNECTadora.R;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        final ImageView backButon = findViewById(R.id.b_backCond);

        final Button inscript = findViewById(R.id.b_signup);

        final Button condition = findViewById(R.id.b_condition);

        condition.setOnClickListener((View v) -> {
            Intent intent = new Intent(this, ConditionsActivity.class);
            startActivity(intent);
        });

        backButon.setOnClickListener((View v) -> {
            this.finish();
        });

        inscript.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopUp();
            }
        });
    }




    public void showPopUp(){
        PopUp popUp = new PopUp("Confirmation", "Inscription réussi"+"\nVeuillez cliquer sur \"OK\"" +
                "et retour à la page précédente par la flèche en haut et gauche.");
        popUp.show(getSupportFragmentManager(), "popUp");
    }
}