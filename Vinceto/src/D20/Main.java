package D20;

public class Main {
    public static void main(String[] args) {
        // Creando instancias de Zorro y León
        Zorro zorro = new Zorro(5, "Bosque", "Rojo");
        Leon leon = new Leon(7, "Sabana", "Macho");

        // Creando una instancia de Zoológico
        Zoologico zoologico = new Zoologico(zorro, leon, "Santiago de Chile");

        // Imprimiendo la información del zoológico
        System.out.println(zoologico);
    }
}