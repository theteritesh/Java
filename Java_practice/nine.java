import java.io.*;
class nine{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter character");
char ch=Char.parseChar(br.readLine());
if(ch=='p')
	{
	System.out.println("PUNE");
	}
}
}