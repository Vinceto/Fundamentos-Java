package ep;

import java.util.Scanner;

public class Calificaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre del estudiante:");
        String estudiante = sc.nextLine();

        System.out.println("Ingrese el nombre de la asignatura:");
        String asignatura = sc.nextLine();

        System.out.println("Ingrese el nombre del docente:");
        String docente = sc.nextLine();

        System.out.println("Ingrese la nota 1:");
        int nota1 = sc.nextInt();

        System.out.println("Ingrese la nota 2:");
        int nota2 = sc.nextInt();

        System.out.println("Ingrese la nota 3:");
        int nota3 = sc.nextInt();

        float promedio = (nota1 + nota2 + nota3) / 3.0f;

        System.out.printf("Estudiante: %s\nAsignatura: %s\nDocente: %s\nNota 1: %d\nNota 2: %d\nNota 3: %d\nPromedio: %.2f\n",
                estudiante, asignatura, docente, nota1, nota2, nota3, promedio);

        // Indicar al estudiante si aprueba o reprueba
        if (promedio < 4) {
            System.out.println("El estudiante está Reprobado.");
        } else {
            System.out.println("El estudiante está Aprobado.");
        }
    }
}
