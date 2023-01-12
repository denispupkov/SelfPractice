package day17_Practices;

public class TestItem {

    public static void main(String[] args) {

        Item item = new Item();

        item.setInfo("Pickwick Black Tea",4.89,3);

        System.out.println(item);
        System.out.println(item.calcCost());


    }
}
