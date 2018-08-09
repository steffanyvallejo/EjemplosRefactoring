/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inappropriateintimacyrefactoring;

import inappropriateintimacy.*;

/**
 *
 * @author Steffany
 */
public class TarjetaRegalo {
    
    private int puntos;

    public TarjetaRegalo(int puntos) {
        this.puntos = puntos;
    }
    
    public void obtenerInformacion(Cliente cliente){
        System.out.println("Nombre "+cliente.getNombre()+" , Puntos: "+cliente.getTarjeta().puntos);
    }
}
