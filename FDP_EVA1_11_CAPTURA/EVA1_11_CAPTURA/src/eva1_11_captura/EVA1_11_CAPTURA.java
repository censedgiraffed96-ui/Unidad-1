
package eva1_11_captura;

import java.util.Scanner;


public class EVA1_11_CAPTURA {

    
    public static void main(String[] args) {
        //CALCULO DE VELOCIDAD
        //SOLICITAR DISTANCIA (m) Y TIEMPO (s)
        //Calcular la velocidad (m/s)
        //DECLARAR VARIABLES Y SCANNER
        Scanner input = new Scanner (System.in);
        double v, t, m, kmh;
        //SOLICITAR DATOS
        System.out.println("El tiempo recorrido es (S): ");
        t = input.nextDouble();
        System.out.println("Los metros recorridos son (m): ");
        m = input.nextDouble();
        //REALIZAR CALCULOS
        v = m / t;
        //MOSTRAR RESULTADOS
        System.out.println("La velocidad (m/s) es; ");
        System.out.print(v);
        System.out.println("m/s");
        //Formula en kilometros
        kmh = v * 3.6;
        System.out.println("La velocidad en kmh es; ");
        System.out.print(kmh);
        System.out.println("kmh");
        
        
    }
    
}
