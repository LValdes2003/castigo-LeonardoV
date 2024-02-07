import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer un número entero desde el teclado
        System.out.print("Introduce un número entero positivo: ");
        int numero = scanner.nextInt();

        // Obtener los factores primos del número ingresado
        ArrayList<Integer> factoresPrimos = obtenerFactoresPrimos(numero);

        // Imprimir los factores primos
        System.out.println("Factores primos de " + numero + ":");
        for (int factor : factoresPrimos) {
            System.out.print(factor + " ");
        }

        scanner.close();
    }

    // Función para obtener los factores primos de un número dado
    private static ArrayList<Integer> obtenerFactoresPrimos(int numero) {
        ArrayList<Integer> factoresPrimos = new ArrayList<>();

        // Dividir el número por 2 mientras sea divisible por 2
        while (numero % 2 == 0) {
            factoresPrimos.add(2);
            numero /= 2;
        }

        // Buscar factores primos impares
        for (int i = 3; i <= Math.sqrt(numero); i += 2) {
            while (numero % i == 0) {
                factoresPrimos.add(i);
                numero /= i;
            }
        }

        // Si el número es primo y mayor que 2
        if (numero > 2) {
            factoresPrimos.add(numero);
        }

        return factoresPrimos;
    }
}
