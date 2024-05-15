package Util;
import Util.SScan;
import java.util.List;

public class Menu {
    public static void mostrarMenu(List<String> opciones) {
        System.out.println("Menú de opciones:");
        for (int i = 0; i < opciones.size(); i++) {
            System.out.printf("%c. %s\n", 'a' + i, opciones.get(i));
        }
    }

    public static String seleccionarOpcionMenu() {
        SScan sscan = new SScan();
        String opcion = sscan.getString("Elige una opción: ");
        return opcion;
    }
}