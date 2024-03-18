import java.util.Scanner;
public class main{

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Welcome! to start choose which class you would like to be?");
        int[] stats = new int[]{10, 12, 9, 11, 16, 14};
        Entity entity = new Entity(10, 0, "mana", stats, true);
        System.out.println("Entity values: " + entity.toString());

        while(!scnr.nextLine().equals("exit")){
            System.out.println( "Congrats you still playing......or are you?????");
            // exit 1;
            // TODO: Quit confirmation
            // TODO: Save game data
        }
    }
}
