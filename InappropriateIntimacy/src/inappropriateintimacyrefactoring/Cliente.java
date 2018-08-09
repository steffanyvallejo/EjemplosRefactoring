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
public class Cliente {
    public String nombre;
    private String id;
    private TarjetaRegalo tarjeta;

    public Cliente(String nombre, String id, TarjetaRegalo tarjeta) {
        this.nombre = nombre;
        this.id = id;
        this.tarjeta = tarjeta;
    }

    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }

    public TarjetaRegalo getTarjeta() {
        return tarjeta;
    }

    
    
    
}
