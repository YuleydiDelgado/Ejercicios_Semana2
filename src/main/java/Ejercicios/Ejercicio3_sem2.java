
package Ejercicios;

import java.util.Scanner;
public class Ejercicio3_sem2 {
    public static void main(String[] args) {
        double salarioBase = 800.00;
        double salario = 0.0;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Introduzca la cantidad de autos vendidos");
        double n = leer.nextDouble();
        
        System.out.println("Introduzca el nombre de el vendedor");
        String nombre = leer.next();
        
        //System.out.println("Cuantas ventas realizo en el mes: ");
        //int xVentas = leer.next();
        double com = comisionAutosDos();
        
        //comisionAutosVendidos(n);
        salario = salarioBase + comisionAutosVendidos(n) + com;
        
        System.out.println("El salario del trabajador es: $" + salario);
        System.out.println("El nombre de el trabajador es: " + nombre);
        
    }
     public static double comisionAutosVendidos(double cantidad) {
         //double comi = 170;
         double totalComision= 170 * cantidad;
         return totalComision;
     }

    private static double comisionAutosDos() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
     }
    
