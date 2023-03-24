import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter an integer number: ");
        int num = obj.nextInt();
        int firstNum = 0, secondNum = 1;
        System.out.println("Fibonnaci Series upto " + num + "terms: ");
        for(int i=1; i<=num; i++){
            System.out.println(firstNum + " ");
            int nextNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = nextNum;
        }
    }
}