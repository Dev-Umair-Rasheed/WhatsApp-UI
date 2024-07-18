package com.example.mywhatsapp;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class ChatsFragment extends Fragment {
    RecyclerView recyclerView;
    ArrayList<ChatFragmentSuitcase> chatList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_chats, container, false);
        recyclerView = v.findViewById(R.id.chatRecycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        chatList.add(new ChatFragmentSuitcase(R.drawable.myimage2, "Umair Rasheed", "Hello! Check this amazing app.", "8:25 pm"));
        chatList.add(new ChatFragmentSuitcase(R.drawable.image2, "Haris Qazi", "Hi Bro! Where are you?", "Yesterday"));
        chatList.add(new ChatFragmentSuitcase(R.drawable.image3, "Umer Farooq", "Hello!", "Yesterday"));
        chatList.add(new ChatFragmentSuitcase(R.drawable.image4, "Muhammad Ahsan", "Hi, How are you Umair?", "14/11/2022"));
        chatList.add(new ChatFragmentSuitcase(R.drawable.image5, "Aswad Kassar", "Hey!", "13/11/2022"));
        chatList.add(new ChatFragmentSuitcase(R.drawable.image6, "Ammar Saleem", "Good Morning Umair!", "12/11/2022"));
        chatList.add(new ChatFragmentSuitcase(R.drawable.image7, "Muhammad Talha", "Are you in university?", "11/11/2022"));
        chatList.add(new ChatFragmentSuitcase(R.drawable.image8, "Usman Abid", "Good Night!", "10/11/2022"));
        chatList.add(new ChatFragmentSuitcase(R.drawable.image1, "Abdullah Waqas", "Bye! See you again.", "9/11/2022"));

        ChatRecyclerAdapter adapter = new ChatRecyclerAdapter(getContext(), chatList);
        recyclerView.setAdapter(adapter);
        return v;
    }
}