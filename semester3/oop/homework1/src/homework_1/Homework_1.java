package homework_1;

public class Homework_1 {

    public static void main(String[] args) {
        Employee Em1 = new Employee("Sha10", "Faruq", 5000);
        Employee Em2 = new Employee("Shadi", "Faruq", 7000);
        
   System.out.println("NAME               YEARLY SALARY");
        System.out.println("----                    -------------");
        System.out.println(Em1.getfirstName() + " " + Em1.getLastName() + "         $" + Em1.getYearlySalary());
        System.out.println(Em2.getfirstName() + " " + Em2.getLastName() + "         $" + Em2.getYearlySalary());

    
        System.out.println("\n10 Percent Salary Raised!!");
        Em1.raiseSalary(10);
        Em2.raiseSalary(10);
        System.out.println("\n");
       
        System.out.println("NAME              YEARLY SALARY");
        System.out.println("----                  -------------");
        System.out.println(Em1.getfirstName() + " " + Em1.getLastName() + "         $" + Em1.getYearlySalary());
        System.out.println(Em2.getfirstName() + " " + Em2.getLastName() + "         $" + Em2.getYearlySalary());
    }

}
