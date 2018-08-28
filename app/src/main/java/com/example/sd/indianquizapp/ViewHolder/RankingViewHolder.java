package com.example.sd.indianquizapp.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.sd.indianquizapp.ItemClickListener;
import com.example.sd.indianquizapp.R;


public class RankingViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

  public TextView txt_name,txt_score;
  private ItemClickListener itemClickListener;

    public RankingViewHolder(View itemView) {
        super(itemView);
        txt_name=itemView.findViewById(R.id.txt_name);
        txt_score=itemView.findViewById(R.id.txt_score);
        itemView.setOnClickListener(this);

    }

    public void setItemClickListener(ItemClickListener itemClickListener){
        this.itemClickListener=itemClickListener;
    }

    @Override
    public void onClick(View v) {
        itemClickListener.onClick(v,getAdapterPosition(),false);


    }
}
