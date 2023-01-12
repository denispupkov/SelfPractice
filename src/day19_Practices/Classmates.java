package day19_Practices;

public class Classmates {

    public static void main(String[] args) {

        String [] classmates = {"Dana Klokov", "Kemal Suleimanov","Olzhas Dairbekov","Arstan Kuksyegyen",
        "Aynur Gulisik","Bekhzod Abdusamatov","Daniil Karpiyevich","Gulnur Burangulova","Taylor Andres",
                "Andrei Marrotta"};

        for (int i = 0; i < classmates.length; i++) {

            System.out.println(classmates[i].charAt(0)+". "+classmates[i].substring(classmates[i].indexOf(" ")+1,
                    classmates[i].indexOf(" ")+2)+".");
        }
    }
}
