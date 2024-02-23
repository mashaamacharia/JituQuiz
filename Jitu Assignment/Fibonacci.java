//Write a program to generate the Fibonacci sequence up to 100.

public class Fibonacci {
    public static void main(String[] args) {
        int maxnum = 100;
        int prevNum = 0;
        int currentNum = 1;

        System.out.println("Fibonacci sequence up to " + maxnum + ":");
        System.out.print(prevNum + ", " + currentNum);
        while (prevNum + currentNum <= maxnum) {
            int nextNumber = prevNum + currentNum;
            System.out.print(", " + nextNumber);
            prevNum = currentNum;
            currentNum = nextNumber;
        }
    }
    
}
