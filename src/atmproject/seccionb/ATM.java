/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atmproject.seccionb;

/**
 *
 * @author Heidy
 */
public class ATM {
    /*
    RanuraParaDepositos ranuraParaDepositosObj = new RanuraParaDepositos();
    TecladoNumerico tecladoNumericoObj = new TecladoNumerico();
    Pantalla pantallaObj = new Pantalla();
    Dispensador dispensadorObj = new Dispensador();
    */
    private RanuraParaDepositos ranuraParaDepositosObj;
    private TecladoNumerico tecladoNumericoObj;
    private Pantalla pantallaObj;
    private Dispensador dispensadorObj;
    
    //Implementación de relacion de agregación entre la clase TecladoNumerico y ATM
    public ATM() {//this para indicar que utilizamos la variable que ya habiamos definido
        this.ranuraParaDepositosObj = new RanuraParaDepositos();
        this.tecladoNumericoObj = new TecladoNumerico();
        this.pantallaObj = new Pantalla();
        this.dispensadorObj = new Dispensador();
        
        this.solicitarDatos();
    }
    
        private void solicitarDatos(){
        
        pantallaObj.mostrarMensaje("Bienvenido!\n");
        pantallaObj.mostrarMensaje("Ingrese su número de cuenta: ");
        int numeroCuenta = tecladoNumericoObj.capturarDatos();
        pantallaObj.mostrarMensaje("Ingrese su NIP: ");
        int Nip = tecladoNumericoObj.capturarDatos();
        pantallaObj.mostrarMensaje("Menu Principal:");
        pantallaObj.mostrarMensaje("1. Ver mi saldo:");
        pantallaObj.mostrarMensaje("2. Retirar efectivo:");
        pantallaObj.mostrarMensaje("3. Depositar fondos:");
        pantallaObj.mostrarMensaje("4. Salir:");
        }
       /* private autentificar(){
        
        }*/
    }
    

