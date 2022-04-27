package com.example.a10119225_latihan2;
// Nama : Nuraeni Eka Susanti
// Kelas : IF-6
// NIM : 10119225
// Tanggal Pengerjaan : 26 April 2022

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
        public void btnRegister(View view){
            Intent intent = new Intent(this, com.example.a10119225_latihan2.RegisterActivity.class);
            startActivity(intent);
    }
}