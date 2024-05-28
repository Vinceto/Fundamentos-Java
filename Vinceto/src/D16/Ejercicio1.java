package D16;

import java.util.*;
import java.util.stream.*;

public class Ejercicio1 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 9, 2, 10, 2, 4, 7, 4, 7, 1, 4);

        // Sumar todos los valores del array
        int sumaTotal = numeros.stream()
                .reduce(0, Integer::sum);
        System.out.println("Suma total: " + sumaTotal);

        // Sumar todos los valores no repetidos del array
        int sumaNoRepetidos = numeros.stream()
                .distinct()
                .reduce(0, Integer::sum);
        System.out.println("Suma de valores no repetidos: " + sumaNoRepetidos);

        // Convertir todos los datos al tipo float
        List<Float> floatValues = numeros.stream()
                .map(Integer::floatValue)
                .collect(Collectors.toList());
        System.out.println("Valores como float: " + floatValues);

        // Filtrar todos los elementos menores a 5 sin repetir
        List<Integer> filtrados = numeros.stream()
                .filter(n -> n < 5)
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Elementos menores a 5 sin repetir: " + filtrados);

        // Utilizando mapToInt, sumar todos los valores del arreglo
        int sumaMapToInt = numeros.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Suma utilizando mapToInt: " + sumaMapToInt);

        // Utilizando .count() contar todos los elementos menores que 5
        long countMenoresA5 = numeros.stream()
                .filter(n -> n < 5)
                .count();
        System.out.println("Cantidad de elementos menores a 5: " + countMenoresA5);
    }
}