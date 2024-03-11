import java.io.*;
class eight{
public static void main(String args[]) throws IOException
{
	BufferedReader br=new BufferedReader(new InputStringReader(System.in));
	System.out.println("Enter No. 1");
	int a=Integer.parseInt(br.readLine());
	System.out.println("Enter No. 2");
	int b=Integer.parseInt(br.readLine());	
	System.out.println("Enter No. 3");
	int c=Integer.parseInt(br.readLine());
if(a>=b){
	if(a>=c){
	System.out.println("greter numb="+a);
	}
	else{
	System.out.println("greter numb="+c);
	}
	}
else{
	if(b>=c)
	{
	System.out.println("greter numb="+b);
	}
	else
	{
	System.out.println("greter numb="+c);
	}
    }
 }
}