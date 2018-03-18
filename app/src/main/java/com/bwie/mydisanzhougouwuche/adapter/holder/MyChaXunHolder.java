package com.bwie.mydisanzhougouwuche.adapter.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import com.bwie.mydisanzhougouwuche.R;

/**
 * Created by admin on 2018/3/17.
 */

public class MyChaXunHolder extends RecyclerView.ViewHolder {

    public CheckBox che_group;
    public TextView text_group;
    public RecyclerView recycler_child;

    public MyChaXunHolder(View itemView) {
        super(itemView);
        che_group = itemView.findViewById(R.id.che_group);
        text_group = itemView.findViewById(R.id.text_group);
        recycler_child = itemView.findViewById(R.id.recycler_child);
    }
}
