package program;

public class Options extends javax.swing.JFrame {

    
    public Options() {
        initComponents();
        getContentPane().setBackground(new java.awt.Color(204, 204, 255));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonNewRecord = new javax.swing.JButton();
        jButtonRetrieveRecord = new javax.swing.JButton();
        jButtonViewDoctor = new javax.swing.JButton();
        jButtonBilling = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Options");
        setBackground(new java.awt.Color(204, 204, 255));

        jButtonNewRecord.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jButtonNewRecord.setText("New Patient Record");
        jButtonNewRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewRecordActionPerformed(evt);
            }
        });

        jButtonRetrieveRecord.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jButtonRetrieveRecord.setText("Retrieve Record");
        jButtonRetrieveRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRetrieveRecordActionPerformed(evt);
            }
        });

        jButtonViewDoctor.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jButtonViewDoctor.setText("View Doctors");
        jButtonViewDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonViewDoctorActionPerformed(evt);
            }
        });

        jButtonBilling.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jButtonBilling.setText("Billing Options");
        jButtonBilling.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBillingActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel1.setText("Welcome! Please choose and option below:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonNewRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonRetrieveRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonViewDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonBilling, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonNewRecord)
                .addGap(7, 7, 7)
                .addComponent(jButtonRetrieveRecord)
                .addGap(7, 7, 7)
                .addComponent(jButtonViewDoctor)
                .addGap(7, 7, 7)
                .addComponent(jButtonBilling)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNewRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewRecordActionPerformed
      this.setVisible(false);
        new NewRecord().setVisible(true);
    }//GEN-LAST:event_jButtonNewRecordActionPerformed

    private void jButtonRetrieveRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRetrieveRecordActionPerformed
        this.setVisible(false);
        new RetrieveRecord().setVisible(true);
    }//GEN-LAST:event_jButtonRetrieveRecordActionPerformed

    private void jButtonViewDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonViewDoctorActionPerformed
        this.setVisible(false);
        new ViewDoctors().setVisible(true);
    }//GEN-LAST:event_jButtonViewDoctorActionPerformed

    private void jButtonBillingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBillingActionPerformed
        this.setVisible(false);
        new BillingRecords().setVisible(true);
    }//GEN-LAST:event_jButtonBillingActionPerformed
    // Set background to an image
    
  
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Options.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Options.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Options.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Options.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Options().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBilling;
    private javax.swing.JButton jButtonNewRecord;
    private javax.swing.JButton jButtonRetrieveRecord;
    private javax.swing.JButton jButtonViewDoctor;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
