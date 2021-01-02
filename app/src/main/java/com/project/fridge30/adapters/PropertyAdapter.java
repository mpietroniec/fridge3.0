package com.project.fridge30.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.project.fridge30.activities.AddingActivity;
import com.project.fridge30.activities.FridgeProductActivity;
import com.project.fridge30.R;
import com.project.fridge30.activities.ShoppingListActivity;
import com.project.fridge30.clickListener.ItemClickListener;
import com.project.fridge30.models.Property;

import java.util.ArrayList;

public class PropertyAdapter extends RecyclerView.Adapter<PropertyAdapter.PropertyViewHolder> {

    private ArrayList<Property> mProperties = new ArrayList<>();
    private final Context context;

    public PropertyAdapter(ArrayList<Property> properties, Context context) {
        this.mProperties = properties;
        this.context = context;
    }

    @NonNull
    @Override
    public PropertyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_property_row, parent, false);
        return new PropertyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PropertyViewHolder holder, int position) {
        Glide.with(context)
                .asBitmap()
                .load(mProperties.get(position).getPropertyImage())
                .into(holder.image);
        holder.propertyName.setText(mProperties.get(position).getPropertyName());

        holder.setItemClickListener((propertyPosition) -> {
            switch (propertyPosition) {
                case 0:
                    Intent i0 = new Intent(context, AddingActivity.class);
                    context.startActivity(i0);
                    break;
                case 1:
                    Intent i1 = new Intent(context, ShoppingListActivity.class);
                    context.startActivity(i1);
                    break;
                case 2:
                    Intent i2 = new Intent(context, FridgeProductActivity.class);
                    context.startActivity(i2);
                    break;
            }
        });
    }


    @Override
    public int getItemCount() {
        return mProperties.size();
    }

    public void setProperties(ArrayList<Property> properties) {
        this.mProperties = properties;
        notifyDataSetChanged();
    }

    public class PropertyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView propertyName;
        private ImageView image;
        ItemClickListener itemClickListener;

        public PropertyViewHolder(@NonNull View itemView) {
            super(itemView);
            propertyName = itemView.findViewById(R.id.property_name);
            image = itemView.findViewById(R.id.main_property_image);
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
