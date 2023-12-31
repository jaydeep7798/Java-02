package String;
import java.util.HashMap;
import java.util.Map;
public class Hashmapiterate {
	
	
	public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Alice", 25);
        hashMap.put("Bob", 30);
        hashMap.put("Charlie", 35);

        // Iterate over the keys
        for (String jay : hashMap.keySet()) {
        	
        	//Returns the value to which the specified key is mapped,
        	//or null if this map contains no mapping for the key
            System.out.println("Key: " + jay + ", Value: " + hashMap.get(jay));
        }
    }

}

