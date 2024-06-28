package Chapter_2;

import java.util.Scanner;

public class Ex_03 {
    final static double METER_TO_FEET = 3.2786;  // 1 meter is 3.2786 feet
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a value for meter: ");
        double meter = scanner.nextDouble();
        System.out.printf("%.1f meters is %.3f feet", meter, METER_TO_FEET * meter);
    }
}
