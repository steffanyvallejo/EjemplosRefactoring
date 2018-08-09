package shotgunsurgerysolucion;

import shotgunsurgery.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Steffany Vallejo Obtenido de:
 * https://javaonfly.blogspot.com/2016/09/code-smell-and-shotgun-surgery.html
 */
public class Cuenta {

    private String tipo;
    private String numeroCuenta;
    private int monto;

    public Cuenta(String tipo, String numCuenta, int monto) {
        this.monto = monto;
        this.tipo = tipo;
        this.numeroCuenta = numCuenta;
    }

    private boolean estaDesbalanceada() {
        if (monto <= 500) {
            return true;
        }
        return false;

    }

    public void debitar(int debito) throws Exception {
        if (estaDesbalanceada()) {
            throw new Exception("Minimo de balance debe ser a 500");
        }

        monto = monto - debito;
        System.out.println("Monto es:" + monto);

    }

    public void transfererir(Cuenta from, Cuenta to, int montoCredito) throws Exception {
        if (estaDesbalanceada()) {
            throw new Exception("Minimo de balance debe ser a 500");
        }

        to.monto = monto + montoCredito;

    }

    public void enviarMensajePrecaucion() {
        if (estaDesbalanceada()) {
            System.out.println("El monto deberia ser superior a 500");
        }
    }

}
