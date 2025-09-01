
package eva1_8_temperatura;


public class EVA1_8_TEMPERATURA {

    
    public static void main(String[] args) {
        double Fahrenheit, Cel;
        Cel= 10;
        Fahrenheit= Cel * 1.8 + 32;
        System.out.println("1= El valor de 10 grados Celsius a Fahrenheit es: ");
        System.out.println(Fahrenheit);
        double Far;
        Far=10;
        Cel= 5 * (Far - 32) / 9;
        System.out.println("2= El valor de 10 grados Fahrenheit a Celsius es: ");
        System.out.println(Cel);
        double Kel;
        Cel=20;
        Kel= Cel + 273.15;
        System.out.println("3= El valor de 20 grados Celsius a Kelvin es: ");
        System.out.println(Kel);
        Cel=15;
        Far= ((9 * Cel) / 5) + 32;
        System.out.println("4= El valor de 15 grados Celsius a Fahrenheit es: ");
        System.out.println (Far);
        
    }
    
}
