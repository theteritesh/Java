import java.util.LinkedList;

class Book{
    String name,author,publisher;
    int id,price;
    public Book(int id,String name, String author, String publisher, int price) {
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.id = id;
        this.price = price;
    }
    
}

public class LinkedListBook {
    public static void main(String[] args) {
        LinkedList<Book> lb=new LinkedList<>();

        Book b1=new Book(1,"monk","ganesh","nb",300);
        Book b2=new Book(2,"dnyan","manesh","pb",200);
        Book b3=new Book(3,"vichar","dnyanesh","mb",500);
        
        lb.add(b1);
        lb.add(b2);
        lb.add(b3);

        for(Book b:lb){
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.price);
        }

    }
}
