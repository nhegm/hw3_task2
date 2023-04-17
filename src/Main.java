public class Main {
    public static void main(String[] args) {

        int account = 213;
        int fill = 550;
        int bonus = fill/100;
        int withBonus = account+bonus+fill;
        int noBonus = account+fill;

        if (fill > 1000) {
            System.out.println("Остаток на счете: "+withBonus+" рублей. Из них "+bonus+" бонусных рублей");
        } else {
            System.out.println("Остаток на счете: "+noBonus+" рублей.");
        }
    }
}