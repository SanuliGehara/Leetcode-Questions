import java.util.HashMap;
import java.util.Map;

public class HashMaps_practice {
    public static void main(String[] args) {
        HashMap<String,String> capitalCity = new HashMap<String,String>();
        capitalCity.put("Sri Lanka", "Colombo");
        capitalCity.put("England", "London");
        capitalCity.put("India", "Mumbai");
        capitalCity.put("Japan", "Tokiyo");
        capitalCity.put("Germany", "Berlin");

        // Print the HashMap
        // The order of the key-value pairs in the output is not guaranteed
        System.out.println(capitalCity);

        System.out.println(capitalCity.containsValue("Colombo"));
        System.out.println(capitalCity.get("Japan"));

        capitalCity.clear();
        System.out.println(capitalCity);

    }
}
