package D9;
import Util.Instrucciones;
import Util.SScan;

public class SoloPares {
    public static void main(String[] args) {
        String nombreApp = "Solo pares: ";
        String[] instrucciones = { "Ingresa un parámetro n para mostrar los primeros n pares."};
        Instrucciones instruccionesApp = new Instrucciones(nombreApp, instrucciones);
        instruccionesApp.mostrarInstrucciones();
        SScan sscan = new SScan();
        int n = (int) sscan.escanear("int");

        for (int i = 0; i < n; i++) {
            System.out.println(i * 2);
        }

        sscan.close();
    }
}
