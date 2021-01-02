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
import com.project.fridge30.models.ShoppingListProduct;

import java.util.ArrayList;

public class ShoppingListProductAdapter extends RecyclerView.Adapter<ShoppingListProductAdapter.ShoppingListViewHolder> {
    private ArrayList<ShoppingListProduct> mShoppingListProducts = new ArrayList<>();
    private final Context context;

    public ShoppingListProductAdapter(ArrayList<ShoppingListProduct> shoppingListProducts, Context context) {
        this.mShoppingListProducts = shoppingListProducts;
        this.context = context;
    }

    @NonNull
    @Override
    public ShoppingListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_shopping_list_row, parent, false);
        return new ShoppingListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ShoppingListViewHolder holder, int position) {
        holder.shoppingListProductName.setText(mShoppingListProducts.get(position).getShoppingListProductName());
        holder.shoppingListProductAmount.setText(String.valueOf(mShoppingListProducts.get(position).getShoppingListProductAmount()));
        holder.shoppingListShopName.setText(mShoppingListProducts.get(position).getShoppingListShopName());
    }

    @Override
    public int getItemCount() {
        return mShoppingListProducts.size();
    }

    public class ShoppingListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView shoppingListProductName, shoppingListProductAmount, shoppingListShopName;
        ItemClickListener itemClickListener;

        public ShoppingListViewHolder(@NonNull View itemView) {
            super(itemView);
            shoppingListProductName = itemView.findViewById(R.id.shopping_list_name_txt);
            shoppingListProductAmount = itemView.findViewById(R.id.shopping_list_amount_txt);
            shoppingListShopName = itemView.findViewById(R.id.shopping_list_shop_name_txt);

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
