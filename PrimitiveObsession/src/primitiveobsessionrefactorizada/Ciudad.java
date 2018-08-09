/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primitiveobsessionrefactorizada;

/**
 *
 * @author Steffany Vallejo
 */
public class Ciudad {
private final String nombre;
private final int  poblacion;

    public Ciudad(String name, int population) {
        this.nombre = name;
        this.poblacion = population;
    }

    @Override
    public String toString() {
        return "La ciudad "+nombre+" tiene "+ poblacion +" habitantes";
    }
    
    


}

