import java.lang.*;
import java.util.Scanner;

public class Area_of_equilateralTriangle {
    public static void main(String[] args){
        double arm,area;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of arm ");
        arm = input.nextDouble();
        area=(Math.sqrt(3)*4)*Math.pow(arm,2);
        System.out.println("The area of the equilateral triangle is : " + area);
    }
}
