public class Main {
    public static void main(String[] args) {
        int n = 10; // Los 10 primeros números naturales

        // Generar las tablas de multiplicar de los 10 primeros números naturales
        int[][] tablas = generarTablasMultiplicar(n);

        // Mostrar las tablas de multiplicar
        for (int i = 0; i < n; i++) {
            System.out.println("Tabla de multiplicar del " + (i + 1) + ":");
            for (int j = 0; j < 10; j++) {
                System.out.println((i + 1) + " x " + j + " = " + tablas[i][j]);
            }
            System.out.println();
        }
    }

    // Función para generar las tablas de multiplicar de los N primeros números
    private static int[][] generarTablasMultiplicar(int n) {
        int[][] tablas = new int[n][10];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 10; j++) {
                tablas[i][j] = (i + 1) * j;
            }
        }
        return tablas;
    }
}
