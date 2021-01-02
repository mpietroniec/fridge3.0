package com.project.fridge30.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.project.fridge30.R;
import com.project.fridge30.clickListener.ItemClickListener;
import com.project.fridge30.models.FridgeProduct;

import java.util.ArrayList;

public class FridgeProductAdapter extends RecyclerView.Adapter<FridgeProductAdapter.FridgeProductViewHolder> {

    private ArrayList<FridgeProduct> mFridgeProducts = new ArrayList<>();
    private final Context context;

    public FridgeProductAdapter(ArrayList<FridgeProduct> mFridgeProducts, Context context) {
        this.mFridgeProducts = mFridgeProducts;
        this.context = context;
    }

    @NonNull
    @Override
    public FridgeProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.actyvity_review_row, parent, false);
        return new FridgeProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FridgeProductViewHolder holder, int position) {
        holder.productID.setText(String.valueOf(mFridgeProducts.get(position).getFridgeProductID()));
        holder.productName.setText(mFridgeProducts.get(position).getFridgeProductName());
        holder.productAmount.setText(String.valueOf(mFridgeProducts.get(position).getFridgeProductAmount()));
    }

    @Override
    public int getItemCount() {
        return mFridgeProducts.size();
    }

    public void setFridgeProducts(ArrayList<FridgeProduct> fridgeProducts){
        this.mFridgeProducts = fridgeProducts;
        notifyDataSetChanged();
    }

    public class FridgeProductViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView productID, productName, productAmount;
        ItemClickListener itemClickListener;

        public FridgeProductViewHolder(@NonNull View itemView) {
            super(itemView);
            productID = itemView.findViewById(R.id.product_id_txt);
            productName = itemView.findViewById(R.id.product_name_txt);
            productAmount = itemView.findViewById(R.id.product_amount_txt);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            this.itemClickListener.onItemClickListener(getAdapterPosition());
        }

        public void setItemClickListener(ItemClickListener ic) {
            this.itemClickListener = ic;

        }
    }
}
