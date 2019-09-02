package com.juan.personalizarlistview.modelo;

public class Peliculas {


    private String titulo;
    private String descripcion;
    private int imagen;


    public Peliculas(String titulo, String descripcion, int imagen)
    {
        this.titulo=titulo;
        this.descripcion=descripcion;
        this.imagen=imagen;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getImagen() {
        return imagen;
    }


}
