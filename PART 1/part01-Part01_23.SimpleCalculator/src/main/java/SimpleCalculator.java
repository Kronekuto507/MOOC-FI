
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int integerOne = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int integerTwo = Integer.valueOf(scanner.nextLine());
        
        System.out.println( integerOne + " + " + integerTwo + " = " + (integerOne + integerTwo) );
System.out.println( integerOne + " - " + integerTwo + " = " + (integerOne - integerTwo) );
System.out.println( integerOne + " * " + integerTwo + " = " + (integerOne * integerTwo) );
System.out.println( integerOne + " / " + integerTwo + " = " + ((double) integerOne / integerTwo) );
    }
}
