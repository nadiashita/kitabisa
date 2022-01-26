package com.kitabisa.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import com.kitabisa.DetailActivity;
import com.kitabisa.R;
import com.kitabisa.model.DonasiBawahModel;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class DonasiBawahAdapter extends RecyclerView.Adapter<DonasiBawahAdapter.MyViewHolder> {

    Context context;
    List<DonasiBawahModel> objList;

    public DonasiBawahAdapter(Context context, List<DonasiBawahModel> objList) {
        this.context = context;
        this.objList = objList;
    }

    @NonNull
    @org.jetbrains.annotations.NotNull
    @Override
    public DonasiBawahAdapter.MyViewHolder onCreateViewHolder(@NonNull @org.jetbrains.annotations.NotNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View v = inflater.inflate(R.layout.itemlist2, parent, false);
        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
        });
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull @org.jetbrains.annotations.NotNull DonasiBawahAdapter.MyViewHolder holder, int position) {
        DonasiBawahModel data = objList.get(position);
        holder.imgdonasi.setImageDrawable(data.getImgurl());
        holder.juduldonasi.setText(data.getJuduldonasi());
        holder.user.setText(data.getUser());
        holder.jumlahdonasi.setText(data.getTotaldonasi());
        holder.sisahari.setText(data.getSisahari());
        holder.simpleProgressBar.setMax(100);
        holder.simpleProgressBar.setProgress(80);
    }

    @Override
    public int getItemCount() {
        return objList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView imgdonasi;
        TextView juduldonasi, user, jumlahdonasi, sisahari;
        ProgressBar simpleProgressBar;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imgdonasi = itemView.findViewById(R.id.img_donasi);
            juduldonasi = itemView.findViewById(R.id.tv_juduldonasi);
            user = itemView.findViewById(R.id.tv_user);
            simpleProgressBar = itemView.findViewById(R.id.simpleProgressBar);
            jumlahdonasi = itemView.findViewById(R.id.tv_jumlahdonasi);
            sisahari = itemView.findViewById(R.id.tv_sisahari);
        }
    }
}

