package com.example.uas;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HasilNilaiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_nilai);

        TextView tvNilaiAkhir = findViewById(R.id.tvNilaiAkhir);

        double nilaiAkhir = getIntent().getDoubleExtra("nilaiAkhir", 0);
        tvNilaiAkhir.setText(String.valueOf(nilaiAkhir));
    }
}
