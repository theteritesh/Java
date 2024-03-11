class twentytwo{
    public static void main(String[] args) {
        int sum=0,digit=0,cube=0;
        for(int i=1;i<=100;i++)
        {
            int check=i;
            while(i>0)
            {
                digit=i%10;
                cube=digit*digit*digit;
                sum=sum+cube;
                i=i/10;
                if(sum==check){
                    System.out.println(check);
                }

            }
            
        }
    }
}