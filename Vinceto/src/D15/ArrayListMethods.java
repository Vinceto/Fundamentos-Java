package D15;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<Double> notas = new ArrayList<Double>();
        notas.add(4.7);
        notas.add(2.2);
        notas.add(5.4);
        notas.add(6.9);
        notas.add(4.4);
        notas.add(2.6);

        mostrarNotaMaximaYMinima(notas);
    }

    public static void mostrarNotaMaximaYMinima(ArrayList<Double> notas) {
        double maxNota = Collections.max(notas);
        double minNota = Collections.min(notas);
        System.out.println("Nota máxima: " + maxNota);
        System.out.println("Nota mínima: " + minNota);
    }
}
