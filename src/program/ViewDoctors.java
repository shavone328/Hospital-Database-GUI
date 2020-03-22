package program;
import entity.Doctor;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import entity.*;
import java.util.Optional;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;


public class ViewDoctors extends javax.swing.JFrame {
    private static DAO doctorDAO;
    
    public ViewDoctors() {
        initComponents();
        getContentPane().setBackground(new java.awt.Color(204, 204, 255));
        doctorDAO = new DoctorDAO();
        refreshDoctorsTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDoctors = new javax.swing.JTable();
        jLabelDoctorID = new javax.swing.JLabel();
        jLabelFirstName = new javax.swing.JLabel();
        jLabelLastName = new javax.swing.JLabel();
        jLabelLocation = new javax.swing.JLabel();
        jLabelPhoneNumber = new javax.swing.JLabel();
        jLabelPractice = new javax.swing.JLabel();
        jTextFieldDoctorID = new javax.swing.JTextField();
        jTextFieldFirstName = new javax.swing.JTextField();
        jTextFieldLastName = new javax.swing.JTextField();
        jTextFieldLocation = new javax.swing.JTextField();
        jTextFieldPhoneNumber = new javax.swing.JTextField();
        jTextFieldPractice = new javax.swing.JTextField();
        jButtonSave = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jMenuBar = new javax.swing.JMenuBar();
        jMenuOption = new javax.swing.JMenu();
        jMenuItemCreateRecord = new javax.swing.JMenuItem();
        jMenuItemRetrieveRecord = new javax.swing.JMenuItem();
        jMenuItemBilling = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Doctors");

        jTableDoctors.setBackground(new java.awt.Color(204, 204, 255));
        jTableDoctors.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Doctor ID", "First Name", "Last Name", "Location", "Phone Number", "Practice"
            }
        ));
        jTableDoctors.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableDoctorsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableDoctors);

        jLabelDoctorID.setText("Doctor ID:");

        jLabelFirstName.setText("First Name:");

        jLabelLastName.setText("Last Name:");

        jLabelLocation.setText("Location:");

        jLabelPhoneNumber.setText("Phone Number:");

        jLabelPractice.setText("Practice:");

        jButtonSave.setText("Save");
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });

        jButtonUpdate.setText("Update");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });

        jButtonDelete.setText("Delete");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        jMenuOption.setText("Options");

        jMenuItemCreateRecord.setText("Create New Patient Record");
        jMenuItemCreateRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCreateRecordActionPerformed(evt);
            }
        });
        jMenuOption.add(jMenuItemCreateRecord);

        jMenuItemRetrieveRecord.setText("Retrieve Patient Record");
        jMenuItemRetrieveRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRetrieveRecordActionPerformed(evt);
            }
        });
        jMenuOption.add(jMenuItemRetrieveRecord);

        jMenuItemBilling.setText("View Billing Records");
        jMenuItemBilling.setToolTipText("");
        jMenuItemBilling.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemBillingActionPerformed(evt);
            }
        });
        jMenuOption.add(jMenuItemBilling);

        jMenuBar.add(jMenuOption);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelPhoneNumber)
                                .addComponent(jLabelDoctorID, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelLastName)
                                    .addComponent(jLabelFirstName))
                                .addComponent(jLabelPractice, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabelLocation, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldFirstName)
                            .addComponent(jTextFieldPractice)
                            .addComponent(jTextFieldPhoneNumber)
                            .addComponent(jTextFieldLocation)
                            .addComponent(jTextFieldLastName)
                            .addComponent(jTextFieldDoctorID, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonSave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonDelete)
                        .addGap(17, 17, 17)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDoctorID)
                    .addComponent(jTextFieldDoctorID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelFirstName)
                    .addComponent(jTextFieldFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLastName)
                    .addComponent(jTextFieldLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelLocation)
                    .addComponent(jTextFieldLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPhoneNumber)
                    .addComponent(jTextFieldPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPractice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPractice))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSave)
                    .addComponent(jButtonUpdate)
                    .addComponent(jButtonDelete))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemCreateRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCreateRecordActionPerformed
        this.setVisible(false);
        new NewRecord().setVisible(true);
    }//GEN-LAST:event_jMenuItemCreateRecordActionPerformed

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        //doctorid error handling
        if(!jTextFieldDoctorID.getText().isEmpty()){
            try{
                Integer.parseInt(jTextFieldDoctorID.getText().trim());
            }
            catch (NumberFormatException ex) {
                alert("ID Field must be an integer", "ID Violation");
            }
        }
        if(jTextFieldDoctorID.getText().isEmpty()) {
            alert("ID Field cannot be empty","Insert Error");
        }
        if(jTextFieldDoctorID.getText().length() > 10) {
            alert("ID Field cannot be greater than 10 digits","Insert Error");
        }
        
        //firstname error handling
        if(jTextFieldFirstName.getText().length() > 30) {
            alert("Field cannot be greater than 30 characters","Insert Error");
        }
        //lastname error handling
        if(jTextFieldLastName.getText().length() > 30) {
            alert("Field cannot be greater than 30 characters","Insert Error");
        }
        //location error handling
        if(jTextFieldLocation.getText().length() > 30) {
            alert("Field cannot be greater than 30 characters","Insert Error");
        }
        //phonenumber error handling
        if(jTextFieldFirstName.getText().length() > 15) {
            alert("Field cannot be greater than 15 characters","Insert Error");
        }
        //pracice error handling
        if(jTextFieldFirstName.getText().length() > 30) {
            alert("Field cannot be greater than 30 characters","Insert Error");
        }
        if(!jTextFieldDoctorID.getText().isEmpty() && !jTextFieldFirstName.getText().isEmpty()
                && !jTextFieldLastName.getText().isEmpty() && !jTextFieldLocation.getText().isEmpty()
                && !jTextFieldPhoneNumber.getText().isEmpty() && !jTextFieldPractice.getText().isEmpty()){
            if(Integer.parseInt(jTextFieldDoctorID.getText()) <=0) {
                alert("ID Field cannot be 0 or negative","Insert Error");
            }
            else{
                int doctorID = Integer.parseInt(jTextFieldDoctorID.getText().trim());  //trim gets rid of space after entering something
                String firstName = jTextFieldFirstName.getText().trim();
                String lastName = jTextFieldLastName.getText().trim();
                String location = jTextFieldLocation.getText().trim();
                String phoneNumber = jTextFieldPhoneNumber.getText().trim();
                String practice = jTextFieldPractice.getText().trim();
                Doctor doctor = getDoctor(doctorID);
                // also check if id is a number (code not written)
            
                if(doctor.getDoctorID() == -1)       // NO PK VIOLATION
                {
                    addDoctor(doctorID, firstName, lastName, location, phoneNumber, practice);
                    refreshDoctorsTable();
                }
                else{
                    alert("ID already exists","Primary Key Violation: Doctor ID");
                }
            }
        }
        else{
            alert("Field cannot be empty.", "Empty Field Violation");
        }
    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
       //doctorid error handling
        if(!jTextFieldDoctorID.getText().isEmpty()){
            try{
                Integer.parseInt(jTextFieldDoctorID.getText().trim());
            }
            catch (NumberFormatException ex) {
                alert("ID Field must be an integer", "ID Violation");
            }
        }
        if(jTextFieldDoctorID.getText().isEmpty()) {
            alert("ID Field cannot be empty","Update Error");
        }
        if(jTextFieldDoctorID.getText().length() > 10) {
            alert("ID Field cannot be greater than 10 digits","Update Error");
        }
        //firstname error handling
        if(jTextFieldFirstName.getText().length() > 30) {
            alert("Field cannot be greater than 30 characters","Update Error");
        }
        //lastname error handling
        if(jTextFieldLastName.getText().length() > 30) {
            alert("Field cannot be greater than 30 characters","Update Error");
        }
        //location error handling
        if(jTextFieldLocation.getText().length() > 30) {
            alert("Field cannot be greater than 30 characters","Update Error");
        }
        //phonenumber error handling
        if(jTextFieldFirstName.getText().length() > 15) {
            alert("Field cannot be greater than 15 characters","Update Error");
        }
        //pracice error handling
        if(jTextFieldFirstName.getText().length() > 30) {
            alert("Field cannot be greater than 30 characters","Update Error");
        }
        if(!jTextFieldDoctorID.getText().isEmpty() && !jTextFieldFirstName.getText().isEmpty()
                && !jTextFieldLastName.getText().isEmpty() && !jTextFieldLocation.getText().isEmpty()
                && !jTextFieldPhoneNumber.getText().isEmpty() && !jTextFieldPractice.getText().isEmpty()){
            if(Integer.parseInt(jTextFieldDoctorID.getText()) <=0) {
                alert("ID Field cannot be 0 or negative","Update Error");
            }
            else{
                int doctorID = Integer.parseInt(jTextFieldDoctorID.getText().trim());
                String fName = jTextFieldFirstName.getText().trim();
                String lName = jTextFieldLastName.getText().trim();
                String location = jTextFieldLocation.getText().trim();
                String phoneNumber = jTextFieldPhoneNumber.getText().trim();
                String practice = jTextFieldPractice.getText().trim();
                Doctor doctor = getDoctor(doctorID);
                if(doctor.getDoctorID() != -1) {
                    updateDoctor(doctorID, fName, lName,location, phoneNumber, practice);
                    refreshDoctorsTable();
                }
                else
                {
                    alert("Doctor does not exist", "Update Error");
                }
            }
        }
        else{
            alert("Field cannot be empty.", "Empty Field Violation");
        }
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        //doctorid error handling
        if(!jTextFieldDoctorID.getText().isEmpty()) {
            try{
                int doctorID = Integer.parseInt(jTextFieldDoctorID.getText().trim());
            }
            catch (NumberFormatException ex) {
                alert("ID Field must be an integer", "ID Violation");
            }
        }
        if(jTextFieldDoctorID.getText().isEmpty()) {
            alert("ID Field cannot be empty","Delete Error");
        }
        if(jTextFieldDoctorID.getText().length() > 10) {
            alert("ID Field cannot be greater than 10 digits","Delete Error");
        }
        if(!jTextFieldDoctorID.getText().isEmpty() && !jTextFieldFirstName.getText().isEmpty()
                && !jTextFieldLastName.getText().isEmpty() && !jTextFieldLocation.getText().isEmpty()
                && !jTextFieldPhoneNumber.getText().isEmpty() && !jTextFieldPractice.getText().isEmpty()){
            if(Integer.parseInt(jTextFieldDoctorID.getText()) <=0) {
                alert("ID Field cannot be 0 or negative","Delete Error");
            }
            else{
                int doctorID = Integer.parseInt(jTextFieldDoctorID.getText().trim());
                String fName = jTextFieldFirstName.getText().trim();
                String lName = jTextFieldLastName.getText().trim();
                String location = jTextFieldLocation.getText().trim();
                String phoneNumber = jTextFieldPhoneNumber.getText().trim();
                String practice = jTextFieldPractice.getText().trim();
                Doctor doctor = getDoctor(doctorID);
                if(doctor.getDoctorID() != -1) {
                    int option = JOptionPane.showConfirmDialog(rootPane, "Are you sure you want to Delete?", "Delete confirmation", JOptionPane.YES_NO_OPTION);
                    if(option == 0) {
                        deleteDoctor(doctorID, fName, lName, location, phoneNumber, practice);
                        refreshDoctorsTable();
                        clearTextFields();
                    }
                }
                else{
                    alert("Doctor does not exist", "Delete Error");
                }
            }
        }
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jMenuItemRetrieveRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRetrieveRecordActionPerformed
        this.setVisible(false);
        new RetrieveRecord().setVisible(true);
    }//GEN-LAST:event_jMenuItemRetrieveRecordActionPerformed

    private void jTableDoctorsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableDoctorsMouseClicked
        int i = jTableDoctors.getSelectedRow();
        TableModel model = jTableDoctors.getModel();
        jTextFieldDoctorID.setText(model.getValueAt(i, 0).toString());
        jTextFieldFirstName.setText(model.getValueAt(i, 1).toString());
        jTextFieldLastName.setText(model.getValueAt(i, 2).toString());
        jTextFieldLocation.setText(model.getValueAt(i, 3).toString());
        jTextFieldPhoneNumber.setText(model.getValueAt(i, 4).toString());
        jTextFieldPractice.setText(model.getValueAt(i, 5).toString());
    }//GEN-LAST:event_jTableDoctorsMouseClicked

    private void jMenuItemBillingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemBillingActionPerformed
        this.setVisible(false);
        new BillingRecords().setVisible(true);
    }//GEN-LAST:event_jMenuItemBillingActionPerformed

    public void alert(String msg, String title) {
        JOptionPane.showMessageDialog(rootPane, msg, title, JOptionPane.ERROR_MESSAGE);}
        
    // Doctor CRUD
   private static void addDoctor(int doctorID, String firstName, String lastName, String location, String phoneNumber, String practice) {
        Doctor doctor;
        doctor = new Doctor(doctorID, firstName, lastName, location, phoneNumber, practice);
        doctorDAO.insert(doctor);
    }
    
    private static void updateDoctor(int doctorID, String firstName, String lastName, String location, String phoneNumber, String practice) {
        Doctor doctor;
        doctor = new Doctor(doctorID, firstName, lastName, location, phoneNumber, practice);
        doctorDAO.update(doctor);
    }
    
    private static void deleteDoctor(int doctorID, String firstName, String lastName, String location, String phoneNumber, String practice) {
        Doctor doctor;
        doctor = new Doctor(doctorID, firstName, lastName, location, phoneNumber, practice);
        doctorDAO.delete(doctor);
    }
    static Doctor getDoctor(int doctorID) {                       
        Optional<Doctor> doctor = doctorDAO.get(doctorID);
        return doctor.orElseGet(() -> new Doctor(-1, "Non-exist", "Non-exist", "Non-exist", "Non-exist", "Non-exist"));
    }
    
    private void refreshDoctorsTable() {
        List<Doctor> doctors = doctorDAO.getAll();
        DefaultTableModel model = (DefaultTableModel) jTableDoctors.getModel();
        //Clear all items in tblDoctors
        for(int i = model.getRowCount() - 1; i >= 0; i-- ) {
            model.removeRow(i);
        }
        for (Doctor doctor : doctors) {
                Object[] row = new Object[6];
                row[0] = doctor.getDoctorID();
                row[1] = doctor.getFirstName();
                row[2] = doctor.getLastName();
                row[3] = doctor.getLocation();
                row[4] = doctor.getPhoneNumber();
                row[5] = doctor.getPractice();
                model.addRow(row);
        }
    }
    private void clearTextFields() {
        jTextFieldDoctorID.setText("");
        jTextFieldFirstName.setText("");
        jTextFieldLastName.setText("");
        jTextFieldLocation.setText("");
        jTextFieldPhoneNumber.setText("");
        jTextFieldPractice.setText("");
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JLabel jLabelDoctorID;
    private javax.swing.JLabel jLabelFirstName;
    private javax.swing.JLabel jLabelLastName;
    private javax.swing.JLabel jLabelLocation;
    private javax.swing.JLabel jLabelPhoneNumber;
    private javax.swing.JLabel jLabelPractice;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenuItem jMenuItemBilling;
    private javax.swing.JMenuItem jMenuItemCreateRecord;
    private javax.swing.JMenuItem jMenuItemRetrieveRecord;
    private javax.swing.JMenu jMenuOption;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableDoctors;
    private javax.swing.JTextField jTextFieldDoctorID;
    private javax.swing.JTextField jTextFieldFirstName;
    private javax.swing.JTextField jTextFieldLastName;
    private javax.swing.JTextField jTextFieldLocation;
    private javax.swing.JTextField jTextFieldPhoneNumber;
    private javax.swing.JTextField jTextFieldPractice;
    // End of variables declaration//GEN-END:variables
}
