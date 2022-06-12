/*Realizar un programa que dado un String de entrada en minúsculas lo
convierta por completo a mayúsculas. Sin uso de métodos o librerías que
realicen toUppercase().*/

import java.util.Scanner;

class Ejercicio7 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String str;
            StringBuilder minusculas = new StringBuilder();

            System.out.println("Ingrese un string en minusculas: ");
            str = sc.nextLine();

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                    minusculas.append((char) (str.charAt(i) - 32));
                } else {
                    minusculas.append(str.charAt(i));
                }
            }

            System.out.println(minusculas);
        }
    }

}
