package D8;

import java.util.Scanner;

public class GenerarListaHtml {
    public static void main(String[] args) {
        System.out.println("Ingresa el tamaño de la lista html:");
        String html = "";
        Scanner sc = new Scanner(System.in);
        int items = sc.nextInt();
        int i = 0;
        while (i<items) {
            i+=1;
            html += "<li> item " + i +
                    "</li>\n";
        }
        System.out.printf(html);
    }
}