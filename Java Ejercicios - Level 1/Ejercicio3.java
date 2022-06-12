/*Confeccionar un programa que dado un número entero como dato de entrada
imprima la secuencia de números (incrementos de 1)*/

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        int pisos;
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.println("ingrese el numero");
            pisos = teclado.nextInt();
        }
        for (int i = 1; i <= pisos; i++) {
            System.out.println("");
            for (int x = 1; x <= i; x++) {
                System.out.print(x);

            }
        }
        System.out.println("");
    }
}
