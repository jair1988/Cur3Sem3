package com.ofam.cur3sem3;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.ofam.cur3sem3.adaptadores.AdapterMascota;
import com.ofam.cur3sem3.entidades.Mascota;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadActionBar();
        loadRecyclerView();
        loadFloatButton();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_settings:
                // User chose the "Settings" item, show the app settings UI...
                return true;

            case R.id.action_favorite:
                startActivity(new Intent(this, Favorites.class));
                return true;
            default:
                // If we got here, the user's action was not recognized.
                // Invoke the superclass to handle it.
                return super.onOptionsItemSelected(item);
        }
    }

    //Load Action Bar
    private void loadActionBar() {
        Toolbar toolbar = findViewById(R.id.actionBar);
        toolbar.setTitle("");
        ((TextView) toolbar.findViewById(R.id.tvTitle)).setText("Petagram");
        toolbar.setLogo(R.drawable.pet);
        setSupportActionBar(toolbar);
    }

    //load Recyclerview
    private void loadRecyclerView() {
        RecyclerView rvMascota = findViewById(R.id.rvMascota);
        ArrayList<Mascota> mascotas = new ArrayList<>();
        mascotas.add(new Mascota(1, "Perrito 1", R.drawable.perro1, false, 10));
        mascotas.add(new Mascota(2, "Perrito 2", R.drawable.perro2, false, 5));
        mascotas.add(new Mascota(3, "Perrito 3", R.drawable.perro3, false, 7));
        mascotas.add(new Mascota(4, "Perrito 4", R.drawable.perro4, false, 6));
        mascotas.add(new Mascota(5, "Perrito 5", R.drawable.perro5, false, 2));
        mascotas.add(new Mascota(5, "Perrito 6", R.drawable.perro6, false, 8));
        mascotas.add(new Mascota(5, "Perrito 7", R.drawable.perro7, false, 15));
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        rvMascota.setLayoutManager(linearLayoutManager);
        rvMascota.setAdapter(new AdapterMascota(mascotas));
    }

    private void loadFloatButton() {
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Camera", Snackbar.LENGTH_LONG).show();
            }
        });
    }
}
