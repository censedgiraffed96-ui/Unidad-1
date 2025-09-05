
package eva1_12_operaciones_boleanas;


public class EVA1_12_OPERACIONES_BOLEANAS {

    
    public static void main(String[] args) {
        int radio = 5; //Declaracion e inicializo
        boolean resu; //True, false
        //USO DE OPERADORES BOOLEANOS:
        
        resu = radio < 0; //radio (5) < 0 = false
        System.out.println("radio (5) < 0 es: ");
        System.out.println(resu);
        
        resu = radio > 0; //radio (5) > 0 = true
        System.out.println("radio (5) > 0 es: ");
        System.out.println(resu);
        
        resu = radio == 0; //radio (5) = 0 = false
        System.out.println("radio (5) = 0 es: ");
        System.out.println(resu);
        
        resu = radio != 0; //radio (5) != 0 = false
        System.out.println("radio (5) != 0 es: ");
        System.out.println(resu);
        
        
    }
    
}
