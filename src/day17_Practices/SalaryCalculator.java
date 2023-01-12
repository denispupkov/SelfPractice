package day17_Practices;

public class SalaryCalculator {

    double hourlyRate;
    double stateTaxRate;
    double federalTaxRate;
    double weeklyHours;

    public void setInfo(double hourlyRate, double stateTaxRate, double federalTaxRate, double weeklyHours) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
        this.weeklyHours = weeklyHours;
    }

    public double salary () {
        return this.hourlyRate*this.weeklyHours*52;
    }

    public double stateTax () {
        return this.hourlyRate*this.weeklyHours*52*(stateTaxRate/100);
    }

    public double federalTax () {
        return this.hourlyRate*this.weeklyHours*52*(federalTaxRate/100);
    }

    public double salaryAfterTax () {
        return salary()-stateTax()-federalTax();
    }


    public String toString() {
        return "SalaryCalculator{" +
                "hourlyRate=" + hourlyRate +
                ", stateTaxRate=" + stateTaxRate +
                ", federalTaxRate=" + federalTaxRate +
                ", weeklyHours=" + weeklyHours +
                ", salary=" + salary() +
                ", stateTax=" + stateTax() +
                ", federalTax=" + federalTax() +
                ", salaryAfterTax=" + salaryAfterTax() +
                '}';
    }
}
