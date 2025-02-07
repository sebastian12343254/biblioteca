package com.bibliotecaMateriales;

public class Libro extends Material {
    private int numPages;

    @Override 
    public void print() {
        System.out.println("Libro: " + getTitle() + " de " + getAuthor() + " (" + getYear() + ")" + " con " + numPages + " paginas");
    }

    public void setNumPages(int numPages){
        this.numPages = numPages;
    }

    public int getNumPages(){
        return numPages;
    }
}
