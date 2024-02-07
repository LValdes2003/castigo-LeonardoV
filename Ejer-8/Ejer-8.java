import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Obtener los números del usuario
        int[] numeros = obtenerNumeros(scanner);

        // Calcular la media, el mínimo y el máximo
        double media = calcularMedia(numeros);
        int minimo = encontrarMinimo(numeros);
        int maximo = encontrarMaximo(numeros);

        // Mostrar los resultados
        System.out.println("Media: " + media);
        System.out.println("Mínimo: " + minimo);
        System.out.println("Máximo: " + maximo);

        scanner.close();
    }

    // Función para recibir N números enteros por teclado hasta que se introduzca un 0
    private static int[] obtenerNumeros(Scanner scanner) {
        System.out.println("Introduce números enteros. Introduce 0 para finalizar.");

        int capacidadInicial = 10; // Capacidad inicial del array
        int[] numeros = new int[capacidadInicial];
        int contador = 0;

        while (true) {
            int numero = scanner.nextInt();

            // Verificar si se debe redimensionar el array
            if (contador == numeros.length) {
                // Duplicar la capacidad del array
                numeros = redimensionarArray(numeros, numeros.length * 2);
            }

            // Agregar el número al array
            numeros[contador] = numero;
            contador++;

            // Si el número es 0, terminar el bucle
            if (numero == 0) {
                break;
            }
        }

        // Redimensionar el array al tamaño exacto
        numeros = redimensionarArray(numeros, contador);

        return numeros;
    }

    // Función para calcular la media de los elementos de un array
    private static double calcularMedia(int[] numeros) {
        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }
        return (double) suma / numeros.length;
    }

    // Función para encontrar el mínimo de los elementos de un array
    private static int encontrarMinimo(int[] numeros) {
        int minimo = Integer.MAX_VALUE;
        for (int numero : numeros) {
            if (numero < minimo) {
                minimo = numero;
            }
        }
        return minimo;
    }

    // Función para encontrar el máximo de los elementos de un array
    private static int encontrarMaximo(int[] numeros) {
        int maximo = Integer.MIN_VALUE;
        for (int numero : numeros) {
            if (numero > maximo) {
                maximo = numero;
            }
        }
        return maximo;
    }

    // Función para redimensionar un array
    private static int[] redimensionarArray(int[] array, int nuevaLongitud) {
        int[] nuevoArray = new int[nuevaLongitud];
        System.arraycopy(array, 0, nuevoArray, 0, Math.min(array.length, nuevaLongitud));
        return nuevoArray;
    }
}
