package day17_Practices;

public class Student {

public String name;
public char gender;
public int age;
public String studentId;
public char grade;
boolean isFullTime;


public void study () {
    System.out.println("Student "+name+" is studying");
}
    public void setInfo(String name, char gender, int age, String studentId, char grade, boolean isFullTime) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.studentId = studentId;
        this.grade = grade;
        this.isFullTime = isFullTime;
    }


    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", studentId='" + studentId + '\'' +
                ", grade=" + grade +
                ", isFullTime=" + isFullTime +
                '}';
    }
}
