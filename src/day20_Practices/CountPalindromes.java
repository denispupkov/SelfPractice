package day20_Practices;

public class CountPalindromes {

    public static void main(String[] args) {

        String [] arr = {"anna","level","java","civic","python","kayak"};
        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length()/2; j++) {

                if (arr[i].charAt(j)!=arr[i].charAt(arr[i].length()-1)) {
                    break;
                }
                else {
                    count++;
                }
            }

        }
        System.out.println(count);

    }
}
