package com.example.intentgojek;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class GoFoodActivity extends AppCompatActivity implements View.OnClickListener {
    EditText nama;
    EditText alamat;
    EditText pesan;
    Button pesanan;

    public static String EXTRA_SELECTED_VALUE = "extra_selected_value";
    public static int RESULT_CODE = 110;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gofood);

        EditText nama = (EditText) findViewById(R.id.edit_nama);
        EditText alamat = (EditText) findViewById(R.id.edit_alamat);
        EditText pesan = (EditText) findViewById(R.id.edit_pesanan);
        Button btn = (Button) findViewById(R.id.btn_Submit);
        btn.setOnClickListener(this);
    }

     @Override
     public void onClick(View view) {
        Intent in = new Intent(GoFoodActivity.this,ReceivedData.class);
        in.putExtra("nama",nama.getText().toString());
        in.putExtra("pesan",pesan.getText().toString());
        in.putExtra("alamat",alamat.getText().toString());
        startActivity(in);
    }

    }

