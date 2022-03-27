
package Semana2;

import static java.lang.System.in;
import java.util.Scanner;
public class Ejercicio2_sem2 {
    
    public static void main(String[] args) {
        double DAI;
        double depreciacion = 0.10;
        double totala;
        double totalb;
        double totalc = 0;
        double mult1 = 0.25;
        double mult2 = 0.10;
        double tota1a;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el valor del vehiculo en USA");
        double valorV = leer.nextDouble();
        
        System.out.println("Ingrese el costo con flete");
        double flete = leer.nextDouble();
        
        System.out.println("Ingrese el valor de seguro");
        double seguro = leer.nextDouble();
        
        DAI = valorV * depreciacion;
        totala = valorV -DAI;
        totalb = totala - flete;
        totalc = totalc * mult1;
        
        System.out.println("El valor por Derecho Arancelario a la importacion de su vehiculo es de: $" + totala);
        
        depreciacion = valorV * mult2;
        
        System.out.println("El valor de Depreciacion es de: $" + depreciacion);
    }
    
}
