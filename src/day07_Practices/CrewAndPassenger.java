package day07_Practices;

public class CrewAndPassenger {

    public static void main(String[] args) {

        int number = 100;
        int crew = 0;
        int passengers = 0;
        String result = "";

        if (number==50 || number == 75 || number == 100) {
            if (number==50) {
                crew = 20;
                passengers = 30;
            }
            else if (number==75) {
                crew = 25;
                passengers = 50;
            }
            else {
                crew = 30;
                passengers = 70;
            }
            System.out.println("Total: "+number+" ====> "+crew+" crew, "+passengers+" passengers");
        }


    }
}
