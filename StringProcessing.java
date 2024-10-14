package org.example;

public class StringProcessing {

    public boolean isStrongPassword(String password) {
        String validate = "(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9@#$%]).{8,}";
        if (password.matches(validate)) {
            System.out.println("Пароль действителен");
            return true;
        }
            System.out.println("Пароль недействителен");
            return false;
    }
    public int calculateDigits(String sentence) {
            int count = 0;
            for (int i = 0; i < sentence.length(); i++) {
                if (Character.isDigit(sentence.charAt(i))) {
                    count++;
                }
            }
            return count;
        }

    public int calculateWords(String sentence){
        if (sentence == null || sentence.trim().isEmpty()) {
            return 0;
        }

        String[] words = sentence.trim().split("\\s+");
        return words.length;
    }

}