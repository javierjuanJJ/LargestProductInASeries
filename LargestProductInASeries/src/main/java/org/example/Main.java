package org.example;

import org.example.LargestProductInASeries.LargestProductInASeries;

public class Main {
    public static void main(String[] args) {

        int adjament = 4;
        int[] array = new int[1000];

        for (int counter = 0; counter < array.length; counter++) {
            array[counter] = LargestProductInASeries.getRandomNumber(1, 9);
        }

        for (int counter = 0; counter < array.length; counter++) {
            System.out.print(array[counter] + " ");
        }
        System.out.println();
        System.out.println(LargestProductInASeries.largestProductInASeries(array,adjament));
    }
}