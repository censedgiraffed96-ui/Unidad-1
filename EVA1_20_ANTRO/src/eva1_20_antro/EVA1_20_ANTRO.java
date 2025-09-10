
package eva1_20_antro;

import java.util.Scanner;


public class EVA1_20_ANTRO {
    final static String Mayor_de_18 = "18";
    final static String INE_MAY = "Porta";
    
    public static void main(String[] args) {
    String edad, crede;
    Scanner captu = new Scanner(System.in);
    System.out.println("*****CONTROL DE ENTRADA*****");
    System.out.println("ANTRO EL NInO FELIZ");
    System.out.println("Edad: ");
    edad = captu.nextLine();
    System.out.println("Credencial: ");
    crede = captu.nextLine();
    if (edad.equals(Mayor_de_18)){
        if (crede.equals(INE_MAY)){
        System.out.println("Adelante");
    }else{
        System.out.println("Denegado");
        }
    }else{
        System.out.println("Incorrecto");
    }
}
    }
