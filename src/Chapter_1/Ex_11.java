package Chapter_1;

public class Ex_11 {
    public static void main(String[] args) {
        long population = 312_032_486;
        double seconds = 365 * 24 * 3600;
        double births = seconds / 7;
        double deaths = seconds / 13;
        double immigrants = seconds / 45;
        long newPeople = Math.round(births) - Math.round(deaths) + Math.round(immigrants);
        for (int i = 1; i <= 5 ; i++) {
            population += newPeople;
            System.out.printf("%d - %d\n", i, population);
        }
    }
}
