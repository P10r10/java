package Chapter_1;

public class Ex_13 {
    public static void main(String[] args) {
        double a = 3.4;
        double b = 50.2;
        double c = 2.1;
        double d = .55;
        double e = 44.5;
        double f = 5.9;
        double denominator = a * d - b * c;

        System.out.println("x = " + ((e * d - b * f) / denominator));
        System.out.println("y = " + ((a * f - e * c) / denominator));
    }
}
