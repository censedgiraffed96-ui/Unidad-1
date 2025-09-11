
package eva1_23_compras;

import java.util.Scanner;


public class EVA1_23_COMPRAS {
    final static String Efectivo = "Si";
    final static String Credito = "Si";
    
    public static void main(String[] args) {
        String Efe, Cred;
        Scanner captu = new Scanner(System.in);
        
        System.out.println("Control De P");
        System.out.println("Muebleria La Ballenita");
        System.out.println("Porta efectivo? Si/No ");
        Efe = captu.nextLine();
        System.out.println("Tiene credito Si/No ");
        Cred = captu.nextLine();
        //OPERADOR AND (Y)
        if(Efe.equals(Efectivo) ||Cred.equals(Credito)){
         System.out.println("Puede comprar!!");
        }else{
         System.out.println("No puede comprar");
    }
    }
}
