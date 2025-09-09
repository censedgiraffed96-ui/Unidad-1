
package eva1_16_numero_mayor;

import java.util.Scanner;


public class EVA1_16_NUMERO_MAYOR {

    
    public static void main(String[] args) {
        int num1, num2;
        Scanner captu = new Scanner(System.in);
        
        System.out.println("Introduce el primer numero: ");
        num1 = captu.nextInt();
        
        System.out.println("Introduce el segundo numero: ");
        num2 = captu.nextInt();
        
        if (num1 > num2) {
        System.out.println("El numero mayor es:  ");
        System.out.println(num1);
    } else { //Nos queda que num2 > num1 o num2 == num2
            //If anidado
        if (num2 > num1){
                System.out.println("El numero mayor es: ");
                System.out.println(num2);
        }else{
                System.out.print("Los numeros son iguales ");
            }   
}
    }
}
