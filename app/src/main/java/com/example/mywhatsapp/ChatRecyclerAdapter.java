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

public class ChatRecyclerAdapter extends RecyclerView.Adapter<ChatRecyclerAdapter.ViewHolder> {
    Context context;
    ArrayList<ChatFragmentSuitcase> chatList;

    public ChatRecyclerAdapter(Context context, ArrayList<ChatFragmentSuitcase> chatList) {
        this.context = context;
        this.chatList = chatList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.chats, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.image.setImageResource(chatList.get(position).image);
        holder.name.setText(chatList.get(position).name);
        holder.time.setText(chatList.get(position).time);
        holder.msg.setText(chatList.get(position).msg);
        int position1 = position;
        int image1 = chatList.get(position).image;
        holder.image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dialog dialog = new Dialog(context);
                dialog.setContentView(R.layout.show_picture_dialog);
                ImageView imageView1 = dialog.findViewById(R.id.dialogImage);
                imageView1.setImageResource(image1);
                dialog.show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return chatList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView name, time, msg;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.nameTxt);
            time = itemView.findViewById(R.id.timeTxt);
            msg = itemView.findViewById(R.id.msgTxt);
            image = itemView.findViewById(R.id.chatImage);
        }
    }
}
