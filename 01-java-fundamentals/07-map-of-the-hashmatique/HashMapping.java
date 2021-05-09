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
        thisList.remove("Good day for Java");
        thisList.replace("Take another byte", "The same old thing");

        String track = thisList.get("Be kind, kinda");
        System.out.println("This track contains the lyrics: " + track);
        System.out.println(thisList.containsKey("Be kind, kinda"));
        System.out.println(thisList.containsValue("Most of the day is spent with you"));
        System.out.println(thisList.size());
        System.out.println(thisList.values());

        //Use keySet to get keys.
        Set<String> keys = thisList.keySet();
        for(String key: keys) {
            System.out.println(key + ": "+thisList.get(key));
        }
    }
}