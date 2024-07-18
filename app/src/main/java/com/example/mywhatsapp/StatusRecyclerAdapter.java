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

public class StatusRecyclerAdapter extends RecyclerView.Adapter<StatusRecyclerAdapter.ViewHolder> {
    Context context;
    ArrayList<StatusFragmentSuitcase> statusList;

    public StatusRecyclerAdapter(Context context, ArrayList<StatusFragmentSuitcase> statusList) {
        this.context = context;
        this.statusList = statusList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.status, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.recentImage.setImageResource(statusList.get(position).statusImage);
        holder.recentName.setText(statusList.get(position).statusName);
        holder.recentTime.setText(statusList.get(position).statusTime);
    }

    @Override
    public int getItemCount() {
        return statusList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView recentImage;
        TextView recentName, recentTime;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            recentImage = itemView.findViewById(R.id.recentImage);
            recentName = itemView.findViewById(R.id.recentName);
            recentTime = itemView.findViewById(R.id.recentTime);
        }
    }
}
