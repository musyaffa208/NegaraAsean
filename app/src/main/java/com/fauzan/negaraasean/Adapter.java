package com.fauzan.negaraasean;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.Holder> {
    private ArrayList<flag> flags;
    private Context context;

    public Adapter(ArrayList<flag> flags, Context context) {
        this.flags = flags;
        this.context = context;
    }

    @NonNull
    @Override
    public Adapter.Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item_flag,parent,false);

        return new Holder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.Holder holder, int position) {
        flag flag = flags.get(position);
        holder.judul.setText(flag.getJudul());
        holder.ibukota.setText(flag.getIbukota());
        holder.img.setImageResource(flag.getImg());

        holder.btnDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(context, DetailFlag.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable("flag",flags);
                i.putExtra("flag",bundle);
                context.startActivity(i);
            }
        });

    }

    @Override
    public int getItemCount() {
        return flags.size();
    }

    public class Holder extends RecyclerView.ViewHolder {
        public TextView judul,ibukota;
        public ImageView img;
        public Button btnDetail;
        public Holder(@NonNull View itemView) {
            super(itemView);

            judul = itemView.findViewById(R.id.judul);
            ibukota = itemView.findViewById(R.id.ibukota);
            img = itemView.findViewById(R.id.imgflag);
            btnDetail = itemView.findViewById(R.id.detail);
        }
    }
}
