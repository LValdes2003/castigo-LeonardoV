import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario las dimensiones de la matriz
        System.out.print("Introduce el tamaño de la matriz cuadrada: ");
        int dimension = scanner.nextInt();

        // Rellenar y mostrar la matriz simétrica
        int[][] matriz = generarMatrizSimetrica(dimension);
        imprimirMatriz(matriz);

        scanner.close();
    }

    // Función para generar una matriz cuadrada simétrica con números aleatorios
    private static int[][] generarMatrizSimetrica(int dimension) {
        int[][] matriz = new int[dimension][dimension];
        Random random = new Random();

        // Rellenar la mitad superior de la matriz (incluyendo la diagonal principal)
        for (int i = 0; i < dimension; i++) {
            for (int j = i; j < dimension; j++) {
                int numeroAleatorio = random.nextInt(101); // Números aleatorios entre 0 y 100
                matriz[i][j] = numeroAleatorio;
                matriz[j][i] = numeroAleatorio; // Simetría: reflejar el valor en la mitad inferior
            }
        }

        return matriz;
    }

    // Función para imprimir una matriz
    private static void imprimirMatriz(int[][] matriz) {
        System.out.println("Matriz generada:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
