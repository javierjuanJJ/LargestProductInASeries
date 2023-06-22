package org.example.LargestProductInASeries;

public class LargestProductInASeries {

    public static int largestProductInASeries(int[] array, int adjacent){
        int result = 0;
        int counter = 0;
        int product = 0;

        for (counter = 0; counter < array.length; counter += adjacent) {
            product=Product(array, adjacent, counter);
            result = product > result ? product : result;
        }


        return result;
    }

    public static int getRandomNumber(int i, int length) {
        return (int) (Math.random()*length + i);
    }

    private static int Product(int[] array, int adjacent, int counterArray) {
        int counter = 0;
        int result = 1;

        for (counter = counterArray; counter < (counterArray + adjacent); counter++) {
            result *= array[counter];
        }

        return result;
    }

}
