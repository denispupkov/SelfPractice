package day08_Practices;

public class ChooseLanguage {

    public static void main(String[] args) {

        int selection = 4;

        switch (selection) {
            case 1:
                System.out.println("Hello, Thank for your call");
                break;
            case 2:
                System.out.println("Hola, gracias para llamar");
                break;
            case 3:
                System.out.println("Merhaba, aradiginiz icin tesekkurler");
                break;
            case 4:
                System.out.println("Privet, spasibo za vash zvonok");
                break;
            case 5:
                System.out.println("Merci, pour votre appel");
                break;
            default:
                System.out.println("Enter number between 1 and 5");
        }
    }
}


