import java.util.Scanner;

class Employee{
    int salary;

    Employee(int salary){
        this.salary=salary;
    }
    void display(int bonusInput){
        int bonus = bonusInput;

        System.out .println("\nInside display() Method : ");
        System.out.println("Salary (Instance Variable): " + salary);
        System.out.println("Bons(Local Variable): " + bonus);

        class Report{
            void show(){
                System.out.println("Repor : Employee salary is " + salary);

            }
        }
        Report report =  new Report();
        System.out.println("\nReport Object Created");
        System.out.println("Report Identity Hash Code : " + System.identityHashCode(report));
        report.show();

    }
}
public class EmployeeMemoryDemo{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter salary: ");
        int salary = sc.nextInt();

        System.out.print("Enter bonus: ");
        int bonus = sc.nextInt();
        Employee emp = new Employee(salary);

        System.out.println("\nEmployee object Created");
        System.out.println("Employee Identity Hash Code : " + System.identityHashCode(emp));
         emp.display(bonus);

        System.out.println("\nMemory Concept:");
        System.out.println("Employee object -> Heap");
        System.out.println("Report object -> Heap");
        System.out.println("salary -> Instance field");
        System.out.println("bonus -> Local variable in display()");
        System.out.println("show() -> Executes in its own method frame");

         sc.close();


    }
}