package day25_Practices;

public class Carpet {

    public double width;
    public double length;
    public double unitPrice;
    public boolean isPersian;

    public Carpet(double width, double length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }

    @Override
    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                ", Total Cost=" + calcCost() +
                '}';
    }

    public double calcCost () {
        double totalPrice = (width*length)*unitPrice;

        if (isPersian) {
            totalPrice+=200;
        }
        return totalPrice;
    }
}
