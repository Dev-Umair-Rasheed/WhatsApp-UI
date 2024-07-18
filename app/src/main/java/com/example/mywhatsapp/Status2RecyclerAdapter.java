package com.example.mywhatsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Status2RecyclerAdapter extends RecyclerView.Adapter<Status2RecyclerAdapter.ViewHolder> {

    Context context;
    ArrayList<StatusFragmentSuitcase> statusList;

    public Status2RecyclerAdapter(Context context, ArrayList<StatusFragmentSuitcase> statusList) {
        this.context = context;
        this.statusList = statusList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.status2, parent, false);
        return new Status2RecyclerAdapter.ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.viewedImage.setImageResource(statusList.get(position).statusImage);
        holder.viewedName.setText(statusList.get(position).statusName);
        holder.viewedTime.setText(statusList.get(position).statusTime);
    }

    @Override
    public int getItemCount() {
        return statusList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView viewedImage;
        TextView viewedName, viewedTime;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            viewedImage = itemView.findViewById(R.id.viewedImage);
            viewedName = itemView.findViewById(R.id.viewedName);
            viewedTime = itemView.findViewById(R.id.viewedTime);
        }
    }
}
