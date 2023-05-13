package com.fauzan.negaraasean;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.annotation.GlideModule;
import com.bumptech.glide.module.AppGlideModule;
import com.fauzan.negaraasean.R;

import java.util.ArrayList;

public class DetailFlag extends AppCompatActivity {
        public static final String ITEM_EXTRA = "item_extra";

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_detail_flag);

            ImageView imgflag = findViewById(R.id.imgflag);
            TextView judul = findViewById(R.id.judul);
            TextView ibukota = findViewById(R.id.ibukota);
            TextView desc = findViewById(R.id.desc);

            flag Flag = getIntent().getParcelableExtra(ITEM_EXTRA);
            if (Flag != null) {
                Glide.with( this)
                        .load(Flag.getImg())
                        .into(imgflag);
                judul.setText(Flag.getJudul());
                ibukota.setText(Flag.getIbukota());
                desc.setText(Flag.getDesc());
            }
            if (getSupportActionBar() != null){
                getSupportActionBar().setTitle("Detail Negara");
                getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            }
        }

        @Override
        public boolean onSupportNavigateUp(){
            finish();
            return true;
        }
}