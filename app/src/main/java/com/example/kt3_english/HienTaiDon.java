package com.example.kt3_english;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class HienTaiDon extends AppCompatActivity {

    ListView listView;
    ArrayList<String> arrayList;
    EditText editText;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hien_tai_don);

        listView = findViewById(R.id.lv_htd);
        btn = findViewById(R.id.btn);
        editText = findViewById(R.id.edText);

        arrayList = new ArrayList<>();




        ArrayAdapter adapter = new ArrayAdapter(HienTaiDon.this, android.R.layout.simple_list_item_1, arrayList);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = editText.getText().toString();
                arrayList.add(text);
                listView.setAdapter(adapter);
                adapter.notifyDataSetChanged();
            }
        });




    }
}