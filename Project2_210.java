import java.util.Random;
import java.util.Scanner;

public class Project2_210{ 
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);  
        Random rand = new Random(); 
    
        boolean condition = true; 
while(condition == true){  
    //user inputs
    System.out.println("input first number: ");
    int number1 = scan.nextInt(); 
    System.out.println("input second number: ");
    int number2 = scan.nextInt();  
        // number <0 
        if(number1 <0 || number2 <0){ 
System.out.println("Smaller than 0, try again.");

        } 

        // number >99 
        else if(number1 >99 || number2 >99){ 
            System.out.println("Greater than 99, try again.");
        }
         
        // same numbers 
        else if(number1 == number2){ 
            System.out.println("Numbers the same, try again.");
        }  
        else{  
            condition = false;

        }


    
 // small & big  
 int large = 0; 
 int small = 0;

if(number1 > number2){ 
large = number1; 
small = number2;
} 
if(number1 < number2){ 
large = number2; 
small = number1;
}

 //assigning bounds
 int randomNumber =  rand.nextInt(large - small + 1) + small ;  
System.out.println("Your number between " + number1 + " and " + number2 + " is " + randomNumber);  

    }  
    
}
}