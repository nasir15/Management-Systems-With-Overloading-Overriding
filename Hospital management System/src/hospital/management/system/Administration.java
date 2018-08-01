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
public class Administration extends PatientInformation{
    
    String Dr_Appointement_Time;
     double Appoinment_fees;
    String feeOption="";
    

    public String getDr_Appointement_Time() {
        return Dr_Appointement_Time;
    }

    public void setDr_Appointement_Time(String Dr_Appointement_Time) {
        this.Dr_Appointement_Time = Dr_Appointement_Time;
    }

    public double getAppoinment_fees() {
        return Appoinment_fees;
    }

    public void setAppoinment_fees(double Appoinment_fees) {
        this.Appoinment_fees = Appoinment_fees;
    }

    public String getFeeOption() {
        return feeOption;
    }

    public void setFeeOption(String feeOption) {
        this.feeOption = feeOption;
    }
   

    
 
}
