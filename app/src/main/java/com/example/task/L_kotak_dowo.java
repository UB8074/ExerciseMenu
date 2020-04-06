package com.example.task;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class L_kotak_dowo extends AppCompatActivity {
    Button Btn;
    EditText ETlb;
    EditText ETpj;
    TextView TVhsl;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_l_kotak_dowo);
        ETpj = findViewById(R.id.ETpjL);
        ETlb = findViewById(R.id.ETlbL);
        TVhsl = findViewById(R.id.TVhslLkotakdowo);
        Btn = findViewById(R.id.BtnHtgLkotakdowo);
        Btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                double panjang = Double.parseDouble(ETpj.getText().toString());
                double lebar = Double.parseDouble(ETlb.getText().toString());
                double luas = panjang * lebar;

                StringBuilder sb = new StringBuilder();
                sb.append("Luas Persegi Panjang dengan panjang: ");
                sb.append(panjang);
                sb.append(" dan lebar ");
                sb.append(lebar);
                sb.append(" adalah: ");
                sb.append(luas);
                sb.append(BuildConfig.FLAVOR);
                TVhsl.setText(sb.toString());
            }
        });
    }
}
