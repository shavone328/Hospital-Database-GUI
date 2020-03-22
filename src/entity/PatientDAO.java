package entity;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import core.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
/**
 * 
 * @author sqj5338
 */
public class PatientDAO implements DAO<Patient>
{ 
    public PatientDAO() {
        
    }
    List<Patient> patients;
    /**
     * Get a single patient entity as an author object
     * @param patientID
     * @return 
     */
    @Override
    public Optional<Patient> get(int patientID) {
        DB db = DB.getInstance();
        ResultSet rs = null;
        try {
            String sql = "SELECT * FROM Patients WHERE patientID = ?";
            PreparedStatement stmt = db.getPreparedStatement(sql);
            stmt.setInt(1, patientID);
            rs = stmt.executeQuery();
            Patient patient = null;
            while (rs.next()) {
                patient = new Patient(rs.getInt("patientID"), rs.getString("firstName"), 
                        rs.getString("lastName"), rs.getString("dob"), rs.getString("gender"),
                        rs.getString("address"), rs.getString("phoneNumber"), rs.getString("insurancePlan"),
                        rs.getString("medicalHistory"), rs.getString("medications"));
            }
            return Optional.ofNullable(patient);
        } catch (SQLException ex) {
            System.err.println(ex.toString());
            return null;
        }
    }
    
    /**
     * Get all patient entities as a List
     * @return 
     */
    @Override
    public List<Patient> getAll() {
        DB db = DB.getInstance();
        ResultSet rs = null;
        patients = new ArrayList<>();
        try {
            String sql = "SELECT * FROM Patients";
            rs = db.executeQuery(sql);
            Patient patient = null;
            while (rs.next()) {
                patient = new Patient(rs.getInt("patientID"), rs.getString("firstName"), 
                        rs.getString("lastName"), rs.getString("dob"), rs.getString("gender"),
                        rs.getString("address"), rs.getString("phoneNumber"), rs.getString("insurancePlan"),
                        rs.getString("medicalHistory"), rs.getString("medications"));
                patients.add(patient);
            }
            return patients;
        } catch (SQLException ex) {
            System.err.println(ex.toString());
            return null;
        }
    }
    
    /**
     * Insert an patient object into author table
     * @param patient 
     */
    @Override
    public void insert(Patient patient)
    {
        DB db = DB.getInstance();
        try {
            String sql = "INSERT INTO Patients(patientID, firstName, lastName, dob, gender, address, phoneNumber, insurancePlan, medicalHistory, medications) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = db.getPreparedStatement(sql);
            stmt.setInt(1, patient.getPatientID());
            stmt.setString(2, patient.getFirstName());
            stmt.setString(3, patient.getLastName());
            stmt.setString(4, patient.getDateofBirth());
            stmt.setString(5, patient.getGender());
            stmt.setString(6, patient.getAddress());
            stmt.setString(7, patient.getPhoneNumber());
            stmt.setString(8, patient.getInsurancePlan());
            stmt.setString(9, patient.getMedicalHistory());
            stmt.setString(10, patient.getMedications());
            
            int rowInserted = stmt.executeUpdate();
            if (rowInserted > 0) {
                System.out.println("A new patient was inserted successfully!");
            }
        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
    }
    
    /**
     * Update a patient entity in database if it exists using a patient object
     * @param patient
     */ 
    @Override
    public void update(Patient patient) {
        DB db = DB.getInstance();
        try {
            String sql = "UPDATE Patients SET firstName=?, lastName=?, dob=?, gender=?, address=?, phoneNumber=?, insurancePlan=?, medicalHistory=?, medications=? WHERE patientID=?";
            PreparedStatement stmt = db.getPreparedStatement(sql);
            stmt.setString(1, patient.getFirstName());
            stmt.setString(2, patient.getLastName());
            stmt.setString(3, patient.getDateofBirth());
            stmt.setString(4, patient.getGender());
            stmt.setString(5, patient.getAddress());
            stmt.setString(6, patient.getPhoneNumber());
            stmt.setString(7, patient.getInsurancePlan());
            stmt.setString(8, patient.getMedicalHistory());
            stmt.setString(9, patient.getMedications());
            stmt.setInt(10, patient.getPatientID());
            int rowsUpdated = stmt.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("An existing patient was updated successfully!");
            }
        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
    }
    
    /**
     * Delete a patient from patient table if the entity exists
     * @param patient 
     */
    @Override
    public void delete(Patient patient) {
        DB db = DB.getInstance();
        try {
            String sql = "DELETE FROM Patients WHERE patientID = ?";
            PreparedStatement stmt = db.getPreparedStatement(sql);
            stmt.setInt(1, patient.getPatientID());
            int rowsDeleted = stmt.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("A patient was deleted successfully!");
            }
        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
    }
    
    /**
     * Get all column names in a list array
     * @return 
     */
    @Override
    public List<String> getColumnNames() {
        DB db = DB.getInstance();
        ResultSet rs = null;
        List<String> headers = new ArrayList<>();
        try {
            String sql = "SELECT * FROM Patients WHERE patientID = -1";//We just need this sql query to get the column headers
            rs = db.executeQuery(sql);
            ResultSetMetaData rsmd = rs.getMetaData();
            //Get number of columns in the result set
            int numberCols = rsmd.getColumnCount();
            for (int i = 1; i <= numberCols; i++) {
                headers.add(rsmd.getColumnLabel(i));//Add column headers to the list
            }
            return headers;
        } catch (SQLException ex) {
            System.err.println(ex.toString());
            return null;
        } 
    }
    
}