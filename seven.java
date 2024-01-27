import java.io.*;
class seven{
public static void main(String args[]) throws IOException
{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int a=Integer.parseInt(br.readLine());
	if(a%2==0){
		System.out.println("ODD no.");
	}
	else{
	System.out.println("EVEN no.");
	}
}
}