import java.util.Scanner;
public class ExchangeMoney {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input USD: ");
        usd = sc.nextDouble();
        double exchange = usd * 23000;
        System.out.println("VND value: " + exchange);

    }

}