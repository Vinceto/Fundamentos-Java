package D8.GuiaEjercicios;

import Util.SScan;

public class SumaPar {
    public static void main(String[] args) {
        SScan sscan = new SScan();
        int n = (int) sscan.escanear("int");

        int suma = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                suma += i;
            }
        }

        System.out.printf("El resultado de la suma de los números pares es: %d\n", suma);
        sscan.close();
    }
}