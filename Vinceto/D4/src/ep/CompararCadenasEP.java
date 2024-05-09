package ep;

public class CompararCadenasEP {
    public static void main(String[] args) {
        // Declarar dos cadenas de texto
        String cadenaUno = "Hola";
        String cadenaDos = "Hola";

        // Comparar las cadenas de texto con equals, y mostrar un mensaje en pantalla
        if (cadenaUno.equals(cadenaDos)) {
            System.out.println("Las cadenas son iguales (usando equals)");
        } else {
            System.out.println("Las cadenas no son iguales (usando equals)");
        }

        // Comparar las cadenas de texto con compareTo y ver cuál es mayor, menor o iguales
        int comparacion = cadenaUno.compareTo(cadenaDos);
        if (comparacion == 0) {
            System.out.println("Las cadenas son iguales (usando compareTo)");
        } else if (comparacion < 0) {
            System.out.println("La cadena Uno es menor que la cadena Dos (usando compareTo)");
        } else {
            System.out.println("La cadena Uno es mayor que la cadena Dos (usando compareTo)");
        }
    }
}

