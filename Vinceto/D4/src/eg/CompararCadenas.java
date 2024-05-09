package eg;

public class CompararCadenas {
    public static void main(String[] args) {
        String cadenaUno = "Bienvenido a Desafío Latam";
        String cadenaDos = "Bienvenidos a Desafío Latam";

        if (cadenaUno.equals(cadenaDos)) {
            System.out.println("Las cadenas son iguales");
        } else {
            System.out.println("Las cadenas no son iguales");
        }
    }
}
