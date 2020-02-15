package com.example.aplikasimenghitung;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MenuJajargenjang extends AppCompatActivity {
    private Button btnhasil;
    private TextView tvluas;
    private EditText etalas,ettinggi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_jajargenjang);

        btnhasil = findViewById(R.id.btnhasil);
        tvluas = findViewById(R.id.tvluas);
        etalas = findViewById(R.id.etalas);
        ettinggi = findViewById(R.id.ettinggi);

       btnhasil.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               try {
                   String sAlas = etalas.getText().toString();
                   String sTinggi = ettinggi.getText().toString();

                   double alas = Double.parseDouble(sAlas);
                   double tinggi = Double.parseDouble(sTinggi);

                   double hasil = alas*tinggi;

                   String sHasil = String.valueOf(hasil);
                   tvluas.setText(sHasil);
               }catch (NumberFormatException nfe){
                   Toast.makeText(getApplicationContext(),"Field Tidak Boleh Kosong",
                           Toast.LENGTH_SHORT).show();
               }
           }
       });

        }
    }

