package com.LeahGrace;

import java.util.Scanner;

public class ConvertCtoF {
    public static void main(String[] args) {

            System.out.println("Indicate temperature in Fahrenheit: ");
            Scanner scan = new Scanner(System.in);
            int tempC = scan.nextInt();
            int tempF = ((tempC * 9) / 5) + 32;
            System.out.println(tempF);

    }
}

/*
JAVASCRIPT:
function convertToF(celsius) {
  let fahrenheit = (celsius*9)/5 + 32;
  return fahrenheit;
}
console.log(convertToF(30));
 */

/*
INSTRUCTIONS:
Convert Celsius to Fahrenheit
The algorithm to convert from Celsius to Fahrenheit is the temperature in Celsius times 9/5, plus 32.

You are given a variable celsius representing a temperature in Celsius. Use the variable fahrenheit already defined and assign it the Fahrenheit temperature equivalent to the given Celsius temperature. Use the algorithm mentioned above to help convert the Celsius temperature to Fahrenheit.
 */