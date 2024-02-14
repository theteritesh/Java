import java.util.HashMap;
import java.util.Map;

public class CollectionMapPractice {
    public static void main(String[] args) {
        Map <String,Integer>student=new HashMap<>();
        student.put("ganesh",50);
        student.put("mahesh",53);
        student.put("dinesh",52);
        student.put("shailesh",56);
        student.put("dinesh",92);
        System.out.println(student);
        System.out.println(student.get("dinesh"));

        for(String key:student.keySet()){
            System.out.println(key+"  :"+student.get(key));
            
        }


    }
}
