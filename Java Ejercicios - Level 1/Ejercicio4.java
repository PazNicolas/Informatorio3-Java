/*Realizar un programa que calcule el factorial de un número:
n! = 1 x 2 x 3 x 4 x 5 x … x (n-1) x n.
Sin hacer uso de librerías.*/
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.println("Ingrese el numero para conocer su factorial: ");
            int factor = teclado.nextInt();
            int factorial = 1;
            int numero = factor;
            while (numero != 0) {
                factorial = factorial * numero;
                numero--;
            }
            System.out.println("el factorias es :" + factorial);
        }
    }

}
