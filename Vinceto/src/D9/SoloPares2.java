package D9;
import Util.Instrucciones;
import Util.SScan;

public class SoloPares2 {
    public static void main(String[] args) {
        String nombreApp = "Solo pares 2: ";
        String[] instrucciones = { "Ingresa un parámetro n para mostrar los primeros n pares sin contar el 0"};
        Instrucciones instruccionesApp = new Instrucciones(nombreApp, instrucciones);
        instruccionesApp.mostrarInstrucciones();

        SScan sscan = new SScan();
        int n = (int) sscan.escanear("int");

        for (int i = 1; i <= n; i++) {
            System.out.println(i * 2);
        }

        sscan.close();
    }
}
