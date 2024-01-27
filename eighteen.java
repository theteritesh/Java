import java.io.*;
class eighteen{
    public static void main(String[] args) throws IOException {
      int a[]= new int[5];
      int max;
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));   
      System.out.println("Enter the array=");
      for(int i=0;i<a.length;i++)
        {
            a[i]=Integer.parseInt(br.readLine());
        }
        max=a[0];
        for( int i=1;i<a.length;i++)
            {
                if(a[i]>max){
                    max=a[i];
                }
            }
        System.out.println("max="+max);
    //   System.out.println(a);
    }    
    

}