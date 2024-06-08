package D15;

/**
 * La clase MultiplosDeTres proporciona una aplicación que
 * calcula la suma de los números múltiplos de tres dados
 * como argumentos de línea de comandos.
 */
public class MultiplosDeTres {

    /**
     * El método principal que ejecuta la aplicación.
     * Convierte los argumentos de línea de comandos en un arreglo de enteros,
     * calcula la suma de los números que son múltiplos de tres,
     * y muestra este valor.
     *
     * @param args Un arreglo de cadenas que representa los argumentos de línea de comandos.
     */
    public static void main(String[] args) {
        // Inicializa un arreglo de enteros del mismo tamaño que los argumentos de línea de comandos
        int[] numeros = new int[args.length];

        // Convierte cada argumento de cadena en un entero y lo guarda en el arreglo numeros
        for (int i = 0; i < args.length; i++) {
            numeros[i] = Integer.parseInt(args[i]);
        }

        // Calcula la suma de los múltiplos de tres
        int sumaMultiplos = suma(numeros);

        // Muestra la suma de los múltiplos de tres
        System.out.println("Suma de múltiplos de tres: " + sumaMultiplos);
    }

    /**
     * Calcula la suma de los números múltiplos de tres en un arreglo de enteros.
     *
     * @param numeros Un arreglo de enteros.
     * @return La suma de los números múltiplos de tres.
     */
    public static int suma(int[] numeros) {
        int suma = 0;

        // Suma los números que son múltiplos de tres
        for (int numero : numeros) {
            if (numero % 3 == 0) {
                suma += numero;
            }
        }

        // Retorna la suma de los múltiplos de tres
        return suma;
    }
}