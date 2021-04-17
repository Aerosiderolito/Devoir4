package com.example.reseau_social_ecole.ui.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.reseau_social_ecole.R;

public class ChatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        final ImageView back = findViewById(R.id.b_backMessages);

        back.setOnClickListener((View v) -> {
            Intent intent = new Intent(this, MessageActivity.class);
            startActivity(intent);
        });
    }


    /*public void showPopUp() {
        PopUp popUp = new PopUp("Demande d'ami(e)", "Demande envoyée");
        popUp.show(getSupportFragmentManager(), "popUp");
    }*/
}
