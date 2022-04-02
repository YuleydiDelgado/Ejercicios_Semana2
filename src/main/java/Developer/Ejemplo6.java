
package Developer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejemplo6 {
    public static void main(String[] args) {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        String cantidadDinero;
        try{
            System.out.println("Cantidad:");
            cantidadDinero = leer.readLine();
            String cantidadCinco = Ejemplo6.obtenerBilletesDeCinco(cantidadDinero);
            System.out.println("Cantidad de Billetes de $5.00: " + cantidadCinco);
            
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
    public static String obtenerBilletesDeCinco(String cantidadDinero){
        double montoDinero = Double.parseDouble(cantidadDinero);
        int billetesCinco = (int) montoDinero/5;
        String resultado = String.valueOf(billetesCinco);
        return resultado;
    }
    
}
