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
public class EmployeeSalary  {
   double Employee_fix_Salary;
     double Employee_Advance_salary;
   double Employee_Traveling_Allowance;
   double Employee_bonus_allowance;
   double Employee_bonus_per_month;
   double Employee_tax_per_month;

    public double getEmployee_fix_Salary() {
        return Employee_fix_Salary;
    }

    public void setEmployee_fix_Salary(double Employee_fix_Salary) {
        this.Employee_fix_Salary = Employee_fix_Salary;
    }

    public double getEmployee_Advance_salary() {
        return Employee_Advance_salary;
    }

    public void setEmployee_Advance_salary(double Employee_Advance_salary) {
        this.Employee_Advance_salary = Employee_Advance_salary;
    }

    public double getEmployee_Traveling_Allowance() {
        return Employee_Traveling_Allowance;
    }

    public void setEmployee_Traveling_Allowance(double Employee_Traveling_Allowance) {
        this.Employee_Traveling_Allowance = Employee_Traveling_Allowance;
    }

    public double getEmployee_bonus_allowance() {
        return Employee_bonus_allowance;
    }

    public void setEmployee_bonus_allowance(double Employee_bonus_allowance) {
        this.Employee_bonus_allowance = Employee_bonus_allowance;
    }

    public double getEmployee_bonus_per_month() {
        return Employee_bonus_per_month;
    }

    public void setEmployee_bonus_per_month(double Employee_bonus_per_month) {
        this.Employee_bonus_per_month = Employee_bonus_per_month;
    }

    public double getEmployee_tax_per_month() {
        return Employee_tax_per_month;
    }

    public void setEmployee_tax_per_month(double Employee_tax_per_month) {
        this.Employee_tax_per_month = Employee_tax_per_month;
    }
 
   double Total_Salary(){
   double x;
   x=Employee_fix_Salary+ Employee_Advance_salary+Employee_Traveling_Allowance+Employee_bonus_allowance+ Employee_bonus_per_month+Employee_tax_per_month;
   return x;
   }
   void recieve_Voucher(){
       System.out.println("Salary Received");
   }
}
