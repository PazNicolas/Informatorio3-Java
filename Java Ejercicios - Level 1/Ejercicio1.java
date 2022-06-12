/*Solicitar por consola el nombre del usuario e imprimir por pantalla el siguiente
mensaje “HOLA {USUARIO}!!!”*/

import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        try (Scanner lectura = new Scanner(System.in)) {
            System.out.println("Ingrese su nombre: ");
            String nombre = lectura.next();
            System.out.println("Hola " + nombre + "!!!");
        }

    }
}