public class StringBufferPractice{
    public static void main(String[] args) {
        StringBuffer sb =new StringBuffer("Ritesh");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append(" Thete");
        sb.deleteCharAt(5);
        sb.insert(0,"java ");
        System.out.println(sb);
        
    }
}