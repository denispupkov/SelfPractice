package day06_Practices;

import java.util.Scanner;

public class NetIncomeCalc {

    public static void main(String[] args) {

        double salary = 85000;
        String resultMarried = "";
        String resultSingle = "";

        if (salary>130000) {
            resultMarried = "Your tax rate is 35% and your salary is "
                    +(salary-(salary/100*35)+" after taxes for Single");
            resultSingle = "Your tax rate is 30% and your salary is "
                    +(salary-(salary/100*30)+" after taxes for Married");
        }
        else if (salary>=100000 && salary<=129000) {
            resultMarried = "Your tax rate is 30% and your salary is "
                    +(salary-(salary/100*30)+" after taxes for Single");
            resultSingle = "Your tax rate is 25% and your salary is "
                    +(salary-(salary/100*25)+" after taxes for Married");
        }
        else if (salary>=80000 && salary<=99000) {
            resultMarried = "Your tax rate is 25% and your salary is "
                    +(salary-(salary/100*25)+" after taxes for Single");
            resultSingle = "Your tax rate is 20% and your salary is "
                    +(salary-(salary/100*20)+" after taxes for Married");
        }
        else if (salary<=79000) {
            resultMarried = "Your tax rate is 20% and your salary is "
                    +(salary-(salary/100*20)+" after taxes for Single");
            resultSingle = "Your tax raye is 15% and your salary is "
                    +(salary-(salary/100*15)+" after taxes for Married");
        }

        System.out.println(resultMarried);
        System.out.println(resultSingle);



        }
    }

