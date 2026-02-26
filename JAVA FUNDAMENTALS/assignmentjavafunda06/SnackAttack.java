import java.util.ArrayList;

public class SnackAttack {

    public static void main(String[] args) {

        // Create ArrayList (Lesson 12: Dynamic Arrays)
        ArrayList<String> snacks = new ArrayList<String>();

        snacks.add("Apples");
        snacks.add("Almonds");
        snacks.add("Pretzels");
        snacks.add("Yogurt");

        // Print original list
        System.out.println(snacks);

        // Loop through the list (Lesson 13: for loop)
        for (int i = 0; i < snacks.size(); i++) {

            // Debug print (Lesson 15: trace program flow)
            System.out.println("Checking index " + i + ": " + snacks.get(i));

            // Check if snack starts with 'A'
            if (snacks.get(i).charAt(0) == 'A') {

                System.out.println("Removing: " + snacks.get(i));

                snacks.remove(i);

                i--; // Step back to avoid skipping elements
            }
        }

        // Print final result
        System.out.println(snacks);
    }
}