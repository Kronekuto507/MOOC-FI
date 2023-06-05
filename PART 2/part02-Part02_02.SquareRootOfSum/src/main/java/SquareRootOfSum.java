
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int integerOne = Integer.valueOf(scanner.nextLine());
        int integerTwo = Integer.valueOf(scanner.nextLine());
        double squareSum = Math.sqrt(integerTwo + integerOne);
        
        System.out.println(squareSum);
        
    }
}
