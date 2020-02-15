package com.example.aplikasimenghitung;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnjajargenjang,btnsegitiga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnjajargenjang= findViewById(R.id.btnjajargenjang);
        btnsegitiga= findViewById(R.id.btnsegitiga);

        btnjajargenjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveIntent = new Intent(MainActivity.this,
                        MenuJajargenjang.class);
                startActivity(moveIntent);
            }
        });

        btnsegitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveIntent = new Intent(MainActivity.this,
                        MenuSegitiga.class);
                startActivity(moveIntent);
            }
        });
    }
}
