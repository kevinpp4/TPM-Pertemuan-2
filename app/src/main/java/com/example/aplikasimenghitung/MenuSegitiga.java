package com.example.aplikasimenghitung;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MenuSegitiga extends AppCompatActivity {
    private Button btnhasilSegitiga;
    private TextView tvluas;
    private EditText etalasSegitiga, ettinggiSegigita;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_segitiga);

        btnhasilSegitiga = findViewById(R.id.btnhasil);
        tvluas = findViewById(R.id.tvluas);
        etalasSegitiga = findViewById(R.id.etalasSegitiga);
        ettinggiSegigita = findViewById(R.id.ettinggiSegitiga);

        btnhasilSegitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    String sAlas = etalasSegitiga.getText().toString();
                    String sTinggi = ettinggiSegigita.getText().toString();

                    double alas = Double.parseDouble(sAlas);
                    double tinggi = Double.parseDouble(sTinggi);

                    double hasil = alas*tinggi/2.0;

                    String sHasil = String.valueOf(hasil);
                    tvluas.setText(sHasil);
                } catch (NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(),"Field Tidak Boleh Kososng",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
