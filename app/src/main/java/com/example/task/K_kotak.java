package com.example.task;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class K_kotak extends AppCompatActivity {
    Button Btn;
    EditText ETs;
    TextView tv;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_k_kotak);
        ETs = findViewById(R.id.ETsisiK);
        tv = findViewById(R.id.TVhslKkotak);
        Btn = findViewById(R.id.BtnHtgKkotak);

        Btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                double sisi = Double.parseDouble(ETs.getText().toString());
                double keliling = 4.0 * sisi;

                StringBuilder sb = new StringBuilder();
                sb.append("Hasil keliling persegi dengan sisi: ");
                sb.append(sisi);
                sb.append(" adalah: ");
                sb.append(keliling);
                sb.append(BuildConfig.FLAVOR);
                tv.setText(sb.toString());
            }
        });
    }
}
