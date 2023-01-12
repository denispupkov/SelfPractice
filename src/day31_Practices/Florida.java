package day31_Practices;

public class Florida extends States{

    public Florida(String name, String abbreviation, String politicalParty, String governor, String senator, int population, double stateTax) {
        super(name, abbreviation, politicalParty, governor, senator, population, stateTax);
    }

    public void oranges () {
        System.out.println(getName()+" grows a lot of oranges");
    }
}
