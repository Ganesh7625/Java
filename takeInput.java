import java.util.Scanner;

public class takeInput {
    public static void main(String[] args) {
        System.out.println("Take input from User.");

        Scanner scan = new Scanner(System.in); // taking input from user

        String userInput = scan.next(); // take input as a string

        System.out.println("User given input is : " + userInput); // stroing string put by users
    }
}
