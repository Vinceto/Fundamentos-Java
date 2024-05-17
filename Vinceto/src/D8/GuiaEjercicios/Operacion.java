package D8.GuiaEjercicios;

import Util.SScan;
import Util.Menu;

import java.util.Arrays;
import java.util.List;

public class Operacion {
    public static void main(String[] args) {
        SScan sscan = new SScan();
        Menu menu = new Menu();
        int num1 = (int) sscan.escanear("int");
        int num2 = (int) sscan.escanear("int");

        List<String> opciones = Arrays.asList("Sumar", "Restar", "Multiplicar", "Dividir", "Salir", "otra");
        menu.mostrarMenu(opciones);
        String opcion = menu.seleccionarOpcionMenu();
        //String opcion = sscan.getString("Elige una opción: ");

        switch (opcion.toLowerCase()) {
            case "a":
                System.out.printf("El resultado de la suma es: %d\n", num1 + num2);
                break;
            case "b":
                System.out.printf("El resultado de la resta es: %d\n", num1 - num2);
                break;
            case "c":
                System.out.printf("El resultado de la multiplicación es: %d\n", num1 * num2);
                break;
            case "d":
                if (num2 != 0) {
                    System.out.printf("El resultado de la división es: %.2f\n", (double) num1 / num2);
                } else {
                    System.out.println("Error: No se puede dividir por cero.");
                }
                break;
            case "e":
                System.out.println("Saliendo del programa.");
                break;
            default:
                System.out.println("Opción inválida.");
                break;
        }

        sscan.close();
    }
}