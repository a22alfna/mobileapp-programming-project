package com.example.project;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements JsonTask.JsonTaskListener {

    private final String JSON_URL = "https://mobprog.webug.se/json-api?login=a22alfna";
    private RecyclerView RecyclerView;
    private ArrayList<Cities> Cities;
    private Adapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView = findViewById(R.id.MyRecyclerView);
        Cities = new ArrayList<Cities>();
        adapter = new Adapter(Cities);
        RecyclerView.setAdapter(adapter);
        RecyclerView.setLayoutManager(new LinearLayoutManager(this));

        new JsonTask(this).execute(JSON_URL);
    }

    @Override
    public void onPostExecute(String json) {
        Log.d("snus", "onPostExecute: " +json);
        Gson gson = new Gson();
        Type type = new TypeToken<ArrayList<Cities>>() {}.getType();
        ArrayList<Cities> data = gson.fromJson(json, type);
        Cities.addAll(data);
        adapter.notifyDataSetChanged();
    }
}
