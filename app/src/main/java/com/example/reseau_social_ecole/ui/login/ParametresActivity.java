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
        /*final Button iconSearch = findViewById(R.id.b_ic_search);
        final Button iconFriends = findViewById(R.id.b_ic_friends);
        //final Button search = findViewById(R.id.b_search);
        final ImageButton iconAcc = findViewById(R.id.b_account);
        final Button iconMessage = findViewById(R.id.b_ic_message);*/
        final Button iconSearch = findViewById(R.id.b_ic_param);
        final Button iconFriends = findViewById(R.id.b_ic_contacts);
        final Button iconMessage = findViewById(R.id.b_ic_messages);

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


        /*for(int i = 0; i < 5; i++){
            sp[i] = findViewById(id[i]);
            sp[i].setOnItemSelectedListener(this);*/

           /* for (int j = 0; j < 5 ; j++) {
                aa[i] = new ArrayAdapter(this, android.R.layout.simple_spinner_item, options[i]);
                aa[i].setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                sp[i].setAdapter(aa[i]);
            }



        }*/

        /*iconAcc.setOnClickListener((View v) -> {
            Intent intent = new Intent(this, AideActivity.class);
            startActivity(intent);
        });

        iconSearch.setOnClickListener((View v) -> {
            Intent intent = new Intent(this, InterestActivity.class);
            startActivity(intent);
        });

        iconFriends.setOnClickListener((View v) -> {
            Intent intent = new Intent(this, FriendsActivity.class);
            startActivity(intent);
        });

        iconMessage.setOnClickListener((View v) -> {
            Intent intent = new Intent(this, MessageActivity.class);
            startActivity(intent);
        });*/

        /*search.setOnClickListener((View v) -> {
            Intent intent = new Intent(this, SearchResultActivity.class);
            startActivity(intent);
        });
*/

    }


    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id) {
    }
    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
    }
}