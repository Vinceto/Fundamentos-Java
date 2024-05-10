package D3;

import java.util.Scanner;

public class PerimetroRectangulo {
    public static void main(String[] args) {
        double base = obtenerDato("Ingrese la base: ");
        double altura = obtenerDato("Ingrese la altura: ");

        double perimetro = calcularPerimetro(base, altura);
        System.out.println("El perímetro del rectángulo es: " + perimetro);
    }

    public static double obtenerDato(String mensaje) {
        Scanner sc = new Scanner(System.in);
        double dato;
        do {
            System.out.print(mensaje);
            dato = sc.nextDouble();
            if (dato <= 0) {
                System.out.println("Dato inválido, por favor ingrese un valor positivo.");
            }
        } while (dato <= 0);
        return dato;
    }

    public static double calcularPerimetro(double base, double altura) {
        return 2 * (base + altura);
    }
}