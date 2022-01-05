package com.LeahGrace;

import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args) {
        System.out.println("Input your favorite phrase: ");
        Scanner scanStr = new Scanner(System.in);
        String str = scanStr.nextLine();
        //String[] arrStr = str.split("",str.length());
        String reversedStr = "";
        char c;
        for (int i = 0; i < str.length(); i++){
            c = str.charAt(i);
            reversedStr = c + reversedStr;
        }
        System.out.print(reversedStr);
    }
}
/*
JAVASCRIPT

function reverseString(str) {
  let tempArr = str.split("");
  let reversedArr = [];

  for (let i = tempArr.length - 1; i >= 0; i--){
    reversedArr.push(tempArr[i])
  }
  return reversedArr.join("");
}

console.log(reverseString("hello"));
 */

/*
INSTRUCTIONS

Reverse a String
Reverse the provided string.

You may need to turn the string into an array before you can reverse it.

Your result must be a string.
 */