package day27_Practices;

public class CydeoStudent {

    public String name;
    public char gender;
    public int age;
    public int batchNumber;
    public int groupNumber;
    public static String schoolName;
    public static String fieldOfStudy;
    public static String programmingLanguage;
    public static String secretCode;

    public CydeoStudent(String name, char gender, int age, int batchNumber, int groupNumber) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
    }

    static {
        schoolName = "Cydeo School";
        fieldOfStudy = "IT";
        programmingLanguage = "Java";
        secretCode = "Wooden Spoon";
    }
    public static void printSchoolName () {
        System.out.println("The name of the school is: "+schoolName);
    }
    public static void printSecretCode () {
        System.out.println("The secret code is: "+secretCode);
    }
    public void attendClass () {
        System.out.println(name+" is attending the class in "+schoolName);
    }
    public void study () {
        System.out.println(name+" is studying "+programmingLanguage);
    }


    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                '}';
    }
}
