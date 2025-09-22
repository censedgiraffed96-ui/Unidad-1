
package eva1_28_moneda;

import java.util.Scanner;


public class EVA1_28_MONEDA {

    
    public static void main(String[] args) {
    Scanner captu = new Scanner (System.in);
    String usuario, moneda;
    
    System.out.println("Elige Aguila o Sello (1/0)");
    usuario = captu.nextLine();
    
    double aleatorio = Math.random();
    System.out.println("Numero: " + aleatorio);
    
    if (aleatorio > 0.5){
        moneda = "1";
        System.out.println("Aguila");
        
    }else{
        moneda = "2";
        System.out.println("Sello");
    }
    if (usuario.equals(moneda)){
        System.out.println("Ganador");
    }else{
        System.out.println("Perdedor");
    }
    }
    
}
