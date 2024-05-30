package D17;
import java.io.File;
import java.io.IOException;

public class FileOperations {
    public static void main(String[] args) {
        // Crear un directorio
        crearDirectorio("directorio");

        // Crear un fichero dentro del directorio
        crearFichero("fichero.txt", "directorio");
    }
    // Método para crear un directorio
    public static void crearDirectorio(String nombre) {
        File directorio = new File("src/" + nombre);
        if (!directorio.exists()) {
            if (directorio.mkdir()) {
                System.out.println("Directorio " + nombre + " creado exitosamente.");
            } else {
                System.out.println("Error al crear el directorio " + nombre + ".");
            }
        } else {
            System.out.println("El directorio " + nombre + " ya existe.");
        }
    }

    // Método para crear un fichero dentro de un directorio
    public static void crearFichero(String nombreFichero, String nombreDirectorio) {
        crearDirectorio(nombreDirectorio); // Crear el directorio si no existe

        File fichero = new File("src/" + nombreDirectorio + "/" + nombreFichero);
        if (!fichero.exists()) {
            try {
                if (fichero.createNewFile()) {
                    System.out.println("Fichero " + nombreFichero + " creado exitosamente en el directorio " + nombreDirectorio + ".");
                } else {
                    System.out.println("Error al crear el fichero " + nombreFichero + " en el directorio " + nombreDirectorio + ".");
                }
            } catch (IOException e) {
                System.out.println("Ocurrió un error al crear el fichero " + nombreFichero + ": " + e.getMessage());
            }
        } else {
            System.out.println("El fichero " + nombreFichero + " ya existe en el directorio " + nombreDirectorio + ".");
        }
    }
}
