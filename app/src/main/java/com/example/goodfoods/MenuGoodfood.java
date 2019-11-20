package com.example.goodfoods;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MenuGoodfood extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_goodfood);

        Button deliveryButton = findViewById(R.id.button_delivery);

        deliveryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MenuGoodfood.this, OrderListActivity.class);
                startActivity(i);

            }
        });

        Button menu1Button = findViewById(R.id.button_menu1);

        menu1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast t = Toast.makeText(MenuGoodfood.this, "เลือกปลาซาบะย่างแล้ว", Toast.LENGTH_SHORT);
                t.show();

            }
        });

        Button menu2Button = findViewById(R.id.button_menu2);

        menu2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast t = Toast.makeText(MenuGoodfood.this, "เลือกผัดหมี่หยกแล้ว", Toast.LENGTH_SHORT);
                t.show();

            }
        });

        Button menu3Button = findViewById(R.id.button_menu3);

        menu3Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast t = Toast.makeText(MenuGoodfood.this, "เลือกแซนวิชทูน่า-ไข่ต้มแล้ว", Toast.LENGTH_SHORT);
                t.show();

            }
        });

        Button menu4Button = findViewById(R.id.button_menu4);

        menu4Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast t = Toast.makeText(MenuGoodfood.this, "เลือกยำปลาทูแล้ว", Toast.LENGTH_SHORT);
                t.show();

            }
        });


    }
}
