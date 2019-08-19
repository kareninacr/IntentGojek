package com.example.intentgojek;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ReceivedData extends AppCompatActivity {
    String nama, alamat, pesanan;
    Button batal;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.data_passing);

        nama = getIntent().getStringExtra("nama");
        alamat = getIntent().getStringExtra("alamat");
        pesanan = getIntent().getStringExtra("pesan");

        TextView tvNama = (TextView) findViewById(R.id.tv1);
        TextView tvAlamat = (TextView) findViewById(R.id.tv2);
        TextView tvPesan = (TextView) findViewById(R.id.tv3);

        batal = findViewById(R.id.btn_batal);
        batal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kembali = new Intent(ReceivedData.this, GoFoodActivity.class);
                startActivity(kembali);
            }
        });


    }
}
