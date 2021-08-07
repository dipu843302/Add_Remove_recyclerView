package com.example.add_remove_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
RecyclerView recyclerView;
    private Button button1;
    private Button button2;
    MyAdapter myAdapter;
    ArrayList<String >arrayList=new ArrayList<>();
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerview);
        button1=findViewById(R.id.add);
        button2=findViewById(R.id.Remove);

        setBuilt();
        setRecyclerview();
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arrayList.add("Dipu kumar");
                myAdapter.notifyDataSetChanged();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (arrayList.size()!=0){
                    arrayList.remove(0);
                    myAdapter.notifyDataSetChanged();
                }
            }
        });
    }

    private void setRecyclerview() {
        myAdapter=new MyAdapter(arrayList);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(linearLayoutManager);
    }

    private void setBuilt() {
        arrayList.add("Dipu Kumar");
        arrayList.add("Dipu Kumar");
        arrayList.add("Dipu Kumar");
    }
}