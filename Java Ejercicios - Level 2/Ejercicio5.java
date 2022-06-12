import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Ejercicio5 {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Ingresar horas trabajadas por dia (de Lunes a Viernes) separadas por un  ¨,¨: ");
        String ingreso = sc.readLine();
        ArrayList<Integer> hsArray = new ArrayList<Integer>();
        for (String x : ingreso.split(",")) {
            hsArray.add(Integer.valueOf(x));
        }
        ;
        System.out.print("Ingresar pago por horas trabajadas (de Lunes a Viernes) separadas por un ¨,¨: ");
        ingreso = sc.readLine();
        ArrayList<Integer> valueArray = new ArrayList<Integer>();
        for (String x : ingreso.split(",")) {
            valueArray.add(Integer.valueOf(x));
        }
        ArrayList<Integer> totalArray = new ArrayList<Integer>();
        for (int i = 0; i < hsArray.size(); i++) {
            totalArray.add((hsArray.get(i) * valueArray.get(i)));
        }
        System.out.println("Ganancias por dia :" + totalArray);

        int suma = 0;
        for (Integer i : totalArray) {
            suma = suma + i;
        }
        System.out.println("Dinero total ganado en la semana: $ " + suma);

    }
}
