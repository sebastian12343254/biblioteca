package com.bibliotecaMateriales;

//Creacion clase abstracta como plantilla
public abstract class Material {

    //atributos obligatorios   
    private String title;
    private String author;
    private int year;

    //metodo abstracto para imprimir los datos de el material
    public abstract void print();

    //getter y setters
    public int getYear() {
        return year;
    }

    public String getAuthor(){
        return author;
    }

    public String getTitle(){
        return title;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void setTitle(String title){
        this.title = title;
    }
}
