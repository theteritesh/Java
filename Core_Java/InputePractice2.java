import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputePractice2 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader bf =new BufferedReader(in);
        System.out.println("Enter a Number : ");
        int num =Integer.parseInt(bf.readLine());
        System.out.println(num);

        bf.close();
    }    
}