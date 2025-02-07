package com.bibliotecaMateriales;

public class Periodico extends Material {
    private String fecha;

    @Override
    public void print() {
        System.out.println("Periodico: " + getTitle() + " de " + getAuthor() + " (" + getYear() + ")" + " con fecha " + fecha);
    }

    public void setFecha(String fecha){
        this.fecha = fecha;
    }

    public String getFecha(){
        return fecha;
    }
}
