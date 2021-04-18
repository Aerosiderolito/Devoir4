package com.example.CONNECTadora.ui.CONNECTadora;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.CONNECTadora.R;

public class AccessibilityActivity extends AppCompatActivity  {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accessibilty);

        final ImageView b_backAcc = findViewById(R.id.b_backAcc);

        b_backAcc.setOnClickListener((View v) -> {
            this.finish();
        });

}
}
