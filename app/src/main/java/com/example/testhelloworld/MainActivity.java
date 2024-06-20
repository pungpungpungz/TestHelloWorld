package com.example.testhelloworld;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);

        btn1.setOnClickListener(v -> {
            Intent intent1 = new Intent (getApplicationContext(), World1.class);
            startActivity(intent1);
        });
        btn2.setOnClickListener(v -> {
            Intent intent2 = new Intent (getApplicationContext(), World2.class);
            intent2.putExtra("Name", "Akarapong Prakobkij");
            intent2.putExtra("CID", "06026924");
            startActivity(intent2);
        });
        btn3.setOnClickListener(v -> {
            Intent intent3 = new Intent (getApplicationContext(), World3.class);
            intent3.putExtra("Uni", "Ubon Ratchathani University");
            intent3.putExtra("Country", "Thailand");
            startActivity(intent3);
        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}