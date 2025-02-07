package com.biblioteca.gestion;

import java.util.ArrayList;
import com.bibliotecaMateriales.*;
import java.util.Scanner;
public class Biblioteca extends Material{
    ArrayList<Material> materiales = new ArrayList<Material>();
    Scanner scanner = new Scanner(System.in);

    private String title;

    public void print(){
        for(Material material : materiales){
            material.print();
        }
    }

    public void addMaterial(Material material){
        materiales.add(material);
    }

    public void removeMaterial(Material material){
        materiales.remove(material);
    }

    public void searchMaterial(){
        System.out.println("Ingrese el titulo del material a buscar: ");
        title = scanner.nextLine();
        for(Material material : materiales){
            if(material.getTitle().equals(title)){
                material.print();
            }
        }
    }

    public void updateMaterial(){
        System.out.println("Ingrese el titulo del material a actualizar: ");
        title = scanner.nextLine();
        for(Material material : materiales){
            if(material.getTitle().equals(title)){
                System.out.println("Ingrese el nuevo titulo: ");
                String newTitle = scanner.nextLine();
                material.setTitle(newTitle);
                System.out.println("Ingrese el nuevo autor: ");
                String newAuthor = scanner.nextLine();
                material.setAuthor(newAuthor);
                System.out.println("Ingrese el nuevo año: ");
                int newYear = scanner.nextInt();
                material.setYear(newYear);
            }
        }
    }
}
