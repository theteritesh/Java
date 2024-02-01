class Human{
    private int age;
    private String name;
    
    public Human(){
        age=12;
        name="Ritesh";
    }

    public Human(int a,String b){
        this.age=a;
        this.name=b;
    }

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
public class ConstructorPractice{
    public static void main(String[] args) {
        Human obj = new Human();
        Human obj1 = new Human(18,"Ganesh");
        System.out.println(obj.getName()+": "+obj.getAge());
        System.out.println(obj1.getName()+": "+obj1.getAge());
    }
}