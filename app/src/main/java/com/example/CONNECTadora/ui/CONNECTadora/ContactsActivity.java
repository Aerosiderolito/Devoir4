package com.example.CONNECTadora.ui.CONNECTadora;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.CONNECTadora.R;

public class ContactsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);

        final Button iconSearch = findViewById(R.id.b_ic_param);
        final Button iconFriends = findViewById(R.id.b_ic_contacts);
        final Button iconMessage = findViewById(R.id.b_ic_messages);
        final ImageView add = findViewById(R.id.add);
        final ImageView msg1 = findViewById(R.id.msg1);
        final ImageView msg2 = findViewById(R.id.msg2);
        final ImageView msg3 = findViewById(R.id.msg3);
        final ImageView msg4 = findViewById(R.id.msg4);

        msg1.setOnClickListener((View v) -> {
            Intent intent = new Intent(this, ChatActivity.class);
            startActivity(intent);
        });

        msg2.setOnClickListener((View v) -> {
            Intent intent = new Intent(this, ChatActivity.class);
            startActivity(intent);
        });

        msg3.setOnClickListener((View v) -> {
            Intent intent = new Intent(this, ChatActivity.class);
            startActivity(intent);
        });

        msg4.setOnClickListener((View v) -> {
            Intent intent = new Intent(this, ChatActivity.class);
            startActivity(intent);
        });

        add.setOnClickListener((View v) -> {
            Intent intent = new Intent(this, AddContactActivity.class);
            startActivity(intent);
        });

        iconSearch.setOnClickListener((View v) -> {
            Intent intent = new Intent(this, ParametresActivity.class);
            startActivity(intent);
        });

        iconMessage.setOnClickListener((View v) -> {
            Intent intent = new Intent(this, MessageActivity.class);
            startActivity(intent);
        });

        iconFriends.setOnClickListener((View v) -> {
            Intent intent = new Intent(this, ContactsActivity.class);
            startActivity(intent);
        });
    }
}
