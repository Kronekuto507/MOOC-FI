
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        // Try your method here
    }
    
    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit){
        
        for(int j: numbers){
            if(j>=lowerLimit && j<= upperLimit){
                System.out.println(j);
            }
        }
    }
}
