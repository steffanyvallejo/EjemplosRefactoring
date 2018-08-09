package shotgunsurgery;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Steffany Vallejo
 * Obtenido de: https://javaonfly.blogspot.com/2016/09/code-smell-and-shotgun-surgery.html
 */
public class Cuenta {
    private String tipo;
       private String numeroCuenta;
       private int monto;
      
       public Cuenta(String tipo,String numCuenta,int monto)
       {
              this.monto=monto;
              this.tipo=tipo;
              this.numeroCuenta=numCuenta;
       }
      
      
       public void debitar(int debito) throws Exception
       {
              if(monto <= 500)
              {
                     throw new Exception("Minimo del balance debe ser superior 500");
              }
             
              monto = monto-debito;
              System.out.println("El monto de la cuenta es: " + monto);
             
       }
      
       public void transfererir(Cuenta from,Cuenta to,int montoCredito) throws Exception
       {
              if(from.monto <= 500)
              {
                     throw new Exception("Minimo del balance debe ser superior 500");
              }
             
              to.monto = monto+montoCredito;
             
       }
      
       public void enviarMensajePrecaucion()
       {
              if(monto <= 500)
              {
                     System.out.println("El monto deberia ser superior a 500");
              }
       }
       
}
