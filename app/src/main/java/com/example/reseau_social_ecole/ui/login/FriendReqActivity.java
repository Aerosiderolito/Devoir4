package com.example.reseau_social_ecole.ui.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.reseau_social_ecole.R;

public class FriendReqActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friend_req);

        final Button iconSearch = findViewById(R.id.b_ic_search);
        final Button iconFriends = findViewById(R.id.b_ic_friends);
        final ImageButton iconAcc = findViewById(R.id.b_account);

        iconSearch.setOnClickListener((View v) -> {
            Intent intent = new Intent(this, ParametresActivity.class);
            startActivity(intent);
        });

        iconFriends.setOnClickListener((View v) -> {
            Intent intent = new Intent(this, FriendsActivity.class);
            startActivity(intent);
        });

        iconAcc.setOnClickListener((View v) -> {
            Intent intent = new Intent(this, ProfileActivity.class);
            startActivity(intent);
        });



    }
}