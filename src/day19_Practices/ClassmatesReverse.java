package day19_Practices;

public class ClassmatesReverse {

    public static void main(String[] args) {

        String [] classmates = {"Dana Klokov", "Kemal Suleimanov","Olzhas Dairbekov","Arstan Kuksyegyen",
                "Aynur Gulisik","Bekhzod Abdusamatov","Daniil Karpiyevich","Gulnur Burangulova","Taylor Andres",
                "Andrei Marrotta"};

        for (int i = 0; i < classmates.length; i++) {

            for (int j = classmates[i].length()-1; j >= 0; j--) {

                System.out.print(classmates[i].charAt(j));

            }
            System.out.println();
        }

    }
}
