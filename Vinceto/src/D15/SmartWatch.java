package D15;

import java.util.ArrayList;
import java.util.List;

/**
 * La clase SmartWatch proporciona una aplicación que filtra y calcula
 * el promedio de los pasos dados como argumentos de línea de comandos.
 */
public class SmartWatch {

    /**
     * El método principal que ejecuta la aplicación.
     * Convierte los argumentos de línea de comandos en una lista de enteros,
     * filtra los valores no válidos y luego calcula y muestra el promedio de los pasos.
     *
     * @param args Un arreglo de cadenas que representa los argumentos de línea de comandos.
     */
    public static void main(String[] args) {
        // Inicializa una lista para almacenar los pasos dados como argumentos de línea de comandos
        List<Integer> pasos = new ArrayList<>();

        // Convierte cada argumento de cadena en un entero y lo agrega a la lista pasos
        for (String arg : args) {
            pasos.add(Integer.parseInt(arg));
        }

        // Filtra los valores no válidos de la lista pasos
        List<Integer> pasosFiltrados = clearSteps(pasos);

        // Calcula el promedio de los pasos filtrados
        double promedioPasos = promedio(pasosFiltrados);

        // Muestra el promedio de pasos
        System.out.println("Promedio de pasos: " + promedioPasos);
    }

    /**
     * Filtra una lista de pasos eliminando los valores fuera del rango [200, 100000].
     *
     * @param pasos Una lista de enteros que representa los pasos.
     * @return Una lista de enteros con los pasos filtrados.
     */
    public static List<Integer> clearSteps(List<Integer> pasos) {
        // Inicializa una lista para almacenar los pasos filtrados
        List<Integer> filtrados = new ArrayList<>();

        // Itera a través de cada paso y agrega los que están dentro del rango válido a la lista filtrados
        for (int paso : pasos) {
            if (paso >= 200 && paso <= 100000) {
                filtrados.add(paso);
            } else {
                // Muestra el valor descartado que no está en el rango válido
                System.out.println("Valor descartado: " + paso);
            }
        }

        // Retorna la lista de pasos filtrados
        return filtrados;
    }

    /**
     * Calcula el promedio de una lista de enteros.
     *
     * @param pasos Una lista de enteros que representa los pasos.
     * @return El promedio de los pasos como un valor de tipo double.
     */
    public static double promedio(List<Integer> pasos) {
        int suma = 0;

        // Suma todos los valores de la lista pasos
        for (int paso : pasos) {
            suma += paso;
            System.out.println("Pasos a sumar: " + paso);
        }

        // Retorna el promedio de los pasos. Si la lista está vacía, retorna 0.
        return pasos.size() == 0 ? 0 : (double) suma / pasos.size();
    }
}
