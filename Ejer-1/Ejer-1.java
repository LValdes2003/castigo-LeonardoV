public class Main {
    // Definir variables que representan el número de días de un año, el número de horas que tiene un día,
    // el número de minutos que tiene una hora y el número de segundos que tiene un minuto.
    private static final int DIAS_POR_ANIO = 365;
    private static final int HORAS_POR_DIA = 24;
    private static final int MINUTOS_POR_HORA = 60;
    private static final int SEGUNDOS_POR_MINUTO = 60;

    // Función para calcular el número de segundos en un año
    private static int calcularSegundosEnAnio() {
        return DIAS_POR_ANIO * HORAS_POR_DIA * MINUTOS_POR_HORA * SEGUNDOS_POR_MINUTO;
    }

    // Función para calcular el número de segundos dados años, meses y días
    private static long calcularSegundos(int anios, int meses, int dias) {
        // Asumiendo un año promedio de 365 días y un mes promedio de 30 días
        long totalDias = anios * DIAS_POR_ANIO + meses * 30 + dias;
        return totalDias * HORAS_POR_DIA * MINUTOS_POR_HORA * SEGUNDOS_POR_MINUTO;
    }

    public static void main(String[] args) {
        // Calcular el número de segundos en un año
        int segundosEnAnio = calcularSegundosEnAnio();
        System.out.println("Número de segundos en un año: " + segundosEnAnio);

        // Calcular el número de segundos dados años, meses y días
        int anios = 2;
        int meses = 6;
        int dias = 15;
        long segundosTotales = calcularSegundos(anios, meses, dias);
        System.out.println("Número de segundos para " + anios + " años, " + meses + " meses y " + dias + " días: " + segundosTotales);
    }
}
