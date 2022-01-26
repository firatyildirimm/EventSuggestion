
import java.util.Scanner;

public class EventSuggestion {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the heat: ");

        int heat = input.nextInt();

        if(heat<5){
            System.out.println("You should stay home!");
        }
        else if (heat<=25){
            if(heat<15){
                System.out.println("You can go a cafe");
            }
            if(heat>10){
                System.out.println("You can walk around");
            }
        }
        else{
            System.out.println("You can meet with your friend");
        }
    }
}
