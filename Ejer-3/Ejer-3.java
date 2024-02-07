import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Obtener todos los múltiplos de 5 entre 1 y 100
        int[] multiplosDe5 = obtenerMultiplosDe5(1, 100);

        // Calcular la suma de los múltiplos de 5
        int suma = sumarArray(multiplosDe5);

        // Mostrar la cantidad de múltiplos y la suma
        System.out.println("Cantidad de múltiplos de 5: " + multiplosDe5.length);
        System.out.println("Suma de los múltiplos de 5: " + suma);

        // Mostrar cada uno de los múltiplos de 5
        System.out.println("Múltiplos de 5:");
        for (int multiplo : multiplosDe5) {
            System.out.println(multiplo);
        }
    }

    // Función para obtener los múltiplos de 5 dentro de un rango dado
    private static int[] obtenerMultiplosDe5(int begin, int end) {
        ArrayList<Integer> multiplos = new ArrayList<>();
        for (int i = begin; i <= end; i++) {
            if (i % 5 == 0) {
                multiplos.add(i);
            }
        }
        return multiplos.stream().mapToInt(i -> i).toArray();
    }

    // Función para sumar todos los elementos de un array
    private static int sumarArray(int[] array) {
        int suma = 0;
        for (int elemento : array) {
            suma += elemento;
        }
        return suma;
    }
}
