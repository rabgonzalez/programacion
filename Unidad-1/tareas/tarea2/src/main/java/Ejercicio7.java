/**
 * @author rabgonzalez
 * Ejercicio Numero 2
 */
import java.util.Scanner;

public class Ejercicio7 {

    /**
     * Descripcion del algoritmo
     * @param args
     */
    static Scanner lectura = new Scanner(System.in);
    public static void main(String[] args)
    {
        double numero;
        System.out.println("Introduce el valor:");
        numero = lectura.nextDouble();
        double n = numero / 3.6;
        System.out.println("el autormovil va a: " + n + " m/s");
    }
}
