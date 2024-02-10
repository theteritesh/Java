// Write a program to print the area of a rectangle by creating a class named 'Area' having two methods.
//  First method named as 'setDim' takes length and breadth of rectangle as parameters and 
//  the second method named as 'getArea' returns the area of the rectangle. 
//  Length and breadth of rectangle are entered through keyboard.

import java.util.*;

public class AreaOfRectangle{
    int length,breadth;
    public void setDim(int l,int b){
        length=l;
        breadth=b;
    }
    public int getArea(){
        int area=length*breadth;
        return area;
    }
    public static void main (String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Lenghth");
        int x=sc.nextInt();
        System.out.println("Enter Breadth");
        int y=sc.nextInt();
        AreaOfRectangle a= new AreaOfRectangle();
        a.setDim(x,y);
        System.out.println("Area = "+a.getArea());
        sc.close();

    }
}
