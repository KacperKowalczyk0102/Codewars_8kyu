public class TransportationOnVacation {
    public static int rentalCarCost(int d) {
        int dailyRent = 40;
        int totalCost = d * dailyRent;

        if (d >= 7) {
            return totalCost -= 50;
        } else if (d >= 3) {
            return totalCost -= 20;
        }
        return totalCost;
    }

    public static void main(String[] args) {
        int d = 15;
        int d2 = 4;
        int d3 = 2;
        System.out.println("Koszty pierwszego wynajmu to: " + rentalCarCost(d) + "\n");
        System.out.println("Koszty drugiego wynajmu to: " + rentalCarCost(d2) + "\n");
        System.out.println("Koszty trzeciego wynajmu to: " + rentalCarCost(d3));

    }

}

