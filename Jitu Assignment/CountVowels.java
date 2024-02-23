/*Write a program that counts the number of vowels in a sentence.
eg " Hello World " => returns 2 */

import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");

        String sentence = scanner.nextLine();

        int vowelCount = countVowels(sentence);
        System.out.println("Number of vowels: " + vowelCount);
    }
    private static int countVowels(String str) {
        int vowelCount = 0;
        for (char ch : str.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }
        return vowelCount;
    }
    
}
