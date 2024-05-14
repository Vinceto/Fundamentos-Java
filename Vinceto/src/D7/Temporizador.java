package D7;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Temporizador {

    public static void main(String[] args) {
        int segundos = 0;

        Scanner sc = new Scanner(System.in);

        do {
            try {
                System.out.println("Ingrese un número para iniciar el contador:");
                String input = sc.nextLine();
                segundos = Integer.parseInt(input);

                if (esEntero(segundos)) {
                    System.out.println("Comenzando contador regresivo desde " + segundos + " segundos...");
                    contadorRegresivo(segundos);
                } else {
                    System.out.println("FALLO");
                }
            } catch (NumberFormatException e) {
                System.out.println("FALLO");
            }
        } while (!esEntero(segundos));
    }
    public static boolean esEntero(int num) {
        if (num >= Integer.MIN_VALUE && num <= Integer.MAX_VALUE && num >0) {
            return true;
        }
        return false;
    }
    public static void contadorRegresivo(int segundos) {
        try {
            for (int i = segundos; i >= 0; i--) {
                System.out.println("Segundos restantes: " + i);
                TimeUnit.SECONDS.sleep(1);
            }
        } catch (InterruptedException e) {
            System.out.println("El temporizador fue interrumpido.");
            Thread.currentThread().interrupt();
        }
    }
}

