enum Laptop{
    Macbook(2000),XPS(2200),Surface,ThinkPad(1800); 
    private Laptop(int price){
        this.price=price;
        System.out.println("Para Constructor = "+this.name());
    } 
    private Laptop(){
        price=500;
        System.out.println("default Constructor = "+this.name());
    }    
    private int price;
    
    public int getPrice(){
        return price;
    }
    public void setPrice(int price) {
        this.price=price;
    }
}
public class EnumPractice3{
    public static void main(String[] args) {
        Laptop lap=Laptop.Macbook;
        System.out.println(lap +" : "+lap.getPrice( ));

        for(Laptop lap1:Laptop.values()){
            System.out.println(lap1  +" : "+lap1.getPrice( ));
        }
        
    }
}