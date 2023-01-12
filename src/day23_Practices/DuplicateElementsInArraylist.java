package day23_Practices;

import java.util.ArrayList;
import java.util.Arrays;

public class DuplicateElementsInArraylist {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        int size = list.size();


        for (int i = 0; i < size; i++) {
            list.add(list.get(i));

        }
        System.out.println(list);
    }
}
