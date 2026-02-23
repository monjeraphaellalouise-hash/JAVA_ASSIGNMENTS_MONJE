public class PizzaPalace {
    public static void main(String[] args) {

        // App Messages
        String welcomeMessage = "Welcome to Pizza Palace!";
        String pendingMessage = ", your order is still being prepared.";
        String readyMessage = ", your order is ready!";
        String displayTotalMessage = "Your total is: $";

        // Menu Prices
        double pepperoniPizza = 8.99;
        double veggiePizza = 9.49;
        double cheesePizza = 7.99;

        // Customers
        String customerAnna = "Anna";
        String customerMark = "Mark";
        String customerLisa = "Lisa";
        String customerKevin = "Kevin";

        // Order Status 
        boolean isOrderReadyAnna = false;
        boolean isOrderReadyMark = true;
        boolean isOrderReadyLisa = false;
        boolean isOrderReadyKevin = true;

        // Welcome Message
        System.out.println(welcomeMessage);
        System.out.println();

        // Anna
        System.out.println("Hello " + customerAnna + "!");
        double annaTotal = pepperoniPizza;

        if (isOrderReadyAnna) {
            System.out.println(customerAnna + readyMessage);
        } else {
            System.out.println(customerAnna + pendingMessage);
        }

        System.out.println(displayTotalMessage + annaTotal);
        System.out.println();

        // Mark
        double markTotal = cheesePizza * 2;
        System.out.println(customerMark + " ordered 2 Cheese Pizzas.");
        System.out.println(displayTotalMessage + markTotal);

        if (isOrderReadyMark) {
            System.out.println(customerMark + readyMessage);
        } else {
            System.out.println(customerMark + pendingMessage);
        }

        System.out.println();

        // Lisa
        double lisaTotal = veggiePizza;
        System.out.println(customerLisa + " ordered a Veggie Pizza.");

        if (isOrderReadyLisa) {
            System.out.println(customerLisa + readyMessage);
            System.out.println(displayTotalMessage + lisaTotal);
        } else {
            System.out.println(customerLisa + pendingMessage);
        }

        System.out.println();

        // Kevin
        System.out.println(customerKevin + " was charged for a Cheese Pizza.");
        System.out.println("But he ordered a Veggie Pizza.");

        double difference = veggiePizza - cheesePizza;

        System.out.println(customerKevin + ", you need to pay an additional: $" + difference);

        if (isOrderReadyKevin) {
            System.out.println(customerKevin + readyMessage);
        } else {
            System.out.println(customerKevin + pendingMessage);
        }

    }
}