package com.me;
//directions
/*
- create a program using arrays that sort a list of integers in descending order
- descending order is highest value to lowest
- in other words, if the array had the values in it 106, 26, 81, 5, 15, your program should
ultimately have an array with 106, 81, 26, 15, 5 in it.
- set up the program so that the numbers to sort are read in from the keyboard
- implement the following methods - getIntegers, printArray, and sortIntegers
- getIntegers returns an array of entered integers from keyboard
- printArray prints out the contents of the array
and sortIntegers should sort the array and return a new array containing the sorted numbers
-you will have to fugure out how to copy the array elements from the passed array into a new
array and sort them and return the new sorted array
 */

//step 1
import java.util.Scanner;

public class Main {
    //step 1
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //step 2 create int array
        int[] myIntegers = getIntegers(5);

        //step 9
        int[] sorted = sortIntegers(myIntegers);
        printArray(sorted);    //then run

    }

    //step 3 method
    public static int[] getIntegers(int capacity) {
        int[] array = new int[capacity];
        System.out.println("Enter " + capacity + " integer values: \r");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        //step 4 return
        return array;
    }

    //step 5 next create print array
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }

    }

    //step 6 method for sorting
    public static int[] sortIntegers(int[] array) {
        int[] sortedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            sortedArray[i] = array[i];
        }

        //step 7 while loop
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }

        }

        //step 8 return
        return sortedArray;


    }

}

//results
/*note; enter any ints
Enter 5 integer values:
2
4
5
7
8
Element 0 contents 8
Element 1 contents 7
Element 2 contents 5
Element 3 contents 4
Element 4 contents 2
 */


