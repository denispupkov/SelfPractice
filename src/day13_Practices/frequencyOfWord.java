package day13_Practices;

public class frequencyOfWord {
    public static void main(String[] args) {

        System.out.println(frequency("Java java jAvA I love jaVA, I cannot live without JAVA","java"));
title("jAvA");

    }

    public static int frequency (String sentence, String word) {
        int count = 0;

        String result = sentence.toLowerCase().replace(word, word.toLowerCase().substring(1));
        count = sentence.length() - result.length();

        return count;
    }
    public static void title (String str) {

        String result = str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase();
        System.out.println(result);
    }

}
