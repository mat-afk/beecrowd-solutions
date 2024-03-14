package bee1040;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Double nota1 = scan.nextDouble();
        Double nota2 = scan.nextDouble();
        Double nota3 = scan.nextDouble();
        Double nota4 = scan.nextDouble();

        Double media = Math.floor(((nota1 * 2) + (nota2 * 3) + (nota3 * 4) + (nota4 * 1)) / (10) * 100) / 100;
        String situacao = "Aluno aprovado.";

        Double notaExame = null;
        Double mediaFinal = null;
        String situacaoFinal = "Aluno aprovado.";

        if (media < 5.0) {
            situacao = "Aluno reprovado.";
        }

        if (media >= 5.0 && media <= 6.9) {
            situacao = "Aluno em exame.";

            notaExame = scan.nextDouble();
            mediaFinal = (media + notaExame) / 2;

            if (mediaFinal <= 4.9) {
                situacaoFinal = "Aluno reprovado.";
            }
        }

        System.out.printf("Media: %.1f\n", media);
        System.out.print(situacao + "\n");

        if (notaExame != null) {
            System.out.printf("Nota do exame: %.1f\n", notaExame);
            System.out.print(situacaoFinal + "\n");
            System.out.printf("Media final: %.1f\n", mediaFinal);
        }

        scan.close();
    }
}
