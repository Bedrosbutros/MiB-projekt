package mib.projekt;

import java.util.HashMap;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

public class Agent extends javax.swing.JFrame {

    private InfDB idb;
    private boolean showingPassword = false;
    
    public Agent(InfDB idb) 
    {
        initComponents();
        this.idb = idb;
        this.setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loggaIn = new javax.swing.JButton();
        lösenord = new javax.swing.JPasswordField();
        agentID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblTest = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        loggaIn.setText("Logga in");
        loggaIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loggaInActionPerformed(evt);
            }
        });

        lösenord.setForeground(new java.awt.Color(153, 153, 153));
        lösenord.setText("rdField1");
        lösenord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lösenordActionPerformed(evt);
            }
        });

        agentID.setForeground(new java.awt.Color(153, 153, 153));
        agentID.setText("Agent ID");
        agentID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agentIDActionPerformed(evt);
            }
        });

        jLabel1.setText("Användarnamn");

        jLabel2.setText("Lösenord");

        lblTest.setText("Välkommen!");

        jLabel5.setText("Var vänlig och logga in med dina inloggningsuppgifter!");

        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
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
                            .addComponent(agentID, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton3)))
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
                    .addComponent(agentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lösenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addComponent(jRadioButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(loggaIn)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agentIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agentIDActionPerformed
        
    }//GEN-LAST:event_agentIDActionPerformed

    private void lösenordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lösenordActionPerformed
        
    }//GEN-LAST:event_lösenordActionPerformed

    private void loggaInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loggaInActionPerformed

        try
        {
            String id = agentID.getText();
            String losenord = lösenord.getText();
            HashMap<String, String> agent = idb.fetchRow("Select Losenord from Agent where Agent_ID = " + id);
            String result = agent.toString();
            String[] hämtadLösenord = result.split("Losenord=");
            String splittradLösenord = hämtadLösenord[1].toString();
            String finalLösenord = splittradLösenord.substring(0, splittradLösenord.length() - 1);
            String adminKontroll = idb.fetchSingle("Select Administrator from Agent where Agent_ID=" + id);
            if (losenord.equals(finalLösenord))
            {
                if (adminKontroll.equals("J"))
                {
                    new AdminPanel(idb,id).setVisible(true);
                    dispose();
                }else
                {
                    new AgentPanel(idb,id).setVisible(true);
                    dispose();
                }
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

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed

        if(showingPassword)
        {
            lösenord.setEchoChar('*');
            showingPassword = false;
        }else
        {
            lösenord.setEchoChar('\u0000');
            showingPassword = true;
        }
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField agentID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JLabel lblTest;
    private javax.swing.JButton loggaIn;
    private javax.swing.JPasswordField lösenord;
    // End of variables declaration//GEN-END:variables
}
