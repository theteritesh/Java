
class ninteen{
    public static void main(String[] args) {
        int total=0;
        // int wt[]=new int[5];
        int wt[]={70,55,60,90,100};
        // float ht[]=new float[5];
        double ht[]={5.5,6.1,5.9,5.3,5.2};
        
        for(int i=0;i<5;i++)
        {
            if(ht[i]>5.5 && wt[i]>60){
                total=total+1;
            }
        }    
        System.out.println("person whose hight >5.5 and waight>60="+total);
            
    }
}