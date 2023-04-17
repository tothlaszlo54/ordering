package org.example;

import java.util.ArrayList;
import java.util.List;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        int randomListLength = (int) ((Math.random() * 9901) + 100);


        for (int i = 0; i < randomListLength; i++) {
            int randomElementOfList = (int) ((Math.random() * 1000) + 1);
            numbers.add(randomElementOfList);
        }

        int sumOfNumbers = 0;
        int averageOfNumbers = 0;

        for (int actualNumber : numbers) {
            sumOfNumbers += actualNumber;
        }

        averageOfNumbers = sumOfNumbers / (numbers.size());

/*
        System.out.println("Sum: " + sumOfNumbers + " " + "average: " +averageOfNumbers);
        System.out.println(numbers);
*/

        //tömblista az order függvényhez

        int randomArrayLength = (int) ((Math.random() * 9901) + 100);

        int[] numberArray = new int[randomArrayLength];


        for (int i = 0; i < numberArray.length; i++) {
            int randomElementOfArray = (int) ((Math.random() * 1000) + 1);
            numberArray[i] = randomElementOfArray;

        }

        for (int i = 0; i < numberArray.length; i++) {

            System.out.print(numberArray[i] + " ");

        }


        int[] ordered = order(numberArray);

        System.out.println();

        for (int i = 0; i < ordered.length; i++) {

            System.out.print(ordered[i] + " ");

        }


    }

    public static int[] order(int[] numberArray) {
        int temp;

        for (int i = 0; i < numberArray.length - 1; i++) {
            for (int j = i + 1; j < numberArray.length; j++) {
                if (numberArray[j] < numberArray[i]) {

                    temp = numberArray[i];
                    numberArray[i] = numberArray[j];
                    numberArray[j] = temp;


                }
            }

        }

        return numberArray;
    }
}


//0.99*100
//listahossz 100 - 10 000 között
//elemek 1-1000 között
//add össze a számokat a listában és írd ki az eredményt.
//átlag