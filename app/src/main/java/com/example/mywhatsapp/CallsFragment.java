package com.example.mywhatsapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class CallsFragment extends Fragment {
    RecyclerView recyclerView1;
    ArrayList<CallsFragmentSuitcase> callsList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View vi = inflater.inflate(R.layout.fragment_calls, container, false);
        recyclerView1 = vi.findViewById(R.id.callsRecycler);
        recyclerView1.setLayoutManager(new LinearLayoutManager(getContext()));

        callsList.add(new CallsFragmentSuitcase(R.drawable.image1, R.drawable.incomming_arrow_green, "Muhammad Ahsan", "(2) 18 November, 6:00 am"));
        callsList.add(new CallsFragmentSuitcase(R.drawable.image2, R.drawable.incomming_arrow_red, "Umer Farooq", "1 November, 7:30 pm"));
        callsList.add(new CallsFragmentSuitcase(R.drawable.image3, R.drawable.outgoing_arrow_green, "Haris Qazi", "(4) 28 October, 8:00 pm"));
        callsList.add(new CallsFragmentSuitcase(R.drawable.image4, R.drawable.incomming_arrow_green, "Ammar Saleem", "8 October, 1:04 am"));
        callsList.add(new CallsFragmentSuitcase(R.drawable.image5, R.drawable.incomming_arrow_green, "Muhammad Talha", "(3) 5 October, 2:40 pm"));
        callsList.add(new CallsFragmentSuitcase(R.drawable.image6, R.drawable.incomming_arrow_red, "Usman Abid", "2 October, 5:00 am"));
        callsList.add(new CallsFragmentSuitcase(R.drawable.image7, R.drawable.outgoing_arrow_green, "Abdullah Waqas", "22 September, 6:33 am"));
        callsList.add(new CallsFragmentSuitcase(R.drawable.image1, R.drawable.incomming_arrow_green, "Waleed Mushtaq", "15 September, 4:12 pm"));
        callsList.add(new CallsFragmentSuitcase(R.drawable.image3, R.drawable.incomming_arrow_red, "Muhammad Kamran", "(2) 11 September, 3:38 am"));
        callsList.add(new CallsFragmentSuitcase(R.drawable.image2, R.drawable.outgoing_arrow_green, "Muhammad Ahsan", "29 August, 9:13 pm"));
        callsList.add(new CallsFragmentSuitcase(R.drawable.image5, R.drawable.incomming_arrow_green, "Uzair Rasheed", "(2) 17 August, 10:07 am"));
        callsList.add(new CallsFragmentSuitcase(R.drawable.image6, R.drawable.outgoing_arrow_green, "Ahmad Rashid", "8 August, 11:43 am"));
        callsList.add(new CallsFragmentSuitcase(R.drawable.image7, R.drawable.incomming_arrow_green, "Talha Iftikahr", "1 August, 10:56 pm"));
        callsList.add(new CallsFragmentSuitcase(R.drawable.image5, R.drawable.incomming_arrow_red, "Sami Rashid", "25 July, 11:44 am"));

        CallsRecyclerAdapter adapter1 = new CallsRecyclerAdapter(getContext(), callsList);
        recyclerView1.setAdapter(adapter1);
        return vi;
    }
}