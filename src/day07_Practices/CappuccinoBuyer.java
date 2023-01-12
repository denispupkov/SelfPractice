package day07_Practices;

public class CappuccinoBuyer {

    public static void main(String[] args) {

        String size = "venti";
        String result = "Invalid size";
        String price = "";
        String calories = "";


        if (size=="tall" || size=="grande"||size=="venti") {
            if (size=="tall") {
                result = size;
                price = "price is $3.69";
                calories = 90+" calories";
            }
            else if (size == "grande") {
                result = size;
                price = "price is $3.99";
                calories = 120+" calories";
            }
            else  {
                result = size;
                price = "price is $4.29";
                calories = 150+" calories";
            }


        }
        System.out.println(result + " "+price);
        System.out.println(calories);

    }
}
