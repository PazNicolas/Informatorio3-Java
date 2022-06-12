/* Se desea una aplicación que solicite 2 números enteros y realice la operación
de potencia (sin uso de librerías).*/
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Ingrese el primer número ");
            int numero1 = sc.nextInt();
            System.out.println("Ingrese el segundo número ");
            int numero2 = sc.nextInt();
            int potencia = 1;

            for (int i = 1; i <= numero2; i++) {
                potencia = potencia * numero1;
            }
            System.out.println("El resultado de la potencia es: " + potencia);
        }
    }
}