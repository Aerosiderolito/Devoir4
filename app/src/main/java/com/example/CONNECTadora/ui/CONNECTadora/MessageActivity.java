package com.example.CONNECTadora.ui.CONNECTadora;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.CONNECTadora.R;



public class MessageActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_messages);

        final Button addConversation = findViewById(R.id.b_add);
        final Button iconSearch = findViewById(R.id.b_ic_param);
        final Button iconFriends = findViewById(R.id.b_ic_contacts);
        final Button iconMessage = findViewById(R.id.b_ic_messages);

        final Button button2 = findViewById(R.id.button2);
        final Button button3 = findViewById(R.id.button3);
        final Button button5 = findViewById(R.id.button5);

        button2.setOnClickListener((View v) -> {
            Intent intent = new Intent(this, ChatActivity.class);
            startActivity(intent);
        });
        button3.setOnClickListener((View v) -> {
            Intent intent = new Intent(this, ChatActivity.class);
            startActivity(intent);
        });
        button5.setOnClickListener((View v) -> {
            Intent intent = new Intent(this, ChatActivity.class);
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

        addConversation.setOnClickListener((View v) -> {
            Intent intent = new Intent(this, ChatActivity.class);
            startActivity(intent);
        });
    }
}
