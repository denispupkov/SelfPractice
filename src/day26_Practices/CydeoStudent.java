package day26_Practices;

public class CydeoStudent {

    public String name;
    public int age;
    public char gender;
    public String id;
    public char grade;
    public int batchNumber;
    public int groupNumber;
    public static String schoolName = "Cydeo School";
    public static String magicWord = "Wooden Spoon";

    public CydeoStudent(String name, int age, char gender, String id, char grade, int batchNumber, int groupNumber) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = id;
        this.grade = grade;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
    }


    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id='" + id + '\'' +
                ", grade=" + grade +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                '}';
    }

    public void study () {
        System.out.println("The student "+name+" is studying");
    }
    public void attendClass () {
        System.out.println("The student "+name+" attend the class");
    }
    public void printSchoolName () {
        System.out.println(schoolName);
    }
    public void printProgrammingLanguage () {
        System.out.println("The student "+name+" is learning Java language");
    }

}
