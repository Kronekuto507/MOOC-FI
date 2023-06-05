
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        
        /*System.out.println("Where to?");
        int intTo = Integer.valueOf(scanner.nextLine());
        for(int i = 1; i <= intTo; i++){
            System.out.println(i);
        }*/
        
        System.out.println("Where to?");
        int intTo = Integer.valueOf(scanner.nextLine());
        System.out.println("Where from?");
        int intFrom = Integer.valueOf(scanner.nextLine());
        
        if(intFrom <= intTo){
            for(int i = intFrom; i <= intTo; i++){
                System.out.println(i);
            }
        }
        

    }
}
