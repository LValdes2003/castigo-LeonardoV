import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce números enteros positivos. Introduce un número negativo para terminar.");

        // Inicializar el mínimo y el máximo con valores iniciales
        int minimo = Integer.MAX_VALUE;
        int maximo = Integer.MIN_VALUE;

        // Leer números hasta que se introduzca un número negativo
        while (true) {
            System.out.print("Introduce un número: ");
            int numero = scanner.nextInt();

            // Verificar si se ha introducido un número negativo para terminar
            if (numero < 0) {
                break;
            }

            // Actualizar el mínimo y el máximo según sea necesario
            if (numero < minimo) {
                minimo = numero;
            }
            if (numero > maximo) {
                maximo = numero;
            }
        }

        // Mostrar el mínimo y el máximo
        if (minimo == Integer.MAX_VALUE && maximo == Integer.MIN_VALUE) {
            System.out.println("No se introdujeron números positivos.");
        } else {
            System.out.println("Mínimo: " + minimo);
            System.out.println("Máximo: " + maximo);
        }

        scanner.close();
    }
}
