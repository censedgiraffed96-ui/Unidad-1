
package eva1_15_descuento;

import java.util.Scanner;


public class EVA1_15_DESCUENTO {

    
    public static void main(String[] args) {
        //Declaracion de variables
       int venta;
       double descuento, precio;
       Scanner captu = new Scanner (System.in);
       //Captura
       System.out.println("Introduce el valor de la venta:  ");
       venta = captu.nextInt();
       //Estructura de control IF - THEN - ELSE
       //if Solo evalua verdadero (true) falso (false)
       if (venta >= 1000) { //seccion de falso
           System.out.println("Se aplicara el descuento del 15%!! ");
           descuento = venta * .15;
           System.out.println(descuento);
           System.out.println("El precio con descuento quedaria; ");
           precio = venta - descuento;
           System.out.println(precio);
           //Aqui va lo que corresponde a verdadero
       } else{             //Seccion falso (Opcional)
           System.out.println("No aplica el descuento: ");
    }
}
}
