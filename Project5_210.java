
import java.util.Scanner;
public class Project5_210 {
    
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        String pwd = ""; 
boolean correct = false; 

 do { 
    System.out.println("Type your password: "); 
    pwd = input.next(); 
    if (pwd.equals("abc123")){ 
        System.out.println("you are logged in successfully"); 
        correct = true;
    } 
    else{ 
        System.out.println("Not a correct password");
    }
}while (!correct);
    

input.close();
    
    }
    }

    