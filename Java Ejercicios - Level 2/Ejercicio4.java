/* Cargar un arrayList con 12 nombres de estudiantes (String), luego separarlos
en 3 cursos (3 arrayList) e imprimir dichos cursos. */

import java.util.*;

public class Ejercicio4 {
    public static void main(String[] args) {
        ArrayList<String> estudiantes = new ArrayList<String>();
        estudiantes.add("Nicolás");
        estudiantes.add("Javier");
        estudiantes.add("Hernan");
        estudiantes.add("Leonardo");
        estudiantes.add("Alejandro");
        estudiantes.add("Rodrigo");
        estudiantes.add("Roberto");
        estudiantes.add("Augusto");
        estudiantes.add("Lucia");
        estudiantes.add("Ivana");
        estudiantes.add("Frodo");
        estudiantes.add("Frida");
        List<String> curso1 = estudiantes.subList(0, 4);
        List<String> curso2 = estudiantes.subList(4, 8);
        List<String> curso3 = estudiantes.subList(8, 12);
        System.out.println("Curso - 1: " + curso1);
        System.out.println("Curso - 2: " + curso2);
        System.out.println("Curso - 3: " + curso3);
    }
}
