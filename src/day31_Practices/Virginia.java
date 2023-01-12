package day31_Practices;

public class Virginia extends States{

    public Virginia(String name, String abbreviation, String politicalParty, String governor, String senator, int population, double stateTax, String capital) {
        super(name, abbreviation, politicalParty, governor, senator, population, stateTax);


        }
    public void famousFor () {
        System.out.println(getName() + " has Presidential homes");
    }




}
