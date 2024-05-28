package D12;

import Util.SScan;

public class Patrones {
    public static void main(String[] args) {
        SScan sscan = new SScan();

        patron1(sscan);
        patron2(sscan);
        patron3(sscan);

        sscan.close();
    }
    private static void patron1(SScan sscan) {
        System.out.println("Ingrese el tamaño del patron 1: ");
        // *.*.*.*.*.*.*
        int n = (int) sscan.escanear("int");
        crearPatron(n, ".","*");
        System.out.println();
    }
    private static void patron2(SScan sscan) {
        System.out.println("Ingrese el tamaño del patron  2: ");
        // 12341234
        int n = (int) sscan.escanear("int");
        crearPatron(n, "1234","1234");
        System.out.println();
    }
    private static void patron3(SScan sscan) {
        System.out.println("Ingrese el tamaño del patron  3: ");
        // ||*||*||*||*
        int n = (int) sscan.escanear("int");
        crearPatron(n, "*","||");
    }
    static void crearPatron(int n, String patronPar, String patronImpar){
        for (int i = 0; i < n; i++) {
            if(i % 2 != 0){
                System.out.print(patronPar);
            }else{
                System.out.print(patronImpar);
            }
        }
    }
}
