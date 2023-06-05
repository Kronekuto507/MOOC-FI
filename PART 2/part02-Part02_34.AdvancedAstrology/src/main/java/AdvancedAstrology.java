
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        for(int i = 0; i< number; i++){
            System.out.print("*");
        }
        System.out.print("\n");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        for(int i = 0; i < number; i++){
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int count = 1;
        for(int i = size; i>=1; i--){
            
            printSpaces(i - 1);
            
            while(count <= size  ){
                
                printStars(count);
                count++;
                
                break;
                
            }
            
            
            
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int counter = 1;
        int k = (height*2) - 1;
        
        for(int i = height; i >= 1; i-- ){
            printSpaces(i - 1);
          
            while(counter <= k){
                printStars(counter);
              
                counter += 2;
                break;
            }
          
        }
        
        for(int j = 1; j <= 2; j++){
            
      
            printSpaces(height - 2);
            printStars(3);
            
        }

        
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
