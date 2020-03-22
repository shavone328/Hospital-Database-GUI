package program;
import entity.Patient;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import entity.*;
import java.util.Optional;
import javax.swing.JOptionPane;
import org.apache.pdfbox.pdmodel.PDDocument;
import java.io.IOException; 
import javax.swing.table.TableModel;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

public class RetrieveRecord extends javax.swing.JFrame {
    private static PatientDAO patientDAO;
    private static BillingDAO billingDAO;
    private static DoctorDAO doctorDAO;
    
    public RetrieveRecord() {
        initComponents();
        getContentPane().setBackground(new java.awt.Color(204, 204, 255));
        patientDAO = new PatientDAO();
        billingDAO = new BillingDAO();
        doctorDAO = new DoctorDAO();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabelMedicalHistory = new javax.swing.JLabel();
        jLabelMedications = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabelFirstName = new javax.swing.JLabel();
        jLabelLastName = new javax.swing.JLabel();
        jLabelDOB = new javax.swing.JLabel();
        jLabelGender = new javax.swing.JLabel();
        jLabelAddress = new javax.swing.JLabel();
        jLabelPatientID = new javax.swing.JLabel();
        jTextFieldPatientID = new javax.swing.JTextField();
        jButtonRetrieve = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabelPhoneNumber = new javax.swing.JLabel();
        jLabelInsurancePlan = new javax.swing.JLabel();
        jButtonPDF = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabelDateofVisit = new javax.swing.JLabel();
        jLabelVisitType = new javax.swing.JLabel();
        jLabelCoPay = new javax.swing.JLabel();
        jLabelDoctor = new javax.swing.JLabel();
        jLabelDoctorNumber = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableBilling = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuOptions = new javax.swing.JMenu();
        jMenuItemNewRecord = new javax.swing.JMenuItem();
        jMenuItemViewDoctors = new javax.swing.JMenuItem();
        jMenuItemBilling = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Patient Records");
        setMinimumSize(new java.awt.Dimension(1116, 525));
        setPreferredSize(new java.awt.Dimension(1116, 525));
        setSize(new java.awt.Dimension(1116, 525));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Patient Record");

        jLabel6.setText("Address:");

        jLabel7.setText("Phone Number:");

        jLabel8.setText("Insurance Plan:");

        jLabel9.setText("Medical History:");

        jLabel10.setText("Medications:");

        jLabelPatientID.setText("Enter Patient ID:");

        jButtonRetrieve.setText("Retrieve");
        jButtonRetrieve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRetrieveActionPerformed(evt);
            }
        });

        jLabel1.setText("First Name:");

        jLabel3.setText("Last Name:");

        jLabel4.setText("Date of Birth:");

        jLabel5.setText("Gender:");

        jButtonPDF.setText("Print to PDF");
        jButtonPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPDFActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Billing Statement");

        jLabel16.setText("Date:");

        jLabel13.setText("Reason for Visit:");

        jLabel14.setText("Co-Pay Amount:");

        jLabel15.setText("Physician:");

        jLabel17.setText("Phone Number:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel11))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(19, 19, 19)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel7))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel8))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel9))))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelAddress)
                            .addComponent(jLabelGender)
                            .addComponent(jLabelDOB)
                            .addComponent(jLabelLastName)
                            .addComponent(jLabelFirstName)
                            .addComponent(jLabelInsurancePlan)
                            .addComponent(jLabelPhoneNumber)
                            .addComponent(jLabelMedications)
                            .addComponent(jLabelMedicalHistory)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel14)
                            .addComponent(jLabel17))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCoPay)
                            .addComponent(jLabelDoctor)
                            .addComponent(jLabelDoctorNumber)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabelPatientID)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldPatientID, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel16))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelDateofVisit)
                                    .addComponent(jLabelVisitType))))
                        .addGap(18, 18, 18)
                        .addComponent(jButtonRetrieve)
                        .addGap(29, 29, 29)
                        .addComponent(jButtonPDF))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel12)))
                .addContainerGap(172, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel11)
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPatientID)
                    .addComponent(jTextFieldPatientID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRetrieve)
                    .addComponent(jButtonPDF))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabelFirstName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabelLastName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabelDOB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabelGender))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabelAddress))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPhoneNumber)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabelInsurancePlan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabelMedicalHistory))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabelMedications))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabelDateofVisit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabelVisitType))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabelCoPay))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabelDoctor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabelDoctorNumber))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTableBilling.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Visit ID", "Visit Type", "Co-Pay", "Date of Visit", "Doctor ID", "Patient ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableBilling.getTableHeader().setReorderingAllowed(false);
        jTableBilling.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableBillingMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableBilling);

        jMenuOptions.setText("Options");

        jMenuItemNewRecord.setText("Create new patient record");
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemNewRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNewRecordActionPerformed
        this.setVisible(false);
        new NewRecord().setVisible(true);
    }//GEN-LAST:event_jMenuItemNewRecordActionPerformed

    private void jMenuItemViewDoctorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemViewDoctorsActionPerformed
        this.setVisible(false);
        new ViewDoctors().setVisible(true);
    }//GEN-LAST:event_jMenuItemViewDoctorsActionPerformed

    private void jMenuItemBillingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemBillingActionPerformed
        this.setVisible(false);
        new BillingRecords().setVisible(true);
    }//GEN-LAST:event_jMenuItemBillingActionPerformed

    private void jButtonRetrieveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRetrieveActionPerformed
        //patientid error handling
        if (!jTextFieldPatientID.getText().isEmpty()) {
            try{
                int patientID = Integer.parseInt(jTextFieldPatientID.getText().trim());
            }
            catch (NumberFormatException ex) {
                alert("ID Field must be an integer", "ID Violation");
            }
        }
        if(jTextFieldPatientID.getText().isEmpty()){
            alert("Patient ID cannot be empty", "Entry Error");
        }
        if(jTextFieldPatientID.getText().length() > 10){
            alert("Patient ID cannot be more than 10 digits", "Entry error");
        }
        
        if (!jTextFieldPatientID.getText().isEmpty()) {
            if(Integer.parseInt(jTextFieldPatientID.getText()) <= 0){
                alert("Patient ID cannot 0 or negative.", "Entry error");
            }
            else{
                int patientID = Integer.parseInt(jTextFieldPatientID.getText().trim());  //trim gets rid of space after entering something
                Patient patient = getPatient(patientID);
                if(patient.getPatientID() != -1){
                    String fname = patient.getFirstName();
                    String lname = patient.getLastName();
                    String dob = patient.getDateofBirth();
                    String gender = patient.getGender();
                    String address = patient.getAddress();
                    String phoneNumber = patient.getPhoneNumber();
                    String insurancePlan = patient.getInsurancePlan();
                    String medicalHistory = patient.getMedicalHistory();
                    String medications = patient.getMedications();
                
                    jLabelFirstName.setText(fname);
                    jLabelLastName.setText(lname);
                    jLabelDOB.setText(dob);
                    jLabelGender.setText(gender);
                    jLabelAddress.setText(address);
                    jLabelPhoneNumber.setText(phoneNumber);
                    jLabelInsurancePlan.setText(insurancePlan);
                    jLabelMedicalHistory.setText(medicalHistory);
                    jLabelMedications.setText(medications);
                    refreshBillingTable();        
                }
        
                else{
                    alert("Patient ID does not exist", "Entry Error");
                }
            }
        }
    }//GEN-LAST:event_jButtonRetrieveActionPerformed

    private void jButtonPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPDFActionPerformed
        String username = "\\\\udrive.win.psu.edu\\Users\\s\\q\\sqj5338\\Desktop\\";
        int patientID = Integer.parseInt(jTextFieldPatientID.getText().trim());  //trim gets rid of space after entering something
            Patient patient = getPatient(patientID);
            String fname = patient.getFirstName();
            String lname = patient.getLastName();
            String dob = patient.getDateofBirth();
            String gender = patient.getGender();
            String address = patient.getAddress();
            String phoneNumber = patient.getPhoneNumber();
            String insurancePlan = patient.getInsurancePlan();
            String medicalHistory = patient.getMedicalHistory();
            String medications = patient.getMedications();
            
        int i = jTableBilling.getSelectedRow();
        if(i == -1){
            alert("You must select a billing entry." , "Please Select");
        }
        else{
        
            TableModel model = jTableBilling.getModel();
        
            String visitType = model.getValueAt(i, 1).toString();
            String coPay = ("$" + model.getValueAt(i, 2).toString());
            String dateofVisit = model.getValueAt(i, 3).toString();
        
            int doctorID = Integer.parseInt(model.getValueAt(i, 4).toString());
            doctorDAO.get(doctorID);
            Doctor doctor = getDoctor(doctorID);
            String docFirstName = doctor.getFirstName();
            String docLastName = doctor.getLastName();
            String docNumber = doctor.getPhoneNumber();
        
            String doctorName = ("Dr. " + docFirstName + " " + docLastName);
            String doctorNumber = (docNumber);
        
            try{
            
            String fileName = (username + "PatientRecord_" + fname + lname + ".pdf");
            PDDocument doc = new PDDocument(); // creates new document object
            PDPage page = new PDPage(); //creates new page object
            doc.addPage(page); //adds page to document, allows for entering content

            PDPageContentStream content = new PDPageContentStream(doc, page);
        
            content.beginText();
            content.setFont(PDType1Font.HELVETICA, 26);
            content.moveTextPositionByAmount(220, 750);
            content.drawString("Patient Record");
            content.endText();
        
        
            content.beginText();
            content.setFont(PDType1Font.HELVETICA, 16);
            content.moveTextPositionByAmount(80, 725);
            content.drawString("Name: " + fname + " " + lname);
            content.endText();
        
        
            content.beginText();
            content.moveTextPositionByAmount(80,700);
            content.drawString("Date of Birth: " + dob);
            content.endText();
        
            content.beginText();
            content.moveTextPositionByAmount(80,675);
            content.drawString("Gender: " + gender);
            content.endText();
        
            content.beginText();
            content.moveTextPositionByAmount(80,650);
            content.drawString("Address: " + address);
            content.endText();
        
            content.beginText();
            content.moveTextPositionByAmount(80,625);
            content.drawString("Phone Number: " + phoneNumber);
            content.endText();
        
            content.beginText();
            content.moveTextPositionByAmount(80,600);
            content.drawString("Insurance Plan: " + insurancePlan);
            content.endText();
        
            content.beginText();
            content.moveTextPositionByAmount(80,575);
            content.drawString("Medical History: " + medicalHistory);
            content.endText();
        
            content.beginText();
            content.moveTextPositionByAmount(80,550);
            content.drawString("Medications: " + medications);
            content.endText();
        
            content.beginText();
            content.setFont(PDType1Font.HELVETICA, 24);
            content.moveTextPositionByAmount(80,500);
            content.drawString("Billing Statement");
            content.endText();
        
            content.beginText();
            content.moveTextPositionByAmount(80,475);
            content.setFont(PDType1Font.HELVETICA, 14);
            content.drawString("Date of Visit: " + dateofVisit );
            content.endText();
        
            content.beginText();
            content.moveTextPositionByAmount(80,450);
            content.drawString("Reason for Visit: " + visitType );
            content.endText();
        
            content.beginText();
            content.moveTextPositionByAmount(80,425);
            content.drawString("Co-Pay Amount: " + coPay);
            content.endText();
        
            content.beginText();
            content.moveTextPositionByAmount(80,400);
            content.drawString("Physician: " + doctorName);
            content.endText();
        
            content.beginText();
            content.moveTextPositionByAmount(80,375);
            content.drawString("Physician Phone Number: " + doctorNumber);
            content.endText();
        
            content.close();
            doc.save(fileName);
            doc.close();
        
            JOptionPane.showMessageDialog(rootPane, "Your pdf was saved to Desktop.", "Save Successful", JOptionPane.INFORMATION_MESSAGE);

            }
            catch(IOException e){
        
            System.out.println(e.getMessage());
        
            }
        }
    }//GEN-LAST:event_jButtonPDFActionPerformed

    private void jTableBillingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableBillingMouseClicked
        int i = jTableBilling.getSelectedRow();
        TableModel model = jTableBilling.getModel();
        jLabelVisitType.setText(model.getValueAt(i, 1).toString());
        jLabelCoPay.setText("$" + model.getValueAt(i, 2).toString());
        jLabelDateofVisit.setText(model.getValueAt(i, 3).toString());
        
        int doctorID = Integer.parseInt(model.getValueAt(i, 4).toString());
        doctorDAO.get(doctorID);
        Doctor doctor = getDoctor(doctorID);
        String docFirstName = doctor.getFirstName();
        String docLastName = doctor.getLastName();
        String docNumber = doctor.getPhoneNumber();
        
        jLabelDoctor.setText("Dr. " + docFirstName + " " + docLastName);
        jLabelDoctorNumber.setText(docNumber);
    }//GEN-LAST:event_jTableBillingMouseClicked

    public void alert(String msg, String title) {
        JOptionPane.showMessageDialog(rootPane, msg, title, JOptionPane.ERROR_MESSAGE);}
    
    static Patient getPatient(int patientID) {                       
        Optional<Patient> patient = patientDAO.get(patientID);
        return patient.orElseGet(() -> new Patient(-1, "Non-exist", "Non-exist", "Non-exist", "Non-exist", "Non-exist", "Non-exist", "Non-exist", "Non-exist", "Non-exist"));
    }
    static Doctor getDoctor(int doctorID) {                       
        Optional<Doctor> doctor = doctorDAO.get(doctorID);
        return doctor.orElseGet(() -> new Doctor(-1, "Non-exist", "Non-exist", "Non-exist", "Non-exist", "Non-exist"));
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonPDF;
    private javax.swing.JButton jButtonRetrieve;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelAddress;
    private javax.swing.JLabel jLabelCoPay;
    private javax.swing.JLabel jLabelDOB;
    private javax.swing.JLabel jLabelDateofVisit;
    private javax.swing.JLabel jLabelDoctor;
    private javax.swing.JLabel jLabelDoctorNumber;
    private javax.swing.JLabel jLabelFirstName;
    private javax.swing.JLabel jLabelGender;
    private javax.swing.JLabel jLabelInsurancePlan;
    private javax.swing.JLabel jLabelLastName;
    private javax.swing.JLabel jLabelMedicalHistory;
    private javax.swing.JLabel jLabelMedications;
    private javax.swing.JLabel jLabelPatientID;
    private javax.swing.JLabel jLabelPhoneNumber;
    private javax.swing.JLabel jLabelVisitType;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemBilling;
    private javax.swing.JMenuItem jMenuItemNewRecord;
    private javax.swing.JMenuItem jMenuItemViewDoctors;
    private javax.swing.JMenu jMenuOptions;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableBilling;
    private javax.swing.JTextField jTextFieldPatientID;
    // End of variables declaration//GEN-END:variables
}
