package D18;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FileHandler {
    public static void main(String[] args) {
        // Crear el archivo y directorio, y escribir en el archivo
        crearArchivo("directorioEjm", "fichero.txt");

        // Buscar texto en el archivo y contar las ocurrencias
        buscarTexto("directorioEjm/fichero.txt", "Juan");
    }
    // Método para crear el archivo y directorio, y escribir en el archivo
    public static void crearArchivo(String directorio, String fichero) {
        // Validar que el nombre del fichero termine con ".txt"
        if (!fichero.endsWith(".txt")) {
            System.out.println("El nombre del fichero debe terminar con \".txt\"");
            return;
        }

        // Crear el directorio si no existe
        File dir = new File("src/" + directorio);
        if (!dir.exists()) {
            if (dir.mkdirs()) {
                System.out.println("Directorio '" + directorio + "' creado exitosamente.");
            } else {
                System.out.println("Error al crear el directorio.");
                return;
            }
        } else {
            System.out.println("El directorio '" + directorio + "' ya existe.");
        }

        // Crear el archivo y escribir en él
        File archivo = new File("src/" + directorio + "/" + fichero);
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Perro");
        lista.add("Gato");
        lista.add("Juan");
        lista.add("Daniel");
        lista.add("Juan");
        lista.add("Gato");
        lista.add("Perro");
        lista.add("Camila");
        lista.add("Daniel");
        lista.add("Camila");

        try {
            if (archivo.createNewFile()) {
                System.out.println("Archivo '" + fichero + "' creado exitosamente.");
            } else {
                System.out.println("El archivo '" + fichero + "' ya existe.");
            }

            FileWriter fileWriter = new FileWriter(archivo);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            // Usar Iterator para recorrer la lista y escribir en el archivo
            Iterator<String> iterator = lista.iterator();
            while (iterator.hasNext()) {
                bufferedWriter.write(iterator.next());
                bufferedWriter.newLine();
            }

            bufferedWriter.close();
            System.out.println("Texto escrito en '" + fichero + "' exitosamente.");
        } catch (IOException e) {
            System.out.println("Ocurrió un error al crear el archivo o escribir en él: " + e.getMessage());
        }
    }

    // Método para buscar texto en el archivo y contar las ocurrencias
    public static void buscarTexto(String nombreFichero, String texto) {
        File archivo = new File("src/" + nombreFichero);

        if (!archivo.exists()) {
            System.out.println("El fichero ingresado no existe.");
            return;
        }

        try {
            List<String> lineas = Files.readAllLines(Paths.get("src/" + nombreFichero));
            int contador = 0;

            for (String linea : lineas) {
                if (linea.contains(texto)) {
                    contador++;
                }
            }

            System.out.println("Cantidad de repeticiones del texto -> " + contador);
        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer el archivo: " + e.getMessage());
        }
    }
}