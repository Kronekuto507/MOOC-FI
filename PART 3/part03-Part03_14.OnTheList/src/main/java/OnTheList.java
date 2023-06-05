
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }
        
        System.out.println("Search for?");
        String search = scanner.nextLine();

        int value = 0;
        for(int i = 0; i<list.size(); i++){
            if(list.get(i).contains(search)){
                System.out.println(search + " was found!");
            } else{
                value++;
            }
        }

        if(value == list.size()){
            System.out.println(search + " was not found!");
        }
        
    }
}
