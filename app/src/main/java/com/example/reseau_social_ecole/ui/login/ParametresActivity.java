package  com.example.reseau_social_ecole.ui.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;

import com.example.reseau_social_ecole.R;

public class ParametresActivity extends AppCompatActivity implements
        AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parametres);
        final Button accessB = findViewById(R.id.button_access);
        /*final Button iconSearch = findViewById(R.id.b_ic_search);
        final Button iconFriends = findViewById(R.id.b_ic_friends);
        //final Button search = findViewById(R.id.b_search);
        final ImageButton iconAcc = findViewById(R.id.b_account);*/

        final Button iconSearch = findViewById(R.id.b_ic_param);
        final Button iconFriends = findViewById(R.id.b_ic_contacts);
        final Button iconMessage = findViewById(R.id.b_ic_messages);
        final Button iconsecurity = findViewById(R.id.button_securit);
        final Button signout = findViewById(R.id.button_deconnexion);
        final Button support = findViewById(R.id.button_support);
        final Button dons = findViewById(R.id.button_dons);

        support.setOnClickListener((View v) -> {
            Intent intent = new Intent(this, SupportActivity.class);
            startActivity(intent);
        });

        dons.setOnClickListener((View v) -> {
            Intent intent = new Intent(this, DonsActivity.class);
            startActivity(intent);
        });

        signout.setOnClickListener((View v) -> {
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
        });


        iconsecurity.setOnClickListener((View v) -> {
            Intent intent = new Intent(this, SecuriteActivity.class);
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
        accessB.setOnClickListener((View v) -> {
            Intent intent = new Intent(this, AccessibilityActivity.class);
            startActivity(intent);
        });


    }


    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id) {
    }
    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
    }
}