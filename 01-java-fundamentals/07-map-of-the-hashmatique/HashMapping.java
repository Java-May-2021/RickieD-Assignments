import java.util.HashMap;
import java.util.Set;

public class HashMapping {
    public static void main(String[] args) {
        HashMap<String, String> thisList = new HashMap<String, String>();
        thisList.put("Good day for Java", "Most of the day is spent with you");
        thisList.put("Be kind, kinda", "If you can take just a moment");
        thisList.put("Take another byte", "Get it while it's hot");
        thisList.put("Don't tred on my keyboard", "Just like that, with a click");
        thisList.put("You call this Java?", "We were up all night");
        thisList.remove("Good day for Java"); //Remove takes the key as an argument
        thisList.replace("Take another byte", "The same old thing"); //Replace takes the key of the value that will be replaced. Then the value to be plugged in.

        String track = thisList.get("Be kind, kinda");
        System.out.println("This track contains the lyrics: " + track);
        System.out.println(thisList.containsKey("Be kind, kinda")); // Returns boolean value.
        System.out.println(thisList.containsValue("Most of the day is spent with you")); //Returns boolean value.
        System.out.println(thisList.size());
        System.out.println(thisList.values());

        //Use keySet to get keys.
        Set<String> keys = thisList.keySet(); // "keySet()" refers to the HashMap that was created
        for(String key: keys) {
            System.out.println(key + ": "+thisList.get(key));
        }
    }
}