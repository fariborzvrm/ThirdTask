package com.example.thirdtask;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.viewHolder> {

    ArrayList<String> myList;
    Context mContext;
    public onItemclicked onClick;




    RecyclerAdapter(ArrayList<String> list){

                 myList=list;


    }


    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
      View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler,parent,false);

       viewHolder holder = new viewHolder(view);
       return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull final viewHolder holder, final int position) {
       final String name=myList.get(position);

       mContext = holder.txtProfile.getContext();

       holder.txtProfile.setText(name);
       holder.txtProfile.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               onClick.onItemClick(position);
           }
       });

    }

    public void setOnClick(onItemclicked onClick) {
        this.onClick = onClick;
    }



    @Override
    public int getItemCount() {
        return myList.size();
    }

   public static class viewHolder extends RecyclerView.ViewHolder  {

          public TextView txtProfile;
          RecyclerView recyclerView;


        public viewHolder(@NonNull View itemView) {
            super(itemView);
            txtProfile=itemView.findViewById(R.id.txtProfile);
            recyclerView = itemView.findViewById(R.id.recycler);

        }



        }


    }



