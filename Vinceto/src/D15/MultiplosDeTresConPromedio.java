package D15;

public class MultiplosDeTresConPromedio {
    public static void main(String[] args) {
        int[] numeros = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            numeros[i] = Integer.parseInt(args[i]);
        }
        int sumaMultiplos = suma(numeros);
        double promedioMultiplos = promedio(numeros);
        System.out.println("sumaMultiplos : "+sumaMultiplos);
        System.out.println("promedioMultiplos : "+promedioMultiplos);
    }

    public static int suma(int[] numeros) {
        int suma = 0;
        for (int numero : numeros) {
            if (numero % 3 == 0) {
                suma += numero;
            }
        }
        return suma;
    }

    public static double promedio(int[] numeros) {
        int suma = 0;
        int contador = 0;
        for (int numero : numeros) {
            if (numero % 3 == 0) {
                suma += numero;
                contador++;
            }
        }
        return contador == 0 ? 0 : (double) suma / contador;
    }
}
