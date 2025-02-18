package com.biblioteca.gestion;

import java.util.Scanner;
public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        //menu de opciones
        int opcion = 0;
        do{
            System.out.println("1. Agregar material");
            System.out.println("2. Eliminar material");
            System.out.println("3. Actualizar material");
            System.out.println("4. Mostrar materiales");
            System.out.println("5. Salir");
            System.out.println("Ingrese una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion){
                case 1:
                    
                case 2:
                    
                case 3:
                   
                case 4:
        
                default:
            } 
        }while(opcion != 5);
    }
}
