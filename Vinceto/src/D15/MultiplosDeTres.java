package D15;

public class MultiplosDeTres {
    public static void main(String[] args) {
        int[] numeros = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            numeros[i] = Integer.parseInt(args[i]);
        }
        int sumaMultiplos = suma(numeros);
        System.out.println("sumaMultiplos : "+sumaMultiplos);
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
}
