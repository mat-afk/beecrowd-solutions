package bee1235;

import java.util.Scanner;
import java.lang.StringBuilder;

public class Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Integer casos = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < casos; i++) {

            String frase = scan.nextLine();

            String esquerda = frase.substring(0, frase.length() / 2);
            String direita = frase.substring(frase.length() / 2);

            StringBuilder sb = new StringBuilder(esquerda);
            sb.reverse();

            StringBuilder sbAuxiliar = new StringBuilder(direita);
            sbAuxiliar.reverse();

            sb.append(sbAuxiliar);

            System.out.println(sb.toString());
        }

        scan.close();
    }
}
