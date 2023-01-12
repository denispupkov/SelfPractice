package day26_Practices;

import java.time.LocalDate;

public class Server {

    public String name;
    public int employeeID;
    public double hourlyRate;
    public boolean fullTime;
    public LocalDate hire_date;

    public Server(String name, int employeeID, double hourlyRate, boolean fullTime, LocalDate hire_date) {
        this.name = name;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
        this.fullTime = fullTime;
        this.hire_date = hire_date;
    }

    public void takeOrder () {

        System.out.println(name+" is taking an order");
    }
    public void cleanTable () {
        System.out.println(name+" is cleaning the table");
    }
    public String isFullTime (boolean fullTime) {
        return (fullTime) ? "Full-Time":"Part-Time";
    }

    public String toString() {
        return "Server{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", hourlyRate=" + hourlyRate +
                ", fullTime=" + isFullTime(fullTime) +
                ", hire_date=" + hire_date +
                '}';
    }


}
