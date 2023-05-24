package com.example.project;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<ViewHolder> {

    private List<Cities> cities;
    public Adapter(List<Cities>cities) {
        this.cities = cities;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cities, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.cityID.setText(cities.get(position).getid());
        holder.cityName.setText(cities.get(position).getname());
        holder.cityLocation.setText(cities.get(position).getlocation());
        holder.citySize.setText(String.valueOf(cities.get(position).getsize()));
        holder.cityCost.setText(String.valueOf(cities.get(position).getcost()));
    }

    @Override
    public int getItemCount() {
        return cities.size();
    }
}
