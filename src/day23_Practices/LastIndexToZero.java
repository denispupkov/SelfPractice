package day23_Practices;

import java.util.ArrayList;
import java.util.Arrays;

public class LastIndexToZero {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(list);
        list.set(list.size()-1,Integer.valueOf(0));
        System.out.println(list);

    }
}
