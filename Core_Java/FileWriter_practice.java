import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_practice {
    public static void main(String[] args) {
        try (FileWriter fw=new FileWriter("notes.txt")){
            fw.write("Hellow");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (FileWriter fw=new FileWriter("notes.txt",true)){
            fw.write(" World");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    
}