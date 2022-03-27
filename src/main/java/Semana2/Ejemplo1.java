

package Semana2;


public class Ejemplo1 {

    public static void main(String[] args) {
        //Se hace el llamado cada de los metodos creados
        metodoConVoid();
        metodoConInt();
        metodoConDouble();
        metodoConString();
        }
    public static void metodoConVoid(){
        System.out.println("Contenido del metodo con void");
        } 
    public static void metodoConInt(){
        System.out.println("Contenido del metodo con Int");
    }
    public static void metodoConDouble(){
         System.out.println("Contenido del metodo con double");
    }
    public static String metodoConString(){
        System.out.println("Contenido del metodo con String");
        return "";
        }
}

    
