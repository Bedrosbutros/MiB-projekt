package mib.projekt;

import oru.inf.InfDB;

public class Meny extends javax.swing.JFrame {

    private InfDB idb;
    
    public Meny(InfDB idb) {
        initComponents();
        this.idb = idb;
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVisaSektionsInformation = new javax.swing.JButton();
        btnVisaMedlemsInfo = new javax.swing.JButton();
        lblApplikationsNamn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnVisaSektionsInformation.setText("Alien");
        btnVisaSektionsInformation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisaSektionsInformationActionPerformed(evt);
            }
        });

        btnVisaMedlemsInfo.setText("Agent");
        btnVisaMedlemsInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisaMedlemsInfoActionPerformed(evt);
            }
        });

        lblApplikationsNamn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblApplikationsNamn.setText("Men In Black Databas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(lblApplikationsNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(btnVisaMedlemsInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(btnVisaSektionsInformation, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblApplikationsNamn)
                .addGap(18, 18, 18)
                .addComponent(btnVisaMedlemsInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVisaSektionsInformation, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVisaMedlemsInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisaMedlemsInfoActionPerformed

        new Agent(idb).setVisible(true);
        dispose();
         
    }//GEN-LAST:event_btnVisaMedlemsInfoActionPerformed

    private void btnVisaSektionsInformationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisaSektionsInformationActionPerformed
        // TODO add your handling code here:
        new Alien(idb).setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVisaSektionsInformationActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVisaMedlemsInfo;
    private javax.swing.JButton btnVisaSektionsInformation;
    private javax.swing.JLabel lblApplikationsNamn;
    // End of variables declaration//GEN-END:variables
}
