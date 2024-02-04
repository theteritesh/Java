interface A{
    void show(int i,String s);
}
public class LambdaFunctionPractice{
    public static void main(String[] args) {
        A obj =(i,s)->{
            System.out.println("Show : "+ i+" "+s);
        };
        obj.show(5,"Ritesh");
        
    }
}