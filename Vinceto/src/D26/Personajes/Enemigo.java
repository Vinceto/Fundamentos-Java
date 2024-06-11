package D26.Personajes;

import D26.Interfaces.Personaje;

public class Enemigo implements Personaje {
    private int xActual;

    public Enemigo() {
        this.xActual = 0;
    }

    @Override
    public void mover(int x) {
        while (xActual < x) {
            xActual++;
        }
    }

    @Override
    public int getX() {
        return xActual;
    }
}
