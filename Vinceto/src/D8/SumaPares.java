package D8;

import Util.SScan;

public class SumaPares {
    public static void main(String[] args) {
        //usar scanner en 2 lineas
        SScan sscan = new SScan();
        int n = (int) sscan.escanear("int");

        int suma = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) { // es par
                suma += i;
            }
        }

        System.out.printf("El resultado es: %d\n", suma);

        // Close the scanner
        sscan.close();
    }
}