package D4;

import java.util.Scanner;

public class CalculadoraSimple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();
        System.out.println("\nSeleccione la operación que desea realizar:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.print("Ingrese el número correspondiente a la operación: ");
        int opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Operación: Suma");
                System.out.println("Resultado: " + (numero1 + numero2));
                break;
            case 2:
                System.out.println("Operación: Resta");
                System.out.println("Resultado: " + (numero1 - numero2));
                break;
            case 3:
                System.out.println("Operación: Multiplicación");
                System.out.println("Resultado: " + numero1 * numero2);
                break;
            case 4:
                if (numero2 != 0.0) {
                    System.out.println("Operación: División");
                    System.out.println("Resultado: " + numero1 / numero2);
                } else {
                    System.out.println("No se puede dividir entre cero.");
                }
                break;
            default:
                System.out.println("La opción seleccionada no es válida.");
        }

        scanner.close();
    }
}