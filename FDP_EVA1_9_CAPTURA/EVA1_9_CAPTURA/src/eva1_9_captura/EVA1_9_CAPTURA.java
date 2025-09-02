
package eva1_9_captura;

import java.util.Scanner;
        
public class EVA1_9_CAPTURA {

    
    public static void main(String[] args) {
        String nombre;
        int edad;
        double promedio;
        Scanner captu = new Scanner (System.in);
         
        //Como capturar java
        System.out.println("Introduzca el nombre completo: ");
        nombre = captu.nextLine(); //nextline()--->captura texto
        
        System.out.println("Introduce la edad:");
        edad = captu.nextInt();
        
        System.out.println("Captura el promedio");
        promedio = captu.nextDouble();
        
        System.out.println("El nombre capturado es: ");
        System.out.println(nombre);
        System.out.println("La edad es; ");
        System.out.println(edad);
        System.out.println("El promedio es: ");
        System.out.println(promedio);
        
    }
    
}
