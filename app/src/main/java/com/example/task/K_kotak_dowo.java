package com.example.task;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class K_kotak_dowo extends AppCompatActivity {
    Button Btn;
    EditText ETl;
    EditText ETp;
    TextView TV;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_k_kotak_dowo);
        ETp = findViewById(R.id.ETpjK);
        ETl = findViewById(R.id.ETlbK);
        TV =  findViewById(R.id.TVhslKkotakdowo);
        Btn = findViewById(R.id.BtnHtgKkotakdowo);

        Btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                double panjang = Double.parseDouble(ETp.getText().toString());
                double lebar = Double.parseDouble(ETl.getText().toString());
                double Keliling = (panjang + lebar) * 2.0;

                StringBuilder sb = new StringBuilder();
                sb.append("Luas Persegi Panjang dengan panjang: ");
                sb.append(panjang);
                sb.append(" dan lebar ");
                sb.append(lebar);
                sb.append(" adalah: ");
                sb.append(Keliling);
                sb.append(BuildConfig.FLAVOR);
                TV.setText(sb.toString());
            }
        });
    }
}
