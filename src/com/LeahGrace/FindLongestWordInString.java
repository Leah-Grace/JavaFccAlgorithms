package com.LeahGrace;

import java.util.Scanner;

public class FindLongestWordInString {
    public static void main(String[] args) {
        System.out.println("Enter a phrase:");
        Scanner stringScan = new Scanner(System.in);
        String string = stringScan.nextLine();
        String[] arrString = string.split(" ");
        String longest = arrString[0];
        for (int i = 1; i < arrString.length; i++){
            if (longest.length() < arrString[i].length()){
                longest = arrString[i];
            }
        }
        System.out.println(longest.length());

    }
}
/*
Find the Longest Word in a String
Return the length of the longest word in the provided sentence.

Your response should be a number.
 */

/*
function findLongestWordLength(str) {
  let temp = str.split(" ")
  let longest = temp[0];
  for (let i = 1; i < temp.length; i++){
    if (longest.length <= temp[i].length)
    longest = temp[i]
  }
  return longest.length;
}

console.log(findLongestWordLength("The quick brown fox jumped over the lazy dog"));
 */