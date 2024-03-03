import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileClass_practice {
    public static void main(String[] args) {
        try{
            File f=new File("new-file.txt");
            f.createNewFile();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }

        try{
            FileWriter fw=new FileWriter("new-file.txt",true);
            fw.write("hi\n");
            fw.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }

        try{
            BufferedReader br=new BufferedReader(new FileReader("new-file.txt"));
            while(br.ready()){
                System.out.println(br.readLine());
            }
            br.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }

        try{
            File f=new File("practice.txt");
            f.createNewFile();
            if(f.delete()){
                System.out.println(f.getName());
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
