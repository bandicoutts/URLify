/*

Written by David Coutts
4.2.2019

Write a method to replace all spaces in a string with '%20:
You may assume that the string has sufficient space at the end to hold the additional characters,
and that you are given the "true" length of the string.
(Note: If implementing in Java, please use a character array so that you can perform this operation in place.)

EXAMPLE:

Input: "Mr John Smith " J 13 Output: "Mr%20J ohn%20Smith" Hints: #53, #7 78

 */


import java.util.Scanner;
import java.lang.StringBuilder;


public class URLify {

    public static String getInput(){
        Scanner reader = new Scanner(System.in);
        String result;
        result = reader.nextLine();
        return result;
    }


    public static String replaceSpaces(String string){
        char array[] = string.toCharArray();
        StringBuilder mutableString = new StringBuilder();

        for (int i = 0; i < array.length; i++){
            if (array[i] == ' '){
                mutableString.append("%20");
            } else {
                mutableString.append(array[i]);
            }
        }

        String result = mutableString.toString();
        return result;

    }

    public static void main(String[] args) {
        String initialResult = getInput();
        System.out.println(initialResult);
        String updatedResult = replaceSpaces(initialResult);
        System.out.println(updatedResult);

    }
}
