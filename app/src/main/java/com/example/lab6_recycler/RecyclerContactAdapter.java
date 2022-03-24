package com.example.lab6_recycler;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerContactAdapter extends RecyclerView.Adapter<RecyclerContactAdapter.Viewholder> {

    Context context;
    ArrayList<ContactModel> arr;
    RecyclerContactAdapter(Context context, ArrayList<ContactModel> arr)
    {
    this.context=context;
    this.arr=arr;
    }


    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(context).inflate(R.layout.contact_row, parent, false);
        Viewholder view=new Viewholder(v);
        return view;
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {
        holder.i.setImageResource(arr.get(position).image);
        holder.name.setText(arr.get(position).name);
        holder.number.setText(arr.get(position).number);

    }

    @Override
    public int getItemCount() {
        return arr.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder
    {
        TextView name,number;
        ImageView i;

        public Viewholder(@NonNull View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.contactname);
            number=itemView.findViewById(R.id.contactnumber);
            i=itemView.findViewById(R.id.imgcontact);
        }
    }

}
