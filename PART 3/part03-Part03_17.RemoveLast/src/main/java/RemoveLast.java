
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        // Try your method in here
    }
    
    public static void removeLast(ArrayList<String> string){
        if(string.size() == 0){
            return;
        }
        
        string.remove(string.size()-1);
    }

}
