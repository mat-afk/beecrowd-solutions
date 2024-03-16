package bee1051;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        Double renda = scan.nextDouble();

        Double impostoDeRenda = calcularImpostoDeRenda(renda);
        
        if (impostoDeRenda == 0.00) {
            System.out.println("Isento");
        } else {
            System.out.printf("R$ %.2f\n", impostoDeRenda);
        }

        scan.close();
    }

    public static Double calcularImpostoDeRenda(Double renda) {
        
        if (renda > 2000.0 && renda <= 3000.0) 
            return (renda - 2000.0) * 0.08;

        if (renda > 3000.0 && renda <= 4500.0) 
            return ((renda - 3000.0) * 0.18) + (1000.0 * 0.08);

        if (renda > 4500.0) 
            return ((renda - 4500.0) * 0.28) + (1500.0 * 0.18) + (1000.0 * 0.08);
        
        return 0.0;
    }
}
