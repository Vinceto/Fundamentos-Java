package D17;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {
        crearFile();
    }
    public static void crearFile() {
        // Crear el directorio
        File directorio = new File("src/miDirectorio");
        if (!directorio.exists()) {
            if (directorio.mkdirs()) {
                System.out.println("Directorio 'miDirectorio' creado exitosamente.");
            } else {
                System.out.println("Error al crear el directorio 'miDirectorio'.");
                return;
            }
        } else {
            System.out.println("El directorio 'miDirectorio' ya existe.");
        }

        // Crear el fichero
        File archivo = new File("src/miDirectorio/fichero.txt");
        try {
            if (archivo.createNewFile()) {
                System.out.println("Archivo 'fichero.txt' creado exitosamente.");
            } else {
                System.out.println("El archivo 'fichero.txt' ya existe.");
            }

            // Crear el FileWriter y BufferedWriter
            FileWriter fileWriter = new FileWriter(archivo);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            // Escribir en el archivo
            bufferedWriter.write("texto 1");
            bufferedWriter.newLine();
            bufferedWriter.write("texto 2");
            bufferedWriter.newLine();

            // Cerrar el BufferedWriter
            bufferedWriter.close();
            System.out.println("Texto escrito en 'fichero.txt' exitosamente.");
        } catch (IOException e) {
            System.out.println("Ocurrió un error al crear el archivo o escribir en él: " + e.getMessage());
        }
    }
}
