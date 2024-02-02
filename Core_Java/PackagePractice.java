import demo.*;
public class PackagePractice{
    public static void main(String[] args) {
        Add a = new Add();
        int result=a.add(10,20);
        System.out.println("Add = "+ result);

        Sub s=new Sub();
        result=s.sub(10,20);
        System.out.println("Sub = "+ result);

        Mul m=new Mul();
        result=m.mul(10,20);
        System.out.println("Mul = "+ result);

        Div d=new Div();
        result=d.div(10,20);
        System.out.println("Div = "+ result);
    }
}