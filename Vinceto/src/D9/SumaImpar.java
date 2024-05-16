package D9;
import Util.Instrucciones;
import Util.SScan;

public class SumaImpar {
    public static void main(String[] args) {
        String nombreApp = "Suma Impar: ";
        String[] instrucciones = { "Suma todos los valores impares, desde 0 hasta n, donde n es ingresado por el usuario."};
        Instrucciones instruccionesApp = new Instrucciones(nombreApp, instrucciones);
        instruccionesApp.mostrarInstrucciones();

        SScan sscan = new SScan();
        int n = (int) sscan.escanear("int");

        int suma = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                suma += i;
            }
        }

        System.out.println(suma);

        sscan.close();
    }
}
