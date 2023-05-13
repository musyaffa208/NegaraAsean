package com.fauzan.negaraasean;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RecyclerView rMenu = findViewById(R.id.rMenu);
        ArrayList<flag>flags = new ArrayList<>();
        rMenu.setAdapter(new Adapter(flags, this));
        flags.add(new flag("Brunei Darussalam","Bandar Seri Begawan",R.drawable.brunei));
        flags.add(new flag("Cambodia","Phnom Penh",R.drawable.kamboja));
        flags.add(new flag("Indonesia","Jakarta",R.drawable.indonesia));
        flags.add(new flag("Laos","Vientiane",R.drawable.laos));
        flags.add(new flag("Malaysia","Kuala Lumpur",R.drawable.malaysia));
        flags.add(new flag("Myanmar","Naypyidaw",R.drawable.myanmar));
        flags.add(new flag("Philippines","Manila",R.drawable.philipines));
        flags.add(new flag("Singapore","Singapura",R.drawable.singapura));
        flags.add(new flag("Thailand","Bangkok",R.drawable.thailand));
        flags.add(new flag("Vietnam","Hanoi",R.drawable.vietnam));


        rMenu.setLayoutManager(new GridLayoutManager(this,2));
    }
}