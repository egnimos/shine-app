package com.google.codelabs.mdc.java.shrine;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.android.volley.toolbox.NetworkImageView;

public class ProductCardViewHolder extends RecyclerView.ViewHolder {
    public NetworkImageView productImage;
    public TextView title;
    public TextView price;

    public ProductCardViewHolder(@NonNull View itemView) {
        super(itemView);
        //TODO: Find and store views from itemView
        productImage = itemView.findViewById(R.id.product_image);
        title = itemView.findViewById(R.id.product_title);
        price = itemView.findViewById(R.id.product_price);
    }
}
