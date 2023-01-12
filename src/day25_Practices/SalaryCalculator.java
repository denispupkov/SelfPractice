package day25_Practices;

public class SalaryCalculator {

    public double hourlyRate;
    public double weeklyHours;
    public double stateTaxRate;
    public double federalTaxRate;

    public SalaryCalculator(double hourlyRate, double weeklyHours, double stateTaxRate, double federalTaxRate) {
        this.hourlyRate = hourlyRate;
        this.weeklyHours = weeklyHours;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
    }


    public String toString() {
        return "SalaryCalculator{" +
                "salary=" + salary()+
                ", stateTax=" + stateTax() +
                ", federalTax=" + federalTax() +
                ", salaryAfterTax=" + salaryAfterTax() +
                '}';
    }

    public double salary () {
        return this.hourlyRate*weeklyHours*52;
    }
    public double stateTax () {
        return (hourlyRate*weeklyHours*52)*stateTaxRate;
    }
    public double federalTax () {
        return (hourlyRate*weeklyHours*52)*federalTaxRate;
    }
    public double salaryAfterTax () {
        return (hourlyRate*weeklyHours*52)-((hourlyRate*weeklyHours*52)*stateTaxRate)-
                ((hourlyRate*weeklyHours*52)*federalTaxRate);
    }


}
