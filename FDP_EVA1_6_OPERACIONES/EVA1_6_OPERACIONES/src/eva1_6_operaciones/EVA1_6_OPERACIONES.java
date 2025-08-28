
package eva1_6_operaciones;


public class EVA1_6_OPERACIONES {

  //Area de un circulo 
    public static void main(String[] args) {
        //declaracion de variables
        double area;
        double radio;
        double pi;
        //Inicializacion
        pi = 3.1416;
        radio = 5;
        area = pi * radio * radio;
        //Imprimir:
        System.out.println("El area de un circulo de radio=5 es:");
        System.out.println(area);
        //nuevo circulo radio 100
        radio = 100;
        area= pi * radio * radio;
        System.out.println("El area de un circulo de radio = 100 es:");
        System.out.println(area);
    }
    
}
