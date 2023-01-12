package day08_Practices;

public class Loans {

    public static void main(String[] args) {

        int salary = 60001;
        int creditScore = 800;
        String result = "";

        result = (salary>60000 && creditScore>650)?"Loan Approved":"Loan Denied";
        System.out.println(result);
    }
}
