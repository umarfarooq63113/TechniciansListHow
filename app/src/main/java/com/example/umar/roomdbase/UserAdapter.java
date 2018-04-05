package com.example.umar.roomdbase;


import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by umar on 17/12/2017.
 */

class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder> {
    List<User> users;
    Context context;

    public UserAdapter(Context context, List<User> users) {

        this.context=context;
        this.users = users;
    }

    @Override
    public UserAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.user_row, parent, false);
        ViewHolder ev = new ViewHolder(view);
        return ev;
        //return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final UserAdapter.ViewHolder holder, final int position) {

        holder.technicianName.setText(users.get(position).getName());
        holder.technicianPhone.setText(users.get(position).getPhone());

        holder.technicianImage.setImageResource(users.get(position).getImage());
        holder.btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context,AddSuccessfull.class);

                // passing data to the book activity
                intent.putExtra("Name",users.get(position).getName());
                intent.putExtra("Phone",users.get(position).getPhone());
                intent.putExtra("Image",users.get(position).getImage());
                // start the activity
                context.startActivity(intent);
                Toast.makeText(context, "Technician Add Successfully", Toast.LENGTH_SHORT).show();

            }
        });
    }

    @Override
    public int getItemCount() {
        return users.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView technicianName, technicianPhone;
        ImageView technicianImage;
        Button btnAdd;


        public ViewHolder(View itemView) {
            super(itemView);
            technicianImage = itemView.findViewById(R.id.imagTechnician);
            technicianName = itemView.findViewById(R.id.tvTechnicianName);
            technicianPhone = itemView.findViewById(R.id.tvTechnicianNo);
            btnAdd=itemView.findViewById(R.id.btnAdd);
        }
    }
}
