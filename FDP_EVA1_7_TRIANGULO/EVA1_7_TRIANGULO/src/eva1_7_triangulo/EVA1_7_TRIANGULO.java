
package eva1_7_triangulo;


public class EVA1_7_TRIANGULO {
    
    public static void main(String[] args) {
      //Area de un triangulo
      //Area = (Base x altura) entre 2;
      double area, base, altura;//tres variables de tipo double
      //Inicializacion
      base = 11;
      altura = 3;
      //se aplica la presedencia de operaciones
      area = base * altura / 2.0; //Cuidado con dividir entre enteros
      System.out.println("El valor de un triangulo de base =11 y altura = 3 es;");
      System.out.println(area);
      
    }
    
}
