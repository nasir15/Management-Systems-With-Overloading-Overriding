/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.management.system;

/**
 *
 * @author nasir
 */
public class HospitalManagementSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Console Hospital Management System");
        System.out.println("First PatientInformation Module contains Overloading method");
        PatientInformation pt=new PatientInformation();
        
        pt.setPatient_Name("Salman");
       
        System.out.println("Pateint Name "+ pt.getPatient_Name());
        pt.setFather_Name("Shahid");
        System.out.println("Pateint Father Name "+ pt.getFather_Name());
        pt.setMR_No_Generated(22);
        System.out.println("Pateint MR No "+ pt.getMR_No_Generated());
        pt.setDate("12 oct 2017");
        System.out.println("Pateint Admit Date "+ pt.getDate());
        pt.setNIC_No(42101);
        System.out.println("Pateint CNIC NO "+ pt.getNIC_No());
        String a[]={"fever","flue"};
         pt.setPatient_ills_Array(a);
    pt.getPatient_ills_Array();
      for(int i=0;i<a.length;i++){
        System.out.println("Disease "+pt.getPatient_ills_Array()[i]);
    }
        int b[]={1,2,3};
       
        pt.setDoctorFields(b); 
        pt.getDoctorFields();
        for(int i=0;i<b.length;i++){
        System.out.println("Doctor at ward "+pt.getDoctorFields()[i]);
    }
        //Method OverLoading
       int c= pt.Generate_BarCode(54);
        int d=pt.Generate_BarCode(54,67);
      
        System.out.println("Randomly Generated Bar Code "+c);
        System.out.println("Method Overload contains Bar Code "+d);
        
        // 2nd Administration Module
        System.out.println("2nd Administration Module ");
        Administration admin=new Administration();
        admin.setAppoinment_fees(1000);
        System.out.println("Appointment fees is "+admin.getAppoinment_fees());
        admin.setDr_Appointement_Time("8:00 PM");
        System.out.println("Appintment time is "+admin.getDr_Appointement_Time());
        admin.setFeeOption("Card");
          String feeOption=admin.getFeeOption();
            switch (feeOption){
    
    case "Online":
    System.out.println("You select online payment method");
    break;
    case "Card":
    System.out.println("You select card Payment Option");
    break;
    case "Cash":
    System.out.println("You select cash Option");
    break;
    case "GetReceived":
    System.out.println("You select a receive option");
    break;
    default:
    System.out.println("You didnt choose any option");
    break;
}
            PatientInformation override=new Administration();
           int x= override.Generate_BarCode(76);
           System.out.println(""+x);
            System.out.println("Cash received slip barcode No using Override Method ");
    }
    
}
