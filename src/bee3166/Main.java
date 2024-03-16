package bee3166;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Integer numPalavras = scan.nextInt();
        Integer linhas = scan.nextInt();
        Integer colunas = scan.nextInt();
        scan.nextLine();

        String[] palavrasProcuradas = new String[numPalavras];
        char[][] cacaPalavras = new char[linhas][colunas];

        for (int i = 0; i < numPalavras; i++) {
            palavrasProcuradas[i] = scan.nextLine().toLowerCase();
        }

        for (int i = 0; i < cacaPalavras.length; i++) {
            cacaPalavras[i] = scan.nextLine().toCharArray();
        }

        StringBuilder diagonalPrincipal = new StringBuilder();
        StringBuilder[] acimaDaDiagonalPrincipal = new StringBuilder[linhas > colunas ? linhas : colunas];
        StringBuilder[] abaixoDaDiagonalPrincipal = new StringBuilder[linhas > colunas ? linhas : colunas];

        for (int i = 0; i < cacaPalavras.length; i++) {
            for (int j = 0; j < cacaPalavras[0].length; j++) {
                if (i == j) {
                    diagonalPrincipal.append(cacaPalavras[i][j]);

                    for (int k = 0; k < acimaDaDiagonalPrincipal.length - j - 1; k++) {

                        if (acimaDaDiagonalPrincipal[k] == null)
                            acimaDaDiagonalPrincipal[k] = new StringBuilder();

                        acimaDaDiagonalPrincipal[k].append(cacaPalavras[i][j + k + 1]);
                    }

                    for (int k = 0; k < abaixoDaDiagonalPrincipal.length - i - 1; k++) {

                        if (abaixoDaDiagonalPrincipal[k] == null)
                            abaixoDaDiagonalPrincipal[k] = new StringBuilder();

                        abaixoDaDiagonalPrincipal[k].append(cacaPalavras[i + k + 1][j]);
                    }
                }
            }
        }

        for (String palavra : palavrasProcuradas) {

            Boolean encontrada = false;

            if (diagonalPrincipal.toString().toLowerCase().contains(palavra)
                    || diagonalPrincipal.reverse().toString().toLowerCase().contains(palavra)) {

                System.out.printf("1 Palavra \"%s\" na diagonal principal\n", palavra);
                encontrada = true;
                continue;
            }

            for (StringBuilder ac : acimaDaDiagonalPrincipal) {

                if (ac == null)
                    continue;

                if (ac.toString().toLowerCase().contains(palavra)
                        || ac.reverse().toString().toLowerCase().contains(palavra)) {
                    System.out.printf("2 Palavra \"%s\" acima da diagonal principal\n", palavra);
                    encontrada = true;
                    break;
                }
            }

            for (StringBuilder ab : abaixoDaDiagonalPrincipal) {

                if (ab == null) 
                    continue;

                if (ab.toString().toLowerCase().contains(palavra)
                        || ab.reverse().toString().toLowerCase().contains(palavra)) {
                    System.out.printf("3 Palavra \"%s\" abaixo da diagonal principal\n", palavra);
                    encontrada = true;
                    break;
                }
            }

            if (encontrada == false)
                System.out.printf("4 Palavra \"%s\" inexistente\n", palavra);
        }

        scan.close();
    }
}
