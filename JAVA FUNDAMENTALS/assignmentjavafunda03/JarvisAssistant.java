
import java.text.SimpleDateFormat;
import java.util.Date; //current date & time

public class JarvisAssistant {

    // Basic greeting
    public String basicGreeting() {
        return "Greetings, Sir. How may I assist you today?";
    }

    // Greeting with name
    public String guestGreeting(String name) {
        return "Hello, " + name + ". How may I assist you?";
    }

    // Greeting with name and time of day
    public String guestGreeting(String name, String dayPeriod) {
        return "Good " + dayPeriod + ", " + name + ". How may I assist you?";
    }

    public String dateAnnouncement() {
        Date currentDate = new Date(); // gets current date and time
        return "Sir, it is currently " + currentDate + ".";
    }

    // Checks what word is in the conversation
    public String respondBeforeFriday(String conversation) {

        // If the word Friday is found
        if (conversation.indexOf("Friday") != -1) {
            return "Right away, Sir. Although she's still learning.";
        } // If the word Jarvis is found
        else if (conversation.indexOf("Jarvis") != -1) {
            return "At your service, Sir.";
        } // If no keyword is found
        else {
            return "Very well. Carrying on.";
        }
    }

    // auto time greeting base on time
    public String guestGreetingAuto(String name) {

        Date currentDate = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("a");
        String period = formatter.format(currentDate);

        //morning
        if (period.equalsIgnoreCase("AM")) {
            return "Good morning, " + name + ". How may I assist you?";
        } //evening
        else {
            return "Good evening, " + name + ". How may I assist you?";
        }
    }

    //based on mood
    public String jarvisMood(String mood) {

        mood = mood.toLowerCase();

        if (mood.equals("angry")) {
            return "Sir... I assure you, I am perfectly calm.";
        } else if (mood.equals("cheerful")) {
            return "Wonderful day, Sir! I am operating at full capacity!";
        } else if (mood.equals("tired")) {
            return "Systems slightly fatigued, Sir... but still fully functional.";
        } //if mood is not listed
        else {
            return "Operating within normal emotional parameters.";
        }
    }
}
