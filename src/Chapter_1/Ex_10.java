package Chapter_1;

public class Ex_10 {
    public static void main(String[] args) {
        int distanceK = 15;
        double timeM = 50.5;
        double distanceM = distanceK / 1.6;
        System.out.println("Average speed (mph): " + (60 * distanceM / timeM));
    }
}
