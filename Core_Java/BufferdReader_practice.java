import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class BufferdReader_practice {
    public static void main(String[] args) {
       try( BufferedReader br=new BufferedReader(new InputStreamReader(System.in))){
            // byte to char stream and read char stream
            System.out.println("You Type : "+br.readLine());
       }catch(IOException e){
            System.out.println(e.getMessage());
       }
       try( BufferedReader br=new BufferedReader(new FileReader("notes.txt"))){
            while (br.ready()) {
                System.out.println(br.readLine());   
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
