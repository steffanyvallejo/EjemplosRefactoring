/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataclassrefactoring;

import dataclass.*;

/**
 *
 * @author Steffany
 */
public class Rectangulo {

    private int base;
    private int altura;

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public int area(){
        return this.base*this.altura;
    }
    
    public int perimetro(){
        return this.altura+this.base;
    }
    
    public void verInformacion(){
        System.out.println("Rectangulo, Base:"+ base+" , Altura: "+altura+" ,Area: "+ area()+" ,Perimetro: "+ perimetro());
    }

}
