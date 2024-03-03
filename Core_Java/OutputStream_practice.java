import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStream_practice {
    public static void main(String[] args) {
        try(OutputStreamWriter osw =new OutputStreamWriter(System.out)) {
            osw.write("Hello World! ");
            osw.write(97);
            osw.write('A');
            osw.write("\n");
            char[] arr="hello".toCharArray();
            char [] arr2={'s','b'};
            osw.write(arr);
            osw.write(arr2);
            

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
