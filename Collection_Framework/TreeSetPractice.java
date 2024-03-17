import java.util.Set;
import java.util.TreeSet;
import java.util.NavigableSet;

class Product{
    private String name;
    private int price;
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }
    @Override
    public String toString() {
        return "name=" + name + ", price=" + price;
    }
    
}
public class TreeSetPractice {
    public static void main(String[] args) {
        Set<Product> setProducts=new TreeSet<>((p1,p2)->(p2.getPrice()-p1.getPrice()));
        setProducts.add(new Product("Pencile",10));
        setProducts.add(new Product("pen",20));
        setProducts.add(new Product("bag",500));
        setProducts.add(new Product("notebook",40));
        // for(Product p:setProducts)
        //     System.out.println(p);
        
        NavigableSet<Integer> setIntegers=new TreeSet<>();
        setIntegers.add(8);
        setIntegers.add(2);
        setIntegers.add(4);
        setIntegers.add(0);

        // for (int i:setIntegers)
        //     System.out.println(i);

        System.out.println(setIntegers.floor(2));
        System.out.println(setIntegers.higher(2));
        System.out.println(setIntegers.lower(2));
        System.out.println(setIntegers.ceiling(3));

        
        
    }
}
