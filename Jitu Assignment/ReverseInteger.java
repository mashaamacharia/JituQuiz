/*Write a program that takes an integer as input and returns an integer with reversed digit 
ordering.
Examples:
For input 500, the program should return 5.
For input -56, the program should return -65.
For input -90, the program should return -9.
For input 91, the program should return 19. */

import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int input = scanner.nextInt();
        int reversedInteger = reverseInteger(input);

        System.out.println("Reversed number: " + reversedInteger);
    }
    private static int reverseInteger(int num) {
        int sign = num < 0 ? -1 : 1;
        int reversed = 0;
        num = Math.abs(num);

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return sign * reversed;
    }

}
