import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario las dimensiones del vector
        System.out.print("Introduce la dimensión de los vectores: ");
        int dimension = scanner.nextInt();

        // Obtener los dos vectores del usuario
        int[] vector1 = obtenerVector(scanner, dimension);
        int[] vector2 = obtenerVector(scanner, dimension);

        // Calcular el producto escalar
        int productoEscalar = calcularProductoEscalar(vector1, vector2);

        // Imprimir el resultado
        System.out.println("El producto escalar de los dos vectores es: " + productoEscalar);

        scanner.close();
    }

    // Función para obtener un vector del usuario
    private static int[] obtenerVector(Scanner scanner, int dimension) {
        int[] vector = new int[dimension];
        System.out.println("Introduce los elementos del vector separados por espacios:");

        for (int i = 0; i < dimension; i++) {
            vector[i] = scanner.nextInt();
        }

        return vector;
    }

    // Función para calcular el producto escalar de dos vectores
    private static int calcularProductoEscalar(int[] vector1, int[] vector2) {
        int productoEscalar = 0;

        // Asumiendo que ambos vectores tienen la misma longitud
        for (int i = 0; i < vector1.length; i++) {
            productoEscalar += vector1[i] * vector2[i];
        }

        return productoEscalar;
    }
}
