
package eva1_22_acceso_tabla;

import java.util.Scanner;


public class EVA1_22_ACCESO_TABLA {
    final static String ACCES_USU = "ARATH";
    final static String ACCESS_CONTRA = "070221";
    
    public static void main(String[] args) {
        String usuario, contraseña;
        Scanner captu = new Scanner(System.in);
        
        System.out.println("*****CONTROL DE ACCESO*****");
        System.out.println("Restaurante el Pie Grande");
        System.out.println("Usuario: ");
        usuario = captu.nextLine();
        System.out.println("Contraseña: ");
        contraseña = captu.nextLine();
        //OPERADOR AND (Y)
        if(usuario.equals(ACCES_USU) &&contraseña.equals(ACCESS_CONTRA)){ //Se pueden agregar ambos valores con los simbolos && que reoresentan tablas and
         System.out.println("ACCESO CONTENIDO!!");
        }else{
            System.out.println("ACCESO DENEGADO");
    }
       
       
    
    }   
}
