package D4;

public class EstadoProyecto {

    public static void main(String[] args) {
        // Definir el porcentaje de avance del proyecto
        int porcentaje = 50;

        // Definir el mensaje de salida según sea el caso
        if (porcentaje == 0) {
            System.out.println("Pendiente");
        } else if (porcentaje > 0 && porcentaje < 100) {
            System.out.println("En proceso");
        } else if (porcentaje == 100) {
            System.out.println("Terminado");
        } else {
            System.out.println("El porcentaje de avance es inválido");
        }
    }
}