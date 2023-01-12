package day20_Practices;

import java.util.Arrays;

public class ReverseTheSecondWord {

    public static void main(String[] args) {

        String sentence = "I Love Java";
        String temp = "";
        String result = "";

        String [] splitted = sentence.split(" ");

        for (int i = splitted[1].length()-1; i >= 0 ; i--) {
            temp+=splitted[1].charAt(i);
        }
        splitted[1] = temp;

        System.out.println(Arrays.toString(splitted));





            }
        }


