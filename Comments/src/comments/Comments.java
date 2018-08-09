/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comments;

/**
 *
 * @author Steffany
 */
public class Comments {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int edad = 24;
        boolean esEcuatoriano = true;
        // Si cumple los requesitos puede ejercer su derecho al voto
        if (edad > 18 && edad < 65 && esEcuatoriano == true) {

            System.out.println("Cumple con los requesitos, puede votar en las proximas elecciones");
        }

    }
}
