/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.factura;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class Factura {
    
        

   
    public static void main(String[] args) {
        Scanner Prod = new Scanner(System.in);
        String Nombre;
        double Precio;
        int Cantidad;
        double SubTotal;
        double Total;
        double Total2;
        double Impuesto;
        double ISV=0.18;
        double Descuento=0.1;
        System.out.println("Que producto desea comprar:");
        Nombre=Prod.next();
        System.out.println("Cual es el precio unitario:"+Nombre+"?");
        Precio=Prod.nextDouble();
        System.out.println("Cuantas unidades del producto:"+Nombre+" desea llevar.");
        Cantidad=Prod.nextInt();
        SubTotal=Precio*Cantidad;
        Impuesto=SubTotal*ISV;
        Total=SubTotal+Impuesto;
        if(Total>5000){
            Total2=Total+Descuento+(Total);
            System.out.println("----------Factura----------"+
                    "\nProducto:"+Nombre
                    +"\nPrecio:"+Precio
                    +"\nCantidad:"+Cantidad
                    +"\nSubTotal:"+SubTotal
                    +"\nImpuesto:"+Impuesto
                    +"\nTotal:"+Total
                    +"\nDescuento:"+(Total*Descuento)
                    +"\nTotal a pagar:"+Total2);
            
            }else{
                  System.out.println("----------Factura----------"+
                    "\nProducto:"+Nombre
                    +"\nPrecio:"+Precio
                    +"\nCantidad:"+Cantidad
                    +"\nSubTotal:"+SubTotal
                    +"\nImpuesto:"+Impuesto
                    +"\nTotal:"+Total);
                    }  
            
        
    }
        
    }
     

