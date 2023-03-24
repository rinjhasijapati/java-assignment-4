import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Nepali Rupees: ");
        double rs = obj.nextDouble();

        double usd = rs / 135.03;  //1 USD = 135.03 for conversation
        System.out.println("US Dollors: " + usd);
    }
}