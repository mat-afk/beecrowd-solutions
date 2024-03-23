package bee1094;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        Integer cases = scan.nextInt();
        scan.nextLine();

        Integer totalCobaias = 0;
        Integer coelhos = 0;
        Integer ratos = 0;
        Integer sapos = 0;

        for (int i = 0; i < cases; i++) {
            
            Integer cobaias = scan.nextInt();

            totalCobaias += cobaias;

            String tipo = scan.nextLine();

            if (tipo.contains("C"))
                coelhos += cobaias;

            if (tipo.contains("R"))
                ratos += cobaias;
            
            if (tipo.contains("S"))
                sapos += cobaias;
        }

        System.out.printf("Total: %d cobaias\n", totalCobaias);
        System.out.printf("Total de coelhos: %d\n", coelhos);
        System.out.printf("Total de ratos: %d\n", ratos);
        System.out.printf("Total de sapos: %d\n", sapos);
        System.out.printf("Percentual de coelhos: %.2f %%\n", coelhos * 100.0 / totalCobaias);
        System.out.printf("Percentual de ratos: %.2f %%\n", ratos * 100.0 / totalCobaias);
        System.out.printf("Percentual de sapos: %.2f %%\n", sapos * 100.0 / totalCobaias);
        
        scan.close();
    }
}