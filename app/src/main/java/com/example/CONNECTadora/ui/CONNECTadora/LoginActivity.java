package  com.example.CONNECTadora.ui.CONNECTadora;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;

import com.example.CONNECTadora.R;

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
        final Button fr = findViewById(R.id.b_fr);
        final Button eng = findViewById(R.id.b_eng);
        final Button esp = findViewById(R.id.b_esp);

        Resources res = getResources();
        int color = res.getColor(R.color.teal_700);

        condition.setOnClickListener((View v) -> {
            Intent intent = new Intent(this, ConditionsActivity.class);
            startActivity(intent);
        });

        aide.setOnClickListener((View v) -> {
            Intent intent = new Intent(this, AideActivity.class);
            startActivity(intent);
        });

        loginButton.setOnClickListener((View v) -> {
                Intent intent = new Intent(this, ContactsActivity.class);
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

        fr.setOnClickListener((View v) -> {
            eng.setTextColor(color);
            esp.setTextColor(color);
            fr.setTextColor(Color.RED);


        });

        eng.setOnClickListener((View v) -> {
            fr.setTextColor(color);
            esp.setTextColor(color);
            eng.setTextColor(Color.RED);

        });

        esp.setOnClickListener((View v) -> {
            fr.setTextColor(color);
            eng.setTextColor(color);
            esp.setTextColor(Color.RED);


        });

    }
}