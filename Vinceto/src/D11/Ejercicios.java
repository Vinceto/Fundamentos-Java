package D11;

import Util.SScan;
import Util.OperacionesMatematicas;

import java.util.ArrayList;
import java.util.List;

public class Ejercicios {
    public static void main(String[] args) {
        SScan sscan = new SScan();

        CiclosAnidados(sscan);
        EjercicioOperaciones(sscan);

        sscan.close();
    }

    private static void CiclosAnidados(SScan sscan) {
        System.out.println("Ingrese un valor límite:");
        int limite = (int) sscan.escanear("int");

        for (int i = 1; i <= limite; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    private static void EjercicioOperaciones(SScan sscan) {
        List<Double> numeros = new ArrayList<>();
        System.out.print("Ingrese el primer número: ");
        numeros.add((double) (int) sscan.escanear("int"));
        System.out.print("Ingrese el segundo número: ");
        numeros.add((double) (int) sscan.escanear("int"));
        System.out.print("Ingrese el tercer número: ");
        numeros.add((double) (int) sscan.escanear("int"));

        OperacionesMatematicas operaciones = new OperacionesMatematicas(numeros);
        System.out.println("Suma: " + operaciones.sumar());
        System.out.println("Resta: " + operaciones.restar());
        System.out.println("Multiplicación: " + operaciones.multiplicar());
        System.out.println("División: " + operaciones.dividir());
    }

}
