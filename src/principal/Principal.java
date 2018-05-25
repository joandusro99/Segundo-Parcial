
package principal;
import java.util.Scanner;

public class Principal {

 
    public static void main(String[] args) {
   
        int X1;
        int Y1;
        int X2;
        int Y2;
        
         Principal miCalculador;
        miCalculador = new Principal();

        Scanner miScanner;
        miScanner = new Scanner(System.in);
        
        int entrada;
        System.out.println("Ingresar el valor de X1:");
        entrada = miScanner.nextInt();
        miCalculador.setX1(entrada);

        System.out.println("Ingresar el valor de Y1:");
        entrada = miScanner.nextInt();
        miCalculador.setY1(entrada);
        
        System.out.println("Ingresar el valor de X2:");
        entrada = miScanner.nextInt();
        miCalculador.setX2(entrada);

        System.out.println("Ingresar el valor de Y2:");
        entrada = miScanner.nextInt();
        miCalculador.setY2(entrada);
        
        miCalculador.sumar();
        System.out.println("El resultado de la suma es:");
        System.out.println(miCalculadora.getZ());

        miCalculador.restar();
        System.out.println("El resultado de la resta es:");
        System.out.println(miCalculadora.getZ());
        

    }
    
    
}
