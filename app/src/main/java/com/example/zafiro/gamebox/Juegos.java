package com.example.zafiro.gamebox;

import android.graphics.drawable.Drawable;

public class Juegos {

    private String titulo;
    private String descripcion;
    private String empresa;
    private String año;
    private Drawable imagen;

    public Juegos() {
        super();
    }

    public Juegos(String titulo, String descripcion, String empresa, String año, Drawable imagen) {
        super();
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.empresa = empresa;
        this.año = año;
        this.imagen = imagen;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Drawable getImagen() {
        return imagen;
    }

    public void setImagen(Drawable imagen) {
        this.imagen = imagen;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

}
