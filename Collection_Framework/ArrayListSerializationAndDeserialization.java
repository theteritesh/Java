import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ArrayListSerializationAndDeserialization {
    public static void main(String[] args) {
        ArrayList<String> aList=new ArrayList<>();
        aList.add("Ritesh");
        aList.add("Mahesh");
        aList.add("Ganesh");

        try {
            //Serialization  
            FileOutputStream fos=new FileOutputStream("demo.txt");  
            ObjectOutputStream oos=new ObjectOutputStream(fos);  
            oos.writeObject(aList);  
            fos.close();  
            oos.close();  
            
            //Deserialization  
            FileInputStream fis=new FileInputStream("demo.txt");  
            ObjectInputStream ois=new ObjectInputStream(fis); 
            ArrayList  list=(ArrayList)ois.readObject();  
            System.out.println(list);    


            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
