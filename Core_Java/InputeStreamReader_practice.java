import java.io.IOException;
import java.io.InputStreamReader;

public class InputeStreamReader_practice {
    public static void main(String[] args) {
        try(InputStreamReader isr=new InputStreamReader(System.in)){
            System.out.print("Enter Some Letters : ");
            int Letters=isr.read();
            while (isr.ready()) {
                System.out.println((char)Letters);
                Letters= isr.read();
                
            }
            // isr.close();   it closes it auto
            System.out.println();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    
}
    
}