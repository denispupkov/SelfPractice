package day28_Practices;

public class Credentials {

    private String username;
    private String password;


    public Credentials(String username, String password) {
        if (isStrongPassword(password)) {
            setUsername(username);
            setPassword(password);
        }
    }


    public boolean isStrongPassword(String password) {
        boolean isStrong = true;
        char[] passwordChar = password.toCharArray();

        if (password.contains(" ")) {
            isStrong = false;
        }
        if (password.length() < 8) {
            isStrong = false;
        }
        int letters = 0;
        for (char c : passwordChar) {
            if (Character.isLetter(c)) {
                letters++;
            }
        }
        if (letters == 0) {
            isStrong = false;
        }

        int specialChars = 0;
        for (char c : passwordChar) {
            if (!Character.isLetterOrDigit(c)) {
                specialChars++;
            }

        }
        if (specialChars == 0) {
            isStrong = false;
        }


        int digits  = 0;
        for (char c : passwordChar) {
            if (Character.isDigit(c)) {
                digits++;
            }
        }
        if (digits==0) {
            isStrong = false;
        }
        return isStrong;
        }




        public String getUsername () {
            return username;
        }

        public void setUsername (String username){
            this.username = username;
        }

        public String getPassword () {
            return password;
        }

        public void setPassword (String password) {
            if (isStrongPassword(password)) {
                this.password = password;
            }
        }



    public String toString() {
        return "Credentials{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
