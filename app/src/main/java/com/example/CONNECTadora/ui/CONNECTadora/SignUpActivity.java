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

        backButon.setOnClickListener((View v) -> {
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
        });

        inscript.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopUp();
            }
        });

    }
    public void showPopUp(){
        PopUp popUp = new PopUp("Confirmation", "Inscription réussi");
        popUp.show(getSupportFragmentManager(), "popUp");
    }
}