package com.example.mywhatsapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class StatusFragment extends Fragment {
    RecyclerView recyclerView;
    RecyclerView recyclerView2;
    ArrayList<StatusFragmentSuitcase> recentList = new ArrayList<>();
    ArrayList<StatusFragmentSuitcase> viewedList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_status, container, false);
        recyclerView = v.findViewById(R.id.updateStatusRecycler);
        recyclerView2 = v.findViewById(R.id.viewedStatusRecycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView2.setLayoutManager(new LinearLayoutManager(getContext()));

        recentList.add(new StatusFragmentSuitcase(R.drawable.image5, "Muhammad Talha", "5 minutes ago"));
        recentList.add(new StatusFragmentSuitcase(R.drawable.image2, "Farhan Ali", "30 minutes ago"));
        recentList.add(new StatusFragmentSuitcase(R.drawable.image3, "Haris Qazi", "Today, 9:43 pm"));

        viewedList.add(new StatusFragmentSuitcase(R.drawable.image4, "Talha Iftikhar", "55 minutes ago"));
        viewedList.add(new StatusFragmentSuitcase(R.drawable.image6, "Usman Abid", "59 minutes ago"));
        viewedList.add(new StatusFragmentSuitcase(R.drawable.image7, "Umer Farooq", "Today, 12:43 pm"));
        viewedList.add(new StatusFragmentSuitcase(R.drawable.image5, "Ahmad Rashid", "Today, 1:12 pm"));
        viewedList.add(new StatusFragmentSuitcase(R.drawable.image3, "Muhammad Ahsan", "Today, 8:23 pm"));
        viewedList.add(new StatusFragmentSuitcase(R.drawable.image2, "Ammar Saleem", "Today, 7:33 pm"));
        viewedList.add(new StatusFragmentSuitcase(R.drawable.image1, "Uzair Rasheed", "Yesterday"));
        viewedList.add(new StatusFragmentSuitcase(R.drawable.image4, "Sami Rashid", "yesterday"));

        StatusRecyclerAdapter adapter1 = new StatusRecyclerAdapter(getContext(), recentList);
        Status2RecyclerAdapter adapter2 = new Status2RecyclerAdapter(getContext(), viewedList);
        recyclerView.setAdapter(adapter1);
        recyclerView2.setAdapter(adapter2);
        return v;
    }
}