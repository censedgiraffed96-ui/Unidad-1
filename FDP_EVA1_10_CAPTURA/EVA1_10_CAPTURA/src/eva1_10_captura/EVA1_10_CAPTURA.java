
package eva1_10_captura;

import java.util.Scanner;


public class EVA1_10_CAPTURA {

   
    public static void main(String[] args) {
        //sOLICITAR LA TEMPERATURA DE FAHRENHEIT
        Scanner input = new Scanner (System.in);
        double far, cent;
        //Captura
        System.out.println("Temperatura en grados Fahrenheit; ");
        far= input.nextDouble();
        //DAARLE LA TEMPERATURA EN GRADOS CENTIRGRADOS
        cent = 5 * (far-32) / 9;
        System.out.println("La temperatura es; ");
        System.out.println(cent);
       
    }
    
}
