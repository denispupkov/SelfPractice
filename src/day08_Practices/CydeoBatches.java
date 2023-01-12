package day08_Practices;

public class CydeoBatches {

    public static void main(String[] args) {

        String batch = "EU";

        if (batch == "US morning") {
            System.out.println("Class times are 10-5 EST. M, T, Th, F.");
        }
        else if (batch == "US evening") {
            System.out.println("Class times are 7-10 EST. M, T, W, Th, S, S.");
        }
        else if (batch=="EU") {
            System.out.println("Class times are 10-5 EST. M, T, W, Th, F.");
        }
        else {
            System.out.println("Invalid batch");
        }

        String result = "Invalid Batch";
if (batch == "US morning" || batch == "US evening" || batch == "EU") {

    switch (batch) {
        case "US morning":
            result = "Class times are 10-5 EST. M, T, Th, F.";
            break;
        case "US evening":
            result = "Class times are 7-10 EST. M, T, W, Th, S, S.";
            break;
        case "EU":
            result = "Class times are 10-5 EST. M, T, W, Th, F.";
            break;
        default:
            result = "Invalid batch";
    }
}
        System.out.println(result);
    }
}
