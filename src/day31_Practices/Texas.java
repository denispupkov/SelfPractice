package day31_Practices;

public class Texas extends States{

    public Texas(String name, String abbreviation, String politicalParty, String governor, String senator, int population, double stateTax) {
        super(name, abbreviation, politicalParty, governor, senator, population, stateTax);
    }

    public void loneStarState () {
        System.out.println(getName()+ " is known as Lone Star State");
    }

}
