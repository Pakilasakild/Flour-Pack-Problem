import java.util.Scanner;

public class Main {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount <= 0 || smallCount <= 0 || goal <= 0) {
            return false;
        }
        int requiredSmall = goal % 5;
        if ((goal / 5 == 0) && (requiredSmall > smallCount)) {
            return false;
        } else if ((requiredSmall <= smallCount) && (goal / 5 <= bigCount)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of Big bags: ");
        int bigCount = in.nextInt();
        System.out.println("Enter the number of small bags: ");
        int smallCount = in.nextInt();
        System.out.println("Enter the goal amount: ");
        int goal = in.nextInt();
        if (canPack(bigCount, smallCount, goal)) {
            System.out.println("Goal can be reached");
        } else {
            System.out.println("Goal is not reached");
        }
    }
}