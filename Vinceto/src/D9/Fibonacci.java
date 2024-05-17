package D9;
import Util.SScan;
import Util.Instrucciones;

public class Fibonacci {
    public static void main(String[] args) {
        String nombreApp = "la secuencia de Fibonacci: ";
        String[] instrucciones = { "indique cuántos elementos de la serie de Fibonacci se deben mostrar."};
        Instrucciones instruccionesApp = new Instrucciones(nombreApp, instrucciones);
        instruccionesApp.mostrarInstrucciones();

        SScan sscan = new SScan();
        int n = (int) sscan.escanear("int");

        int a = 0, b = 1;
        System.out.println(a);

        if (n > 1) {
            System.out.println(b);
        }

        for (int i = 2; i < n; i++) {
            int next = a + b;
            System.out.println(next);
            a = b;
            b = next;
        }

        sscan.close();
    }
}
