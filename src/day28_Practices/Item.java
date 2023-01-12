package day28_Practices;

import java.util.ArrayList;
import java.util.Arrays;


public class Item {

    private String name;
    private double unitPrice;
    private int quantity;

    public Item(String name, double unitPrice, int quantity) {

        if (name.equalsIgnoreCase("toilet paper") && quantity>1) {
            System.out.println("We cannot sell more than 1 toilet paper");
            System.exit(1);
        }
        setName(name);
        setUnitPrice(unitPrice);
        setQuantity(quantity);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        char [] arr = (name.toCharArray());
        if (name.isBlank() || name.isEmpty()) {
            System.err.println("The name is blank or empty");
            System.exit(1);
        }

        for (char c : arr) {
            if (!Character.isLetterOrDigit(c) && !Character.isSpaceChar(c)) {
                System.err.println("The name cannot contain any special characters");
                System.exit(1);
            }
        }
        if (!Character.isUpperCase(arr[0])) {
            System.err.println("The first letter of the name should start with upper case and shouldn't be a number");
            System.exit(1);
        }

        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        if (unitPrice<0) {
            System.err.println("The price cannot be negative");
            System.exit(1);
        }
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity<0) {
            System.err.println("The quantity cannot be negative");
            System.exit(1);
        }

        this.quantity = quantity;
    }

    public double calcCost () {
        return quantity*unitPrice;
    }


    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", total cost=" + calcCost() +
                '}';
    }
}
