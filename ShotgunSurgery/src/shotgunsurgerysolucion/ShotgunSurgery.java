/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shotgunsurgerysolucion;

import shotgunsurgery.*;

/**
 *
 * @author estudiante
 */
public class ShotgunSurgery {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
       Cuenta acc = new Cuenta("Personal","AC1234",1000);
              acc.debitar(500);
              acc.enviarMensajePrecaucion();
    }
    
}
