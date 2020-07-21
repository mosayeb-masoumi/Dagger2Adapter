package com.example.daggeradapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    List<Model> nameList;
    Context context;

    public void setNameList(List<Model> nameList) {
        this.nameList = nameList;
    }


    public void setContext(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, final int position) {

        Model models = nameList.get(position);

        holder.txt.setText(models.name);

        holder.btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(context, ""+position, Toast.LENGTH_SHORT).show();
            }
        });

    }


    @Override
    public int getItemCount() {
        return nameList.size();
    }



    public class ViewHolder extends RecyclerView.ViewHolder {

        Button btn;
        TextView txt;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

           btn = itemView.findViewById(R.id.item_btn);
           txt = itemView.findViewById(R.id.item_txt);

        }
    }
}
