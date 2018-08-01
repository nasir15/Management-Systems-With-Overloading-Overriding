/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.management.system;

import java.util.Random;

/**
 *
 * @author nasir
 */
public class PatientInformation {
     String Patient_Name;
      String Father_Name;
    String Husband_Name;
    String Date;
    int MR_No_Generated;
   String  Time_Generated;
   int NIC_No;
   String Patient_Ward;
   String[] Patient_ills_Array;
   int [] DoctorFields;

    public String getPatient_Name() {
        return Patient_Name;
    }

    public void setPatient_Name(String Patient_Name) {
        this.Patient_Name = Patient_Name;
    }

    public String getFather_Name() {
        return Father_Name;
    }

    public void setFather_Name(String Father_Name) {
        this.Father_Name = Father_Name;
    }

    public String getHusband_Name() {
        return Husband_Name;
    }

    public void setHusband_Name(String Husband_Name) {
        this.Husband_Name = Husband_Name;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public int getMR_No_Generated() {
        return MR_No_Generated;
    }

    public void setMR_No_Generated(int MR_No_Generated) {
        this.MR_No_Generated = MR_No_Generated;
    }

    public String getTime_Generated() {
        return Time_Generated;
    }

    public void setTime_Generated(String Time_Generated) {
        this.Time_Generated = Time_Generated;
    }

    public int getNIC_No() {
        return NIC_No;
    }

    public void setNIC_No(int NIC_No) {
        this.NIC_No = NIC_No;
    }

    public String[] getPatient_ills_Array() {
        return Patient_ills_Array;
    }

    public void setPatient_ills_Array(String[] Patient_ills_Array) {
        this.Patient_ills_Array = Patient_ills_Array;
    }

    public int[] getDoctorFields() {
        return DoctorFields;
    }

    public void setDoctorFields(int[] DoctorFields) {
        this.DoctorFields = DoctorFields;
    }
   
 
   
   int Generate_BarCode(int g){
         Random rand=new Random();
   int n=rand.nextInt(1000+1);
   int y=n+g;
   return y;
   };
   
   //Function Overloading
   
 int Generate_BarCode(int g,int f){
         Random rand=new Random();
   int n=rand.nextInt(1000+1);
   int y=n+g+f;
   return y;
   };   
}
