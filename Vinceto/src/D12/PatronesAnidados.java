package D12;

import Util.SScan;

public class PatronesAnidados {
    public static void main(String[] args) {
        SScan sscan = new SScan();

        patron1(sscan);
        patron2(sscan);
        patron3(sscan);
        patron4(sscan);

        sscan.close();
    }

    private static void patron1(SScan sscan) {
        System.out.println("Ingrese el tamaño del patron 1: ");
        int n = (int) sscan.escanear("int");
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

    private static void patron2(SScan sscan) {
        System.out.println("Ingrese el tamaño del patron 2: ");
        int n = (int) sscan.escanear("int");

        if (n == 1) {
            System.out.println("*");
            return;
        }


        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();

        for (int i = 1; i < n - 1; i++) {
            for (int j = 0; j < n; j++) {
                if (j == n - i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    private static void patron3(SScan sscan) {
        System.out.println("Ingrese el tamaño del patron 3: ");
        int n = (int) sscan.escanear("int");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n - 1) {
                    System.out.print("x");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void patron4(SScan sscan) {
        System.out.println("Ingrese el tamaño del patron 4: ");
        int n = (int) sscan.escanear("int");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0 || (i == n - 1 && j == n - 1) || (j > 0 && j < n - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

}
