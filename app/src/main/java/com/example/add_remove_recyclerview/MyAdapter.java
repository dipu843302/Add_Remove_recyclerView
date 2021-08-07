package com.example.add_remove_recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class MyAdapter extends RecyclerView.Adapter<Holder> {
    @NonNull
    ArrayList<String> arrayList;

    public MyAdapter(@NonNull ArrayList<String> arrayList) {
        this.arrayList = arrayList;
    }

    @Override
    public Holder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
       View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
     String model1=arrayList.get(position);
     holder.setData(model1);
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}
