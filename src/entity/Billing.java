package entity;

public class Billing {
    private int visitID;
    private String visitType;
    private int coPay;
    private String dateofVisit;
    private int doctorID;
    private int patientID;
    
    public Billing(int visitID, String visitType,int coPay, String dateofVisit, int doctorID, int patientID){
        this.visitID = visitID;
        this.visitType = visitType;
        this.coPay = coPay;
        this.dateofVisit = dateofVisit;
        this.doctorID = doctorID;
        this.patientID = patientID;
    }
    
    public int getVisitID(){
        return visitID;
    }
    public String getVisitType(){
        return visitType;
    }
    public int getCoPay(){
        return coPay;
    }
    public String getDateofVisit(){
        return dateofVisit;
    }
    public int getDoctorID(){
        return doctorID;
    }
    public int getPatientID(){
        return patientID;
    }
    
    @Override
    public String toString() {
        return "Billing{" + "visitID=" + visitID + ", visitType=" + visitType 
                + ", coPay=" + coPay + ", dateofVisit=" + dateofVisit + ", doctorID=" 
                + doctorID + ", patientID=" + patientID + "}";
    }    
}
        