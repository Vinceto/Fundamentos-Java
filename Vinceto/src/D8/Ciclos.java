package D8;
import java.util.Scanner;

public class Ciclos {
    public static void main(String[] args) {
        //Se lee el valor ingresado por el usuario
        System.out.println("Ingrese un número");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //i es la variable que contará hasta el número ingresado
        int i = 0;
        //suma es la variable que irá guardando el resultado
        int suma = 0;
        while (i < n){
            i+=1;
            suma += i;
        }
        System.out.printf("%d\n",suma);
    }
}
