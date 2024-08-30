package org.example.Exercicio02;

public class StringAnalyzer {
    public int[] contarOcorrenciasDeA(String input) {
        int[] counts = new int[2];
        for (char c : input.toCharArray()) {
            if (c == 'a') {
                counts[0]++;
            } else if (c == 'A') {
                counts[1]++;
            }
        }
        return counts;
    }
}