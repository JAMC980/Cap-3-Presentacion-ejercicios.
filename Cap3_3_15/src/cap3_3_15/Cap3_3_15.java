/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cap3_3_15;

import java.util.Scanner;


public class Cap3_3_15 {

    
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta("Jane Green", 50.00);
        Cuenta cuenta2 = new Cuenta("John Blue", -7.53);

        
        mostrarCuenta(cuenta1);
        mostrarCuenta(cuenta2);
        

        Scanner entrada = new Scanner(System.in);

        System.out.print("Escriba el monto a depositar para cuenta1: "); 
        double montoDeposito = entrada.nextDouble(); 
        System.out.printf("%nsumando %.2f al saldo de cuenta1%n%n",
        montoDeposito);
        cuenta1.depositar(montoDeposito);

       
        mostrarCuenta(cuenta1);
        mostrarCuenta(cuenta2);
      

        System.out.print("Escriba el monto a depositar para cuenta2: ");
        montoDeposito = entrada.nextDouble();
        System.out.printf("%nsumando %.2f al saldo de cuenta2%n%n",
        montoDeposito);
        cuenta2.depositar(montoDeposito); 

     
        mostrarCuenta(cuenta1);
        mostrarCuenta(cuenta2);
       
        } 
    public static void mostrarCuenta(Cuenta cuentaAMostrar){
        System.out.printf("Saldo de %s: $%.2f%n",cuentaAMostrar.obtenerNombre(), cuentaAMostrar.obtenerSaldo()); 
        cuentaAMostrar.obtenerSaldo();
      
    }
} 
