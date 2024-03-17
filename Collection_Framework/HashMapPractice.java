import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapPractice{
    public static void main(String[] args) {
        Map<String,Integer> mapMarks=new HashMap<>();
        mapMarks.put("Ritesh", 40);
        mapMarks.put("Ganesh", 30);
        mapMarks.put("Dinesh", 60);
        mapMarks.put("Mhesh", 80);


        // System.out.println("Ritesh : "+mapMarks.get("Ritesh"));
        // System.out.println("Not Exist : "+mapMarks.get("Drshn"));

        // System.out.println("Not Exist : "+mapMarks.getOrDefault("drsh",  0));
        // System.out.println("Dinesh : "+mapMarks.getOrDefault("Dinesh",  0));

        // System.out.println("Return True If Key Ritesh Present : "+mapMarks.containsKey("Ritesh"));
        // mapMarks.remove("Mhesh");
        // System.out.println("Mhesh is not removed  : "+mapMarks.containsKey("Mhesh"));

        Set<Map.Entry<String,Integer>> entries=mapMarks.entrySet();
        for(Map.Entry<String,Integer> e: entries)
            System.out.println(e.getKey()+" : "+e.getValue());

        System.out.println();
        Set<String> keySet=mapMarks.keySet();
        for(String key:keySet)
            System.out.println(key+":"+mapMarks.get(key));
    }
}