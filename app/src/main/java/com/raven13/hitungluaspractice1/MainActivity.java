package com.raven13.hitungluaspractice1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText edtPanjang,edtLebar;
    private Button count;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Hitung Luas Persegi Panjang");

        edtPanjang = (EditText)findViewById(R.id.edt_panjang);
        edtLebar = (EditText)findViewById(R.id.edt_lebar);
        count = (Button)findViewById(R.id.btn_hitung);
        result = (TextView)findViewById(R.id.txt_luas);

        count.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String panjang = edtPanjang.getText().toString().trim();
                String lebar = edtPanjang.getText().toString().trim();

                double p = Double.parseDouble(panjang);
                double l = Double.parseDouble(lebar);

                double luas = p * l;

                result.setText("" + luas);
            }
        });
    }
}
