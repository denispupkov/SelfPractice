package day31_Practices;

public class States {

    private String name;
    private String abbreviation;

    private String politicalParty;
    private String governor;

    private String senator;
    private int population;
    private double stateTax;

    public States(String name, String abbreviation, String politicalParty, String governor, String senator, int population, double stateTax) {
        setName(name);
        setAbbreviation(abbreviation);
        setGovernor(governor);
        setSenator(senator);
        setPopulation(population);
        setStateTax(stateTax);
        setPoliticalParty(politicalParty);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name==null || name.isEmpty()) {
            System.out.println("The name cannot be empty or null");
            System.exit(1);
        }
        this.name = name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        if (abbreviation == null || abbreviation.isEmpty()) {
            System.out.println("The abbreviation cannot be empty or null");
            System.exit(1);
            this.abbreviation = abbreviation;
        }
    }

    public String getGovernor() {
        return governor;
    }

    public void setGovernor(String governor) {
        if (governor == null || governor.isEmpty()) {
            System.out.println("The governor cannot be empty or null");
            System.exit(1);
            this.governor = governor;
        }
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        if (population<0) {
            System.err.println("Population cannot be negative");
            System.exit(1);
        }
        this.population = population;
    }

    public double getStateTax() {
        return stateTax;
    }

    public void setStateTax(double stateTax) {
        if (stateTax<0) {
            System.err.println("Tax rate cannot be negative");
        }
        this.stateTax = stateTax;
    }

    public String getPoliticalParty() {
        return politicalParty;
    }

    public String getSenator() {
        return senator;
    }

    public void setSenator(String senator) {
        if (senator==null || senator.isEmpty()) {
            System.err.println("Senator cannot be empty or null");
            System.exit(1);
        }
        this.senator = senator;
    }



    public void setPoliticalParty(String politicalParty) {
        if (politicalParty == null || politicalParty.isEmpty()) {
            System.out.println("The political party cannot be empty or null");
            System.exit(1);
            this.politicalParty = politicalParty;
        }
    }



    public String toString() {
        return
                "name='" + name + '\'' +
                ", abbreviation='" + abbreviation + '\'' +
                ", politicalParty='" + politicalParty + '\'' +
                ", governor='" + governor + '\'' +
                ", senator='" + senator + '\'' +
                ", population=" + population +
                ", stateTax=" + stateTax;

    }
}
