package day31_Practices;

public class California extends States {

    public California(String name, String abbreviation, String politicalParty, String governor, String senator, int population, double stateTax) {
        super(name, abbreviation, politicalParty, governor, senator, population, stateTax);
    }

    public void wineCountry () {
        System.out.println(getName()+" is famous for wines");
    }
}
