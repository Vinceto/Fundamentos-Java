package Util;

public class Instrucciones {

    private String nombreApp;
    private String[] instrucciones;

    public Instrucciones(String nombreApp, String[] instrucciones) {
        this.nombreApp = nombreApp;
        this.instrucciones = instrucciones;
    }

    public void mostrarInstrucciones() {
        System.out.println("Bienvenido a " + nombreApp);
        System.out.println("Instrucciones:");
        for (int i = 0; i < instrucciones.length; i++) {
            System.out.println((i + 1) + ". " + instrucciones[i]);
        }
        //System.out.println("¡Esperamos que disfrutes usando la aplicación!");
    }
}
