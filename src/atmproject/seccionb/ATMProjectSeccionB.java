/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atmproject.seccionb;

/**
 *
 * @author Heidy
 */
public class ATMProjectSeccionB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Creación de objetos
        //Cuenta cuentaObj = new Cuenta("Heidy"); 
        //Cuenta cuentaObj2 = new Cuenta("TOj");
        
        /*cuentaObj.numeroDeCuenta = 1;
        cuentaObj.setNumeroDeCuenta(1);
        cuentaObj.getNumeroDeCuenta();
        //cuentaObj2.numeroDeCuenta = 2;
        */
        
        //TecladoNumerico tecladoNumerico = new TecladoNumerico();
        //ATM atmObj = new ATM(tecladoNumerico);
        
        
        Retiro retiroObj = new Retiro();
        retiroObj.ejecutar(0);

        Deposito depositoObj = new Deposito();
        depositoObj.ejecutar(0);

       /* Transaccion transaccionObj1 = new Deposito();
        transaccion transaccionObj1.ejecutar(0);

        Transaccion transaccionObj2 = new Tetiro();
        transaccion transaccionObj2.ejecutar(0); 
*/
       
      /* ATM atm = new ATM();
       atm.polimorfismo Retir();
       atm.polimorfismo Deposito();
       */
    
     /* Pantalla pantallaObj = new Pantalla();
      pantallaObj.mostrarMensaje("Hola Mundo");
*/
     ATM atmObj = new ATM();
    }
    
}
