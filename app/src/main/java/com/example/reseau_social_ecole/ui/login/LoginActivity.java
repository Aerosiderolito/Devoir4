package  com.example.reseau_social_ecole.ui.login;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;

import com.example.reseau_social_ecole.R;

public class LoginActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final Button condition = findViewById(R.id.b_condition);
        final Button loginButton = findViewById(R.id.b_login);
        final Button createButton = findViewById(R.id.b_connexion);
        final Button forgetButton = findViewById(R.id.b_forgetPass);
        final Button aide = findViewById(R.id.b_aide);

        condition.setOnClickListener((View v) -> {
            Intent intent = new Intent(this, ConditionsActivity.class);
            startActivity(intent);
        });

        aide.setOnClickListener((View v) -> {
            Intent intent = new Intent(this, AideActivity.class);
            startActivity(intent);
        });

        loginButton.setOnClickListener((View v) -> {
                Intent intent = new Intent(this, ChatActivity.class);
                startActivity(intent);
        });

        createButton.setOnClickListener((View v) -> {
            Intent intent = new Intent(this, SignUpActivity.class);
            startActivity(intent);
        });

        forgetButton.setOnClickListener((View v) -> {
            Intent intent = new Intent(this, PassForgotActivity.class);
            startActivity(intent);
        });

    }
}