package com.example.task;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class L_trapesium extends AppCompatActivity {
    Button BtnHtg;
    EditText ETt;
    EditText ETab;
    EditText ETef;
    TextView TVhsl;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_l_trapesium);

        ETab = findViewById(R.id.ETpjABL);
        ETef = findViewById(R.id.ETpjEFL);
        ETt = findViewById(R.id.ETtingKotakmir);
        BtnHtg = findViewById(R.id.BtnHtgLkotakmir);
        TVhsl =  findViewById(R.id.TVhslLkotakmir);

        BtnHtg.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                double AB = Double.parseDouble(ETab.getText().toString());
                double EF = Double.parseDouble(ETef.getText().toString());
                double t = Double.parseDouble(ETt.getText().toString());
                double luas = ((AB + EF) * t) / 2.0;

                StringBuilder sb = new StringBuilder();
                sb.append("Luas Trapesium dengan panjang AB: ");
                sb.append(AB);
                sb.append(" dan panjang EF: ");
                sb.append(EF);
                sb.append(" dan tinggi: ");
                sb.append(t);
                sb.append(" adalah: ");
                sb.append(luas);
                sb.append(BuildConfig.FLAVOR);
                TVhsl.setText(sb.toString());
            }
        });
    }
}
