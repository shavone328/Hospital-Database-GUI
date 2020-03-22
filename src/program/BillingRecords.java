package program;
import javax.swing.table.DefaultTableModel;
import entity.*;
import java.util.List;
import java.util.Optional;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import entity.Billing;



public class BillingRecords extends javax.swing.JFrame {
    private static DAO billingDAO;
    private static DAO doctorDAO;
    private static DAO patientDAO;
    public BillingRecords() {
        initComponents();
        getContentPane().setBackground(new java.awt.Color(204, 204, 255));
        billingDAO = new BillingDAO();
        doctorDAO = new DoctorDAO();
        patientDAO = new PatientDAO();
        refreshBillingTable();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableBilling = new javax.swing.JTable();
        jLabelVisitID = new javax.swing.JLabel();
        jLabelVisitType = new javax.swing.JLabel();
        jLabelCoPay = new javax.swing.JLabel();
        jLabelDateofVisit = new javax.swing.JLabel();
        jLabelDoctorID = new javax.swing.JLabel();
        jLabelPatientID = new javax.swing.JLabel();
        jTextFieldVisitID = new javax.swing.JTextField();
        jTextFieldVisitType = new javax.swing.JTextField();
        jTextFieldCoPay = new javax.swing.JTextField();
        jTextFieldDateofVisit = new javax.swing.JTextField();
        jTextFieldDoctorID = new javax.swing.JTextField();
        jTextFieldPatientID = new javax.swing.JTextField();
        jButtonSave = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jMenuBar = new javax.swing.JMenuBar();
        jMenuOptions = new javax.swing.JMenu();
        jMenuItemRetrieveRecord = new javax.swing.JMenuItem();
        jMenuItemNewRecord = new javax.swing.JMenuItem();
        jMenuItemViewDoctors = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Billing Options");

        jTableBilling.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Visit ID", "Visit Type", "CoPay", "Date of Visit", "DoctorID", "Patient ID"
            }
        ));
        jTableBilling.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableBillingMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableBilling);

        jLabelVisitID.setText("Visit ID");

        jLabelVisitType.setText("Visit Type");

        jLabelCoPay.setText("Co-Pay");

        jLabelDateofVisit.setText("Date of Visit");

        jLabelDoctorID.setText("Doctor ID");

        jLabelPatientID.setText("Patient ID");

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

        jMenuOptions.setText("Options");

        jMenuItemRetrieveRecord.setText("Retrieve Patient Record");
        jMenuItemRetrieveRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRetrieveRecordActionPerformed(evt);
            }
        });
        jMenuOptions.add(jMenuItemRetrieveRecord);

        jMenuItemNewRecord.setText("Create a new patient record");
        jMenuItemNewRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNewRecordActionPerformed(evt);
            }
        });
        jMenuOptions.add(jMenuItemNewRecord);

        jMenuItemViewDoctors.setText("View Doctors");
        jMenuItemViewDoctors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemViewDoctorsActionPerformed(evt);
            }
        });
        jMenuOptions.add(jMenuItemViewDoctors);

        jMenuBar.add(jMenuOptions);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonSave)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonUpdate)
                        .addGap(26, 26, 26)
                        .addComponent(jButtonDelete))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelDateofVisit)
                                    .addComponent(jLabelDoctorID)
                                    .addComponent(jLabelPatientID)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelVisitType)
                                    .addComponent(jLabelVisitID)
                                    .addComponent(jLabelCoPay))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldVisitID, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(jTextFieldDoctorID)
                            .addComponent(jTextFieldDateofVisit)
                            .addComponent(jTextFieldCoPay)
                            .addComponent(jTextFieldVisitType)
                            .addComponent(jTextFieldPatientID))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelVisitID)
                    .addComponent(jTextFieldVisitID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelVisitType)
                    .addComponent(jTextFieldVisitType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCoPay)
                    .addComponent(jTextFieldCoPay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDateofVisit)
                    .addComponent(jTextFieldDateofVisit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDoctorID)
                    .addComponent(jTextFieldDoctorID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPatientID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPatientID))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSave)
                    .addComponent(jButtonUpdate)
                    .addComponent(jButtonDelete))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemRetrieveRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRetrieveRecordActionPerformed
        this.setVisible(false);
        new RetrieveRecord().setVisible(true);
    }//GEN-LAST:event_jMenuItemRetrieveRecordActionPerformed

    private void jMenuItemNewRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNewRecordActionPerformed
       this.setVisible(false);
        new NewRecord().setVisible(true);
    }//GEN-LAST:event_jMenuItemNewRecordActionPerformed

    private void jMenuItemViewDoctorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemViewDoctorsActionPerformed
        this.setVisible(false);
        new ViewDoctors().setVisible(true);
    }//GEN-LAST:event_jMenuItemViewDoctorsActionPerformed

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        // visit ID error handling
        if(!jTextFieldVisitID.getText().isEmpty()){
            try{
                Integer.parseInt(jTextFieldVisitID.getText().trim());
            }
            catch (NumberFormatException ex) {
                alert("ID Field must be an integer", "ID Violation");
            }}
        if(jTextFieldVisitID.getText().isEmpty()) {
            alert("ID Field cannot be empty","Insert Error");
        }
        if(jTextFieldVisitID.getText().length() > 10){
            alert("ID Field cannot greater than 10 digits.","Insert Error");
        }
        // visitType error handling
        if(jTextFieldVisitType.getText().length() > 30){
            alert("Field cannot be greater than 30 characters.","Insert Error");
        }
        //copay error handling
        if(!jTextFieldCoPay.getText().isEmpty()){
            try{
                Integer.parseInt(jTextFieldCoPay.getText().trim());
            }
            catch (NumberFormatException ex) {
                alert("Co-Pay Field must be an integer", "Input Value Violation");
            }}
        if(jTextFieldCoPay.getText().length() > 10){
            alert("Field cannot greater than 10 digits.","Insert Error");
        }
        //date of visit error handling
        if(jTextFieldDateofVisit.getText().length() > 30){
            alert("Field cannot greater than 30 characters.","Insert Error");
        }
        //doctorid error handling
        if(!jTextFieldDoctorID.getText().isEmpty()){
            try{
                Integer.parseInt(jTextFieldDoctorID.getText().trim());
            }
            catch (NumberFormatException ex) {
                alert("Doctor ID Field must be an integer", "Doctor ID Violation");
            }
        }
        if(jTextFieldDoctorID.getText().length() > 10){
            alert("Field cannot greater than 10 digits.","Insert Error");
        }
        //patientid error handling
        if(!jTextFieldPatientID.getText().isEmpty()){
           try{
                Integer.parseInt(jTextFieldPatientID.getText().trim());
            }
            catch (NumberFormatException ex) {
                alert("Patient ID Field must be an integer", "Doctor ID Violation");
            } 
        }
        if(jTextFieldPatientID.getText().length() > 10){
            alert("Field cannot greater than 10 digits.","Insert Error");
        }
        
        if(!jTextFieldVisitID.getText().isEmpty() && !jTextFieldVisitType.getText().isEmpty()
                && !jTextFieldCoPay.getText().isEmpty() && !jTextFieldDateofVisit.getText().isEmpty() 
                && !jTextFieldDoctorID.getText().isEmpty() && !jTextFieldPatientID.getText().isEmpty()){
            if(Integer.parseInt(jTextFieldVisitID.getText()) <= 0){
                alert("ID Field cannot be 0 or negative.","Insert Error");
            }
            if(Integer.parseInt(jTextFieldCoPay.getText()) <= 0){
                alert("Field cannot be 0 or negative.","Insert Error");
            }
            if(Integer.parseInt(jTextFieldDoctorID.getText()) <= 0){
                alert("Field cannot be 0 or negative.","Insert Error");
            }
            if(Integer.parseInt(jTextFieldPatientID.getText()) <= 0){
                alert("Field cannot be 0 or negative.","Insert Error");
            }
            else{
                int visitID = Integer.parseInt(jTextFieldVisitID.getText().trim());  //trim gets rid of space after entering something
                String visitType = jTextFieldVisitType.getText().trim();
                int copay = Integer.parseInt(jTextFieldCoPay.getText().trim());
                String dateofVisit = jTextFieldDateofVisit.getText().trim();
                int doctorID = Integer.parseInt(jTextFieldDoctorID.getText().trim());
                int patientID = Integer.parseInt(jTextFieldPatientID.getText().trim());
            
                Billing bill = getBilling(visitID);
                Doctor doctor = getDoctor(doctorID);
                Patient patient = getPatient(patientID);
                // also check if id is a number (code not written)
            
                if(bill.getVisitID() == -1)       // NO PK VIOLATION
                {
                    if(!jTextFieldDoctorID.getText().isEmpty() && !jTextFieldPatientID.getText().isEmpty()){
                        if(doctor.getDoctorID() != -1 & patient.getPatientID() != -1){
                            addBilling(visitID, visitType,copay, dateofVisit, doctorID, patientID);
                            refreshBillingTable();
                        }
                        else{
                           alert("DoctorID or PatientID does not exist", " Foreign ID Violation"); 
                        }
                    }
                    else{
                        alert("DoctorID and PatientID cannot be empty", "ID Violation");
                    }
                } 
                else{
                    alert("ID already exists","Primary Key Violation: Billing ID");
                }
            }
        }
        else{
           alert("Field cannot be empty.","Empty Field Violation"); 
        }
    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        // visit ID error handling
        if(!jTextFieldVisitID.getText().isEmpty()){
            try{
                Integer.parseInt(jTextFieldVisitID.getText().trim());
            }
            catch (NumberFormatException ex) {
                alert("ID Field must be an integer", "ID Violation");
            }}
        if(jTextFieldVisitID.getText().isEmpty()) {
            alert("ID Field cannot be empty","Insert Error");
        }
        if(jTextFieldVisitID.getText().length() > 10){
            alert("ID Field cannot greater than 10 digits.","Insert Error");
        }
        // visitType error handling
        if(jTextFieldVisitType.getText().length() > 30){
            alert("Field cannot be greater than 30 characters.","Insert Error");
        }
        //copay error handling
        if(!jTextFieldCoPay.getText().isEmpty()){
            try{
                Integer.parseInt(jTextFieldCoPay.getText().trim());
            }
            catch (NumberFormatException ex) {
                alert("Co-Pay Field must be an integer", "Input Value Violation");
            }}
        if(jTextFieldCoPay.getText().length() > 10){
            alert("Field cannot greater than 10 digits.","Insert Error");
        }
        //date of visit error handling
        if(jTextFieldDateofVisit.getText().length() > 30){
            alert("Field cannot greater than 30 characters.","Insert Error");
        }
        //doctorid error handling
        if(!jTextFieldDoctorID.getText().isEmpty()){
            try{
                Integer.parseInt(jTextFieldDoctorID.getText().trim());
            }
            catch (NumberFormatException ex) {
                alert("Doctor ID Field must be an integer", "Doctor ID Violation");
            }
        }
        if(jTextFieldDoctorID.getText().length() > 10){
            alert("Field cannot greater than 10 digits.","Update Error");
        }
        //patientid error handling
        if(!jTextFieldPatientID.getText().isEmpty()){
           try{
                Integer.parseInt(jTextFieldPatientID.getText().trim());
            }
            catch (NumberFormatException ex) {
                alert("Patient ID Field must be an integer", "Patient ID Violation");
            } 
        }
        if(jTextFieldPatientID.getText().length() > 10){
            alert("Field cannot greater than 10 digits.","Update Error");
        }
        
        if(!jTextFieldVisitID.getText().isEmpty() && !jTextFieldVisitType.getText().isEmpty()
                && !jTextFieldCoPay.getText().isEmpty() && !jTextFieldDateofVisit.getText().isEmpty() 
                && !jTextFieldDoctorID.getText().isEmpty() && !jTextFieldPatientID.getText().isEmpty()){
            if(Integer.parseInt(jTextFieldVisitID.getText()) <= 0){
                alert("ID Field cannot be 0 or negative.","Update Error");
            }
            if(Integer.parseInt(jTextFieldCoPay.getText()) <= 0){
                alert("Field cannot be 0 or negative.","Update Error");
            }
            if(Integer.parseInt(jTextFieldDoctorID.getText()) <= 0){
                alert("Field cannot be 0 or negative.","Update Error");
            }
            if(Integer.parseInt(jTextFieldPatientID.getText()) <= 0){
                alert("Field cannot be 0 or negative.","Update Error");
            }
            else{
                int visitID = Integer.parseInt(jTextFieldVisitID.getText().trim());  //trim gets rid of space after entering something
                String visitType = jTextFieldVisitType.getText().trim();
                int copay = Integer.parseInt(jTextFieldCoPay.getText().trim());
                String dateofVisit = jTextFieldDateofVisit.getText().trim();
                int doctorID = Integer.parseInt(jTextFieldDoctorID.getText().trim());
                int patientID = Integer.parseInt(jTextFieldPatientID.getText().trim());
                Billing bill = getBilling(visitID);
                Doctor doctor = getDoctor(doctorID);
                Patient patient = getPatient(patientID);
                if(bill.getVisitID() != -1) {
                    if(!jTextFieldDoctorID.getText().isEmpty() && !jTextFieldPatientID.getText().isEmpty()){
                        if(doctor.getDoctorID() != -1 & patient.getPatientID() != -1){
                        updateBilling(visitID, visitType,copay, dateofVisit, doctorID, patientID);
                        refreshBillingTable();
                        }
                        else{
                          alert("DoctorID or PatientID does not exist", "ID Violation");   
                        }
                    }
                    else{
                        alert("Visit ID does not exist", "Update Error");
                    }
                }
            }
        }
        else{
            alert("Field cannot be empty.","Empty Field Violation");
        }
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        // visit ID error handling
        if(!jTextFieldVisitID.getText().isEmpty()){
            try{
                Integer.parseInt(jTextFieldVisitID.getText().trim());
            }
            catch (NumberFormatException ex) {
                alert("ID Field must be an integer", "ID Violation");
            }}
        if(jTextFieldVisitID.getText().isEmpty()) {
            alert("ID Field cannot be empty","Delete Error");
        }
        if(jTextFieldVisitID.getText().length() > 10){
            alert("ID Field cannot greater than 10 digits.","Delete Error");
        }
        if(!jTextFieldVisitID.getText().isEmpty() && !jTextFieldVisitType.getText().isEmpty()
                && !jTextFieldCoPay.getText().isEmpty() && !jTextFieldDateofVisit.getText().isEmpty() 
                && !jTextFieldDoctorID.getText().isEmpty() && !jTextFieldPatientID.getText().isEmpty()){
            if(Integer.parseInt(jTextFieldVisitID.getText()) <= 0){
                alert("ID Field cannot be 0 or negative.","Delete Error");
            }
            else{
                int visitID = Integer.parseInt(jTextFieldVisitID.getText().trim());  //trim gets rid of space after entering something
                String visitType = jTextFieldVisitType.getText().trim();
                int copay = Integer.parseInt(jTextFieldCoPay.getText().trim());
                String dateofVisit = jTextFieldDateofVisit.getText().trim();
                int doctorID = Integer.parseInt(jTextFieldDoctorID.getText().trim());
                int patientID = Integer.parseInt(jTextFieldPatientID.getText().trim());
                Billing bill = getBilling(visitID);
            
                if(bill.getVisitID() != -1) {
                    int option = JOptionPane.showConfirmDialog(rootPane, "Are you sure you want to Delete?", "Delete confirmation", JOptionPane.YES_NO_OPTION);
                    if(option == 0) {
                        deleteBilling(visitID, visitType,copay, dateofVisit, doctorID, patientID);
                        refreshBillingTable();
                        clearTextFields();
                    }
                }
                else{
                    alert("Visit ID does not exist", "Delete Error");
                }
            }
        }
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jTableBillingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableBillingMouseClicked
        int i = jTableBilling.getSelectedRow();
        TableModel model = jTableBilling.getModel();
        jTextFieldVisitID.setText(model.getValueAt(i, 0).toString());
        jTextFieldVisitType.setText(model.getValueAt(i, 1).toString());
        jTextFieldCoPay.setText(model.getValueAt(i, 2).toString());
        jTextFieldDateofVisit.setText(model.getValueAt(i, 3).toString());
        jTextFieldDoctorID.setText(model.getValueAt(i, 4).toString());
        jTextFieldPatientID.setText(model.getValueAt(i, 5).toString());
    }//GEN-LAST:event_jTableBillingMouseClicked

    public void alert(String msg, String title) {
        JOptionPane.showMessageDialog(rootPane, msg, title, JOptionPane.ERROR_MESSAGE);}
        
    // Doctor CRUD
   private static void addBilling(int visitID, String visitType, int coPay, String dateofVisit, int doctorID, int patientID) {
        Billing bill;
        bill = new Billing(visitID, visitType, coPay, dateofVisit, doctorID, patientID);
        billingDAO.insert(bill);
    }
    
    private static void updateBilling(int visitID, String visitType, int coPay, String dateofVisit, int doctorID, int patientID) {
        Billing bill;
        bill = new Billing(visitID, visitType, coPay, dateofVisit, doctorID, patientID);
        billingDAO.update(bill);
    }
    
    private static void deleteBilling(int visitID, String visitType, int coPay, String dateofVisit, int doctorID, int patientID) {
        Billing bill;
        bill = new Billing(visitID, visitType, coPay, dateofVisit, doctorID, patientID);
        billingDAO.delete(bill);
    }
    static Billing getBilling(int visitID) {                       
        Optional<Billing> bill = billingDAO.get(visitID);
        return bill.orElseGet(() -> new Billing(-1, "Non-exist", -1, "Non-exist", -1, -1));
    }
    static Doctor getDoctor(int doctorID) {                       
        Optional<Doctor> doctor = doctorDAO.get(doctorID);
        return doctor.orElseGet(() -> new Doctor(-1, "Non-exist", "Non-exist", "Non-exist", "Non-exist", "Non-exist"));
    }
    static Patient getPatient(int patientID) {                       
        Optional<Patient> patient = patientDAO.get(patientID);
        return patient.orElseGet(() -> new Patient(-1, "Non-exist", "Non-exist", "Non-exist", "Non-exist", "Non-exist", "Non-exist", "Non-exist", "Non-exist", "Non-exist"));
    }
    private void refreshBillingTable() {
        List<Billing> bills = billingDAO.getAll();
        DefaultTableModel model = (DefaultTableModel) jTableBilling.getModel();
        //Clear all items in tblDoctors
        for(int i = model.getRowCount() - 1; i >= 0; i-- ) {
            model.removeRow(i);
        }
        for (Billing bill : bills) {
                Object[] row = new Object[6];
                row[0] = bill.getVisitID();
                row[1] = bill.getVisitType();
                row[2] = bill.getCoPay();
                row[3] = bill.getDateofVisit();
                row[4] = bill.getDoctorID();
                row[5] = bill.getPatientID();
                model.addRow(row);
        }
    }
    private void clearTextFields() {
        jTextFieldVisitID.setText("");
        jTextFieldVisitType.setText("");
        jTextFieldCoPay.setText("");
        jTextFieldDateofVisit.setText("");
        jTextFieldDoctorID.setText("");
        jTextFieldPatientID.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JLabel jLabelCoPay;
    private javax.swing.JLabel jLabelDateofVisit;
    private javax.swing.JLabel jLabelDoctorID;
    private javax.swing.JLabel jLabelPatientID;
    private javax.swing.JLabel jLabelVisitID;
    private javax.swing.JLabel jLabelVisitType;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenuItem jMenuItemNewRecord;
    private javax.swing.JMenuItem jMenuItemRetrieveRecord;
    private javax.swing.JMenuItem jMenuItemViewDoctors;
    private javax.swing.JMenu jMenuOptions;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableBilling;
    private javax.swing.JTextField jTextFieldCoPay;
    private javax.swing.JTextField jTextFieldDateofVisit;
    private javax.swing.JTextField jTextFieldDoctorID;
    private javax.swing.JTextField jTextFieldPatientID;
    private javax.swing.JTextField jTextFieldVisitID;
    private javax.swing.JTextField jTextFieldVisitType;
    // End of variables declaration//GEN-END:variables
}
