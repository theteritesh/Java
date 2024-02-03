abstract class Car{ //abtract class
    public abstract void drive(); 
    public abstract void fly();

    public void playMusic(){
        System.out.println("Music");
    }
}
abstract class VagonR extends Car{  //abtract class
    public void drive(){
        System.out.println("Driving");
    }
    
}
class UpdatedVagonR extends VagonR{ //Concreat class
    public void fly(){
        System.out.println("Flying");
    }
}

public class AbtractKeywordPracticegit{
    public static void main(String[] args) {
        Car  obj = new UpdatedVagonR();
        obj.drive();
        obj.playMusic();
        obj.fly();

    }
    
}