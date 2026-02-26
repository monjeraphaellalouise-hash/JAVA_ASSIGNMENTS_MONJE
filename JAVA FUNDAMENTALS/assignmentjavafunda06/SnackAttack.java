import java.util.ArrayList;

public class SnackAttack {

    public static void main(String[] args) {

        // Create ArrayList 
        ArrayList<String> snacks = new ArrayList<String>();

        snacks.add("Apples");
        snacks.add("Almonds");
        snacks.add("Pretzels");
        snacks.add("Yogurt");

     
        System.out.println(snacks);

        // Loop through the list 
        for (int i = 0; i < snacks.size(); i++) {

            // Debug print 
            System.out.println("Checking index " + i + ": " + snacks.get(i));

            // Check if snack starts with 'A'
            if (snacks.get(i).charAt(0) == 'A') {

                System.out.println("Removing: " + snacks.get(i));

                snacks.remove(i);

                i--; 
            }
        }

        //results
        System.out.println(snacks);
    }
}