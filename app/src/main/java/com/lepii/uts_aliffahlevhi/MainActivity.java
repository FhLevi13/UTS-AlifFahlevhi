package com.lepii.uts_aliffahlevhi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnDaftar;
    EditText etNama;
    EditText etNoPendaftaran;
    Spinner spJalurPendaftaran;
    CheckBox cbKonfirmasi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Home");

        etNama = findViewById(R.id.et_namalengkap);
        etNoPendaftaran = findViewById(R.id.et_nomorpendaftaran);
        spJalurPendaftaran = findViewById(R.id.sp_jalurpendaftaran);
        cbKonfirmasi = findViewById(R.id.cb_konfirmasi);
        btnDaftar = findViewById(R.id.btn_daftar);

        btnDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Nama = etNama.getText().toString();
                String NoPendaftaran = etNoPendaftaran.getText().toString();


                if (Nama.trim().equals("")) {
                    etNama.setError("Nama Tidak Boleh Kosong");
                }
                if else (NoPendaftaran.trim().equals("")) {
                    etNoPendaftaran.setError("Nama Tidak Boleh Kosong");
                }
                else {
                    Intent pindah = new Intent(MainActivity.this, SecondActivity.class);
                    pindah.putExtra("inputNama", Nama);
                    pindah.putExtra("inputNoPendaftaran", NoPendaftaran);
                    pindah.putExtra("inputJalurPendaftaran", Nama);
                    pindah.putExtra("inputNoPendaftaran", NoPendaftaran);
                    startActivity(pindah);
                }
            }
        });

    }
}