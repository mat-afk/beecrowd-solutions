package bee1068;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        while (scan.hasNextLine()) {
            char[] expression = scan.nextLine().toCharArray();

            Map<Integer, Character> parenthesisAberturas = new HashMap<>();
            Map<Integer, Character> parenthesisFechaduras = new HashMap<>();

            for (int i = 0; i < expression.length; i++) {
                if (expression[i] == '(') 
                    parenthesisAberturas.put(i, expression[i]);
                
                if (expression[i] == ')') 
                    parenthesisFechaduras.put(i, expression[i]);
                
            }

            if (parenthesisAberturas.size() != parenthesisFechaduras.size()) {
                System.out.println("incorrect");
            }

            Integer correspondencias = 0;

            for (int i = 0; i < parenthesisAberturas.size(); i++) {
                if ( parenthesisAberturas.get(i) != null) {
                    for (int j = 0; j < parenthesisFechaduras.size(); j++) {
                        if (j > i && parenthesisFechaduras.get(j) != null) {
                            correspondencias++;
                        }
                    }
                }
            }

            if (correspondencias == parenthesisAberturas.size())
                System.out.println("correct");            
        }

        scan.close();
    }
}
