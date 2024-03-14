package bee1049;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Map<String, Map<String, Map<String, String>>> estruturas = new HashMap<>();

        Map<String, Map<String, String>> classesVertebradas = new HashMap<>();
        Map<String, Map<String, String>> classesInvertebradas = new HashMap<>();

        Map<String, String> animaisAves = new HashMap<>();
        Map<String, String> animaisMamiferos = new HashMap<>();
        Map<String, String> animaisInsetos = new HashMap<>();
        Map<String, String> animaisAnelideos = new HashMap<>();

        animaisAves.put("carnivoro", "aguia");
        animaisAves.put("onivoro", "pomba");
        animaisMamiferos.put("onivoro", "homem");
        animaisMamiferos.put("herbivoro", "vaca");
        animaisInsetos.put("hematofago", "pulga");
        animaisInsetos.put("herbivoro", "lagarta");
        animaisAnelideos.put("hematofago", "sanguessuga");
        animaisAnelideos.put("onivoro", "minhoca");

        classesVertebradas.put("ave", animaisAves);
        classesVertebradas.put("mamifero", animaisMamiferos);
        classesInvertebradas.put("inseto", animaisInsetos);
        classesInvertebradas.put("anelideo", animaisAnelideos);

        estruturas.put("vertebrado", classesVertebradas);
        estruturas.put("invertebrado", classesInvertebradas);

        Scanner scan = new Scanner(System.in);

        String estrutura = scan.nextLine();
        String classe = scan.nextLine();
        String dieta = scan.nextLine();
    
        System.out.println(estruturas.get(estrutura).get(classe).get(dieta));

        scan.close();
    }
}
