
package eva1_13_if;

import java.util.Scanner;


public class EVA1_13_IF {

   
    public static void main(String[] args) {
       //Declaracion de variables
       double califa;
       Scanner captu = new Scanner (System.in);
       //Captura
       System.out.println("Introduce la calificación: ");
       califa = captu.nextDouble();
       //Estructura de control IF - THEN - ELSE
       //if Solo evalua verdadero (true) falso (false)
       if (califa >= 70) { //seccion de falso
           System.out.println("Felicidades, acreditaste!!");
           //Aqui va lo que corresponde a verdadero
       } else{             //Seccion falso (Opcional)
           System.out.println("Que bruto pongale 0  ");
       }
    }
    
}
