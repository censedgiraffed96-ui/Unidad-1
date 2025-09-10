
package eva1_19_acceso;

import java.util.Scanner;


public class EVA1_19_ACCESO {
    //constantes (No se le pude cambiar el valor, no hay cambios)
    final static String ACCES_USU = "ARATH";
    final static String ACCESS_CONTRA = "070221";
    //final static double pi = "3.1416";
    
    public static void main(String[] args) {
        String usuario, contraseña;
        Scanner captu = new Scanner(System.in);
        
        System.out.println("*****CONTROL DE ACCESO*****");
        System.out.println("Restaurante el Pie Grande");
        System.out.println("Usuario: ");
        usuario = captu.nextLine();
        System.out.println("Contraseña: ");
        contraseña = captu.nextLine();
       
        if(usuario.equals(ACCES_USU)){
            if(contraseña.equals(ACCESS_CONTRA)){
            System.out.println("ACCESO CONCEDIDO");
        }else{
            System.out.println("ACCESO DENEGADO");
        }
       }else{
            System.out.println("Incorrecto");
           
    }
        }
    
}
