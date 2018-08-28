package com.example.sd.indianquizapp.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.sd.indianquizapp.R;

public class ScoreDetailViewHolder extends RecyclerView.ViewHolder {

    public TextView txt_name,txt_score;
    public ScoreDetailViewHolder(View itemView) {
        super(itemView);
        txt_name=itemView.findViewById(R.id.txt_name);
        txt_score=itemView.findViewById(R.id.txt_score);
    }
}
