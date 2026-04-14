import java.util.Random;
import java.util.Scanner;

public class BonusQuiz1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        //two numbers from user
        System.out.print("input first number: ");
        int number1 = scan.nextInt();
        System.out.print("input second number: ");
        int number2 = scan.nextInt();

        //large and small
        int large = 0;
        int small = 0;

        // if number1 is greater than second number
        if(number1 >= number2){
            System.out.println("Error, input again");
            scan.close();
            return;
        }

        // if both are not positive
        else if(number1 < 0 || number2 < 0){
            System.out.println("Error, input again");
            scan.close();
            return;
        }

        // tests for larger or smaller
        if(number1 > number2){
            large = number1;
            small = number2;
        }
        else if(number2 > number1){
            large = number2;
            small = number1;
        }

        scan.close();

        // Assigns random bounds
        int randomNumber = rand.nextInt(large - small + 1) + small;
        int randomNumber2 = rand.nextInt(large - small + 1) + small;

        Scanner scan2 = new Scanner(System.in);
        System.out.print("Choose an operator (+, -, *, /): ");
        String op = scan2.next();

        System.out.println(randomNumber + " " + op + " " + randomNumber2 + " = ?");

        // calculate answer
        int result = 0;
        if (op.equals("+")) {result = randomNumber + randomNumber2;}
        else if (op.equals("-")) {result = randomNumber - randomNumber2;}
        else if (op.equals("*")) {result = randomNumber * randomNumber2;}
        else if (op.equals("/")) {result = randomNumber / randomNumber2;}

        while (true){
            System.out.print("Your answer: ");
            int userAnswer = scan2.nextInt();

            if (userAnswer == result){
                System.out.println("You are a math genius! Bye.");
                break;
            } else{
                System.out.println("wrong answer!");
                System.out.println(randomNumber + " " + op + " " + randomNumber2 + " = ?");
            }
        }

        scan2.close();
    }
}