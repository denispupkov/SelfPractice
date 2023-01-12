package day25_Practices;

public class Pizza {

    public char size;
    public int numberOfCheeseTopping;
    public int numberOfPepperoniTopping;

    public Pizza(char size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +

                '}';
    }

    public double calcCost () {
        double cost = 0;
        if (size == 'S') {
            cost = 10 + (this.numberOfCheeseTopping + this.numberOfPepperoniTopping) * 2;
        } else if (size == 'M') {
            cost = 12 + (this.numberOfCheeseTopping + this.numberOfPepperoniTopping) * 2;
        }
        else if (size == 'L') {
            cost = 14 + (this.numberOfCheeseTopping + this.numberOfPepperoniTopping) * 2;
        }
        else {
            System.out.print("Wrong pizza size ");

        }
        return cost;
    }
}
