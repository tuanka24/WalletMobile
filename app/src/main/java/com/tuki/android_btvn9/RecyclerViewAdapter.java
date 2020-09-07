package com.tuki.android_btvn9;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.tuki.android_btvn9.Model.WallPaper;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewHolder> {


    private ArrayList<WallPaper> data = new ArrayList<>();

    public RecyclerViewAdapter(ArrayList<WallPaper> data) {this.data = data; }


    @Override
    public RecyclerViewAdapter.RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.wallpaper_items, parent, false);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.RecyclerViewHolder holder, int position) {
        WallPaper wallPP = data.get(position);

        Glide.with(holder.img)
                .load(wallPP.getAvt())
                .placeholder(R.mipmap.ic_launcher)
                .into(holder.img);

        holder.textMonth.setText(data.get(position).getTvMonth());
    }
    @Override
    public int getItemCount() {
        return data.size();
    }


    public class RecyclerViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView textMonth;

        public RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
            img = (ImageView) itemView.findViewById(R.id.imgAvatar);
            textMonth = (TextView) itemView.findViewById(R.id.tvMonth);
        }
    }
}