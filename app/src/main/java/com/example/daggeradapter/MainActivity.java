package com.example.daggeradapter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Inject
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((App) getApplication()).component.inject(this);

        recyclerView=findViewById(R.id.recyclerview);


        List<Model> nameList = new ArrayList<>();
        nameList.add(new Model("reza"));
        nameList.add(new Model("ali"));
        nameList.add(new Model("leila"));
        nameList.add(new Model("mina"));
        nameList.add(new Model("nabi"));



        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);


        adapter.setNameList(nameList);
        adapter.setContext(this);
//        adapter = new Adapter(nameList,this);
        recyclerView.setAdapter(adapter);


    }
}
