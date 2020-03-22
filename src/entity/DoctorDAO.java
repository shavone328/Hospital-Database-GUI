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
public class DoctorDAO implements DAO<Doctor>
{ 
    public DoctorDAO() {
        
    }
    List<Doctor> doctors;
    /**
     * Get a single doctor entity as an author object
     * @param doctorID
     * @return 
     */
    @Override
    public Optional<Doctor> get(int doctorID) {
        DB db = DB.getInstance();
        ResultSet rs = null;
        try {
            String sql = "SELECT * FROM Doctors WHERE doctorID = ?";
            PreparedStatement stmt = db.getPreparedStatement(sql);
            stmt.setInt(1, doctorID);
            rs = stmt.executeQuery();
            Doctor doctor = null;
            while (rs.next()) {
                doctor = new Doctor(rs.getInt("doctorID"), rs.getString("firstName"), 
                        rs.getString("lastName"), rs.getString("location"), rs.getString("phoneNumber"), rs.getString("practice"));
            }
            return Optional.ofNullable(doctor);
        } catch (SQLException ex) {
            System.err.println(ex.toString());
            return null;
        }
    }
    
    /**
     * Get all doctor entities as a List
     * @return 
     */
    @Override
    public List<Doctor> getAll() {
        DB db = DB.getInstance();
        ResultSet rs = null;
        doctors = new ArrayList<>();
        try {
            String sql = "SELECT * FROM Doctors";
            rs = db.executeQuery(sql);
            Doctor doctor = null;
            while (rs.next()) {
                doctor = new Doctor(rs.getInt("doctorID"), rs.getString("firstName"), 
                        rs.getString("lastName"), rs.getString("location"), rs.getString("phoneNumber"), rs.getString("practice"));
                doctors.add(doctor);
            }
            return doctors;
        } catch (SQLException ex) {
            System.err.println(ex.toString());
            return null;
        }
    }
    
    /**
     * Insert an doctor object into author table
     * @param doctor 
     */
    @Override
    public void insert(Doctor doctor)
    {
        DB db = DB.getInstance();
        try {
            String sql = "INSERT INTO Doctors(doctorID, firstName, lastName, location, phoneNumber, practice) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = db.getPreparedStatement(sql);
            stmt.setInt(1, doctor.getDoctorID());
            stmt.setString(2, doctor.getFirstName());
            stmt.setString(3, doctor.getLastName());
            stmt.setString(4, doctor.getLocation());
            stmt.setString(5, doctor.getPhoneNumber());
            stmt.setString(6, doctor.getPractice());
            
            int rowInserted = stmt.executeUpdate();
            if (rowInserted > 0) {
                System.out.println("A new doctor was inserted successfully!");
            }
        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
    }
    
    /**
     * Update a doctor entity in database if it exists using a doctor object
     * @param doctor
     */ 
    @Override
    public void update(Doctor doctor) {
        DB db = DB.getInstance();
        try {
            String sql = "UPDATE Doctors SET firstName=?, lastName=?, location=?, phoneNumber=?, practice=?  WHERE doctorID=?";
            PreparedStatement stmt = db.getPreparedStatement(sql);
            stmt.setString(1, doctor.getFirstName());
            stmt.setString(2, doctor.getLastName());
            stmt.setString(3, doctor.getLocation());
            stmt.setString(4, doctor.getPhoneNumber());
            stmt.setString(5, doctor.getPractice());
            stmt.setInt(6, doctor.getDoctorID());
            int rowsUpdated = stmt.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("An existing doctor was updated successfully!");
            }
        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
    }
    
    /**
     * Delete a doctor from doctor table if the entity exists
     * @param author 
     */
    @Override
    public void delete(Doctor doctor) {
        DB db = DB.getInstance();
        try {
            String sql = "DELETE FROM Doctors WHERE doctorID = ?";
            PreparedStatement stmt = db.getPreparedStatement(sql);
            stmt.setInt(1, doctor.getDoctorID());
            int rowsDeleted = stmt.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("A doctor was deleted successfully!");
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
            String sql = "SELECT * FROM Doctors WHERE doctorID = -1";//We just need this sql query to get the column headers
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
