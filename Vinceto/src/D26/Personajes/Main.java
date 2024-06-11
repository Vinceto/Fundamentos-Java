package D26.Personajes;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de Protagonista
        Protagonista protagonista = new Protagonista();
        System.out.println("Probando Protagonista...");

        // Mover el protagonista
        protagonista.mover(3);
        System.out.println("Protagonista se ha movido a X: " + protagonista.getX() + ", Y: " + protagonista.getY());

        // Saltar con el protagonista
        protagonista.Saltar();
        System.out.println("Protagonista ha saltado a X: " + protagonista.getX() + ", Y: " + protagonista.getY());

        // Ejecutar acciones con el protagonista
        protagonista.ejecutarAccion("saltar");
        System.out.println("Protagonista ejecuta acción saltar a X: " + protagonista.getX() + ", Y: " + protagonista.getY());

        protagonista.ejecutarAccion("avanzar");
        System.out.println("Protagonista ejecuta acción avanzar a X: " + protagonista.getX() + ", Y: " + protagonista.getY());

        // Crear una instancia de Enemigo
        Enemigo enemigo = new Enemigo();
        System.out.println("Probando Enemigo...");

        // Mover el enemigo
        enemigo.mover(5);
        System.out.println("Enemigo se ha movido a X: " + enemigo.getX());
    }
}
