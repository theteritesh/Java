class Human{
    private int age;
    private String name;
    

    public void setAge(int a){
        age=a;
    }
    public void setName(String n){
        name=n;
    }

    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
}
public class Encapsulation{
    public static void main(String[] args) {
        Human obj = new Human();
        obj.setName("Ritesh");
        obj.setAge(21);
        System.out.println(obj.getName()+": "+obj.getAge());
    }
}