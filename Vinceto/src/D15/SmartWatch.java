package D15;
import java.util.ArrayList;
import java.util.List;
public class SmartWatch {
    public static void main(String[] args) {
        List<Integer> pasos = new ArrayList<>();
        for (String arg : args) {
            pasos.add(Integer.parseInt(arg));
        }
        List<Integer> pasosFiltrados = clearSteps(pasos);
        double promedioPasos = promedio(pasosFiltrados);
        System.out.println("Promedio de pasos : "+promedioPasos);
    }

    public static List<Integer> clearSteps(List<Integer> pasos) {
        List<Integer> filtrados = new ArrayList<>();
        for (int paso : pasos) {
            if (paso >= 200 && paso <= 100000) {
                filtrados.add(paso);
            }else{
                System.out.println("valor descartado : "+paso);
            }
        }
        return filtrados;
    }

    public static double promedio(List<Integer> pasos) {
        int suma = 0;
        for (int paso : pasos) {
            suma += paso;
            System.out.println("pasos a sumar : "+paso);
        }
        return pasos.size() == 0 ? 0 : (double) suma / pasos.size();
    }
}
