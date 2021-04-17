package com.example.reseau_social_ecole.ui.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.reseau_social_ecole.R;

public class AddContactActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_contact);


        final ImageView back = findViewById(R.id.b_backContact);


        back.setOnClickListener((View v) -> {
            Intent intent = new Intent(this, ContactsActivity.class);
            startActivity(intent);
        });

    }

    public void showPopUp() {
        PopUp popUp = new PopUp("Demande d'ami(e)","Demande envoyée!");
        popUp.show(getSupportFragmentManager(), "popUp");
    }
}