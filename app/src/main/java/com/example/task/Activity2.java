package com.example.task;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;

public class Activity2 extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {
    int kode;
    Button Btnbund;
    Button BtnSD;
    Button Btnkot;
    Button Btnkotdo;
    Button Btnsgt;
    Button Btntrap;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Btnkot = findViewById(R.id.Btnkotak);
        Btnkotdo = findViewById(R.id.Btnkotakdowo);
        Btnbund = findViewById(R.id.Btnbunder);
        Btntrap = findViewById(R.id.Btnkotakmiring);
        Btnsgt = findViewById(R.id.Btnsegitelu);
        BtnSD = findViewById(R.id.BtnSD);
        Btnkot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kode = 1;
                PopupMenu pop = new PopupMenu(Activity2.this, v);
                pop.setOnMenuItemClickListener(Activity2.this);
                pop.inflate(R.menu.optionmenu);
                pop.show();
            }
        });
        Btnbund.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kode = 2;
                PopupMenu pop = new PopupMenu(Activity2.this, v);
                pop.setOnMenuItemClickListener(Activity2.this);
                pop.inflate(R.menu.optionmenu);
                pop.show();
            }
        });
        Btnkotdo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kode = 3;
                PopupMenu pop = new PopupMenu(Activity2.this, v);
                pop.setOnMenuItemClickListener(Activity2.this);
                pop.inflate(R.menu.optionmenu);
                pop.show();
            }
        });
        Btnsgt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kode = 4;
                PopupMenu pop = new PopupMenu(Activity2.this, v);
                pop.setOnMenuItemClickListener(Activity2.this);
                pop.inflate(R.menu.optionmenu);
                pop.show();
            }
        });
        Btntrap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kode = 5;
                PopupMenu pop = new PopupMenu(Activity2.this, v);
                pop.setOnMenuItemClickListener(Activity2.this);
                pop.inflate(R.menu.optionmenu);
                pop.show();
            }
        });
        BtnSD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
            }
        });
    }

    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.Mk:
                int i = kode;
                if (i == 1) {
                    startActivity(new Intent(getApplicationContext(), K_kotak.class));
                    break;
                }
                if (i == 2) {
                    startActivity(new Intent(getApplicationContext(), K_bunder.class));
                    break;
                }
                if (i == 3) {
                    startActivity(new Intent(getApplicationContext(), K_kotak_dowo.class));
                    break;
                }
                if (i == 4) {
                    startActivity(new Intent(getApplicationContext(), K_segitelu.class));
                    break;
                }
                if (i == 5) {
                    startActivity(new Intent(getApplicationContext(), K_trapesium.class));
                    break;
                }
            case R.id.Ml:
                int i2 = kode;
                if (i2 == 1) {
                    startActivity(new Intent(getApplicationContext(), L_kotak.class));
                    break;
                }
                if (i2 == 2) {
                    startActivity(new Intent(getApplicationContext(), L_bunder.class));
                    break;
                }
                if (i2 == 3) {
                    startActivity(new Intent(getApplicationContext(), L_kotak_dowo.class));
                    break;
                }
                if (i2 == 4) {
                    startActivity(new Intent(getApplicationContext(), L_segitelu.class));
                    break;
                }
                if (i2 == 5) {
                    startActivity(new Intent(getApplicationContext(), L_trapesium.class));
                    break;
                }
        }
        return true;
    }
}