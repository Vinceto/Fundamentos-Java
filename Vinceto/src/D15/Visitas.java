package D15;
/**
 * La clase Visitas proporciona una aplicación que calcula y muestra
 * el promedio de visitas dadas como argumentos de línea de comandos.
 */
public class Visitas {

    /**
     * El método principal que ejecuta la aplicación.
     * Convierte los argumentos de línea de comandos en un arreglo de enteros,
     * imprime cada valor, y luego calcula y muestra el promedio de las visitas.
     *
     * @param args Un arreglo de cadenas que representa los argumentos de línea de comandos.
     */
    public static void main(String[] args) {
        // Inicializa un arreglo de enteros del mismo tamaño que los argumentos de línea de comandos
        int[] visitas = new int[args.length];

        // Convierte cada argumento de cadena en un entero y lo guarda en el arreglo visitas
        for (int i = 0; i < args.length; i++) {
            visitas[i] = Integer.parseInt(args[i]);
            System.out.println("visita " + i + " : " + visitas[i]);
        }

        // Calcula el promedio de las visitas
        double promedioVisitas = promedio(visitas);

        // Muestra el promedio de visitas
        System.out.println("El promedio de visitas es: " + promedioVisitas);
    }

    /**
     * Calcula el promedio de un arreglo de enteros.
     *
     * @param visitas Un arreglo de enteros que representa las visitas.
     * @return El promedio de las visitas como un valor de tipo double.
     */
    public static double promedio(int[] visitas) {
        int suma = 0;

        // Suma todos los valores del arreglo visitas
        for (int visita : visitas) {
            suma += visita;
        }

        // Devuelve el promedio de las visitas. Si el arreglo está vacío, devuelve 0.
        return visitas.length == 0 ? 0 : (double) suma / visitas.length;
    }
}

