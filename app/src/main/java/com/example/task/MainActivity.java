package com.example.task;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static String password, username;
    EditText ETusname, ETpass;
    Button BtnSign;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ETusname = findViewById(R.id.ETusname);
        ETpass = findViewById(R.id.ETpass);
        BtnSign = findViewById(R.id.BtnSign);

        BtnSign.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                username = ETusname.getText().toString();
                password = ETpass.getText().toString();
                if (!username.equals("admin") || !password.equals("123")) {
                    Toast.makeText(getApplicationContext(), "Password Salah", Toast.LENGTH_LONG).show();
                    return;
                }
                startActivity(new Intent(getApplicationContext(), Activity2.class));
            }
        });
    }
}


