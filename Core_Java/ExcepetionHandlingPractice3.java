public class ExcepetionHandlingPractice3 {
    public static void main(String[] args) {
        int i=20;
        int j=0;
        try{
            j=10/i;
            if (j==0)
                throw new ArithmeticException("Arithmatic Exception...");
        }catch(ArithmeticException e){
            j=10/1;
            System.out.println("That A default output"+e);
        }
        System.out.println(j);
    }    
}