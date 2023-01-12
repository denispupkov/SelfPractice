package day29_Practices;

public class Tester {

    private String name;
    private char gender;
    private int age;
    private String id;
    private String jobTitle;
    private int salary;

    public void setInfo(String name, char gender, int age, String id, String jobTitle, int salary) {
        setName(name);
        setGender(gender);
        setAge(age);
        setId(id);
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {

        if (!(gender=='M' || gender=='F')) {
            System.out.println("Gender should be M or L");
            System.exit(1);
        }
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Age cannot be negative");
            System.exit(1);
        }
        if (age >= 18 && age <= 65) {
            this.age = age;
        } else {
            System.out.println("The age should be between 18-65");
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if (salary<0) {
            System.out.println("Salary cannot be negative");
            System.exit(1);
        }
        this.salary = salary;
    }

    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", id='" + id + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
