package day28_Practices;

import java.util.ArrayList;
import java.util.Arrays;

public class CandyFactory {

    public static void main(String[] args) {

        ArrayList<Candy> candies = new ArrayList<>();
        Candy candy1 = new Candy("Snickers",2,2.99,true);
        Candy candy2 = new Candy("Mars",1,2.25,false);
        Candy candy3 = new Candy("Hershey's",1,2.3,true);
        Candy candy4 = new Candy("Milky Way",3,0.00,false);
        Candy candy5 = new Candy("Dove",4,2.79,false);

        candies.addAll(Arrays.asList(candy1,candy2,candy3,candy4,candy5));

        for (Candy candy : candies) {
            System.out.println(candy);
        }


    }
}
