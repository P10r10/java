package Chapter_2;

import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter miles: ");
        double miles = scanner.nextDouble();
        System.out.printf("%.0f miles is %.1f kilometers\n", miles, miles * 1.6);
    }
}
