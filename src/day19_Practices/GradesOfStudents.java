package day19_Practices;

public class GradesOfStudents {

    public static void main(String[] args) {

        String [] names = {"Anna", "Nancy", "Sarah"};
        int [] scores = {90, 75, 80};
        char [] grades = new char[names.length];

        for (int i = 0; i < scores.length; i++) {

            if (scores[i]>89) {
                grades[i] = 'A';
            }
            else if (scores[i]>79) {
                grades[i] = 'B';
            }
            else if (scores[i]>69) {
                grades[i] = 'C';
            }
            else if (scores[i]>60) {
                grades[i] = 'D';
            }
            else if (scores[i]<=60) {
                grades[i] = 'F';
            }

        }
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]+"'s score is "+scores[i]+", and grade is "+grades[i]);
        }

    }
}
