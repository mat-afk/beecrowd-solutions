package bee1183;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Double[][] m = new Double[12][12];

        Scanner scan = new Scanner(System.in);
        String operacao = scan.nextLine();

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                m[i][j] = scan.nextDouble();
            }
        }

        if (operacao.equals("S")) {
            System.out.printf("%.1f\n", calcularSomaAcimaDaDiagonalPrincipal(m));
        }

        if (operacao.equals("M")) {
            System.out.printf("%.1f\n", calcularMediaAcimaDaDiagonalPrincipal(m));
        }

        scan.close();
    }

    private static Double calcularSomaAcimaDaDiagonalPrincipal(Double[][] m) {

        Double soma = 0.0;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                if (i < j) {
                    soma += m[i][j];
                }
            }
        }

        return soma;
    }

    private static Double calcularMediaAcimaDaDiagonalPrincipal(Double[][] m) {
        return calcularSomaAcimaDaDiagonalPrincipal(m) / ((144 - 12) / 2);
    }
}
