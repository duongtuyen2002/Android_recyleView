package com.example.recyleview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ShopAdapter extends RecyclerView.Adapter<ShopAdapter.ViewHolder>{
    ArrayList<DataShop> dtShop;
    Context context;

    public ShopAdapter(ArrayList<DataShop> dtShop, Context context) {
        this.dtShop = dtShop;
        this.context = context;
    }

    //tạo layout
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.item_row, parent,false);
        return new ViewHolder(itemView);
    }
    //gán dữ liệu
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.name.setText(dtShop.get(position).getTen());
        holder.anh.setImageResource(dtShop.get(position).getHinhAnh());
    }

    @Override
    public int getItemCount() {
        return dtShop.size();
    }

    //Ánh xạ
    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView name;
        ImageView anh;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.tvName);
            anh = (ImageView) itemView.findViewById(R.id.Hinh);
        }
    }
}
