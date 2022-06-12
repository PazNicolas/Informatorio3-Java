public class Ejercicio7 {
    public static String[] fizzBuzzFuncion(int a, int b) {
        String out = "";
        String n = "";
        for (int i = a; i < b - 1; i++) {
            n = String.valueOf(i);
            if (i % 2 == 0)
                n = "Fizz";
            if (i % 3 == 0)
                n = "Buzz";
            if (i % 2 == 0 && i % 3 == 0)
                n = "FizzBuzz";
            out = out + " " + n;
        }
        out = out + " " + String.valueOf(b - 1);
        return out.split(" ");
    }

    public static void main(String[] args) {
        String[] Fizz = fizzBuzzFuncion(2, 10);
        System.out.print("[");
        for (String string : Fizz) {
            System.out.print(" " + string);
        }
        System.out.print(" ]");
        System.out.println();
    }
}