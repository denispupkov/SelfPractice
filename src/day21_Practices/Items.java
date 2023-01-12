package day21_Practices;

public class Items {

    public static void main(String[] args) {

        String[][] items = {
                {"Apple", "Banana", "Grape", "Avocado"},
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
        };


        for (int i = 0; i < items.length; i++) {
            for (int j = 0; j < items[i].length; j++) {
                System.out.print(items[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("___________________");

        for (int i = 0; i < items.length; i++) {
            for (int i1 = items[i].length - 1; i1 >= 0; i1--) {
                System.out.print(items[i][i1]+"\t");
            }
            System.out.println();
        }
        System.out.println("___________________");

        for (int i = items.length - 1; i >= 0; i--) {
            for (int j = 0; j < items[i].length; j++) {
                System.out.print(items[i][j]+"\t");
            }
            System.out.println();
        }
        }

    }

