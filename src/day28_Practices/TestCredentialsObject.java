package day28_Practices;

public class TestCredentialsObject {

    public static void main(String[] args) {

        Credentials credentials = new Credentials("Student","student!1");

        System.out.println(credentials.getUsername());
        System.out.println(credentials.getPassword());



    }
}
