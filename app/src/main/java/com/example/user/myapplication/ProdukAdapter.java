package com.example.user.myapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ProdukAdapter extends RecyclerView.Adapter<ProdukAdapter.MyViewHolder>{

    private Context mContext;
    private List<Produk> mData;

    public ProdukAdapter(Context mContext, List<Produk> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.produk_row, parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.produkName.setText(mData.get(position).getNama());
        holder.produkImg.setImageResource(mData.get(position).getGmbr());


    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView produkName;
        ImageView produkImg;
        CardView cardView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            produkName = itemView.findViewById(R.id.produk_title);
            produkImg = itemView.findViewById(R.id.produk_img);
            cardView = itemView.findViewById(R.id.produk_list);
        }
    }
}
