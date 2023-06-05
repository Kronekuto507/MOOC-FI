
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int counter = 0;
        
        while(true){
            System.out.println("Give a number:");
            int integer = Integer.valueOf(scanner.nextLine());
            if(integer != 0){
                
                counter = counter + integer;
                
            } else {
                break;
            }
            
            
        }
        
        System.out.println("Sum of the numbers: " + counter);
    }
}
