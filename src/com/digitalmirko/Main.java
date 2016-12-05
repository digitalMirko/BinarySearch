package com.digitalmirko;

// Binary Search Algorithm in Java
// This algorithm goes and compares the Key value requested with the Key Value
// of the middle element of the array. Then searches for its position as it breaks
// down the array more to find its location postion.

// Big O Notation:
// Best case: O(1), Worst Case: O(log n)

import java.util.Arrays;

public class Main {

    public String binarySearchAlgo(int[] inputArray, int key){

        int start = 0;
        int end = inputArray.length - 1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(key == inputArray[mid]){
                return new String(String.valueOf(mid));
            }
            if (key < inputArray[mid]){
                end = mid + 1;
            } else {
                start = mid + 1;
            }
        }
        return "Not Found";
    }

    public static void main(String[] args) {

        Main bsa = new Main();

        int[] arraySet1 = {1,3,5,7,9,11,13,15,17,19};
        System.out.println("Key value 13's position in the array " + Arrays.toString(arraySet1)
                + " is "+ bsa.binarySearchAlgo(arraySet1,13));

        int[] arraySet2 = {135,729,111,135,115,170,199};
        System.out.println("Key value 1435's position in the array " + Arrays.toString(arraySet2)
                + " is " + bsa.binarySearchAlgo(arraySet2,1435));

        int[] arraySet3 = {2,4,6,8,10,12,15,22,34,42,53};
        System.out.println("Key value 53's position in the array " + Arrays.toString(arraySet3)
                + " is " + bsa.binarySearchAlgo(arraySet3,53));

        int[] arraySet4 = {22,33,44,55,88,111,222,333,444,555};
        System.out.println("Key value 33's position in the array " + Arrays.toString(arraySet4)
                + " is " + bsa.binarySearchAlgo(arraySet4,33));
    }
}

/*
Output:
Key value 13's position in the array [1, 3, 5, 7, 9, 11, 13, 15, 17, 19] is 6
Key value 1435's position in the array [135, 729, 111, 135, 115, 170, 199] is Not Found
Key value 53's position in the array [2, 4, 6, 8, 10, 12, 15, 22, 34, 42, 53] is 10
Key value 33's position in the array [22, 33, 44, 55, 88, 111, 222, 333, 444, 555] is 1
 */