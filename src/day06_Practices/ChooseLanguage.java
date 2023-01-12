package day06_Practices;

public class ChooseLanguage {

    public static void main(String[] args) {
        int languageSelection = 5;
        String message="";

        if (languageSelection==1) {
            message = "Hello, thank for your call";
        }
        else if (languageSelection ==2) {
            message = "Hola, gracias para llamar";
        }
        else if (languageSelection==3) {
            message = "Merhaba, aradiginiz icin tesekkurler";
        }
        else if (languageSelection == 4) {
            message = "Privet, spasibo za vash zvonok";
        }
        else if (languageSelection == 5) {
            message = "Merci ,pour votre appel";
        }
        else {
            System.out.println("Wrong Selection. Choose numbers from 1 to 5");
        }
        System.out.println(message);

    }
}
