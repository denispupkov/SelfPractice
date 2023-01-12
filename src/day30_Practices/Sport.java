package day30_Practices;

public class Sport {

    private String name;
    private int numberOfPlayers;
    private int numberOfReferee;
    private String rules;

    public Sport(String name, int numberOfPlayers, int numberOfReferee, String rules) {
        setName(name);
        setNumberOfPlayers(numberOfPlayers);
        setNumberOfReferee(numberOfReferee);
        setRules(rules);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        if (numberOfPlayers <= 0) {
            System.err.println("Number of players cannot be zero or negative");
            System.exit(1);
        }
        this.numberOfPlayers = numberOfPlayers;
    }

    public int getNumberOfReferee() {
        return numberOfReferee;
    }

    public String getRules() {
        return rules;
    }

    public void setRules(String rules) {
        this.rules = rules;
    }

    public void setNumberOfReferee(int numberOfReferee) {
        if (numberOfReferee <= 0) {
            System.err.println("Number of referee cannot be zero or negative");
            System.exit(1);
            this.numberOfReferee = numberOfReferee;
        }


    }

    public void play() {
        System.out.println(name + " is playing");
    }


    public String toString() {
        return
                "name='" + name + '\'' +
                        ", numberOfPlayers=" + numberOfPlayers +
                        ", numberOfReferee=" + numberOfReferee +
                        ", rules=" + rules;

    }
}
