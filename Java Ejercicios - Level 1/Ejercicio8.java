/*Crear una aplicación que solicite de entrada los datos de una persona en este orden:
Nombre y Apellido
Edad
Dirección
Ciudad
Luego imprimirá el siguiente mensaje:
{Ciudad} - {Dirección} - {Edad} - {Nombre y Apellido}*/


import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.println("Introduzca su nombre y apellido: ");
            String nombre = teclado.nextLine();

            System.out.println("Introduzca su edad: ");
            String edad = teclado.nextLine();

            System.out.println("Introduzca su direccion: ");
            String direccion = teclado.nextLine();

            System.out.println("Introduzca su ciudad: ");
            String ciudad = teclado.nextLine();
            
            System.out.println(ciudad + " - " + direccion + " - " + edad + " - "+ nombre );
        }

    }
}
