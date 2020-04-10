package com.ofam.cur3sem3;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.ofam.cur3sem3.adaptadores.AdapterMascota;
import com.ofam.cur3sem3.entidades.Mascota;

import java.util.ArrayList;

public class Favorites extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorites);
        loadActionBar();
        loadRecyclerView();
    }

    //Load Action Bar
    private void loadActionBar() {
        Toolbar toolbar = findViewById(R.id.actionBar);
        toolbar.setTitle("");
        ((TextView) toolbar.findViewById(R.id.tvTitle)).setText("Petagram");
        toolbar.setLogo(R.drawable.pet);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    //load Recyclerview
    private void loadRecyclerView() {
        RecyclerView rvMascota = findViewById(R.id.rvMascota);
        ArrayList<Mascota> mascotas = new ArrayList<>();
        mascotas.add(new Mascota(5, "Perrito 7", R.drawable.perro7, false, 15));
        mascotas.add(new Mascota(1, "Perrito 1", R.drawable.perro1, false, 10));
        mascotas.add(new Mascota(5, "Perrito 6", R.drawable.perro6, false, 8));
        mascotas.add(new Mascota(3, "Perrito 3", R.drawable.perro3, false, 7));
        mascotas.add(new Mascota(4, "Perrito 4", R.drawable.perro4, false, 6));
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        rvMascota.setLayoutManager(linearLayoutManager);
        rvMascota.setAdapter(new AdapterMascota(mascotas));
    }
}
