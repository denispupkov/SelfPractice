package day28_Practices;

public class Pizza {

    private String size;
    private int numberOfCheeseToppings;
    private int numberOfPepperoniToppings;

    public String getSize() {
        return size;
    }

    public Pizza(String size, int numberOfCheeseToppings, int numberOfPepperoniToppings) {
        if (size.equalsIgnoreCase("small") && numberOfCheeseToppings>3) {
            System.out.println("The number of cheese toppings for "+size+" pizza should not exceed 3");
            System.exit(1);
        }
        if (size.equalsIgnoreCase("medium") && numberOfCheeseToppings>4) {
            System.out.println("The number of cheese toppings for "+size+" pizza should not exceed 4");
            System.exit(1);
        }

        if (size.equalsIgnoreCase("large") && numberOfCheeseToppings>5) {
            System.out.println("The number of cheese toppings for "+size+" pizza should not exceed 5");
            System.exit(1);
        }

        if (size.equalsIgnoreCase("small")&& numberOfPepperoniToppings>4) {
            System.out.println("The number of pepperoni toppings for "+size+" pizza should not exceed 4");
            System.exit(1);
        }

        if (size.equalsIgnoreCase("medium") && numberOfPepperoniToppings>5) {
            System.out.println("The number of pepperoni toppings for "+size+" pizza should not exceed 5");
            System.exit(1);
        }

        if (size.equalsIgnoreCase("large") && numberOfPepperoniToppings>6) {
            System.out.println("The number of pepperoni toppings for "+size+" pizza should not exceed 6");
            System.exit(1);
        }

        setSize(size);
        setNumberOfCheeseToppings(numberOfCheeseToppings);
        setNumberOfPepperoniToppings(numberOfPepperoniToppings);
    }

    public void setSize(String size) {

        if (!(size.equalsIgnoreCase("Small") || size.equalsIgnoreCase("Medium")
                || size.equalsIgnoreCase("Large"))) {
            System.out.println("Wrong size. Should be only Small, Medium or Large");
            System.exit(1);
        }
        this.size = size;
    }

    public int getNumberOfCheeseToppings() {
        return numberOfCheeseToppings;
    }

    public void setNumberOfCheeseToppings(int numberOfCheeseToppings) {
        if (numberOfCheeseToppings<0) {
            System.out.println("Number of toppings cannot be negative");
            System.exit(1);
        }
        this.numberOfCheeseToppings = numberOfCheeseToppings;
    }

    public int getNumberOfPepperoniToppings() {
        return numberOfPepperoniToppings;
    }

    public void setNumberOfPepperoniToppings(int numberOfPepperoniToppings) {
        if (numberOfPepperoniToppings<0) {
            System.out.println("The number of toppings cannot be negative");
            System.exit(1);
        }
        this.numberOfPepperoniToppings = numberOfPepperoniToppings;
    }
    double totalCost = 0;
    public double calcCost () {
        if (size.equalsIgnoreCase("small")) {
            totalCost = 10+(numberOfCheeseToppings+numberOfPepperoniToppings)*2;
        }
        else if (size.equalsIgnoreCase("medium") ){
            totalCost = 12+(numberOfCheeseToppings+numberOfPepperoniToppings)*2;
        }
        else {
            totalCost = 14+(numberOfCheeseToppings+numberOfPepperoniToppings)*2;
        }
        return totalCost;
    }


    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfCheeseToppings=" + numberOfCheeseToppings +
                ", numberOfPepperoniToppings=" + numberOfPepperoniToppings +
                ", calcCost=" + calcCost() +
                '}';
    }
}
