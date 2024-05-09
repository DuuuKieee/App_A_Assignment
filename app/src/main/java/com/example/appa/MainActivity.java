package com.example.appa; // Khai báo package của App A

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button secretButton = findViewById(R.id.secretButton);
        secretButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Khởi tạo Intent để mở App B
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.setComponent(new ComponentName("com.example.appb", "com.example.appb.MainActivity")); // Thay đổi bằng tên package và class của App B
                // Gửi một "tin nhắn" đặc biệt cho App B
                intent.putExtra("open_camera", true);
                startActivity(intent);
            }
        });
    }
}
