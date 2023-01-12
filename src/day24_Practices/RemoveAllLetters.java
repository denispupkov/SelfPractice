package day24_Practices;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveAllLetters {

    public static void main(String[] args) {

        ArrayList<Character> list = new ArrayList<>(Arrays.
                asList( '$', 'A', 'B', '1', '2', 'C', 'D', '@', '!', '3', '4'));
        ArrayList <Character> newList = new ArrayList<>();

        Character [] ch = list.toArray(new Character[0]);

        for (int i = 0; i < ch.length; i++) {
            if (!Character.isLetter(ch[i])) {
                newList.add(ch[i]);
            }

        }
        System.out.println(newList);
    }
}
