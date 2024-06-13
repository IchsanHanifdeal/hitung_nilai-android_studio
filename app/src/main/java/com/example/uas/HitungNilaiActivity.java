package com.example.uas;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class HitungNilaiActivity extends AppCompatActivity {

    private EditText etNilaiKuis;
    private EditText etNilaiPraktikum;
    private EditText etNilaiProjek;
    private EditText etNilaiTugas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_nilai);

        etNilaiKuis = findViewById(R.id.etNilaiKuis);
        etNilaiPraktikum = findViewById(R.id.etNilaiPraktikum);
        etNilaiProjek = findViewById(R.id.etNilaiProjek);
        etNilaiTugas = findViewById(R.id.etNilaiTugas);
        Button btnHitung = findViewById(R.id.btnHitung);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double nilaiKuis = Double.parseDouble(etNilaiKuis.getText().toString());
                    double nilaiPraktikum = Double.parseDouble(etNilaiPraktikum.getText().toString());
                    double nilaiProjek = Double.parseDouble(etNilaiProjek.getText().toString());
                    double nilaiTugas = Double.parseDouble(etNilaiTugas.getText().toString());

                    if (nilaiKuis < 0 || nilaiKuis > 100 ||
                            nilaiPraktikum < 0 || nilaiPraktikum > 100 ||
                            nilaiProjek < 0 || nilaiProjek > 100 ||
                            nilaiTugas < 0 || nilaiTugas > 100) {
                        Toast.makeText(HitungNilaiActivity.this, "Nilai harus antara 0 dan 100", Toast.LENGTH_SHORT).show();
                        return;
                    }

                    double nilaiAkhir = (nilaiKuis + nilaiPraktikum + nilaiProjek + nilaiTugas) / 4;

                    Intent intent = new Intent(HitungNilaiActivity.this, HasilNilaiActivity.class);
                    intent.putExtra("nilaiAkhir", nilaiAkhir);
                    startActivity(intent);
                } catch (NumberFormatException e) {
                    Toast.makeText(HitungNilaiActivity.this, "Semua nilai harus diisi dengan angka", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
