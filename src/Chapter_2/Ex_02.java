package Chapter_2;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length of the sides and height of the equilateral triangle: ");
        double length = scanner.nextDouble();
        double area = (Math.sqrt(3) / 4) * Math.pow(length, 2);
        System.out.println("The area is " + area);
        System.out.println("The volume of the Triangular prism is " + (area * length));
    }
}
