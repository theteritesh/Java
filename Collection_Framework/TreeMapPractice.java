import java.util.NavigableMap;
import java.util.TreeMap;
import java.util.Map;
import java.util.Set;

public class TreeMapPractice {
    public static void main(String[] args) {
        NavigableMap<Integer,String> treeMap=new TreeMap<>( (k1,k2)->k2-k1);
        treeMap.put(1,"Ritesh");
        treeMap.put(6,"Dinesh");
        treeMap.put(4,"Ganesh");
        treeMap.put(8,"Mahesh");
        System.out.println(treeMap);

        Set<Map.Entry<Integer,String>> setEntry=treeMap.entrySet();
        for(Map.Entry<Integer,String> e:setEntry)
            System.out.println(e.getKey()+" : "+e.getValue());

            System.out.println(treeMap.pollFirstEntry());
            System.out.println(treeMap.pollLastEntry());

            System.out.println(treeMap.ceilingEntry(5));

    }
    
}