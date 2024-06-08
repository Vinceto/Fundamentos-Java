package D15;

import java.util.ArrayList;
import java.util.Collections;

/**
 * La clase ArrayListMethods proporciona una aplicación que
 * maneja una lista de notas y muestra la nota máxima y mínima.
 */
public class ArrayListMethods {

    /**
     * El método principal que ejecuta la aplicación.
     * Inicializa una lista de notas y muestra la nota máxima y mínima.
     *
     * @param args Un arreglo de cadenas que representa los argumentos de línea de comandos.
     */
    public static void main(String[] args) {
        // Inicializa una lista de notas con valores predeterminados
        ArrayList<Double> notas = new ArrayList<Double>();
        notas.add(4.7);
        notas.add(2.2);
        notas.add(5.4);
        notas.add(6.9);
        notas.add(4.4);
        notas.add(2.6);

        // Muestra la nota máxima y mínima de la lista
        mostrarNotaMaximaYMinima(notas);
    }

    /**
     * Muestra la nota máxima y mínima de una lista de notas.
     *
     * @param notas Una lista de números decimales que representan las notas.
     */
    public static void mostrarNotaMaximaYMinima(ArrayList<Double> notas) {
        double maxNota = Collections.max(notas);
        double minNota = Collections.min(notas);
        System.out.println("Nota máxima: " + maxNota);
        System.out.println("Nota mínima: " + minNota);
    }
}