/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atmproject.seccionb;

import java.util.Scanner;

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
    int select = 0;
    int opc = 0;
    String error = "Error, ingrese una valiable correcta"; 
    Scanner op = new Scanner(System.in);
    
    private RanuraParaDepositos ranuraParaDepositosObj;
    private TecladoNumerico tecladoNumericoObj;
    private Pantalla pantallaObj;
    private Pantalla pantallaObj2;
    private Pantalla pantallaObj3;
    private Dispensador dispensadorObj;
    
    //Implementación de relacion de agregación entre la clase TecladoNumerico y ATM
    public ATM() {//this para indicar que utilizamos la variable que ya habiamos definido
        this.ranuraParaDepositosObj = new RanuraParaDepositos();
        this.tecladoNumericoObj = new TecladoNumerico();
        this.pantallaObj = new Pantalla();
        this.pantallaObj2 = new Pantalla();
        this.dispensadorObj = new Dispensador();
        
        this.solicitarDatos();
    }
    
        private void solicitarDatos(){
        

            pantallaObj.mostrarMensaje("Bienvenido!\n");
            pantallaObj.mostrarMensaje("Ingrese su número de cuenta: ");
        int numeroCuenta = tecladoNumericoObj.capturarDatos();
            pantallaObj.mostrarMensaje("Ingrese su NIP: ");
        int Nip = tecladoNumericoObj.capturarDatos();
        
        
            do{
                
            pantallaObj2.mostrarMensaje2("");
            pantallaObj2.mostrarMensaje2(" __________________________________");
            pantallaObj2.mostrarMensaje2("|          MENU PRINCIPAL          |");
            pantallaObj2.mostrarMensaje2("|                                  |");
            pantallaObj2.mostrarMensaje2("|   1. Ver mi saldo                |");
            pantallaObj2.mostrarMensaje2("|   2. Retirar efectivo            |");
            pantallaObj2.mostrarMensaje2("|   3. Depositar fondos            |");
            pantallaObj2.mostrarMensaje2("|   4. salir                       |");
            pantallaObj2.mostrarMensaje2("|                                  |");
            pantallaObj2.mostrarMensaje2("|        *Eliga una opcion         |");
            pantallaObj2.mostrarMensaje2("|__________________________________|");    

            select = op.nextInt();
            switch(opc){
                
                case 1:    
          
                
            pantallaObj3.mostrarMensaje3("");
            pantallaObj2.mostrarMensaje2(" __________________________________");
            pantallaObj3.mostrarMensaje3("|                                  |");
            pantallaObj3.mostrarMensaje3("|     Tu Saldo disponible es de:   |");
            pantallaObj3.mostrarMensaje3("|                                  |");
            pantallaObj3.mostrarMensaje3("|                                  |");
            pantallaObj3.mostrarMensaje3("|            Q.00.00               |");
            pantallaObj3.mostrarMensaje3("|                                  |");
            pantallaObj3.mostrarMensaje3("|                                  |");
            pantallaObj3.mostrarMensaje3("|                                  |");
            pantallaObj3.mostrarMensaje3("|__________________________________|"); 
                    
            select = op.nextInt();
                break;
                
            case 2:
                opc = 2;
                
            pantallaObj2.mostrarMensaje2("");
            pantallaObj2.mostrarMensaje2(" __________________________________");
            pantallaObj2.mostrarMensaje2("|          MENU PRINCIPAL          |");
            pantallaObj2.mostrarMensaje2("|                                  |");
            pantallaObj2.mostrarMensaje2("|   1. Q20            4. Q100      |");
            pantallaObj2.mostrarMensaje2("|   2. Q40            5. Q200      |");
            pantallaObj2.mostrarMensaje2("|   3. Q60            6. Cancelar  |");
            pantallaObj2.mostrarMensaje2("|                                  |");
            pantallaObj2.mostrarMensaje2("|  *Eliga un monto de retiro       |");
            pantallaObj2.mostrarMensaje2("|__________________________________|");  
                
                
                break;
                
            case 3:
                
                break;
                
            //default:
               // System.out.println(error);        
                                    
                

            }//switch   
        }while (opc !=4);
            
        }
        }
      
    
        
       
       /* private autentificar(){
        
        }*/
  
    

