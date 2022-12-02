public class booleanProgram {
    public static void main(String[] args) {
        boolean doorOpen = true;
        boolean doorClose = false;
        boolean allDoorOpen = false;
        int doorCount = 0;

        if (doorOpen) {
            System.out.println("Your door1 is open");
            doorCount = doorCount + 1;
        }
        if (doorClose) {
            System.out.println("Your door2 is open");
            doorCount = doorCount + 1;
        }
        if (doorOpen) {
            System.out.println("Your door3 is open");
            doorCount = doorCount + 1;
        }
        if (doorCount == 3) {
            allDoorOpen = true;
            System.out.println("Hurry!!! You Won.");
        }
        if (doorCount != 3) {
            System.out.println("Oops!!! Better Luck Next Time.");
        }
    }
}
