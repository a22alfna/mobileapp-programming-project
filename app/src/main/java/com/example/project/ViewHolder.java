package com.example.project;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {
    public TextView cityID;
    public TextView cityName;
    public TextView cityLocation;
    public TextView citySize;
    public TextView cityCost;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        cityID = itemView.findViewById(R.id.citiesID);
        cityName = itemView.findViewById(R.id.citiesname);
        cityLocation = itemView.findViewById(R.id.citieslocation);
        citySize = itemView.findViewById(R.id.citiessize);
        cityCost = itemView.findViewById(R.id.citiescost);
    }

}
