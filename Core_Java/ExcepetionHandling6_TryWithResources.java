import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExcepetionHandling6_TryWithResources {
    public static void main(String[] args) throws NumberFormatException, IOException {
        int num=0;
        try (BufferedReader br =new BufferedReader(new InputStreamReader(System.in))) {
            num=Integer.parseInt(br.readLine());
            //it close resources automatically
            System.out.println(num);
        }
    }
}
