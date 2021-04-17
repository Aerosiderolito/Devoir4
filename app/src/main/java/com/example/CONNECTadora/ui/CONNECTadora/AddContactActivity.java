package com.example.CONNECTadora.ui.CONNECTadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.CONNECTadora.R;

public class AddContactActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_contact);

        final Button ajout = findViewById(R.id.b_ajout);
        final ImageView back = findViewById(R.id.b_backContact);

        ajout.setOnClickListener((View v) -> {
            showPopUp();
        });

        back.setOnClickListener((View v) -> {
            Intent intent = new Intent(this, ContactsActivity.class);
            startActivity(intent);
        });
    }

    public void showPopUp() {
        PopUp popUp = new PopUp("Confirmation","Contact ajouté.");
        popUp.show(getSupportFragmentManager(), "popUp");
    }
}