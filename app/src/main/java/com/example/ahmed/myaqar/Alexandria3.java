package com.example.ahmed.myaqar;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class Alexandria3 extends Fragment  {
    String list[] = {"one", "two", "three", "four", "five"};
    private RecyclerView recyclerView;
    private recycle_view_adapter recyclerviewaAdapter;
    public List<List_Item> listItems;

    public Alexandria3() {
        // Required empty public constructor
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_north1, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.m_RecyclerView);
        recyclerView.setHasFixedSize(true);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 1);
        recyclerView.setLayoutManager(gridLayoutManager);

        listItems = new ArrayList<>();

        listItems.add(new List_Item("Doblix","Dolpix Doplix",R.drawable.investment));
        listItems.add(new List_Item("Doblix","Dolpix Doplix",R.drawable.investment));
        listItems.add(new List_Item("Doblix","Dolpix Doplix",R.drawable.investment));
        listItems.add(new List_Item("Doblix","Dolpix Doplix",R.drawable.investment));
        listItems.add(new List_Item("Doblix","Dolpix Doplix",R.drawable.investment));
        listItems.add(new List_Item("Doblix","Dolpix Doplix",R.drawable.investment));
        listItems.add(new List_Item("Doblix","Dolpix Doplix",R.drawable.investment));


        recyclerviewaAdapter= new recycle_view_adapter(listItems, getActivity());
        recyclerView.setAdapter(recyclerviewaAdapter);






        return  view;

    }
}
