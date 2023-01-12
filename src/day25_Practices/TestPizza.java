package day25_Practices;

public class TestPizza {

    public static void main(String[] args) {

        Pizza pizza1 = new Pizza('L',1,1);
        Pizza pizza2 = new Pizza('M',2,0);
        Pizza pizza3 = new Pizza('S',0,0);
        Pizza pizza4 = new Pizza('H',2,2);

        System.out.println(pizza1.calcCost());
        System.out.println(pizza2.calcCost());
        System.out.println(pizza3.calcCost());
        System.out.println(pizza4.calcCost());





    }
}
