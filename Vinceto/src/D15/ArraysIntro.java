package D15;

/**
 * La clase ArraysIntro proporciona una aplicación que calcula
 * el promedio de los sueldos que son mayores a 500000.
 */
public class ArraysIntro {

    /**
     * El método principal que ejecuta la aplicación.
     * Inicializa un arreglo de sueldos y calcula el promedio de
     * aquellos sueldos que son mayores a 500000, luego muestra este valor.
     *
     * @param args Un arreglo de cadenas que representa los argumentos de línea de comandos.
     */
    public static void main(String[] args) {
        // Inicializa un arreglo de sueldos con valores predeterminados
        int[] sueldos = {400000, 760000, 1100000, 650000, 654980, 987300, 700450, 442300};

        // Calcula el promedio de los sueldos mayores a 500000
        double promedio = calcularPromedioSueldos(sueldos);

        // Muestra el promedio de los sueldos mayores a 500000
        System.out.println("El promedio de los sueldos mayores a 500000 es: " + promedio);
    }

    /**
     * Calcula el promedio de los sueldos que son mayores a 500000.
     *
     * @param sueldos Un arreglo de enteros que representa los sueldos.
     * @return El promedio de los sueldos mayores a 500000 como un valor de tipo double.
     */
    public static double calcularPromedioSueldos(int[] sueldos) {
        int suma = 0;
        int contador = 0;

        // Suma y cuenta los sueldos que son mayores a 500000
        for (int sueldo : sueldos) {
            if (sueldo > 500000) {
                suma += sueldo;
                contador++;
            }
        }

        // Retorna el promedio de los sueldos mayores a 500000. Si no hay sueldos mayores a 500000, retorna 0.
        return contador == 0 ? 0 : (double) suma / contador;
    }
}