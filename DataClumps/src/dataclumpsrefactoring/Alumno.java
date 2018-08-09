/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataclumpsrefactoring;

/**
 *
 * @author Steffany
 */
public class Alumno {
    String nombre;
    String carrera;
    Integer edad;

    public Alumno(String nombre, String carrera, Integer edad) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.edad = edad;
    }

    
    public void presentarInformacion() {
       System.out.printf("Su nombre es %s, tiene %d años y estudia %s\n", nombre, edad, carrera);
    }
    
    
}
