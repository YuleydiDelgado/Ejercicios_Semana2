
package Semana2;

import java.util.Scanner;
public class Ejercicio4_sem2 {
    public static void main(String[] args) {
        //Declaracion de variables
        double salario = 300.00;
        double comision = 50.00;
        double renta = 0.10;
        double salarioC;
        double salarioR;
        double salarioT;
        double Renta;
        double comi;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre de el vendedor");
        String nombre = leer.nextLine();
        
        System.out.println("Cuantas ventas realizo en el mes");
        double Venta = leer.nextDouble();
        
        comi = Venta * comision;
        
        salarioC = salario + comi;
        salarioR = salario * renta;
        salarioT = salarioC - salarioR;
        
        System.out.println("El salario total es de: $" + salarioT);
        
        Renta = salario * renta;
        double com = 0;
        double n = 0;
        double salarioBase = 0;
        salario = salarioBase + comisionAutosVendidos(n) + com;
        
        System.out.println("El salario del trabajador es: $" + salario);
        System.out.println("El nombre de el trabajo es: " + nombre);
                
}
    
    public static double comisionAutosVendidos(double cantidad) {
        //double comi = 170;
        double totalComision = 170 * cantidad;
        return totalComision;
    }
    public static double comisionAutosDos() {
        int xVentas = 3;
        double valorV1 = 5000;
        double valorV2 = 7000;
        double valorV3 = 15000;
        
        double comision = (valorV1 * 0.05) + (valorV2 * 0.05) + (valorV3 * 0.05);
        return comision;
    }
    
}
