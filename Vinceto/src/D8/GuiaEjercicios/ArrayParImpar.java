package D8.GuiaEjercicios;
import Util.SScan;

public class ArrayParImpar {
    public static void main(String[] args) {
        SScan sscan = new SScan();

        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = (int) sscan.escanear("int");

        int[] pares = new int[n];
        int[] impares = new int[n];

        int contadorPares = 0;
        int contadorImpares = 0;
        int sumaPares = 0;
        int sumaImpares = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                pares[contadorPares] = i;
                contadorPares++;
            } else {
                impares[contadorImpares] = i;
                contadorImpares++;
            }
        }

        // Imprimir los arreglos de números pares e impares
        System.out.println("Números pares:");
        for (int i = 0; i < contadorPares; i++) {
            System.out.print(pares[i] + " ");
            sumaPares += pares[i];
        }
        System.out.println();
        System.out.println("Sumatoria de pares:"+sumaPares);

        System.out.println("Números impares:");
        for (int i = 0; i < contadorImpares; i++) {
            System.out.print(impares[i] + " ");
            sumaImpares += impares[i];
        }
        System.out.println();
        System.out.println("Sumatoria de impares:"+sumaImpares);
        sscan.close();
    }
}
