import java.util.Scanner;

public class takeInput {
    public static void main(String[] args) {
        System.out.println("Take input from User.");

        Scanner scan = new Scanner(System.in);

        String userInput = scan.next();

        System.out.println("User given input is : " + userInput);
    }
}
