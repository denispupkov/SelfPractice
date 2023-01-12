package day18_Practices;

public class HighestFrequencyCharacter {

    public static void main(String[] args) {

        String str = "aaabbccccddeeee";
        char target = ' ';
        int biggestNumber = Integer.MIN_VALUE;

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {

                if (str.charAt(i)==str.charAt(j))
                    count++;
            }
            if (count>biggestNumber) {
                target=str.charAt(i);
                biggestNumber=count;
            }

        }
        System.out.println(target+" with frequency of "+biggestNumber+" times");
    }
}
