package D15;

import java.util.ArrayList;

/**
 * La clase ArrayListOperations proporciona una aplicación que
 * agrega elementos a una lista de cadenas, verificando si el elemento
 * ya existe antes de agregarlo.
 */
public class ArrayListOperations {

    /**
     * El método principal que ejecuta la aplicación.
     * Inicializa una lista de elementos, intenta agregar nuevos elementos
     * y muestra mensajes correspondientes.
     *
     * @param args Un arreglo de cadenas que representa los argumentos de línea de comandos.
     */
    public static void main(String[] args) {
        // Inicializa una lista de elementos con valores predeterminados
        ArrayList<String> elementos = new ArrayList<String>();
        elementos.add("mesa");
        elementos.add("Refrigerador");
        elementos.add("Cocina");
        elementos.add("lavadora");

        // Intenta agregar nuevos elementos a la lista
        agregarElemento(elementos, "Silla");
        agregarElemento(elementos, "Cocina"); // Este elemento ya existe
    }

    /**
     * Agrega un elemento a la lista si no existe ya en la lista.
     * Muestra un mensaje si el elemento ya existe o si se ha agregado exitosamente.
     *
     * @param lista    Una lista de cadenas que representa los elementos.
     * @param elemento El elemento a agregar a la lista.
     */
    public static void agregarElemento(ArrayList<String> lista, String elemento) {
        if (lista.contains(elemento)) {
            System.out.println("Elemento " + elemento + " ya existe");
        } else {
            lista.add(elemento);
            System.out.println("Elemento agregado: " + elemento);
        }
    }
}