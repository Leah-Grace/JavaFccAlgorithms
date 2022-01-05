package com.LeahGrace;
import java.util.Scanner;
import java.util.Arrays;

public class ReturnLargestNumbersInArrays {
    public static void main(String[] args) {
        //declare empty array for highest numbers
        int highestNums[] = new int[4];
        //prompt user to input values of sub arrays
        int arr[][] = new int[4][4];
        for (int i = 0; i < arr.length; i++){
            System.out.println("Input an array with four integers");
            Scanner readArrays = new Scanner(System.in);
            String str = readArrays.nextLine();
            String[] strArr = new String[]{};
            strArr = str.split(",", 4);
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = Integer.parseInt(strArr[j]);
            }
            Arrays.sort(arr[i]);
            highestNums[i] = arr[i][arr[i].length - 1];
        }
        for (int l = 0; l < highestNums.length; l++){
            System.out.println(highestNums[l]);
        }
        System.out.println(highestNums);
    }
}

/*

largestOfFour([[13, 27, 18, 26], [4, 5, 1, 3], [32, 35, 37, 39], [1000, 1001, 857, 1]])
 should return [27, 5, 39, 1001]
largestOfFour([[4, 9, 1, 3], [13, 35, 18, 26], [32, 35, 97, 39], [1000000, 1001, 857, 1]])
should return [9, 35, 97, 1000000].
largestOfFour([[17, 23, 25, 12], [25, 7, 34, 48], [4, -10, 18, 21], [-72, -3, -17, -10]]) should return [25, 48, 21, -3]
 */

/*
Return Largest Numbers in Arrays
Return an array consisting of the largest number from each provided sub-array. For simplicity, the provided array will contain exactly 4 sub-arrays.

Remember, you can iterate through an array with a simple for loop, and access each member with array syntax arr[i].
 */

/*
function largestOfFour(arr) {
  let largestArr = [];
  for (let i = 0; i < arr.length; i++){
    let tempArr = arr[i].sort((a,b) => b - a);
    largestArr.push(tempArr[0]);
  }

  return largestArr;
}

console.log(largestOfFour([[4, 5, 1, 3], [13, 27, 18, 26], [32, 35, 37, 39], [1000, 1001, 857, 1]]));
 */