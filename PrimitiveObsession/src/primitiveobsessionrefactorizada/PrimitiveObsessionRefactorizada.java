/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primitiveobsessionrefactorizada;

import primitiveobsession.*;

/**
 *
 * @author Steffany Vallejo
 */
public class PrimitiveObsessionRefactorizada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ciudad[] ciudades = {
            new Ciudad("London", 13000000),
            new Ciudad("New York", 21903623),
            new Ciudad("Tokyo", 12570000),
            new Ciudad("Stockholm", 1932763),
            new Ciudad("Barcelona", 1605602),
            new Ciudad("Sydney", 4119190)

        };

        for (Ciudad ciudad : ciudades) {

            System.out.println(ciudad.toString());
        }

    }

}
