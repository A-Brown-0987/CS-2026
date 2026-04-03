/* Prompt
- make a class where it behaves as lawyer but makes 20% more money
- 3 days more vacation 
- has 4 fracation forms, the getVacationForm method should return "pinkpinkpinkpink"

*/

// Starter Code  - cut due to copyright, my code extends a Lawyer class provided by Building Java Programs 5th Edition.

// - My Code - 
public class HarvardLawyer extends Lawyer{    
    // Harvard lawyers earn 20% over standard lawyer salary
    public double getSalary() { 
        return super.getSalary() * 1.2;
    }

    public String getVacationForm(){   
        // Harvard Lawyers return vacation form 4 times.
      String form = super.getVacationForm(); 
       return form.repeat(4);
    } 
    public int getVacationDays() { 
    // adds 3 to Lawyer vacation days.
         return super.getVacationDays() + 3;
     } 
 
  
 }