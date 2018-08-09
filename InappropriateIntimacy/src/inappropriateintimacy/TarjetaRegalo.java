/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inappropriateintimacy;

/**
 *
 * @author Steffany
 */
public class TarjetaRegalo {
    
    private Cliente cliente;
    private int puntos=0;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
    
    public void obtenerInformacion(){
        System.out.println("Nombre "+cliente.getNombre()+" , Puntos: "+puntos);
    }
}
