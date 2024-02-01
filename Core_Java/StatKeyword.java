class Mobile{
    String brand;
    int price;
    static String name;  
    public void display(){
        System.out.println(brand +": "+price+": "+name);
    }  
}
public class StatKeyword{

    public static void main(String[] args) {
        Mobile obj1=new Mobile();
        obj1.brand="Apple";
        obj1.price=15000;
        Mobile.name="smartphone";
        obj1.display();

        Mobile obj2=new Mobile();
        obj2.brand="Samsung";
        obj2.price=10000;
        Mobile.name="smartphone";
        obj2.display();

        

    }
}