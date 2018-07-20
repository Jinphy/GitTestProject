package com.example.jianhuijiang.gittestproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView text = findViewById(R.id.hello);

        text.setText("");

        Toast.makeText(this, "Hahaha", Toast.LENGTH_SHORT).show();
    }

    public void method() {
        //
        Toast.makeText(this, "Thank you", Toast.LENGTH_SHORT).show();

        ///

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "我要退出啦！", Toast.LENGTH_SHORT).show();
    }
}
