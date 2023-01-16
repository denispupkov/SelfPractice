package Test;

import java.util.Scanner;

public class Test {


        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

            //WRITE YOUR CODE BELOW:
            int count = 0;
            int unique = 0;

            for (int i = 0; i<nums.length; i++) {
                count = 0;

                for (int j = 0; j<nums.length; j++) {

                    if (nums[i]==nums[j]) {
                        count++;

                    }
                }
                if (count==1) {
                    unique = nums[i];


                }

            }
            System.out.println(unique);
        }
}



