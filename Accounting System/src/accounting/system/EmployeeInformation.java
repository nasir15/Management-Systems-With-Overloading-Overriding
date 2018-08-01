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
public class EmployeeInformation  extends EmployeeSalary {
     String Employee_name;
    String Employee_full_name;
String Father_name;
int Nic_no;
Boolean Attendence;

    public String getEmployee_name() {
        return Employee_name;
    }

    public void setEmployee_name(String Employee_name) {
        this.Employee_name = Employee_name;
    }

    public String getEmployee_full_name() {
        return Employee_full_name;
    }

    public void setEmployee_full_name(String Employee_full_name) {
        this.Employee_full_name = Employee_full_name;
    }

    public String getFather_name() {
        return Father_name;
    }

    public void setFather_name(String Father_name) {
        this.Father_name = Father_name;
    }

    public int getNic_no() {
        return Nic_no;
    }

    public void setNic_no(int Nic_no) {
        this.Nic_no = Nic_no;
    }

    public Boolean getAttendence() {
        return Attendence;
    }

    public void setAttendence(Boolean Attendence) {
        this.Attendence = Attendence;
    }
  
    //EmployeeSlary variables are using in EmployeeInformation class through inheritance
double Overtime_allowance(){

double y;
y=(Employee_fix_Salary+ Employee_Advance_salary+Employee_Traveling_Allowance+Employee_bonus_allowance+ Employee_bonus_per_month+Employee_tax_per_month)/100;
double z=y*10;
return z;
}
}
