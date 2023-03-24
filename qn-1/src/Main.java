import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner obj = new Scanner(System.in);
        System.out.println("Enter an integer number.");
        int num = obj.nextInt();

        for(int i=1; i<=10; i++){
            int mul = num * i;
            System.out.println(num + "x" + i + "=" + mul);
        }
    }
}