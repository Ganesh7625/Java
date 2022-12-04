public class ternaryOperators {
    public static void main(String[] args) {
        int a, b;
        a = 10;

        System.out.println("Value of A : " + a);
        b = (a == 10) ? 20 : 30; // b = (Condition) ? True : False
        System.out.println("Value of B : " + b);

        b = (a == 20) ? 40 : 50; // ? => if AND : => else
        System.out.println("Value of B : " + b);
    }
}
