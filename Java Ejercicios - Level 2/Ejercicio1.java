/* Crear un ArrayList y cargarlo con tus ciudades favoritas de Argentina, luego
imprimir por pantalla el ranking */

public class Ejercicio1 {
    public static void main(String args[]) {
        String[] ciudades = { "#1 - Barranqueras", "#2 - Resistencia ", "#3 - Cordoba", "#4 - Salta", "#5 - Corrientes" };
        for (int i = 0; i < ciudades.length; i++) {
            System.out.println(ciudades[i]);
        }

    }
}
