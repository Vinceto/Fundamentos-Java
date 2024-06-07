package D25;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class LibroVenta {
    private String nombreVenta;
    private String fechaVenta;

    public LibroVenta(String nombreVenta, String fechaVenta) {
        this.nombreVenta = nombreVenta;
        this.fechaVenta = fechaVenta;
    }

    public String getNombreVenta() {
        return nombreVenta;
    }

    public void setNombreVenta(String nombreVenta) {
        this.nombreVenta = nombreVenta;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public void guardarVenta(Cliente cliente, Vehiculo vehiculo) {
        String directorio = "ficheros";
        File dir = new File(directorio);

        if (!dir.exists()) {
            dir.mkdir();
        }

        File archivo = new File(directorio + "/" + nombreVenta + ".txt");

        if (archivo.exists()) {
            System.out.println("El archivo ya existe.");
            return;
        }

        try (FileWriter writer = new FileWriter(archivo)) {
            writer.write("Patente del Vehiculo: " + cliente.getPatente() + "\n");
            writer.write("Edad del Cliente: " + cliente.getEdad() + "\n");
            writer.write("Fecha de la Venta: " + fechaVenta + "\n");
            writer.write("Nombre de la Venta: " + nombreVenta + "\n");

            System.out.println("El archivo creado en: "+archivo.getAbsolutePath());
        } catch (IOException e) {
            System.out.println("Ocurrió un error al escribir el archivo.");
            e.printStackTrace();
        }
    }
}
