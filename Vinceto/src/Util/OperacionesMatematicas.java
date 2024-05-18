package Util;

import java.util.List;

public class OperacionesMatematicas {
    private List<Double> numeros;

    public OperacionesMatematicas(List<Double> numeros) {
        this.numeros = numeros;
    }

    public double sumar() {
        double resultado = 0;
        for (double num : numeros) {
            resultado += num;
        }
        return resultado;
    }

    public double restar() {
        if (numeros.isEmpty()) return 0;
        double resultado = numeros.get(0);
        for (int i = 1; i < numeros.size(); i++) {
            resultado -= numeros.get(i);
        }
        return resultado;
    }

    public double multiplicar() {
        double resultado = 1;
        for (double num : numeros) {
            resultado *= num;
        }
        return resultado;
    }

    public double dividir() {
        if (numeros.isEmpty()) return 0;
        double resultado = numeros.get(0);
        for (int i = 1; i < numeros.size(); i++) {
            if (numeros.get(i) == 0) {
                System.out.println("Error: División por cero");
                return 0;
            }
            resultado /= numeros.get(i);
        }
        return resultado;
    }
}
