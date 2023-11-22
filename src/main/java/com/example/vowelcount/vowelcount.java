package com.example.vowelcount;

import javax.swing.*;

public class vowelcount {
    public static void main(String[] args) {
        String sentence = JOptionPane.showInputDialog(null, "Enter your sentence:");
        int result = VowelCount(sentence);
        JOptionPane.showMessageDialog(null,"Number of vowels in the sentence: " +result);

    }

    private static int VowelCount(String Sentence) {
        int count=0;
        if (!Sentence.isEmpty()) {
           count = 0;

            for (int i = 0; i < Sentence.length(); i++) {
                char New = Character.toLowerCase(Sentence.charAt(i));
                if (New == 'a' || New == 'e' || New == 'i' || New == 'o' || New == 'u') {
                    count += 1;

                }


            }
        }
        return count;



    }
}