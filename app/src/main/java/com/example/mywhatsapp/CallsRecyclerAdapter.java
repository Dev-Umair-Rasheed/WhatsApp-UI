package com.example.mywhatsapp;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CallsRecyclerAdapter extends RecyclerView.Adapter<CallsRecyclerAdapter.ViewHolder> {

    Context context1;
    ArrayList<CallsFragmentSuitcase> callsList;

    public CallsRecyclerAdapter(Context context, ArrayList<CallsFragmentSuitcase> callsList) {
        this.context1 = context;
        this.callsList = callsList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vie = LayoutInflater.from(context1).inflate(R.layout.call, parent, false);
        return new ViewHolder(vie);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.callImage.setImageResource(callsList.get(position).callImage);
        holder.arrow.setImageResource(callsList.get(position).arrow);
        holder.callName.setText(callsList.get(position).callName);
        holder.callTime.setText(callsList.get(position).callTime);
        int image1 = callsList.get(position).callImage;
        holder.callImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dialog dialog = new Dialog(context1);
                dialog.setContentView(R.layout.show_call_dialogue_picture);
                ImageView imageView1 = dialog.findViewById(R.id.callDialogueImage);
                imageView1.setImageResource(image1);
                dialog.show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return callsList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView arrow, callImage;
        TextView callName, callTime;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            arrow = itemView.findViewById(R.id.callArrow);
            callImage = itemView.findViewById(R.id.callImage);
            callName = itemView.findViewById(R.id.callNameTxt);
            callTime = itemView.findViewById(R.id.callTimeTxt);
        }
    }
}
