import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
public class BufferedWriter_practice {
    public static void main(String[] args) {
        try(BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out))){
            bw.write("Hiii");
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
