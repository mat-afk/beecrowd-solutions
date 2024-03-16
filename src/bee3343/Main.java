package bee3343;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        Integer numTitans = scan.nextInt();
        Integer tamanhoMuralha = scan.nextInt();
        scan.nextLine();

        char[] titans = new char[numTitans];
        titans = scan.nextLine().toCharArray();

        Integer p = scan.nextInt();
        Integer m = scan.nextInt();
        Integer g = scan.nextInt();

        Integer numMuralhas = 1;
        Integer vidaMuralhaAtual = tamanhoMuralha;

        for (char titan : titans) {

            Integer ataque = 0;
            
            if (titan == 'P') 
                ataque = p;

            if (titan == 'M') 
                ataque = m;

            if (titan == 'G') 
                ataque = g;

            vidaMuralhaAtual -= ataque;

            if (vidaMuralhaAtual < ataque) {
                numMuralhas++;
                vidaMuralhaAtual = tamanhoMuralha;
            }
        }

        System.out.println(numMuralhas);

        scan.close();
    }
}