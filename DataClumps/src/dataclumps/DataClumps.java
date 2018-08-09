/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataclumps;

import java.util.Scanner;

/**
 *
 * @author Steffany
 */
public class DataClumps {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Nombre: ");
        String nombre = entrada.nextLine();
        System.out.println("Carrera: ");
        String carrera = entrada.nextLine();
        System.out.println("Edad: ");
        Integer edad = entrada.nextInt();
        presentarInformacion(nombre, edad, carrera);
    }

    public static void presentarInformacion(String nombre, Integer edad, String carrera) {
        System.out.printf("Su nombre es %s, tiene %d años y estudia %s\n", nombre, edad, carrera);
    }
}
