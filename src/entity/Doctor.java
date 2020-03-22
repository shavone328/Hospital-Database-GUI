package entity;

public class Doctor {
    private int doctorID;
    private String firstName;
    private String lastName;
    private String location;
    private String phoneNumber;
    private String practice;
    
    public Doctor(int doctorID, String firstName, String lastName, String location, String phoneNumber, String practice){
        this.doctorID = doctorID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.location = location;
        this.phoneNumber = phoneNumber;
        this.practice = practice;
    }
    
    public int getDoctorID(){
        return doctorID;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getLocation(){
        return location;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public String getPractice(){
        return practice;
    }
    
    @Override
    public String toString() {
        return "Doctors{" + "doctorID=" + doctorID + ", firstName=" + firstName 
                + ", lastName=" + lastName + ", location=" + location + ", phoneNumber=" 
                + phoneNumber + ", practice=" + practice + "}";
    }        
    
}
