package com.bibliotecaMateriales;

//clase tipo Revista hija de clase material
public class Revista extends Material {
    private int numEdition;

    //metodo para imprimir los datos de la revista
    @Override
    public void print() {
        System.out.println("Revista: " + getTitle() + " de " + getAuthor() + " (" + getYear() + ")" + " con " + numEdition + " edicion");
    }

    //getter y setter
    public void setNumEdition(int numEdition){
        this.numEdition = numEdition;
    }

    public int getNumEdition(){
        return numEdition;
    }
}
