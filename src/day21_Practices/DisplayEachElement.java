package day21_Practices;

public class DisplayEachElement {

    public static void main(String[] args) {

        String[][][][][][][][][][]  array = {{{{{{{{{{"I", "Love", "Arrays"}}}}}}}}}};

        for (String [][][][][][][][][] array9d : array) {
            for (String [][][][][][][][] array8d : array9d) {
                for (String [][][][][][][] array7d : array8d) {
                    for (String [][][][][][] array6d : array7d) {
                        for (String [][][][][] array5d : array6d) {
                            for (String [][][][] array4d : array5d) {
                                for (String [][][] array3d : array4d) {
                                    for (String [][] array2d : array3d) {
                                        for (String [] singleArray : array2d) {
                                            for (String each : singleArray) {
                                                System.out.print(each+" ");
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }



    }
}
