package com.bibliotecaMateriales;

//clase tipo Libro hija de clase material
public class Libro extends Material {
    //atributo propio de la clase libro
    private int numPages;

    //metodo para imprimir los datos de el libro
    @Override 
    public void print() {
        System.out.println("Libro: " + getTitle() + " de " + getAuthor() + " (" + getYear() + ")" + " con " + numPages + " paginas");
    }

    //getter y setter
    public void setNumPages(int numPages){
        this.numPages = numPages;
    }

    public int getNumPages(){
        return numPages;
    }
}
