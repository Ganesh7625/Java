import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num < 0 && num > 100) {
            System.out.println("Invalid Number.");
        } else if (num >= 90 && num <= 100) {
            System.out.println("A Grade");
        } else if (num >= 80 && num < 90) {
            System.out.println("B Grade");
        } else if (num >= 70 && num < 80) {
            System.out.println("C Grade");
        } else if (num >= 60 && num < 70) {
            System.out.println("D Grade");
        } else if (num >= 50 && num < 60) {
            System.out.println("E Grade");
        } else {
            System.out.println("Fail");
        }
        sc.close();
    }
}
