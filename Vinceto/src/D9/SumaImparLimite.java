package D9;
import Util.Instrucciones;
import Util.SScan;

public class SumaImparLimite {
    public static void main(String[] args) {
        String nombreApp = "la secuencia de Fibonacci: ";
        String[] instrucciones = {
                "ingresa el límite inferior (min) para realizar la suma de los impares.",
                "Ingresa el límite superior (max) del intervalo, para realizar la suma de los impares."};
        Instrucciones instruccionesApp = new Instrucciones(nombreApp, instrucciones);
        instruccionesApp.mostrarInstrucciones();

        SScan sscan = new SScan();
        int min = (int) sscan.escanear("int");
        int max = (int) sscan.escanear("int");

        int suma = 0;
        for (int i = min; i <= max; i++) {
            if (i % 2 != 0) {
                suma += i;
            }
        }

        System.out.println(suma);

        sscan.close();
    }
}
