/*Write a program that accepts a string as input, capitalizes the first letter of each word in the 
string, and then returns the result string.
Examples: 
"hi"=> returns "Hi"
"i love programming"=> returns "I Love Programming" */

import java.util.Scanner;

public class Capitalize {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String result = capitalizeWords(input);

        System.out.println("Capitalized string: " + result);
    }
    private static String capitalizeWords(String str) {
        String[] words = str.split("\\s");
        StringBuilder resultBuilder = new StringBuilder();

        for (String word : words) {
            String capitalizedWord = word.substring(0, 1).toUpperCase() + word.substring(1);
            resultBuilder.append(capitalizedWord).append(" ");
        }
        return resultBuilder.toString().trim();
    }
    
}
