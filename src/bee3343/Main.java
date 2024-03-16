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
        Integer[] muralhas = new Integer[numTitans];
        muralhas[0] = tamanhoMuralha;

        for (char titan : titans) {

            Integer ataque = 0;
            
            if (titan == 'P') 
                ataque = p;

            if (titan == 'M') 
                ataque = m;

            if (titan == 'G') 
                ataque = g;

            for (int i = 0; i < muralhas.length; i++) {
                
                if (muralhas[i] >= ataque) {
                    muralhas[i] -= ataque;
                    break;
                }

                if (muralhas[i + 1] == null) {
                    numMuralhas++;
                    muralhas[i + 1] = tamanhoMuralha;
                }
            }
        }

        System.out.println(numMuralhas);

        scan.close();
    }
}