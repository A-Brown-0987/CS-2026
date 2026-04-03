/* Prompt  
ensure that the conditions are met. 
- m1 returns	
monster 1

- m2 returns
truck 1
car 1

- toString returns 
"monster vroomvroom"

*/
// Starter Code -- code cut for copyright reasons.




//- My Code - 

public class MonsterTruck extends Truck {   
    // MonsterTruck returns monster 1 by printing.
    @Override
    public void m1(){  
        System.out.println("monster 1");

    }  
    // MonsterTruck returns truck 1 and car 1, using truck methods.
    @Override
    public void m2(){ 
        super.m1(); 
        super.m2();
    }   

// adds "monster" to Truck's toString output,  so MonsterTruck is reflected without duplicating Truck's logic.
    @Override
    public String toString(){ 
        return "monster " + super.toString();
    }
}