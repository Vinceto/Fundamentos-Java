package D5;

import java.util.Scanner;

public class EvaluarExamen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el promedio:");
        double promedio = scanner.nextDouble();

        if (promedio < 4) {
            System.out.println("Debes dar una prueba de recuperación para poder rendir el examen final");
        } else if (promedio >= 4 && promedio <= 5.5) {
            System.out.println("Debes rendir el examen final para aprobar");
        } else {
            System.out.println("Felicitaciones! Te eximiste del examen y aprobaste");
        }

        scanner.close();
    }
}
