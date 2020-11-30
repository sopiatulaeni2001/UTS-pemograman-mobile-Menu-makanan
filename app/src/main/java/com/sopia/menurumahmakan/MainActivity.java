package com.sopia.menurumahmakan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton btnMakana,btnMinuman;
    public static final String JENIS_GALERI_KEY = "JENIS_GALERI";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inisialisasiView();

    }

    private void inisialisasiView() {
        btnMakana = findViewById(R.id.btn_buka_makanan);
        btnMinuman = findViewById(R.id.btn_buka_minuman);
        btnMakana.setOnClickListener(view -> bukaGaleri("Makanan"));
        btnMinuman.setOnClickListener(view -> bukaGaleri("Minuman"));
    }

    private void bukaGaleri(String jenisMenu) {
        Log.d("MAIN","Buka activity makanan");
        Intent intent = new Intent(this, GaleriActivity.class);
        intent.putExtra(JENIS_GALERI_KEY, jenisMenu);
        startActivity(intent);
    }

}