package D15;

import java.util.ArrayList;

public class ArrayListOperations {
    public static void main(String[] args) {
        ArrayList<String> elementos = new ArrayList<String>();
        elementos.add("mesa");
        elementos.add("Refrigerador");
        elementos.add("Cocina");
        elementos.add("lavadora");

        agregarElemento(elementos, "Silla");
        agregarElemento(elementos, "Cocina"); // Este elemento ya existe
    }

    public static void agregarElemento(ArrayList<String> lista, String elemento) {
        if (lista.contains(elemento)) {
            System.out.println("Elemento "+elemento+" ya existe");
        } else {
            lista.add(elemento);
            System.out.println("Elemento agregado: " + elemento);
        }
    }
}
