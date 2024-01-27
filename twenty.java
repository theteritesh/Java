import java.io.*;
class twenty{
    public static void main(String[] args) throws IOException {
        int sequence[]= new int[5];
        int sum=0,digit=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<5;i++)
        {
            sequence[i]=Integer.parseInt(br.readLine());
        }
        for(int i=0;i<sequence.length;i++)
        {   int value=sequence[i];
            while(sequence[i]>0)
            {
                digit=sequence[i]%10;
                sum=sum+(digit*digit*digit);
                sequence[i]=sequence[i]/10;
            }
            if (value==sum){
                System.out.println("its ArmStrong no="+sequence[i]);
            }else{
                System.out.println("its not armstrong no="+sequence[i]);
            }
        }
      
    }
}