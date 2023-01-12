package day25_Practices;

public class TestSalaryCalculator {

    public static void main(String[] args) {

        SalaryCalculator salaryCalculator = new SalaryCalculator(
                35, 40, 0.0875, 0.04);


        System.out.println(salaryCalculator.salary());
        System.out.println(salaryCalculator.stateTax());
        System.out.println(salaryCalculator.federalTax());
        System.out.println(salaryCalculator.salaryAfterTax());

        System.out.println(salaryCalculator);




    }
}
