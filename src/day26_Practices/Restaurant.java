package day26_Practices;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {

    public String owner;
    public String location;
    public int numberOfStars;
    ArrayList<Server> servers = new ArrayList<>();
    ArrayList<Chef> chefs = new ArrayList<>();

    public Restaurant(String owner, String location, int numberOfStars) {
        this.owner = owner;
        this.location = location;
        this.numberOfStars = numberOfStars;
    }

    public void hireServer (Server server) {
        servers.add(server);
    }
    public void hireServer (Server [] servers) {
        this.servers.addAll(Arrays.asList(servers));
    }
    public void hireChef (Chef chef) {
        chefs.add(chef);
    }
    public void hireChef (Chef [] chefs) {
        this.chefs.addAll(Arrays.asList(chefs));
    }

    public void terminateChef (int employeeID) {
        chefs.removeIf(p -> p.employeeID==employeeID);
    }

    public void terminateServer (int employeeID) {
        servers.removeIf(p -> p.employeeID==employeeID);
    }


    public String toString() {
        return "Restaurant{" +
                "owner='" + owner + '\'' +
                ", location='" + location + '\'' +
                ", numberOfStars=" + numberOfStars +
                ", number of servers=" + servers.size() +
                ", number of chefs=" + chefs.size() +
                '}';
    }
}
