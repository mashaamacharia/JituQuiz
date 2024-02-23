/*Write a program that takes an integer as input and returns true if the input is a power of two.
Examples: 
8=> returns true
6=> returns false */

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int input = scanner.nextInt();

        boolean isPowerOfTwo = checkPowerOfTwo(input);
        System.out.println(input + " => " + isPowerOfTwo);
    }
    private static boolean checkPowerOfTwo(int num) {
        return num > 0 && (num & (num - 1)) == 0;
    }
    
}
