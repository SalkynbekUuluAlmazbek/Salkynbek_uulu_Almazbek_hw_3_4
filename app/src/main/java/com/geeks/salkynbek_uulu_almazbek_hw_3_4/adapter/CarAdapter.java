package com.geeks.salkynbek_uulu_almazbek_hw_3_4.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.geeks.salkynbek_uulu_almazbek_hw_3_4.Car;
import com.geeks.salkynbek_uulu_almazbek_hw_3_4.ItemClick;
import com.geeks.salkynbek_uulu_almazbek_hw_3_4.R;

import java.util.ArrayList;

public class CarAdapter extends RecyclerView.Adapter<CarViewHolder> {

    private ArrayList<Car> adapterArrayList;
    private ItemClick onClick;

    public CarAdapter(ArrayList<Car> arrayList, ItemClick onItemClick) {
        this.adapterArrayList = arrayList;
        this.onClick = onItemClick;
    }

    @NonNull
    @Override
    public CarViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return  new CarViewHolder(
                LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.item_car, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CarViewHolder holder, int position) {
        holder.onBind(adapterArrayList.get(position));
        holder.itemView.setOnClickListener(v -> onClick.onClick(adapterArrayList.get(holder.getAdapterPosition())));

    }

    @Override
    public int getItemCount() {
        return adapterArrayList.size();
    }
}
