class twentyone{
    public static void main(String[] args) {
        int no=153,digit=0,sum=0,no1=no;
        while(no!=0){
            digit=no%10;
            sum=sum+(digit*digit*digit);
            no=no/10;
        }
        if(no1==sum){
            System.out.println("Its a armstrong no="+no1);
        }else{
            System.out.println("Its not a armstrong no="+no1);
        }
    }
}