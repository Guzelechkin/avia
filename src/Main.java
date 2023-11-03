public class Main {
    /**
     * За каждые 20 рублей, потраченные на билет, начисляется 1 миля. Дробные мили не начисляются.
     * @value ticketPrice - стоимость билета.
     * @value BonusperMiles - бонус за 1 милю.
     */
    public static void main(String[] args) {

        int ticketPrice = 17120;
        int BonusperMiles = 20;

        int bonusMiles = ticketPrice / BonusperMiles;

        System.out.println("Начислено: " + bonusMiles + " бонусных миль");
    }
}
