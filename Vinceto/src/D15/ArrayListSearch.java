package D15;

import java.util.ArrayList;

public class ArrayListSearch {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<String>();
        nombres.add("Pedro");
        nombres.add("Juan");
        nombres.add("Maria");
        nombres.add("Ana");
        nombres.add("Luis");

        buscarYEliminar(nombres, "Maria");
        buscarYEliminar(nombres, "Carlos");
    }

    public static void buscarYEliminar(ArrayList<String> lista, String nombre) {
        if (lista.contains(nombre)) {
            System.out.println("Elemento encontrado: " + nombre);
        } else {
            System.out.println("Elemento no encontrado: " + nombre);
            lista.removeIf(n -> n.equals(nombre));
            System.out.println("Lista después de la eliminación: " + lista);
        }
    }
}
