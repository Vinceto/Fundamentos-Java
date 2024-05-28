package D15;

public class Visitas {
    public static void main(String[] args) {
        int[] visitas = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            visitas[i] = Integer.parseInt(args[i]);
            System.out.println("visita "+i+" : "+visitas[i]);
        }
        double promedioVisitas = promedio(visitas);
        System.out.println("El promedio de visitas es: "+promedioVisitas);
    }

    public static double promedio(int[] visitas) {
        int suma = 0;
        for (int visita : visitas) {
            suma += visita;
        }
        return visitas.length == 0 ? 0 : (double) suma / visitas.length;
    }
}
