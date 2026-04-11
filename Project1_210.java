import java.util.Scanner;

public class Project1_210 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
// minimum
        System.out.print("Input min length of ID: ");
        int minLength = scan.nextInt();
// maximum
        System.out.print("Input max length of ID: ");
        int maxLength = scan.nextInt();
        scan.nextLine();
// conditional
        boolean done = false;

        while (!done) { 
            //id
            System.out.print("\nCreate a new ID: ");
            String id = scan.nextLine();
//parameters
            int length = id.length();
            char first = id.charAt(0);
            char last = id.charAt(length - 1);
// conditions to check each iteration
            boolean check1 = (length >= minLength && length <= maxLength);
            boolean check2 = (length % 2 != 0);
            boolean check3 = (first == last);

            if (check1 && check2 && check3) {
                System.out.println(id + " has been successfully created!");
                done = true;
            } else {
                if (!check1) {
                    System.out.println("ID must be greater than or equal to " + minLength + " and less than or equal to " + maxLength);
                }
                if (!check2) {
                    System.out.println("ID must be an odd number.");
                } 
            } 
        } 
    } 
}