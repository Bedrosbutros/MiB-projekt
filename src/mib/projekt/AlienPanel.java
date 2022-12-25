
package mib.projekt;

import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

public class AlienPanel extends javax.swing.JFrame {

    private InfDB idb;
    private String ID;

    public AlienPanel(InfDB idb, String ID) 
    {
        initComponents();
        this.idb = idb;
        this.ID =ID;
        this.setLocationRelativeTo(null);
        hej();
    }
    
    private void hej()
    {
        try
        {
            
            String hejMeddelande = idb.fetchSingle("Select Namn from Alien where Alien_ID="+ID);
            String welcome = "Välkommen"+" "+hejMeddelande+" "+"vad vill du göra idag?";
            hej.setText(welcome);
            
        }catch (InfException ettUndantag) {
            
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
            
        }
        
        catch (Exception ettUndantag) {
            
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
            
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        hej = new javax.swing.JLabel();
        loggaUt = new javax.swing.JButton();
        mittKonto = new javax.swing.JButton();
        mittKonto1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));

        hej.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        hej.setForeground(new java.awt.Color(255, 255, 255));
        hej.setText("jLabel1");

        loggaUt.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        loggaUt.setForeground(new java.awt.Color(51, 51, 51));
        loggaUt.setText("Logga ut");
        loggaUt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loggaUtActionPerformed(evt);
            }
        });

        mittKonto.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        mittKonto.setForeground(new java.awt.Color(51, 51, 51));
        mittKonto.setText("Mitt konto");
        mittKonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mittKontoActionPerformed(evt);
            }
        });

        mittKonto1.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        mittKonto1.setForeground(new java.awt.Color(51, 51, 51));
        mittKonto1.setText("Mitt område");
        mittKonto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mittKonto1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(hej))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(mittKonto, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(mittKonto1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(loggaUt, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(hej)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mittKonto, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mittKonto1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(loggaUt, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mittKontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mittKontoActionPerformed
        
        new MittKontoAlien(idb, ID).setVisible(true);
        
    }//GEN-LAST:event_mittKontoActionPerformed

    private void loggaUtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loggaUtActionPerformed

        new Alien(idb).setVisible(true);
        dispose();

    }//GEN-LAST:event_loggaUtActionPerformed

    private void mittKonto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mittKonto1ActionPerformed
        
        new MittOmråde(idb,ID).setVisible(true);
        
    }//GEN-LAST:event_mittKonto1ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel hej;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loggaUt;
    private javax.swing.JButton mittKonto;
    private javax.swing.JButton mittKonto1;
    // End of variables declaration//GEN-END:variables
}
