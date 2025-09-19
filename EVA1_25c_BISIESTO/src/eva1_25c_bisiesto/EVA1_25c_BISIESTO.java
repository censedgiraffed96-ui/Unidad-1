
package eva1_25c_bisiesto;

import java.util.Scanner;


public class EVA1_25c_BISIESTO {

    
    public static void main(String[] args) {
    Scanner captu = new Scanner(System.in);
    int Year;
    
       System.out.println("Introduce el año:");
       Year = captu.nextInt();
    
        if (Year % 4 != 0){
         System.out.println("No es un año Bisiesto");
        } 
        if ((Year % 100 == 0) && (Year % 400 != 0)){
         System.out.println("No es un año Bisiesto");
        }
        if ((Year % 100 == 0) && (Year % 400 == 0)){
         System.out.println("Es un año Bisiesto");
        }
        if ((Year % 4 == 0) && (Year % 100 != 0)){
         System.out.println("Es un año Bisiesto");
        }
    }    
}
