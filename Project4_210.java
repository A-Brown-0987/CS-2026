import java.util.*;

public class Project4_210 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int first;
        int second;
        int third;

        boolean made = false;
        while (!made ) {
            System.out.println("input first number: ");
            first = input.nextInt();
            System.out.println("input second number: ");
            second = input.nextInt();
            System.out.println("input third number: ");
            third = input.nextInt();
            boolean ok = checkNumbers(first, second, third);
            if (ok) {
                System.out.println("you are a genius, Bye!");
                made = true;
            } else {
                System.out.println("Input again");
            }
        }
    }

    public static boolean checkNumbers(int first, int second, int third) {
       return (first == second) && (first + second < third);

    }
}