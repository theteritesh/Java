class Mobile{
    String brand;
    int price;
    static String name;  
    public Mobile(){
        brand="";
        price=100;
        System.out.println("In Constractor...");
    }
    static{
        name="phone";
        System.out.println("In Static Block...");
    }
    public void display(){
        System.out.println(brand +": "+price+": "+name);
    }
}
public class StaticBlock{

    public static void main(String[] args) throws ClassNotFoundException {
        // Mobile obj1=new Mobile();
        // Mobile obj2=new Mobile();

        Class.forName("Mobile");
        


    }
}