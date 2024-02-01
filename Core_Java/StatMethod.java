
class Mobile{
    String brand;
    int price;
    static String name;  
    public void display(){
        System.out.println(brand +": "+price+": "+name);
    }
    
    public static void staticDisplay(Mobile obj){
        System.out.println("Static Method");
        System.out.println(obj.brand +": "+obj.price+": "+name);
    }
}
public class StatMethod{

    public static void main(String[] args) {
        Mobile obj1=new Mobile();
        obj1.brand="Apple";
        obj1.price=15000;
        Mobile.name="smartphone";
        obj1.display();

        Mobile.staticDisplay(obj1);


    }
}