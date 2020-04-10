package com.ofam.cur3sem3.entidades;

public class Mascota {

    private int id;
    private String nombre;
    private int foto;
    private boolean voto;
    private int cantidadVotos;

    public Mascota(int id, String nombre, int foto, boolean voto, int cantidadVotos) {
        this.id = id;
        this.nombre = nombre;
        this.foto = foto;
        this.voto = voto;
        this.cantidadVotos = cantidadVotos;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getFoto() {
        return foto;
    }

    public boolean isVoto() {
        return voto;
    }

    public int getCantidadVotos() {
        return cantidadVotos;
    }

    public void setVoto(boolean voto) {
        this.voto = voto;
    }
}
