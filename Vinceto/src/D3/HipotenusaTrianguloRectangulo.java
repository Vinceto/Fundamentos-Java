package D3;

import java.util.Scanner;

public class HipotenusaTrianguloRectangulo {
    public static void main(String[] args) {
        double cateto1 = obtenerDato("Ingrese la longitud del primer cateto: ");
        double cateto2 = obtenerDato("Ingrese la longitud del segundo cateto: ");

        double hipotenusa = calcularHipotenusa(cateto1, cateto2);
        System.out.println("El largo de la hipotenusa del triángulo rectángulo es: " + hipotenusa);
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

    public static double calcularHipotenusa(double cateto1, double cateto2) {
        return Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2);
    }
}
