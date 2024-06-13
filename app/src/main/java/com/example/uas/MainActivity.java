package com.example.uas;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText etNim;
    private EditText etNama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNim = findViewById(R.id.etNim);
        etNama = findViewById(R.id.etNama);
        Button btnSignIn = findViewById(R.id.btnSignIn);

        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nim = etNim.getText().toString();
                String nama = etNama.getText().toString();

                if (nim.isEmpty() || nama.isEmpty()) {
                    Toast.makeText(MainActivity.this, "NIM dan Nama Lengkap harus diisi", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(MainActivity.this, HitungNilaiActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}