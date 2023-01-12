package day08_Practices;

public class NumberToWord {

    public static void main(String[] args) {

        int number = 10;
        String word = "";

        word = (number>=0 && number<10) ? (number==0)?"Zero":(number==1)?"One":(number==2)?
                "Two":(number==3)?"Three":(number==4)?"Four":(number==5)?"Five":(number==6)?
                "Six":(number==7)?"Seven":(number==8)?"Eight":"Nine":"Invalid Number";
        System.out.println(word);
    }
}
