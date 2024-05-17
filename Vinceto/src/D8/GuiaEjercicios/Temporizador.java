package D8.GuiaEjercicios;

import Util.SScan;

public class Temporizador {
    public static void main(String[] args) {
        SScan sscan = new SScan();
        int numero = (int) sscan.escanear("int");

        System.out.println("Iniciando cuenta regresiva:");
        for (int i = numero; i >= 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000); // Pausa de 1 segundo
            } catch (InterruptedException e) {
                System.out.println("Interrupción en el temporizador.");
            }
        }

        System.out.println("¡Tiempo terminado!");
        sscan.close();
    }
}