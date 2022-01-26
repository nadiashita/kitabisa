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
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.kitabisa.DetailActivity;
import com.kitabisa.R;
import com.kitabisa.model.DonasiAtasModel;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class DonasiAtasAdapter extends RecyclerView.Adapter<DonasiAtasAdapter.MyViewHolder> {

    Context context;
    List<DonasiAtasModel> objList;

    public DonasiAtasAdapter(Context context, List<DonasiAtasModel> objList) {
        this.context = context;
        this.objList = objList;
    }

    @NonNull
    @org.jetbrains.annotations.NotNull
    @Override
    public DonasiAtasAdapter.MyViewHolder onCreateViewHolder(@NonNull @org.jetbrains.annotations.NotNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View v = inflater.inflate(R.layout.itemlist1, parent, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull @org.jetbrains.annotations.NotNull DonasiAtasAdapter.MyViewHolder holder, int position) {
        DonasiAtasModel data = objList.get(position);
        holder.imgdonasi.setImageDrawable(data.getImgurl());
        holder.juduldonasi.setText(data.getJuduldonasi());
        holder.danaterkumpul.setText(data.getDanaterkumpul());
        holder.targetdonasi.setText(data.getTargetdonasi());
        holder.jumlahdonasi.setText(data.getTotaldonasi());
        holder.totalhari.setText(data.getTotalhari());
        holder.simpleProgressBar.setMax(100);
        holder.simpleProgressBar.setProgress(80);
        holder.btndonasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return objList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView imgdonasi;
        TextView juduldonasi, danaterkumpul, jumlahdonasi, totalhari, targetdonasi;
        ProgressBar simpleProgressBar;
        CardView btndonasi;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imgdonasi = itemView.findViewById(R.id.img_donasi);
            juduldonasi = itemView.findViewById(R.id.tv_juduldonasi);
            danaterkumpul = itemView.findViewById(R.id.tv_danaterkumpul);
            targetdonasi = itemView.findViewById(R.id.tv_danatarget);
            simpleProgressBar = itemView.findViewById(R.id.simpleProgressBar);
            jumlahdonasi = itemView.findViewById(R.id.tv_jumlahdonasi);
            totalhari = itemView.findViewById(R.id.tv_totalhari);
            btndonasi = itemView.findViewById(R.id.btn_donasi);
        }
    }
}

