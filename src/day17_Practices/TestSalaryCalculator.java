package day17_Practices;

public class TestSalaryCalculator {

    public static void main(String[] args) {

        SalaryCalculator salaryCalculator = new SalaryCalculator();

        salaryCalculator.setInfo(35,2.9,1.5,40);

        System.out.println("Salary: "+salaryCalculator.salary());
        System.out.println("State Tax: "+salaryCalculator.stateTax());
        System.out.println("Federal Tax: "+salaryCalculator.federalTax());
        System.out.println("Salary After Tax: "+salaryCalculator.salaryAfterTax());


    }
}
