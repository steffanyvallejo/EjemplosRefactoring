/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataclumpsrefactoring;

import java.util.Scanner;

/**
 *
 * @author Steffany
 */
public class DataClumpRefactoring {
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
        
        Alumno a1= new Alumno(nombre,carrera,edad);
        a1.presentarInformacion();
    }
}
