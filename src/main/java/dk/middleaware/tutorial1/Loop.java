package dk.middleaware.tutorial1;

public class Loop {
    public static void main(String[] args) {

        // example for for each loop in "new format"
        // create an array
        int[] numbers = {3, 7, 5, -5};

        // iterating through the array
        for (int number: numbers) {
            System.out.println(number);
        }
    }
}