import java.util.ArrayList;

class MyGeneric<T1,T2> {
    private int val;
    private T1 t1;
    private T2 t2;

    public MyGeneric(int val, T1 t1,T2 t2) {
        this.val = val;
        this.t1 = t1;
        this.t2 = t2;
    }
    public int getVal(){
        return val;
    }
    public void setVal(int val){
        this.val=val;
    }
    public T1 getT1(){
        return t1;
    }
    public void setT1(T1 t1){
        this.t1=t1;
    }
    public T2 getT2(){
        return t2;
    }
    public void setT2(T2 t2){
        this.t2=t2;
    }

}

public class GenericsPractice {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        // arr.add("hi");
        arr.add(1);
        arr.add(2);
        arr.add(3);
        // arr.add(1.2);
        // int a = arr.get(0);
        // System.out.println(a);

        MyGeneric<String,Double> g1=new MyGeneric<>(10, "hellow",3.5);
        String aString=g1.getT1();
        System.out.println(aString);
        int aInt=g1.getVal();
        System.out.println(aInt);
        double aDouble=g1.getT2();
        System.out.println(aDouble);

    }

}