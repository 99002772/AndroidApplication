package com.example.lntapp;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/**
 * MyAdapter job is to put data into each row of the listview
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.WordViewHolder> {
    String[] languages;
    public MyAdapter(String[] languagesData) {
        languages = languagesData;
    }

    /**
     * onCreateViewHolder job is to buy wooden planks
     * @param parent
     * @param viewType
     * @return
     */
    @NonNull
    @Override
    public MyAdapter.WordViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    /**
     * onBindViewHolder job is to write data on planks
     * @param holder
     * @param position
     */

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.WordViewHolder holder, int position) {

    }

    /**
     * job is to keep the count of number of dataitems in the dataset
     * @return
     */

    @Override
    public int getItemCount() {
        return 0;
    }

    /**
     * job is to hold the recycled stock and new stock of wooden planks
     */

    public class WordViewHolder extends RecyclerView.ViewHolder {
        public WordViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
