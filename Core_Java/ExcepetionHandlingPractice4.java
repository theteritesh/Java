class RiteshException extends Exception{
    public RiteshException(String message) {
        super(message);
    }
}
public class ExcepetionHandlingPractice4 {
    public static void main(String[] args) {
        int a=12;
        try {
            if (a==12){
                throw new RiteshException("A=12");
            }
                
        } catch (RiteshException e) {
            System.out.println(e);
        }
        
        
        
    }
}