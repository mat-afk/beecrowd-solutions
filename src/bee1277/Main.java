package bee1277;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        Integer cases = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < cases; i++) {
            
            Integer numEstudantes = scan.nextInt();
            scan.nextLine();

            String[] estudantes = new String[numEstudantes];
            estudantes = scan.nextLine().split(" ");

            String[] registrosFrequencias = new String[numEstudantes];
            registrosFrequencias = scan.nextLine().split(" ");

            for (int j = 0; j < estudantes.length; j++) {
                char[] frequencias = registrosFrequencias[j].toCharArray();
    
                Double presenca = 0.0;
                Double abono = 0.0;
                for (char frequencia : frequencias) {
                    if (frequencia == 'P') presenca++;
                    if (frequencia == 'M') abono++;
                }
    
                Double frequenciaGlobal = Math.round((presenca / (frequencias.length - abono)) * 100.0) / 100.0;
    
                if (frequenciaGlobal < 0.75) 
                    System.out.printf("%s ", estudantes[j]);
            }
    
            System.out.println();
        }

        scan.close();
    }
}
