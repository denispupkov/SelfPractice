package day19_Practices;

public class ArrayOfGoods {

    public static void main(String[] args) {

        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case"};
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs =   {12345, 12346, 12347, 12348, 12349, 12350};

        for (int i = 0; i < items.length; i++) {
            if (items[i].startsWith("Gloves")) {
                System.out.println("Index Of "+items[i]+" is "+i);
            }
            if (items[i].equalsIgnoreCase("IPad")) {
                System.out.println("The item "+items[i]+" is contained in the list");
            }
        }
        for (int j = 0; j < items.length ; j++) {

            System.out.println(items[j]+" - $"+prices[j]+" - ID#"+itemIDs[j]);
        }

    }
}
