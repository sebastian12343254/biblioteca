package com.bibliotecaMateriales;

public class Revista extends Material {
    private int numEdition;

    @Override
    public void print() {
        System.out.println("Revista: " + getTitle() + " de " + getAuthor() + " (" + getYear() + ")" + " con " + numEdition + " edicion");
    }

    public void setNumEdition(int numEdition){
        this.numEdition = numEdition;
    }

    public int getNumEdition(){
        return numEdition;
    }
}
