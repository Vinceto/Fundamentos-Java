package D6;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Scanner;

public class Fechas {
    public static void main(String[] args) {
        String fecha1 = obtenerFecha("Ingrese la primera fecha en formato DD/MM/AAAA: ");
        String fecha2 = obtenerFecha("Ingrese la segunda fecha en formato DD/MM/AAAA: ");
        compararFecha(extraerFecha(fecha1), extraerFecha(fecha2));
    }

    public static String obtenerFecha(String texto) {
        Scanner sc = new Scanner(System.in);
        String fecha;
        do {
            System.out.println(texto);
            fecha = sc.nextLine();
            //mientras la fecha no tenga el formato válido o exista
            if (!validarFormatoFecha(fecha) || !fechaValida(fecha)) {
                System.out.println("Formato de fecha solicitado no es válido, intente nuevamente.");
            }
        } while (!validarFormatoFecha(fecha) || !fechaValida(fecha));
        sc.close();
        return fecha;
    }

    private static boolean validarFormatoFecha(String fecha) {
        // El formato debe ser "DD/MM/AAAA"
        return fecha.matches("\\d{2}/\\d{2}/\\d{4}");
    }

    private static boolean fechaValida(String fechaStr) {
        try {
            // Intentar convertir la cadena a LocalDate
            LocalDate fecha = LocalDate.parse(fechaStr, java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            // Verificar si el día, el mes y el año son válidos
            int dia = fecha.getDayOfMonth();
            int mes = fecha.getMonthValue();
            int anio = fecha.getYear();
            // Verificar si el día es válido para el mes y el año dados
            return dia >= 1 && dia <= YearMonth.of(anio, mes).lengthOfMonth();
        } catch (DateTimeException e) {
            // Si ocurre una excepción al intentar convertir la cadena a LocalDate, la fecha es inválida
            return false;
        }
    }

    private static int[] extraerFecha(String fechaStr) {
        int[] fecha = new int[3]; // Un arreglo de 3 elementos para día, mes y año

        String[] partes = fechaStr.split("/"); // Dividir la cadena en partes usando "/"

        // Convertir cada parte a entero y almacenarla en el arreglo de fecha
        fecha[0] = Integer.parseInt(partes[0]); // Día
        fecha[1] = Integer.parseInt(partes[1]); // Mes
        fecha[2] = Integer.parseInt(partes[2]); // Año

        return fecha;
    }

    private static void compararFecha(int[] fecha1, int[] fecha2) {
        // Comparar las fechas
        if (fecha1[2] > fecha2[2]) {
            System.out.println("La persona 2 es mayor.");
        } else if (fecha1[2] < fecha2[2]) {
            System.out.println("La persona 1 es mayor.");
        } else {
            if (fecha1[1] > fecha2[1]) {
                System.out.println("La persona 2 es mayor.");
            } else if (fecha1[1] < fecha2[1]) {
                System.out.println("La persona 1 es mayor.");
            } else {
                if (fecha1[0] > fecha2[0]) {
                    System.out.println("La persona 2 es mayor.");
                } else if (fecha1[0] < fecha2[0]) {
                    System.out.println("La persona 1 es mayor.");
                } else {
                    System.out.println("Tienen la misma edad.");
                }
            }
        }
    }
}