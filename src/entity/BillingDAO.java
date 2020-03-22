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
public class BillingDAO implements DAO<Billing>
{ 
    public BillingDAO() {
        
    }
    List<Billing> bills;
    /**
     * Get a single bill entity as an billing object
     * @param bills
     * @return 
     */
    @Override
    public Optional<Billing> get(int visitID) {
        DB db = DB.getInstance();
        ResultSet rs = null;
        try {
            String sql = "SELECT * FROM Billing WHERE visitID= ?";
            PreparedStatement stmt = db.getPreparedStatement(sql);
            stmt.setInt(1, visitID);
            rs = stmt.executeQuery();
            Billing bill = null;
            while (rs.next()) {
                bill = new Billing(rs.getInt("visitID"), rs.getString("visitType"), rs.getInt("coPay"), rs.getString("dateofVisit"), rs.getInt("doctorID"), rs.getInt("patientID"));
            }
            return Optional.ofNullable(bill);
        } catch (SQLException ex) {
            System.err.println(ex.toString());
            return null;
        }
    }
    
    /**
     * Get all book entities as a List
     * @return 
     */
    @Override
    public List<Billing> getAll() {
        DB db = DB.getInstance();
        ResultSet rs = null;
        bills = new ArrayList<>();
        try {
            String sql = "SELECT * FROM Billing";
            rs = db.executeQuery(sql);
            Billing bill = null;
            while (rs.next()) {
                bill = new Billing(rs.getInt("visitID"), rs.getString("visitType"), rs.getInt("coPay"), rs.getString("dateofVisit"), rs.getInt("doctorID"), rs.getInt("patientID"));
                bills.add(bill);
            }
            return bills;
        } catch (SQLException ex) {
            System.err.println(ex.toString());
            return null;
        }
    }
    
    /**
     * Insert a bill object into billing table
     * @param bill 
     */
    @Override
    public void insert(Billing bill)
    {
        DB db = DB.getInstance();
        try {
            String sql = "INSERT INTO Billing(visitID, visitType, coPay, dateofVisit, doctorID, patientID) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = db.getPreparedStatement(sql);
            stmt.setInt(1, bill.getVisitID());
            stmt.setString(2, bill.getVisitType());
            stmt.setInt(3, bill.getCoPay());
            stmt.setString(4, bill.getDateofVisit());
            stmt.setInt(5, bill.getDoctorID());
            stmt.setInt(6, bill.getPatientID());
            
            int rowInserted = stmt.executeUpdate();
            if (rowInserted > 0) {
                System.out.println("A new entry was inserted successfully!");
            }
        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
    }
    
    /**
     * Update a book entity in database if it exists using a book object
     * @param bill
     */
    @Override
    public void update(Billing bill) {
        DB db = DB.getInstance();
        try {
            String sql = "UPDATE Billing SET visitType=?, coPay=?, dateofVisit=?, doctorID=?, patientID=? WHERE visitID=?";
            PreparedStatement stmt = db.getPreparedStatement(sql);
            stmt.setString(1, bill.getVisitType());
            stmt.setInt(2, bill.getCoPay());
            stmt.setString(3, bill.getDateofVisit());
            stmt.setInt(4, bill.getDoctorID());
            stmt.setInt(5, bill.getPatientID());
            stmt.setInt(6, bill.getVisitID());
            int rowsUpdated = stmt.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("An existing entry was updated successfully!");
            }
        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
    }
    
    /**
     * Delete an entry from billing table if the entity exists
     * @param bill 
     */
    @Override
    public void delete(Billing bill) {
        DB db = DB.getInstance();
        try {
            String sql = "DELETE FROM Billing WHERE visitID = ?";
            PreparedStatement stmt = db.getPreparedStatement(sql);
            stmt.setInt(1, bill.getVisitID());
            int rowsDeleted = stmt.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("An entry was deleted successfully!");
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
            String sql = "SELECT * FROM Billing WHERE visitID = -1";//We just need this sql query to get the column headers
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
