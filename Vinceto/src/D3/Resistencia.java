package D3;

import java.util.Scanner;

public class Resistencia {
    public static void main(String[] args) {
        // Solicitar al usuario que ingrese las resistencias
        double resistencia1 = obtenerResistencia("Ingrese resistencia 1: ");
        double resistencia2 = obtenerResistencia("Ingrese resistencia 2: ");
        double resistencia3 = obtenerResistencia("Ingrese resistencia 3: ");

        // Calcular resistencia total
        double resistenciaTotal = calcularResistenciaTotal(resistencia1, resistencia2, resistencia3);

        // Mostrar resultado
        System.out.println("La resistencia total es de " + resistenciaTotal);
    }

    public static double obtenerResistencia(String mensaje) {
        Scanner sc = new Scanner(System.in);
        double resistencia;
        do {
            System.out.print(mensaje);
            resistencia = sc.nextDouble();
            if (resistencia <= 0) {
                System.out.println("Dato inválido, por favor ingrese un valor positivo.");
            }
        } while (resistencia <= 0);
        return resistencia;
    }

    public static double calcularResistenciaTotal(double resistencia1, double resistencia2, double resistencia3) {
        return 1 / (1 / resistencia1 + 1 / resistencia2 + 1 / resistencia3);
    }
}
