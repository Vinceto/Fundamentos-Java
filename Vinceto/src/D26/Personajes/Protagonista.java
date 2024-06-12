package D26.Personajes;

import D26.Interfaces.Jugador;
import D26.Interfaces.Personaje;

public class Protagonista implements Personaje, Jugador {
    private int xActual = 1;
    private int yActual = 1;

    @Override
    public void mover(int x) {
        xActual = xActual + x;
    }

    @Override
    public void Saltar() {
        while (yActual < 5) {
            yActual++;
        }
        while (yActual > 1) {
            yActual--;
        }
    }

    @Override
    public void ejecutarAccion(String accion) {
        if (accion.equals("saltar") && yActual == 1) {
            Saltar();
        } else if (accion.equals("avanzar")) {
            mover(1);
        }
    }

    @Override
    public int getX() {
        return xActual;
    }

    public int getY() {
        return yActual;
    }
}