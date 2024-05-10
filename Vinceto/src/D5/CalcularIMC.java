package D5;
import java.util.Scanner;

public class CalcularIMC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Primero indique su edad:");
        int edad = sc.nextInt();
        if (mayorEdad(edad)) {
            double altura = obtenerDato("Digite su altura: ");
            double peso = obtenerDato("Digite su Peso: ");
            double imc = calcular(altura, peso);
            String evaluacion = evaluarImc(imc);
            System.out.println("IMC: " + imc);
            System.out.println("Evaluación: " + evaluacion);
        } else {
            System.out.println("Debes ser mayor de edad");
        }
        sc.close();
    }

    private static boolean mayorEdad(int edad) {
        return edad >= 18;
    }

    public static double obtenerDato(String mensaje) {
        Scanner sc = new Scanner(System.in);
        double dato;
        do {
            System.out.println(mensaje);
            dato = sc.nextDouble();
            if (dato <= 0) {
                System.out.println("Dato inválido, por favor ingrese un valor positivo.");
            }
        } while (dato <= 0);
        return dato;
    }

    public static double calcular(double altura, double peso) {
        return peso / (altura * altura);
    }

    private static String evaluarImc(double imc) {
        String evaluacion = "";
        if (imc < 18.5) {
            evaluacion = "Delgado";
        } else if (imc >= 18.5 && imc <= 24.9) {
            evaluacion = "Normal";
        } else if (imc > 24.9 && imc <= 29.9) {
            evaluacion = "Sobrepeso";
        } else if (imc > 29.9) {
            evaluacion = "Obeso";
        } else {
            evaluacion = "Error";
        }
        return evaluacion;
    }
}