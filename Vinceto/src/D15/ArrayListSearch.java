package D15;

import java.util.ArrayList;

/**
 * La clase ArrayListSearch proporciona una aplicación que
 * busca y elimina elementos en una lista de nombres.
 */
public class ArrayListSearch {

    /**
     * El método principal que ejecuta la aplicación.
     * Inicializa una lista de nombres, busca y elimina nombres específicos,
     * y muestra mensajes correspondientes.
     *
     * @param args Un arreglo de cadenas que representa los argumentos de línea de comandos.
     */
    public static void main(String[] args) {
        // Inicializa una lista de nombres con valores predeterminados
        ArrayList<String> nombres = new ArrayList<String>();
        nombres.add("Pedro");
        nombres.add("Juan");
        nombres.add("Maria");
        nombres.add("Ana");
        nombres.add("Luis");

        // Busca y elimina los nombres especificados
        buscarYEliminar(nombres, "Maria");
        buscarYEliminar(nombres, "Carlos");
    }

    /**
     * Busca un nombre en la lista y lo elimina si está presente.
     * Muestra un mensaje si el nombre se encuentra o no, y muestra la lista después de la eliminación.
     *
     * @param lista  Una lista de cadenas que representa los nombres.
     * @param nombre El nombre a buscar y eliminar en la lista.
     */
    public static void buscarYEliminar(ArrayList<String> lista, String nombre) {
        if (lista.contains(nombre)) {
            System.out.println("Elemento encontrado: " + nombre);
            lista.remove(nombre);  // Elimina el nombre si se encuentra
        } else {
            System.out.println("Elemento no encontrado: " + nombre);
            lista.removeIf(n -> n.equals(nombre));
            System.out.println("Lista después de la eliminación: " + lista);
        }
        // Muestra la lista después de la eliminación
        System.out.println("Lista después de la eliminación: " + lista);
    }
}