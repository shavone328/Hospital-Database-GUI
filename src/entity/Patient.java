package entity;

public class Patient {
    private int patientID;
    private String firstName;
    private String lastName;
    private String dateofBirth;
    private String gender;
    private String address;
    private String phoneNumber;
    private String insurancePlan;
    private String medicalHistory;
    private String medications;
    
    public Patient(int patientID, String firstName, String lastName, String dateofBirth, 
                   String gender, String address, String phoneNumber, String insurancePlan, 
                   String medicalHistory, String medications)
    {
        this.patientID = patientID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateofBirth = dateofBirth;
        this.gender = gender;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.insurancePlan = insurancePlan;
        this.medicalHistory = medicalHistory;
        this.medications = medications;
    }
    public int getPatientID() {
        return patientID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public String getDateofBirth(){
        return dateofBirth;
    }
    public String getGender(){
        return gender;
    }
    public String getAddress(){
        return address;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public String getInsurancePlan(){
        return insurancePlan;
    }
    public String getMedicalHistory(){
        return medicalHistory;
    }
    public String getMedications(){
        return medications;
    }
    
    @Override
    public String toString() {
        return "Patients{" + "patientID=" + patientID + ", firstName=" + firstName + 
                ", lastName=" + lastName + ", dateofBirth=" + dateofBirth + 
                ", gender=" + gender + ", address=" + address + ", phoneNumber=" + phoneNumber + 
                ", insurancePlan=" + insurancePlan + ", medicalHistory=" + medicalHistory + 
                ", medications=" + medications + '}';
    }        
    
    
    
    
}
