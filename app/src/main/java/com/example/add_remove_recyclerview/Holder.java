package com.example.add_remove_recyclerview;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Holder extends RecyclerView.ViewHolder {
    ArrayList<String>arrayList=new ArrayList<>();
    TextView textView;
    public Holder(@NonNull View itemView) {
        super(itemView);
        textView=itemView.findViewById(R.id.text);
    }

    public void setData(String model1) {
      textView.setText(model1);
    }
}
