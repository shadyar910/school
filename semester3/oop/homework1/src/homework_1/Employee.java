
package homework_1;


public class Employee {
    private String firstName ;
    private String lastName ;
    private double monthlySalary;
    
    
      public Employee(String Name, String Last, double Salary){
     firstName=Name;
      lastName = Last;
      if(Salary >0 ){
      monthlySalary = Salary;
      } else{
      monthlySalary = 0.00; 
      }
      
      
    
      }
    
    
    public String getfirstName(){
    return firstName;
    }             
public void setFirstName(String Name){
firstName=Name ;
}

public String getLastName(){
    return lastName;
    }               
public void setLastName(String Last){
lastName = Last ;
}

public double getMonthlySalary(){
    return monthlySalary;
    }                 
public void setMonthlySalary( double Salary){
monthlySalary=Salary ;
if (Salary > 0) {
            monthlySalary = Salary;
        }
}

 public double getYearlySalary() {
        return monthlySalary * 12;
    }
 public void raiseSalary(double percentage) {
        if (percentage > 0) {
            monthlySalary += monthlySalary * percentage / 100;
        }
    }
 


}
