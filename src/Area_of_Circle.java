import java.lang.*;
import java.util.Scanner;

public class Area_of_Circle {
    public static void main(String[] args){
        double radius,area;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius");
        radius = input.nextDouble();
        area=Math.PI*Math.pow(radius,2);
        System.out.println("The area of the triangle is : " + area);

    }
}
