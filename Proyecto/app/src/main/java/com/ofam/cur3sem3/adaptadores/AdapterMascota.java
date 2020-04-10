package com.ofam.cur3sem3.adaptadores;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ofam.cur3sem3.R;
import com.ofam.cur3sem3.entidades.Mascota;

import java.util.List;

public class AdapterMascota extends RecyclerView.Adapter<AdapterMascota.ViewHolderMascota> {

    private final List<Mascota> mascotas;

    public AdapterMascota(List<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    @NonNull
    @Override
    public ViewHolderMascota onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_mascota, parent, false);
        return new ViewHolderMascota(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderMascota holder, int position) {
        try {
            Mascota mascota = mascotas.get(position);
            holder.foto.setImageResource(mascota.getFoto());
            holder.nombre.setText(mascota.getNombre());
            holder.votos.setText(String.valueOf(mascota.getCantidadVotos()));
        } catch (Exception e) {
            Log.e("error;", e.getMessage());
        }
    }

    @Override
    public int getItemCount() {
        return mascotas.size();
    }

    static class ViewHolderMascota extends RecyclerView.ViewHolder {
        private ImageView foto;
        private TextView nombre;
        private TextView votos;

        ViewHolderMascota(@NonNull View itemView) {
            super(itemView);
            foto = itemView.findViewById(R.id.imgFoto);
            nombre = itemView.findViewById(R.id.txtNombre);
            votos = itemView.findViewById(R.id.txtVotos);
        }
    }
}
