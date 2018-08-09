/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primitiveobsession;

/**
 *
 * @author Steffany Vallejo
 */
public class PrimitiveObsession {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer[] PoblacionCiudades = {
            13000000, // London

            21903623, // New York

            12570000, // Tokyo

            1932763, // Stockholm

            1605602, // Barcelona

            4119190 // Sydney
        };

        for (Integer cityPopulation : PoblacionCiudades) {

            System.out.println(cityPopulation);
        }

    }

}
