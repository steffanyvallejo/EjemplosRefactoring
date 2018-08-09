/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataclass;

/**
 *
 * @author Steffany
 */
public class DataClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangulo r= new Rectangulo (12,8);
        int area = r.getAltura()*r.getBase();
        int perimetro = r.getAltura()+r.getBase();
        System.out.println("Rectangulo, Base:"+ r.getBase()+" , Altura: "+r.getAltura()+" ,Area: "+ area+" ,Perimetro: "+ perimetro);
    }
    
}
