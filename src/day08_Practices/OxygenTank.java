package day08_Practices;

public class OxygenTank {

    public static void main(String[] args) {

        int level = -2;
        String result = "";

        result = (level>=0&& level<=100)?(level>=91)?"Your Tank Is Full":(level>=81 && level<=90)?"Still OK"
                :(level>=71 && level<=80)?"Don't go far":(level>=61 && level<=70)?"Start to head back":
                (level>=50)?"Be careful now you at 50%":"Don't go anywhere, you will dye":"Wrong level number";
        System.out.println(result);


    }
}
