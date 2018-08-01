/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accounting.system;

/**
 *
 * @author nasir
 */
public class AccountingSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("First Module of the Accounting System");
        EmployeeInformation employee=new EmployeeInformation();
        employee.setEmployee_name("Abdullah");
        System.out.println("Employee _Name is "+employee.getEmployee_name());
        employee.setFather_name("Abdul Malik");
           System.out.println("Employee Father Name is "+employee.getFather_name());
        employee.setNic_no(42101);
        System.out.println("Employee NIC no is "+employee.getNic_no());
        employee.setAttendence(true);
           System.out.println("Employee Attandance status is "+employee.getAttendence());
       double z= employee.Overtime_allowance();
       System.out.println("Overtime aalowance is "+z);
        System.out.println("Here Overtime allowance is calculating through Inheritance ");
        
        
       
        System.out.println("2nd Module of the Accounting System");
        EmployeeSalary Salary=new EmployeeSalary();
        Salary.setEmployee_fix_Salary(30000);
        System.out.println("Employee Fix SALARY is "+Salary.getEmployee_fix_Salary());
        Salary.setEmployee_Traveling_Allowance(3000);
        System.out.println("Employee Traveling allowance is "+Salary.getEmployee_Traveling_Allowance());
        Salary.setEmployee_bonus_allowance(15000);
        System.out.println("Employee Bonus allowance is "+Salary.getEmployee_bonus_allowance());
        Salary.setEmployee_Advance_salary(20000);
        System.out.println("Employee Advance SALARY is "+Salary.getEmployee_Advance_salary());
        Salary.setEmployee_tax_per_month(3000);
        System.out.println("Employee TAX / MONTH is "+Salary.getEmployee_tax_per_month());
        Salary.setEmployee_bonus_per_month(2000);
        System.out.println("Employee Bonus/Month is "+Salary.getEmployee_bonus_per_month());
        
        
           double v=Salary.Total_Salary();
           System.out.println("Total Salary of a employee is "+v);
           Salary.recieve_Voucher();
       
       
       
    }
    
}
