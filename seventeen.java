class seventeen{
public static void main(String args[]){
int num[]={2,33,22,55,44,};
System.out.println("Arry In Sorted Order");
	for(int i=0;i<num.length;i++)
	{
	for(int j=i+1;j<num.length;j++)
	{
	if(num[i]<num[j])
	{
	int temp=num[i];
	num[i]=num[j];
	num[j]=temp;
	}
	}
	}
	for(int i=0;i<num.length;i++)
	{
	System.out.print(num[i]+" ");
	}
}
}