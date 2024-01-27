//while loop
//fibonaccis series
class eleven{
public static void main(String args[])
{
int sum,max=20,no=0,no1=1;
System.out.println("fabonaccis series");

while(no1<=max){
	System.out.println(no1);
	sum=no+no1;
	no=no1;
	no1=sum;
}
}
}