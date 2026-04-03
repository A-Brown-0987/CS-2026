/* Prompt
- make a class where it behaves as lawyer but makes 20% more money
- 3 days more vacation 
- has 4 fracation forms, the getVacationForm method should return "pinkpinkpinkpink"

*/

// Starter Code  - some code cut due to copyright 
public class Employee {
	

	public double getSalary() {
		return salary;             
	}
}
public class Lawyer extends Employee {
	
	public String getVacationForm() {
		 return lawyerVacationForm;
	}

	private String lawyerVacationForm = "pink";
	
	public final void setVacationForm(String form) {
		lawyerVacationForm = form;
	} 
    public int getVacationDays() {
		return super.getVacationDays() + 5;
	}

}

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