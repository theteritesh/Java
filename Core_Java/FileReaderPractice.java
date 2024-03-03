import java.io.FileReader;
import java.io.IOException;
public class FileReaderPractice {
    public static void main(String[] args) {
        try(FileReader fr=new FileReader("notes.txt")){
            System.out.println("Enter Some Letters : ");
            int Letters=fr.read();
            while (fr.ready()) {
                System.out.print((char)Letters);
                Letters= fr.read();
                
            }
            // fr.close();   it closes it auto
            System.out.println();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
    
}