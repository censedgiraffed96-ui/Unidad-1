/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_14_votar;

import java.util.Scanner;

/**
 *
 * @author Arath
 */
public class EVA1_14_VOTAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Declaracion de variables
       int año;
       Scanner captu = new Scanner (System.in);
       //Captura
       System.out.println("Introduce el año de nacimiento: ");
       año = captu.nextInt();
       //Estructura de control IF - THEN - ELSE
       //if Solo evalua verdadero (true) falso (false)
       if (año <= 2007) { //seccion de falso
           System.out.println("Puede votar!! ");
           //Aqui va lo que corresponde a verdadero
       } else{             //Seccion falso (Opcional)
           System.out.println("No puede votar!");
       }
    }
    
}
