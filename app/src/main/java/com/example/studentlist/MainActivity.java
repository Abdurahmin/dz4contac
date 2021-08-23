package com.example.studentlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  {
    Button btnBoris;
    Button btnAnotoliy;
    Button btnSergiy;
    Button btnIvun;
RecyclerView recyclerView;
StudentAdapter adapter;
ArrayList<String> nameList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSergiy = findViewById(R.id.btn_sergey);
        btnIvun = findViewById(R.id.btn_ivun);
        btnBoris=findViewById(R.id.btn_boris);
        btnAnotoliy = findViewById(R.id.btn_anotoliy);

        btnBoris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Boris_activity.class);
                startActivity(intent);

            }
        });
        btnAnotoliy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Anotoliy_Activity.class);
                startActivity(intent);



            }
        });
        btnSergiy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Sergey_activity.class);
                startActivity(intent);
            }
        });
        btnIvun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,IvanActivity.class);
                startActivity(intent);
            }
        });

        initRecycler();
    }
    private  void  initRecycler(){
        nameList.add("Сергей");
        nameList.add("Иван");
        nameList.add("Анотолий");
        nameList.add("Борис");
        recyclerView=  findViewById(R.id.student_recycler);
        adapter = new StudentAdapter(nameList);
        recyclerView.setAdapter(adapter);
    }
}