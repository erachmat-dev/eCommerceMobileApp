package com.example.ecommercemobileapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ProductSizeAdapter extends RecyclerView.Adapter<ProductSizeAdapter.SizeViewHolder> {

    private List<String> sizes;

    public ProductSizeAdapter(List<String> sizes) {
        this.sizes = sizes;
    }

    @Override
    public SizeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_product_size, parent, false);
        return new SizeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(SizeViewHolder holder, int position) {
        String size = sizes.get(position);
        holder.txtSize.setText(size);
    }

    @Override
    public int getItemCount() {
        return sizes.size();
    }

    public static class SizeViewHolder extends RecyclerView.ViewHolder {

        TextView txtSize;

        public SizeViewHolder(View itemView) {
            super(itemView);
            txtSize = itemView.findViewById(R.id.txt_size);
        }
    }
}

