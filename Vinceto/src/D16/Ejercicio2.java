package D16;

import java.util.*;
import java.util.stream.*;

public class Ejercicio2 {
    public static void main(String[] args) {
        List<String> nombres = Arrays.asList("Ana", "Pedro", "Maria", "Paula", "Alberto", "Beatriz", "Carlos");

        // Obtener todos los elementos que excedan los 5 caracteres
        List<String> nombresLargos = nombres.stream()
                .filter(nombre -> nombre.length() > 5)
                .collect(Collectors.toList());
        System.out.println("Nombres que exceden 5 caracteres: " + nombresLargos);

        // Utilizar map para transformar todos los nombres a minúscula
        List<String> nombresMinuscula = nombres.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());
        System.out.println("Nombres en minúscula: " + nombresMinuscula);

        // Crear un arreglo con todos los nombres que comiencen con 'P' o 'p'
        List<String> nombresConP = nombres.stream()
                .filter(nombre -> nombre.toLowerCase().startsWith("p"))
                .collect(Collectors.toList());
        System.out.println("Nombres que comienzan con 'P' o 'p': " + nombresConP);

        // Utilizando .count, contar los elementos que empiecen con 'A', 'B' o 'C'
        long countABC = nombres.stream()
                .map(String::toUpperCase)
                .filter(nombre -> nombre.startsWith("A") || nombre.startsWith("B") || nombre.startsWith("C"))
                .count();
        System.out.println("Cantidad de nombres que empiezan con A, B o C: " + countABC);

        // Utilizando .map, crear un arreglo con la cantidad de letras que tiene cada nombre
        List<Integer> cantidadLetras = nombres.stream()
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println("Cantidad de letras en cada nombre: " + cantidadLetras);
    }
}