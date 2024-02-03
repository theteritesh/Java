interface Computer {
    void code();
}

class Laptop implements Computer{
    public void code(){
        System.out.println("Code,Compile,run");
    }
}

class Desktop implements Computer{
    public void code(){
        System.out.println("Code,Compile,run:Faster");
    }
}

class Developer{
    public void decApp(Computer pc){
        pc.code();
    }
}

public class InterfacePractice2{
    public static void main(String[] args) {
        Computer lap=new Laptop();
        Desktop desk=new Desktop();
        Developer ritesh=new Developer();
        ritesh.decApp(desk);
        ritesh.decApp(lap);
    }
}