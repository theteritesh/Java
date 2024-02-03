class Laptop{
    String model;
    int price;
    public String toString(){
        return model +":"+price;
    }
    public boolean equals(Laptop that){
        return this.model.equals(that.model)&&this.price==that.price;
    }

}

public class ObjectClassPractice{
    public static void main(String[] args) {
        Laptop obj = new Laptop(); 
        obj.model="Lenevo";
        obj.price=1000;
        System.out.println(obj.toString());

        Laptop obj2 = new Laptop(); 
        obj2.model="Lenevo2";
        obj2.price=1000;
        System.out.println(obj2.toString());

        boolean result =obj.equals(obj2);
        System.out.println(result);
    }
}