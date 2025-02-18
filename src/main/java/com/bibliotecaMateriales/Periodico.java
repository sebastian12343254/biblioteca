package com.bibliotecaMateriales;

//clase tipo Periodico hija de clase material
public class Periodico extends Material {
    private String fecha;

    //metodo para imprimir los datos de el periodico
    @Override
    public void print() {
        System.out.println("Periodico: " + getTitle() + " de " + getAuthor() + " (" + getYear() + ")" + " con fecha " + fecha);
    }

    //getter y setter
    public void setFecha(String fecha){
        this.fecha = fecha;
    }

    public String getFecha(){
        return fecha;
    }
}
