
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give numbers:");
        int integer = 0;
        int sum = 0;
        int numbers = 0;
        int areEven = 0;
        int areOdd = 0;
        
        while(integer!= -1){
            
            integer = Integer.valueOf(scanner.nextLine());
           
            if(integer == -1){
               
                System.out.println("Thx! Bye!");
                break;
               
            }
           
            sum += integer;
            numbers++;
           
            if(integer %2 == 0){
                areEven++;
            } else {
                areOdd++;
            }
        }
        
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + numbers);
        System.out.println("Average: " + ((double)sum/numbers));
        System.out.println("Even: " + areEven);
        System.out.println("Odd: " + areOdd);
        
    }
}
