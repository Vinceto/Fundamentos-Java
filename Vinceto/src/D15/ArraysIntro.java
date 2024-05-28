package D15;

public class ArraysIntro {
    public static void main(String[] args) {
        int[] sueldos = {400000, 760000, 1100000, 650000, 654980, 987300, 700450, 442300};
        double promedio = calcularPromedioSueldos(sueldos);
        System.out.println("El promedio de los sueldos mayores a 500000 es: " + promedio);
    }

    public static double calcularPromedioSueldos(int[] sueldos) {
        int suma = 0;
        int contador = 0;
        for (int sueldo : sueldos) {
            if (sueldo > 500000) {
                suma += sueldo;
                contador++;
            }
        }
        return contador == 0 ? 0 : (double) suma / contador;
    }
}
