
package Ejercicios;

import java.util.Scanner;
public class Ejercicio1sem_2 {
    
    public static void main(String [] args){
         /*Escriba  un  programa  que  imprima  por  pantalla  cuánto  le  costará
comprar  una computadora  a un determinado precio  si sabe que puede conseguir
una rebaja del 15%. No  olvidar  que  al  precio  del  artículo  se  le  debe  
de  agregar  el  IVA.  El  programa  deberá permitir  digitar  el  precio  de  
la  computadora  y deberá  de  realizar  los  cálculos correspondientes.*/
       
         double rebaja = 0.15;
         double IVA = 0.13;
         double precio = 0.0;
         double precioF;
         double total;
         Scanner leer = new Scanner (System.in);
         
         System.out.println("Ingrese el precio de la computadora");
         double n = leer.nextDouble();
         
         precio = n * IVA;
         precio = n + precio;
         precioF = precio * rebaja;
         total = precio - precioF;
         
         System.out.println("El precio total es: $" + total);
    }
    
}
