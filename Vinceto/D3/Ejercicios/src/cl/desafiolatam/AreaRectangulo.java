package cl.desafiolatam;

import java.util.Scanner;

public class AreaRectangulo {
    public static void main(String[] args) {
        double base = 0.0;
        double altura = 0.0;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.printf("Ingrese la base: ");
            base = sc.nextDouble();
            if(base <= 0) {
                System.out.println("Dato inválido");
            }
        }while(base <= 0);
        do{
            System.out.printf("Ingrese la altura: ");
            altura = sc.nextDouble();
            if(altura <= 0) {
                System.out.println("Dato inválido");
            }
        }while(altura <= 0);

        double area = 0.0;
        area = base * altura;
        System.out.println("El área del rectángulo es: " + area);
    }
}
