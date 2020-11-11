package com.example.lntapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.L;

/**
 * MyAdapter job is to put data into each row of the listview
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.WordViewHolder> {
    String[] languages;
    LayoutInflater layoutInflater;

    public MyAdapter(Context context, String[] languagesData) {
        languages = languagesData;
        layoutInflater = LayoutInflater.from(context);
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
       //return null;
        View rowView = layoutInflater.inflate(R.layout.row_listview,parent,false);
        return new WordViewHolder(rowView);
    }

    /**
     * onBindViewHolder job is to write data on planks
     * @param holder
     * @param position
     */

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.WordViewHolder holder, int position) {
        holder.titleTextView.setText(languages[position]);

    }

    /**
     *
     * job is to keep the count of number of dataitems in the dataset
     * @return
     */

    @Override
    public int getItemCount() {
        return languages.length;
    }

    /**
     * job is to hold the recycled stock and new stock of wooden planks
     */

    public class WordViewHolder extends RecyclerView.ViewHolder {
        public TextView titleTextView;
        public WordViewHolder(@NonNull View itemView) {
            super(itemView);
            titleTextView = itemView.findViewById(R.id.textviewRow);
        }
    }
}
