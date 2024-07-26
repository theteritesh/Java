import java.io.IOException;
import java.io.InputStreamReader;

public class InputeStreamReader_practice {

    public static void main(String[] args) {
        try(InputStreamReader isr= new InputStreamReader(System.in)){
            System.out.print("Enter Stream hear....");
            int letter=isr.read();
            while (isr.ready()) {
                System.out.println((char)letter);
                letter=isr.read();
            }
            System.out.println();
            isr.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        
    }
}