import java.util.Scanner;

public class LargestDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int largest = -1;
        
        if (number < 0) {
            number = -number;
        }
        
        while (number > 0) {
            int digit = number % 10;
            if (digit > largest) {
                largest = digit;
            }
            number /= 10;
        }
        
        System.out.println("Largest digit: " + largest);
        scanner.close();
    }
}
