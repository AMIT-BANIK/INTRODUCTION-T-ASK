import java.lang.*;
import java.util.Scanner;

public class Volume_of_Ball {
    public static void main(String[] args) {
        double radius,volume;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius");
        radius = input.nextFloat();
        volume=(4/3f)*Math.PI*Math.pow(radius,3);
        System.out.println("The volume is of the triangle is : " + volume);

    }
}
