public class ExcepetionHandlingPractice2 {
    public static void main(String[] args) {
        int i=4;
        int j=0;
        String str="";
        int num[]=new int[5];
        try{
            j=10/i;
            System.out.println(str.length());
            System.out.println(num[3]);
            System.out.println(num[5]);
            
        }
        catch(ArithmeticException e){
            System.out.println("Cannot Divide By zero");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Index out of Bounds");
        }
        catch(Exception e){
            System.out.println("Something wents Wrong..");
        }
        System.out.println(j);
    }
}