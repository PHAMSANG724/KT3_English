package com.example.kt3_english;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<String> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.lv);
        arrayList = new ArrayList<>();

        arrayList.add("Hiện tại đơn");
        arrayList.add("Quá khứ đơn");
        arrayList.add("Hiện tại hoàn thành");
        arrayList.add("Quá khứ hoàn thành");
        arrayList.add("Tương lai");
        arrayList.add("Tương lai hoàn thành");

        ArrayAdapter adapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1, arrayList);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i == 0){
                    startActivity(new Intent(MainActivity.this, HienTaiDon.class));
                }else if(i == 1){
                    startActivity(new Intent(MainActivity.this, QuaKhuDon.class));
                }else if(i == 2){
                    startActivity(new Intent(MainActivity.this, HienTaiHoanThanh.class));
                }else if(i == 3){
                    startActivity(new Intent(MainActivity.this, QuaKhuHoanThanh.class));
                }else if(i == 4){
                    startActivity(new Intent(MainActivity.this, TuongLai.class));
                }else if(i == 5){
                    startActivity(new Intent(MainActivity.this, TuongLaiHoanThanh.class));
                }
            }
        });
    }
}