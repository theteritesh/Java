interface A{
    int add(int i,int j);
}
public class LambdaFunctionPractice2{
    public static void main(String[] args) {
        A obj =(i,j)->i+j;
        System.out.println("Addition : "+obj.add(5,6));
        
    }
}