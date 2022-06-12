/* Realizar un programa que solicite por consola 2 números enteros. Para luego
imprimir el resultado de la suma, resta, multiplicación, división y módulo (resto
de la división) de ambos números. */

import java.util.Scanner;
public class Ejercicio2 {

    public static void main(String args[]) {

        try (Scanner teclado = new Scanner(System.in)) {
            System.out.print("Introduzca el primer número: ");
            int primerNumero = teclado.nextInt();
            System.out.print("Introduzca el segundo número: ");
            int segundoNumero = teclado.nextInt();

            System.out.print("La suma es: ");
            System.out.println(primerNumero + segundoNumero);
            System.out.print("La resta es: ");
            System.out.println(primerNumero - segundoNumero);
            System.out.print("La multiplicacion es: ");
            System.out.println(primerNumero * segundoNumero);
            System.out.print("La division es: ");
            System.out.println(primerNumero / segundoNumero);
            System.out.print("El resto es: ");
            System.out.println(primerNumero % segundoNumero);
        }
    }
}