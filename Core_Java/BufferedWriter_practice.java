import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 * BufferedWriter_practice
 */
public class BufferedWriter_practice {

    public static void main(String[] args) {
        try(BufferedWriter bw=new BufferedWriter(new FileWriter("notes.txt",true))){
            bw.write("hi");
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}