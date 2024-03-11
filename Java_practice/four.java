import java.io.*;
class four{
public static void main(String args[])
throws IOException
{
BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter 2 no.");
int a=Integer.parseInt(br.readLine());
int b=Integer.parseInt(br.readLine());
int c=a+b;
System.out.println("Addition="+c);
}
}