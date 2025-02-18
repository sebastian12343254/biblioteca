package com.biblioteca.gestion;

//importacion de paquete de materiales
import com.bibliotecaMateriales.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca{
    ArrayList<Material> materiales = new ArrayList<Material>();
    Scanner scanner = new Scanner(System.in);

    //metodo para crear un producto 
    void createMaterial(Material material){
        System.out.println("Ingrese el titulo: ");
        material.setTitle(scanner.nextLine());
        System.out.println("Ingrese el autor: ");
        material.setAuthor(scanner.nextLine());
        System.out.println("Ingrese el año: ");
        material.setYear(scanner.nextInt());
        scanner.nextLine();
    }
    //metodo para agregar un producto a la biblioteca
    void addMaterial(Material material){
        materiales.add(material);
    }

    //metodo para eliminar un producto de la biblioteca
    void deleteMaterial(Material material){
        materiales.remove(material);
    }

    //metodo para actualizar un producto de la biblioteca, necesita mas validaciones
    void updateMaterial(Material material){
       String titulo = scanner.nextLine();
        for (Material material1 : materiales) {
            if(titulo.equals(material1.getTitle())){
                System.out.println("Ingrese el nuevo titulo: ");
                material1.setTitle(scanner.nextLine());
            }
            else{
                System.out.println("No se encontro el material");
            }
        }
    }

    //metodo para mostrar los productos de la biblioteca
    void showMaterials(){
        for (Material material : materiales) {
            material.print();
        }
    }
}




