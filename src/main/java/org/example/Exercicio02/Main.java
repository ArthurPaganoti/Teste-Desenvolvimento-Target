package org.example.Exercicio02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String input = scanner.nextLine();

        StringAnalyzer analyzer = new StringAnalyzer();
        int[] counts = analyzer.contarOcorrenciasDeA(input);

        if (counts[0] > 0 || counts[1] > 0) {
            System.out.println("A letra 'a' minúscula aparece " + counts[0] + " vezes na string.");
            System.out.println("A letra 'A' maiúscula aparece " + counts[1] + " vezes na string.");
        } else {
            System.out.println("A letra 'a' não aparece na string.");
        }
    }
}