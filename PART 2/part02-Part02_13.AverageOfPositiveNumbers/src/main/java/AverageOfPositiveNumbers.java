
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int counter = 0;
        int sum = 0;
        while(true){
            System.out.println("Give a number:");
            int integer = Integer.valueOf(scanner.nextLine());
            if(integer == 0 && counter == 0){
                
                System.out.println("Cannot calculate the average");
                break;
                
            } else if (integer > 0) {
                
                sum += integer;
                counter++;
               
            } else if (integer == 0 && counter!= 0) {
                break;
            }
            
            
        }
        
        System.out.println((double)sum/counter);
        
    }
}
