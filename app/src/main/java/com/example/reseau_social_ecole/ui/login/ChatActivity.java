package com.example.reseau_social_ecole.ui.login;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.ImageView;

import com.example.reseau_social_ecole.R;
import com.google.android.material.textfield.TextInputEditText;

public class ChatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        final ImageView back = findViewById(R.id.b_backMessages);
        final Button send = findViewById(R.id.b_send);
        final TextInputEditText champTexte = findViewById(R.id.champ_input);



        back.setOnClickListener((View v) -> {
            Intent intent = new Intent(this, MessageActivity.class);
            startActivity(intent);
        });

        send.setOnClickListener((View v) -> {
            cacher(this);

            champTexte.setText("");

        });








    }

    // FROM STACK OVERFLOW
    public static void cacher(Activity activity) {
        InputMethodManager in = (InputMethodManager) activity.getSystemService(Activity.INPUT_METHOD_SERVICE);
        //prendre la fenetre adequate
        View vue = activity.getCurrentFocus();
        // si aucune créer une nouvelle
        if (vue == null) {
            vue = new View(activity);
        }
        in.hideSoftInputFromWindow(vue.getWindowToken(), 0);
    }


    /*public void showPopUp() {
        PopUp popUp = new PopUp("Demande d'ami(e)", "Demande envoyée");
        popUp.show(getSupportFragmentManager(), "popUp");
    }*/
}
