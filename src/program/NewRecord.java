package program;
import entity.Patient;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import entity.*;
import java.util.Optional;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;

public class NewRecord extends javax.swing.JFrame {
    private static DAO patientDAO;
    
    public NewRecord() {
        initComponents();
        getContentPane().setBackground(new java.awt.Color(204, 204, 255));
        patientDAO = new PatientDAO();
        refreshPatientsTable();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePatients = new javax.swing.JTable();
        jLabelPatientID = new javax.swing.JLabel();
        jLabelFirstName = new javax.swing.JLabel();
        jLabelLastName = new javax.swing.JLabel();
        jLabelDOB = new javax.swing.JLabel();
        jLabelGender = new javax.swing.JLabel();
        jLabelAddress = new javax.swing.JLabel();
        jLabelPhoneNumber = new javax.swing.JLabel();
        jLabelInsurancePlan = new javax.swing.JLabel();
        jLabelMedicalHistory = new javax.swing.JLabel();
        jLabelMedications = new javax.swing.JLabel();
        jTextFieldPatientID = new javax.swing.JTextField();
        jTextFieldFirstName = new javax.swing.JTextField();
        jTextFieldLastName = new javax.swing.JTextField();
        jTextFieldDOB = new javax.swing.JTextField();
        jTextFieldGender = new javax.swing.JTextField();
        jTextFieldAddress = new javax.swing.JTextField();
        jTextFieldPhoneNumber = new javax.swing.JTextField();
        jTextFieldInsurancePlan = new javax.swing.JTextField();
        jTextFieldMedications = new javax.swing.JTextField();
        jButtonSave = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaMedicalHistory = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuOptions = new javax.swing.JMenu();
        jMenuItemRetrieveRecord = new javax.swing.JMenuItem();
        jMenuItemViewDoctors = new javax.swing.JMenuItem();
        jMenuItemBilling = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("New Patient  Record");
        setBackground(new java.awt.Color(204, 204, 255));

        jTablePatients.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Patient ID", "First Name", "Last Name", "DOB", "Gender", "Address", "Phone Number", "Insurance Plan", "Medical History", "Medications"
            }
        ));
        jTablePatients.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePatientsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablePatients);

        jLabelPatientID.setText("Patient ID");

        jLabelFirstName.setText("First Name");

        jLabelLastName.setText("Last Name");

        jLabelDOB.setText("DOB");

        jLabelGender.setText("Gender");

        jLabelAddress.setText("Address");

        jLabelPhoneNumber.setText("Phone Number");

        jLabelInsurancePlan.setText("Insurance Plan");

        jLabelMedicalHistory.setText("Medical History");

        jLabelMedications.setText("Medications");

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

        jLabel1.setText("Please enter N/A if not applicable.");

        jTextAreaMedicalHistory.setColumns(20);
        jTextAreaMedicalHistory.setRows(5);
        jScrollPane2.setViewportView(jTextAreaMedicalHistory);

        jMenuOptions.setText("Options");

        jMenuItemRetrieveRecord.setText("Retrieve a Record");
        jMenuItemRetrieveRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRetrieveRecordActionPerformed(evt);
            }
        });
        jMenuOptions.add(jMenuItemRetrieveRecord);

        jMenuItemViewDoctors.setText("View Doctors");
        jMenuItemViewDoctors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemViewDoctorsActionPerformed(evt);
            }
        });
        jMenuOptions.add(jMenuItemViewDoctors);

        jMenuItemBilling.setText("View Billing Records");
        jMenuItemBilling.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemBillingActionPerformed(evt);
            }
        });
        jMenuOptions.add(jMenuItemBilling);

        jMenuBar1.add(jMenuOptions);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jButtonSave)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonUpdate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonDelete)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabelMedications)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldMedications))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabelMedicalHistory)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabelPatientID)
                                .addGap(8, 8, 8))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelLastName)
                                    .addComponent(jLabelFirstName)
                                    .addComponent(jLabelDOB)
                                    .addComponent(jLabelGender)
                                    .addComponent(jLabelAddress)
                                    .addComponent(jLabelPhoneNumber)
                                    .addComponent(jLabelInsurancePlan))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldPatientID)
                            .addComponent(jTextFieldFirstName)
                            .addComponent(jTextFieldLastName)
                            .addComponent(jTextFieldDOB)
                            .addComponent(jTextFieldGender)
                            .addComponent(jTextFieldAddress)
                            .addComponent(jTextFieldPhoneNumber)
                            .addComponent(jTextFieldInsurancePlan, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPatientID)
                    .addComponent(jTextFieldPatientID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelFirstName)
                    .addComponent(jTextFieldFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLastName)
                    .addComponent(jTextFieldLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDOB)
                    .addComponent(jTextFieldDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelGender)
                    .addComponent(jTextFieldGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAddress)
                    .addComponent(jTextFieldAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPhoneNumber)
                    .addComponent(jTextFieldPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelInsurancePlan)
                    .addComponent(jTextFieldInsurancePlan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelMedicalHistory)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldMedications, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelMedications))))
                .addGap(18, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSave)
                    .addComponent(jButtonUpdate)
                    .addComponent(jButtonDelete))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTablePatientsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePatientsMouseClicked
        int i = jTablePatients.getSelectedRow();
        TableModel model = jTablePatients.getModel();
        jTextFieldPatientID.setText(model.getValueAt(i, 0).toString());
        jTextFieldFirstName.setText(model.getValueAt(i, 1).toString());
        jTextFieldLastName.setText(model.getValueAt(i, 2).toString());
        jTextFieldDOB.setText(model.getValueAt(i, 3).toString());
        jTextFieldGender.setText(model.getValueAt(i, 4).toString());
        jTextFieldAddress.setText(model.getValueAt(i, 5).toString());
        jTextFieldPhoneNumber.setText(model.getValueAt(i, 6).toString());
        jTextFieldInsurancePlan.setText(model.getValueAt(i, 7).toString());
        jTextAreaMedicalHistory.setText(model.getValueAt(i, 8).toString());
        jTextFieldMedications.setText(model.getValueAt(i, 9).toString());
    }//GEN-LAST:event_jTablePatientsMouseClicked

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        //patientid error handling
        if(!jTextFieldPatientID.getText().isEmpty()) {
            try{
                Integer.parseInt(jTextFieldPatientID.getText().trim());
            }
            catch (NumberFormatException e) {
                alert("ID Field must be an integer", "ID Violation");
            }
        }
        if(jTextFieldPatientID.getText().isEmpty()) {
            alert("ID Field cannot be empty","Insert Error");
        }
        if(jTextFieldPatientID.getText().length() > 10){
            alert("ID Field cannot greater than 10 digits.","Insert Error");
        }
        
        // firstname error handling
        if(jTextFieldFirstName.getText().length() > 30){
            alert("Field cannot greater than 30 characters.","Insert Error");
        }
        //lastname error handling
        if(jTextFieldLastName.getText().length() > 30){
            alert("Field cannot greater than 30 characters.","Insert Error");
        }
        // dob error handling
        if(jTextFieldDOB.getText().length() > 10){
            alert("Field cannot greater than 10 characters.","Insert Error");
        }
        //gender error handling
        if(jTextFieldGender.getText().length() > 15){
            alert("Field cannot greater than 15 characters.","Insert Error");
        }
        //address error handling
        if(jTextFieldAddress.getText().length() > 60){
            alert("Field cannot greater than 60 characters.","Insert Error");
        }
        //phoneNumber error handling
        if(jTextFieldPhoneNumber.getText().length() > 15){
            alert("Field cannot greater than 15 characters.","Insert Error");
        }
        //insurancePlan error handling
        if(jTextFieldInsurancePlan.getText().length() > 50){
            alert("Field cannot greater than 50 characters.","Insert Error");
        }
        //medicalHistory error handling
        if(jTextAreaMedicalHistory.getText().length() > 300){
            alert("Field cannot greater than 300 characters.","Insert Error");
        }
        //medications error handling
        if(jTextFieldMedications.getText().length() > 100){
            alert("Field cannot greater than 100 characters.","Insert Error");
        }
        if(!jTextFieldPatientID.getText().isEmpty() && !jTextFieldFirstName.getText().isEmpty()
                && !jTextFieldLastName.getText().isEmpty() && !jTextFieldDOB.getText().isEmpty()
                && !jTextFieldGender.getText().isEmpty() && !jTextFieldAddress.getText().isEmpty()
                && !jTextFieldPhoneNumber.getText().isEmpty() && !jTextFieldInsurancePlan.getText().isEmpty()
                && !jTextAreaMedicalHistory.getText().isEmpty() && !jTextFieldMedications.getText().isEmpty()){
            if(Integer.parseInt(jTextFieldPatientID.getText()) <= 0){
                alert("ID Field be 0 or negative.","Insert Error");
            }
            else{
            int patientID = Integer.parseInt(jTextFieldPatientID.getText().trim());  //trim gets rid of space after entering something
            String firstName = jTextFieldFirstName.getText().trim();
            String lastName = jTextFieldLastName.getText().trim();
            String dob = jTextFieldDOB.getText().trim();
            String gender = jTextFieldGender.getText().trim();
            String address = jTextFieldAddress.getText().trim();
            String phoneNumber = jTextFieldPhoneNumber.getText().trim();
            String insurancePlan = jTextFieldInsurancePlan.getText().trim();
            String medicalHistory = jTextAreaMedicalHistory.getText().trim();
            String medications = jTextFieldMedications.getText().trim();
            
            Patient patient = getPatient(patientID);
            // also check if id is a number (code not written)
            
                if(patient.getPatientID() == -1)       // NO PK VIOLATION
                {
                    addPatient(patientID, firstName, lastName, dob, gender, address, phoneNumber, insurancePlan, medicalHistory, medications);
                    refreshPatientsTable();
                }
                else{
                    alert("ID already exists","Primary Key Violation: Patient ID");
                }
            }
        }
        else{
            alert("Field cannot be empty", "Insert error");
        }
    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void jMenuItemBillingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemBillingActionPerformed
        this.setVisible(false);
        new BillingRecords().setVisible(true);
    }//GEN-LAST:event_jMenuItemBillingActionPerformed

    private void jMenuItemViewDoctorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemViewDoctorsActionPerformed
        this.setVisible(false);
        new ViewDoctors().setVisible(true);
    }//GEN-LAST:event_jMenuItemViewDoctorsActionPerformed

    private void jMenuItemRetrieveRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRetrieveRecordActionPerformed
        this.setVisible(false);
        new RetrieveRecord().setVisible(true);
    }//GEN-LAST:event_jMenuItemRetrieveRecordActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        //patientid error handling
        if(!jTextFieldPatientID.getText().isEmpty()) {
            try{
                Integer.parseInt(jTextFieldPatientID.getText().trim());
            }
            catch (NumberFormatException e) {
                alert("ID Field must be an integer", "ID Violation");
            }
        }
        if(jTextFieldPatientID.getText().isEmpty()) {
            alert("ID Field cannot be empty","Update Error");
        }
        if(jTextFieldPatientID.getText().length() > 10){
            alert("ID Field cannot greater than 10 digits.","Update Error");
        }
        // firstname error handling
        if(jTextFieldFirstName.getText().length() > 30){
            alert("Field cannot greater than 30 characters.","Update Error");
        }
        //lastname error handling
        if(jTextFieldLastName.getText().length() > 30){
            alert("Field cannot greater than 30 characters.","Update Error");
        }
        // dob error handling
        if(jTextFieldDOB.getText().length() > 10){
            alert("Field cannot greater than 10 characters.","Update Error");
        }
        //gender error handling
        if(jTextFieldGender.getText().length() > 15){
            alert("Field cannot greater than 15 characters.","Update Error");
        }
        //address error handling
        if(jTextFieldAddress.getText().length() > 60){
            alert("Field cannot greater than 60 characters.","Update Error");
        }
        //phoneNumber error handling
        if(jTextFieldPhoneNumber.getText().length() > 15){
            alert("Field cannot greater than 15 characters.","Update Error");
        }
        //insurancePlan error handling
        if(jTextFieldInsurancePlan.getText().length() > 50){
            alert("Field cannot greater than 50 characters.","Update Error");
        }
        //medicalHistory error handling
        if(jTextAreaMedicalHistory.getText().length() > 300){
            alert("Field cannot greater than 300 characters.","Update Error");
        }
        //medications error handling
        if(jTextFieldMedications.getText().length() > 100){
            alert("Field cannot greater than 100 characters.","Update Error");
        }
        if(!jTextFieldPatientID.getText().isEmpty() && !jTextFieldFirstName.getText().isEmpty()
                && !jTextFieldLastName.getText().isEmpty() && !jTextFieldDOB.getText().isEmpty()
                && !jTextFieldGender.getText().isEmpty() && !jTextFieldAddress.getText().isEmpty()
                && !jTextFieldPhoneNumber.getText().isEmpty() && !jTextFieldInsurancePlan.getText().isEmpty()
                && !jTextAreaMedicalHistory.getText().isEmpty() && !jTextFieldMedications.getText().isEmpty()){
            if(Integer.parseInt(jTextFieldPatientID.getText()) <= 0){
                alert("ID Field be 0 or negative.","Insert Error");
            }
            else{
                int patientID = Integer.parseInt(jTextFieldPatientID.getText().trim());  //trim gets rid of space after entering something
                String firstName = jTextFieldFirstName.getText().trim();
                String lastName = jTextFieldLastName.getText().trim();
                String dob = jTextFieldDOB.getText().trim();
                String gender = jTextFieldGender.getText().trim();
                String address = jTextFieldAddress.getText().trim();
                String phoneNumber = jTextFieldPhoneNumber.getText().trim();
                String insurancePlan = jTextFieldInsurancePlan.getText().trim();
                String medicalHistory = jTextAreaMedicalHistory.getText().trim();
                String medications = jTextFieldMedications.getText().trim();
            
                Patient patient = getPatient(patientID);
            
                if(patient.getPatientID() != -1) {
                    updatePatient(patientID, firstName, lastName, dob, gender, address, phoneNumber, insurancePlan, medicalHistory, medications);
                    refreshPatientsTable();
                }
                else
                {
                    alert("Patient ID does not exist", "Update Error");
                }   
            }
        }
        else{
            alert("Field cannot be empty", "Update Error");
        }
        
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        //patientid error handling
        if(!jTextFieldPatientID.getText().isEmpty()) {
            try{
                Integer.parseInt(jTextFieldPatientID.getText().trim());
            }
            catch (NumberFormatException e) {
                alert("ID Field must be an integer", "ID Violation");
            }
        }
        if(jTextFieldPatientID.getText().isEmpty()) {
            alert("ID Field cannot be empty","Delete Error");
        }
        if(jTextFieldPatientID.getText().length() > 10){
            alert("ID Field cannot greater than 10 digits.","Delete Error");
        }
        if(Integer.parseInt(jTextFieldPatientID.getText()) <= 0){
            alert("ID Field be 0 or negative.","Delete Error");
        }
        if(!jTextFieldPatientID.getText().isEmpty()){
            
            int patientID = Integer.parseInt(jTextFieldPatientID.getText().trim());  //trim gets rid of space after entering something
            String firstName = jTextFieldFirstName.getText().trim();
            String lastName = jTextFieldLastName.getText().trim();
            String dob = jTextFieldDOB.getText().trim();
            String gender = jTextFieldGender.getText().trim();
            String address = jTextFieldAddress.getText().trim();
            String phoneNumber = jTextFieldPhoneNumber.getText().trim();
            String insurancePlan = jTextFieldInsurancePlan.getText().trim();
            String medicalHistory = jTextAreaMedicalHistory.getText().trim();
            String medications = jTextFieldMedications.getText().trim();
            
            Patient patient = getPatient(patientID);
            
            if(patient.getPatientID() != -1) {
                int option = JOptionPane.showConfirmDialog(rootPane, "Are you sure you want to Delete?", "Delete confirmation", JOptionPane.YES_NO_OPTION);
                if(option == 0) {
                    deletePatient(patientID, firstName, lastName, dob, gender, address, phoneNumber, insurancePlan, medicalHistory, medications);
                    refreshPatientsTable();
                    clearTextFields();
                }
            }
            else
            {
                alert("Patient ID does not exist", "Delete Error");
            }
        }
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    public void alert(String msg, String title) {
        JOptionPane.showMessageDialog(rootPane, msg, title, JOptionPane.ERROR_MESSAGE);}
        
  
   private static void addPatient(int patientID, String firstName, String lastName, String dateofBirth, String gender, String address, String phoneNumber, String insurancePlan, String medicalHistory, String medications) {
        Patient patient;
        patient = new Patient(patientID, firstName, lastName, dateofBirth, gender, address, phoneNumber, insurancePlan, medicalHistory, medications);
        patientDAO.insert(patient);
    }
    private static void updatePatient(int patientID, String firstName, String lastName, String dateofBirth, String gender, String address, String phoneNumber, String insurancePlan, String medicalHistory, String medications) {
        Patient patient;
        patient = new Patient(patientID, firstName, lastName, dateofBirth, gender, address, phoneNumber, insurancePlan, medicalHistory, medications);
        patientDAO.update(patient);
    }
    private static void deletePatient(int patientID, String firstName, String lastName, String dateofBirth, String gender, String address, String phoneNumber, String insurancePlan, String medicalHistory, String medications) {
        Patient patient;
        patient = new Patient(patientID, firstName, lastName, dateofBirth, gender, address, phoneNumber, insurancePlan, medicalHistory, medications);
        patientDAO.delete(patient);
    }
   static Patient getPatient(int patientID) {                       
        Optional<Patient> patient = patientDAO.get(patientID);
        return patient.orElseGet(() -> new Patient(-1, "Non-exist", "Non-exist", "Non-exist", "Non-exist", "Non-exist", "Non-exist", "Non-exist", "Non-exist", "Non-exist"));
    }
    
    private void refreshPatientsTable() {
        List<Patient> patients = patientDAO.getAll();
        DefaultTableModel model = (DefaultTableModel) jTablePatients.getModel();
        //Clear all items in tbl Patients
        for(int i = model.getRowCount() - 1; i >= 0; i-- ) {
            model.removeRow(i);
        }
        for (Patient patient : patients) {
                Object[] row = new Object[10];
                row[0] = patient.getPatientID();
                row[1] = patient.getFirstName();
                row[2] = patient.getLastName();
                row[3] = patient.getDateofBirth();
                row[4] = patient.getGender();
                row[5] = patient.getAddress();
                row[6] = patient.getPhoneNumber();
                row[7] = patient.getInsurancePlan();
                row[8] = patient.getMedicalHistory();
                row[9] = patient.getMedications();
                model.addRow(row);
        }
    }
    private void clearTextFields() {
        jTextFieldPatientID.setText("");
        jTextFieldFirstName.setText("");
        jTextFieldLastName.setText("");
        jTextFieldDOB.setText("");
        jTextFieldGender.setText("");
        jTextFieldAddress.setText("");
        jTextFieldPhoneNumber.setText("");
        jTextFieldInsurancePlan.setText("");
        jTextAreaMedicalHistory.setText("");
        jTextFieldMedications.setText("");
    }
    
    
    
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelAddress;
    private javax.swing.JLabel jLabelDOB;
    private javax.swing.JLabel jLabelFirstName;
    private javax.swing.JLabel jLabelGender;
    private javax.swing.JLabel jLabelInsurancePlan;
    private javax.swing.JLabel jLabelLastName;
    private javax.swing.JLabel jLabelMedicalHistory;
    private javax.swing.JLabel jLabelMedications;
    private javax.swing.JLabel jLabelPatientID;
    private javax.swing.JLabel jLabelPhoneNumber;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemBilling;
    private javax.swing.JMenuItem jMenuItemRetrieveRecord;
    private javax.swing.JMenuItem jMenuItemViewDoctors;
    private javax.swing.JMenu jMenuOptions;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTablePatients;
    private javax.swing.JTextArea jTextAreaMedicalHistory;
    private javax.swing.JTextField jTextFieldAddress;
    private javax.swing.JTextField jTextFieldDOB;
    private javax.swing.JTextField jTextFieldFirstName;
    private javax.swing.JTextField jTextFieldGender;
    private javax.swing.JTextField jTextFieldInsurancePlan;
    private javax.swing.JTextField jTextFieldLastName;
    private javax.swing.JTextField jTextFieldMedications;
    private javax.swing.JTextField jTextFieldPatientID;
    private javax.swing.JTextField jTextFieldPhoneNumber;
    // End of variables declaration//GEN-END:variables
}
