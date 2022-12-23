package mib.projekt;

import java.util.HashMap;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;


public class Alien extends javax.swing.JFrame {

    private InfDB idb;
    private boolean showingPassword = false;
    
    public Alien(InfDB idb) {
        initComponents();
        this.idb = idb;
        this.setLocationRelativeTo(null);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loggaIn = new javax.swing.JButton();
        lösenord = new javax.swing.JPasswordField();
        alienID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblTest = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        loggaIn.setText("Logga in");
        loggaIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loggaInActionPerformed(evt);
            }
        });

        lösenord.setForeground(new java.awt.Color(153, 153, 153));
        lösenord.setText("jPasswor");
        lösenord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lösenordActionPerformed(evt);
            }
        });

        alienID.setForeground(new java.awt.Color(153, 153, 153));
        alienID.setText("Alien ID");
        alienID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alienIDActionPerformed(evt);
            }
        });

        jLabel1.setText("Användarnamn");

        jLabel2.setText("Lösenord");

        lblTest.setText("Välkommen!");

        jLabel5.setText("Var vänlig och logga in med dina inloggningsuppgifter!");

        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(lblTest)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lösenord)
                            .addComponent(loggaIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(alienID, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton1)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lblTest)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alienID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lösenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addComponent(jRadioButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(loggaIn)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void alienIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alienIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alienIDActionPerformed

    private void lösenordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lösenordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lösenordActionPerformed

    private void loggaInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loggaInActionPerformed

        try
        {
            String id = alienID.getText();
            String losenord = lösenord.getText();
            HashMap<String, String> agent = idb.fetchRow("Select Losenord from Alien where Alien_ID = " + id);
            String result = agent.toString();
            String[] words = result.split("Losenord=");
            String words2 = words[1].toString();
            String words3 = words2.substring(0, words2.length() - 1);
            if (losenord.equals(words3))
            {
                new AlienPanel(idb,id).setVisible(true);
                dispose();
                
            }else
            {
                JOptionPane.showMessageDialog(null, "Fel Lösenord!");
            }
        }catch (InfException ettUndantag) {
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        }
        
        catch (Exception ettUndantag) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        } 
    }//GEN-LAST:event_loggaInActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed

        if(showingPassword)
        {
            lösenord.setEchoChar('*');
            showingPassword = false;
        }else
        {
            lösenord.setEchoChar('\u0000');
            showingPassword = true;
        }

    }//GEN-LAST:event_jRadioButton1ActionPerformed

     
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alienID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JLabel lblTest;
    private javax.swing.JButton loggaIn;
    private javax.swing.JPasswordField lösenord;
    // End of variables declaration//GEN-END:variables
}
