import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mappok {
    public static void main(String[] args) {
        
        HashMap<String, String> map = new HashMap<String, String>();

        map.put("a", "kaki");
        map.put("b", "pisi");
        map.put("c", "puki");

        // map.put("a", null);

        map.replace("a", "kuki"); // csak ha létezik akkor változtatja meg

        System.out.println(map);

        System.out.println(map.get("b"));
        System.out.println(map.getOrDefault("x", "helobello ez itt nincs"));


        Map<Integer, Double> nuMap = new HashMap<>();

        nuMap.put(3,3.14);
        nuMap.put(4, 2.0);

        System.out.println(nuMap.getOrDefault(5, 0.0));

        System.out.println(map.containsKey("a"));
        System.out.println(map.containsValue("puki"));

        System.out.println(map.keySet());
        System.out.println(map.values());

        for(Entry e : map.entrySet()){
            System.out.printf("Key=%s, Value=%s\n", e.getKey(), e.getValue());
        }



    }
}
