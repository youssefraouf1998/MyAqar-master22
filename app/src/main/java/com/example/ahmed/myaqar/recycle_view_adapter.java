package com.example.ahmed.myaqar;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.ahmed.myaqar.R;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Ahmed on 11/11/2018.
 */

public class recycle_view_adapter extends RecyclerView.Adapter<recycle_view_adapter.ViewHolder>{

    private List<List_Item> List_Item;
    private Context context;

    public recycle_view_adapter(List<List_Item> list_Item, Context context) {
        List_Item = list_Item;
        this.context = context;
    }

    @Override
    public recycle_view_adapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_items, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(recycle_view_adapter.ViewHolder holder, final int position) {

        holder.tvTitle.setText(List_Item.get(position).getTitle());
        holder.tvDescription.setText(List_Item.get(position).getDescription());
        holder.imageView.setImageResource(List_Item.get(position).getImage());
     //   Picasso.with(context).load(List_Item.get(position).Image).into(holder.imageView);
       // Picasso.get().load(List_Item.get(position).Image).into(holder.imageView);
        Glide.with(context).load(List_Item.get(position).Image).into(holder.imageView);

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(context,ShowContent.class);
                intent.putExtra("Title",List_Item.get(position).getTitle());
                intent.putExtra("Description",List_Item.get(position).getDescription());
                intent.putExtra("Image",List_Item.get(position).getImage());
                context.startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return (null != List_Item ? List_Item.size() : 0);
    }

    protected class ViewHolder extends RecyclerView.ViewHolder{
        private CardView cardView;
        private ImageView imageView;
        private TextView tvTitle;
        private TextView tvDescription;

        public ViewHolder(View view) {
            super(view);
            cardView = (CardView) view.findViewById(R.id.cardView);
            imageView = (ImageView) view.findViewById(R.id.imageView);
            tvTitle = (TextView) view.findViewById(R.id.tvTitle);
            tvDescription = (TextView) view.findViewById(R.id.tvDescription);
        }
    }
}