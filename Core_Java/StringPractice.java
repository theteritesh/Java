public class StringPractice{
    public static void main(String[] args) {
        // String name ="navin";
        String name= new String("Navin");
        System.out.println(name);
        System.out.println("hello "+name);
        System.out.println(name.charAt(1));
        System.out.println(name.concat(" ready "));

        String name1="Ganesh";
        name1 =name1 + " Dagle";
        System.out.println(name1);

        String s1="Ritesh";
        String s2="Ritesh" ;
        System.out.println(s1==s2);

    }
}