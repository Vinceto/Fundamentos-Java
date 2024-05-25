package D10;

import Util.SScan;

public class Formas {
    public static void main(String[] args) {
        SScan sscan = new SScan();
        System.out.println("Ingrese el tamaño de las figuras a dibujar: ");
        int n = (int) sscan.escanear("int");
        Triangulo(n);
        TrianguloInvertido(n);
        Cuadrado(n);
        CuadradoVacio(n);
    }

    public static void Cuadrado(int n) {
        System.out.println("Cuadrado: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void CuadradoVacio(int n) {
        System.out.println("Cuadrado Vacio: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void Triangulo(int n) {
        System.out.println("Triangulo: ");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void TrianguloInvertido(int n) {
        System.out.println("Triangulo Invertido: ");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
}
