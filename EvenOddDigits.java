import java.util.Scanner;

public class EvenOddDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int evenCount = 0;
        int oddCount = 0;
        
        if (number < 0) {
            number = -number;
        }
        
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
            number /= 10;
        }
        
        System.out.println("Even digits: " + evenCount);
        System.out.println("Odd digits: " + oddCount);
        sc.close();
    }
}
