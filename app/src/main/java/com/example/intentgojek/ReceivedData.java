package com.example.intentgojek;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class ReceivedData extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.data_passing);

        TextView tvNama = (TextView) findViewById(R.id.tv1);
        TextView tvAlamat = (TextView) findViewById(R.id.tv2);
        TextView tvPesan = (TextView) findViewById(R.id.tv3);

        Bundle bundle = getIntent().getExtras();

        String nama = bundle.getString("nama");
        tvNama.setText(nama);

        String alamat = bundle.getString("alamat");
        tvAlamat.setText(alamat);

        String pesan = bundle.getString("pesan");
        tvPesan.setText(pesan);
    }
}
