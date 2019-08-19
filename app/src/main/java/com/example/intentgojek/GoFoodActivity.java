package com.example.intentgojek;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class GoFoodActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gofood);

        final EditText nama = (EditText) findViewById(R.id.edit_nama);
        final EditText alamat = (EditText) findViewById(R.id.edit_alamat);
        final EditText pesan = (EditText) findViewById(R.id.edit_pesanan);
        Button btn = (Button) findViewById(R.id.btn_Submit);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(GoFoodActivity.this,ReceivedData.class);
                in.putExtra("nama",nama.getText().toString());
                in.putExtra("pesan",pesan.getText().toString());
                in.putExtra("alamat",alamat.getText().toString());
                startActivity(in);
            }
        });
    }
}
