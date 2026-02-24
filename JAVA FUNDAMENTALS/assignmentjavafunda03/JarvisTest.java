public class JarvisTest {

    public static void main(String[] args) {

        JarvisAssistant jarvis = new JarvisAssistant();

        System.out.println(jarvis.basicGreeting());
        System.out.println(jarvis.guestGreeting("Pepper Potts"));

        System.out.println(jarvis.respondBeforeFriday("Friday is coming."));
        System.out.println(jarvis.respondBeforeFriday("Jarvis"));
        System.out.println(jarvis.respondBeforeFriday("Prepare the suit."));

        System.out.println(jarvis.guestGreeting("Tony Stark", "evening"));
        System.out.println(jarvis.guestGreetingAuto("Tony Stark"));

        System.out.println(jarvis.jarvisMood("cheerful"));
        System.out.println(jarvis.jarvisMood("angry"));
        System.out.println(jarvis.jarvisMood("tired"));
    }
}
