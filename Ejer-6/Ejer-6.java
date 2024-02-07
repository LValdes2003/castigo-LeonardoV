public class Main {
    public static void main(String[] args) {
        int n = 10; // Número de primeros números primos a encontrar

        // Obtener los N primeros números primos
        int[] primerosPrimos = obtenerPrimerosNPrimos(n);

        // Mostrar los N primeros números primos
        System.out.println("Los " + n + " primeros números primos son:");
        for (int primo : primerosPrimos) {
            System.out.print(primo + " ");
        }
    }

    // Función para obtener los N primeros números primos
    private static int[] obtenerPrimerosNPrimos(int n) {
        int[] primos = new int[n];
        int contador = 0;
        int numero = 2; // Empezamos con el primer número primo

        while (contador < n) {
            if (esPrimo(numero)) {
                primos[contador] = numero;
                contador++;
            }
            numero++;
        }

        return primos;
    }

    // Función para verificar si un número es primo
    private static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
