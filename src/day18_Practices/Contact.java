package day18_Practices;

public class Contact {

    public String name;
    public long phoneNumber;
    public String email;

    public void setInfo(String name, long phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    public void call () {
        System.out.println(this.name+" calling");
    }
    public void sendingMessage () {
        System.out.println("sending message to "+phoneNumber+" now");
    }
    public void sendEmail () {
        System.out.println("sending email to "+email+" now");
    }
}
