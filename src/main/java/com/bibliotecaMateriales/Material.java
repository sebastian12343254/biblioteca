package com.bibliotecaMateriales;

public abstract class Material {
    private String title;
    private String author;
    private int year;

    public abstract void print();

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
