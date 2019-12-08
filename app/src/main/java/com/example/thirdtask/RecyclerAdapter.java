package com.example.thirdtask;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.viewHolder> {

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
      View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler,parent,false);

       viewHolder holder = new viewHolder(view);
       return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {

        switch (position){

            case 0:
                holder.txtProfile.setText("Profile");
                holder.txtProfile.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                    }
                });
                break;

            case 1:
                holder.txtProfile.setText("Dial");
                holder.txtProfile.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                    }
                });
                break;

        }

    }

    @Override
    public int getItemCount() {
        return 2;
    }

    class viewHolder extends RecyclerView.ViewHolder{

          TextView txtProfile;

        public viewHolder(@NonNull View itemView) {
            super(itemView);

            txtProfile=itemView.findViewById(R.id.txtProfile);
        }
    }


}
