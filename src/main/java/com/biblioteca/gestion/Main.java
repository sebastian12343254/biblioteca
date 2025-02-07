package com.biblioteca.gestion;

import java.util.Scanner;
public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        Biblioteca biblioteca = new Biblioteca();
        int option = 0;
        do{
            System.out.println("1. Agregar material");
            System.out.println("2. Eliminar material");
            System.out.println("3. Buscar material");
            System.out.println("4. Actualizar material");
            System.out.println("5. Mostrar materiales");
            System.out.println("6. Salir");
            System.out.println("Ingrese una opcion: ");
            option = scanner.nextInt();
            scanner.nextLine();
            switch(option){
                case 1:
                    biblioteca.addMaterial(biblioteca);
                    break;
                case 2:
                    biblioteca.removeMaterial(biblioteca);
                    break;
                case 3:
                    biblioteca.updateMaterial();
                    break;
                case 4:
                    biblioteca.searchMaterial();
                    break;
                case 5:
                    biblioteca.print();
                    break;
                case 6:
                    System.out.println("Salio del programa");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }while(option != 6);

        scanner.close();
    }
}
