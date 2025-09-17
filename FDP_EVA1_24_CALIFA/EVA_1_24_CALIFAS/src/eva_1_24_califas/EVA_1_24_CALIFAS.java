
package eva_1_24_califas;

import java.util.Scanner;


public class EVA_1_24_CALIFAS {
    
    
    public static void main(String[] args) {
        int califa;
        Scanner captu = new Scanner(System.in);
        System.out.println("Califa asignada:  ");
        califa = captu.nextInt();
        
        if ((califa >= 90)&&(califa <= 100)){
        System.out.println("Calificacion igual: A");
        }else if((califa >= 80)&&(califa <= 89)){
        System.out.println("Calificacion igual: B");
        }else if((califa >= 70)&&(califa <= 79)){
        System.out.println("Calificacion igual: C");
        }else if((califa >= 60)&&(califa <= 69)){
        System.out.println("Calificacion igual: D");
        }else if((califa >= 0)&&(califa <= 59)){
        System.out.println("Calificacion igual: F");
        }else{
            System.out.println("La calificacion no es valida ");
        }
        
        
    }
    
}
