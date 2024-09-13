package org.example;
//Дан текст. Определите содержит ли данный текст
//все буквы алфавита. Например, The quick brown fox jumps over the lazy dog

public class Main {
    public static void main(String[] args) {
        String phrase = new String("The quick brown fox jumps over the lazy dog");
        String [] alphabet = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
                "k", "l", "m", "n", "o", "p", "q", "r", "s", "t",
                "u", "v", "w", "x", "y", "z"};
        boolean containsAll = true;
        for (String letter : alphabet) {
            if (!phrase.toLowerCase().contains(letter)) {
                containsAll = false;
                break;
            }
        }
        if (containsAll) {
            System.out.println("The phrase contains all the letters of the alphabet");
        } else {
            System.out.println("The phrase does not contain all the letters of the alphabet");
        }

    }
}