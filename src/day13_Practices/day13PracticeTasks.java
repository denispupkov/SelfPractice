package day13_Practices;

public class day13PracticeTasks {

    public static void main(String[] args) {

        combine("stop","pushing me");
    }

    public static void combine (String str1, String str2) {

        if (str1.charAt(str1.length()-1)==str2.charAt(0)) {
            System.out.println(str1.substring(0,str1.length())+str2.substring(1));
        }
        else {
            System.out.println(str1+str2);
        }

    }
}
