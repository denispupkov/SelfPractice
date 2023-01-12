package day04_Practices;

public class EmployeeInfo {

    public static void main(String[] args) {

        String name = "Daniel";
        int age = 28;
        String gender = "Male";
        String company_name = "Google Inc";
        String job_title = "Software Developer";
        int salary = 90000;

        System.out.println(name+" is "+age+" years old, gender is "+gender+".\n"
                +name+" works at "+company_name+" as a "+job_title+".\n"+
                name+" makes $ "+salary+" per year."
        );

    }
}
