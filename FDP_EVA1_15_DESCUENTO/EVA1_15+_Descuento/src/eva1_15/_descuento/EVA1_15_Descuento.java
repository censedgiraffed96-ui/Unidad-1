/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_15._descuento;

import java.util.Scanner;

/**
 *
 * @author Arath
 */
public class EVA1_15_Descuento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // int venta;
       double monto, venta;
       Scanner captu = new Scanner (System.in);
       //Captura
       System.out.println("Introduce el valor de la venta:  ");
       venta = captu.nextInt();
       //Estructura de control IF - THEN - ELSE
       //if Solo evalua verdadero (true) falso (false)
       if (venta > 1000) { //seccion de falso
           System.out.println("Se aplicara el descuento del 15%!! ");
           monto = venta * .85;
           System.out.println("El monto a pagar es: ");
           System.out.println(monto);
           //Aqui va lo que corresponde a verdadero
       } else{             //Seccion falso (Opcional)
           System.out.println("No aplica el descuento: ");
       }
    }
}
