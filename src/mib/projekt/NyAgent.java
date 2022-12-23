package mib.projekt;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;
import java.util.Date;

public class NyAgent extends javax.swing.JFrame {

private InfDB idb;
private String ID;
private boolean showingPassword = false;
private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    public NyAgent(InfDB idb, String ID) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.idb=idb;
        this.ID=ID;
        fyllListor();
        NyAgent.this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        agentID.setEnabled(false);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        namn = new javax.swing.JTextField();
        agentID = new javax.swing.JTextField();
        datum = new com.toedter.calendar.JDateChooser();
        telefon = new javax.swing.JTextField();
        lösenord = new javax.swing.JPasswordField();
        administratör = new javax.swing.JComboBox<>();
        område = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        spara = new javax.swing.JButton();
        döljaLösenord = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        namn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namnActionPerformed(evt);
            }
        });

        agentID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agentIDActionPerformed(evt);
            }
        });

        lösenord.setText("jPasswordField1");

        jLabel1.setText("Registrera ny Agent");

        spara.setText("Spara");
        spara.setToolTipText("");
        spara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sparaActionPerformed(evt);
            }
        });

        döljaLösenord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                döljaLösenordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(328, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(spara, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(döljaLösenord)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(agentID, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(telefon)
                                .addComponent(namn)
                                .addComponent(datum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lösenord, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                                .addComponent(administratör, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(område, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(53, 53, 53))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(47, 47, 47)
                .addComponent(agentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(namn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(telefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(datum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lösenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(döljaLösenord))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(administratör, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(område, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(spara)
                .addContainerGap(65, Short.MAX_VALUE))
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

    private void fyllListor()
    {
        
        String hämtaOmråde = "Select Benamning from Omrade";
        String bestämmID = "select MAX(Agent_ID) from Agent";
        
        ArrayList<String> allaAlienNamn;
        ArrayList<String> allaOmrådesNamn;
        
        try {
            
            allaOmrådesNamn = idb.fetchColumn(hämtaOmråde);            
            
            for (String benämning : allaOmrådesNamn) {
                område.addItem(benämning);
            }  
            
            administratör.addItem("Nej");
            administratör.addItem("Ja");
            
            int nyAgentID = Integer.parseInt(idb.fetchSingle(bestämmID));
            nyAgentID = nyAgentID +1;
            agentID.setText(Integer.toString(nyAgentID));
            
        } catch (InfException ettUndantag) {
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        }
        
        catch (Exception ettUndantag) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        }
        
    }
    
    
    private void namnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namnActionPerformed

    
    private void sparaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sparaActionPerformed
        
        try {
            
                Date datumet = datum.getDate();
                String nyID = agentID.getText();
                String nyDatum = dateFormat.format(datumet);
                String nyLösen = lösenord.getText();
                String nyNamn = namn.getText();
                String nyTelefon = telefon.getText();
                String nyStatus = administratör.getSelectedItem().toString();
                String nyOmråde = område.getSelectedItem().toString(); 
                
                if (nyStatus.equals("Ja")){
                    nyStatus = "J";
                }else if (nyStatus.equals("Nej")){
                    nyStatus= "N";
                }
                        
                String ändraInfo = "INSERT INTO mibdb.Agent (Agent_ID, Namn, Telefon, Anstallningsdatum, Administrator, Losenord, Omrade) VALUES ("+nyID+", '"+nyNamn+"', '"+nyTelefon+"', '"+nyDatum+"', '"+nyStatus+"', '"+nyLösen+"', (select Omrades_ID from Omrade where Benamning='"+nyOmråde+"'))";
                
                int resultat = JOptionPane.showConfirmDialog(null, "Är du nöjd med allt du har skrivit?", "Bekräfta uppgifter", JOptionPane.YES_NO_OPTION);
                
                if(resultat == JOptionPane.YES_OPTION)
                {
                    idb.insert(ändraInfo);
                    JOptionPane.showMessageDialog(null, "Ny Agent är nu registrerat!");
                    dispose();
                } else {
                    
                }
                
                
            
        } catch (InfException ettUndantag) {
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        }
        
        catch (Exception ettUndantag) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        }
        
        
    }//GEN-LAST:event_sparaActionPerformed

    private void döljaLösenordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_döljaLösenordActionPerformed
        
        if(showingPassword)
        {
            lösenord.setEchoChar('*');
            showingPassword = false;
        }else
        {
            lösenord.setEchoChar('\u0000');
            showingPassword = true;
        }
        
    }//GEN-LAST:event_döljaLösenordActionPerformed

    private void agentIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agentIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_agentIDActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> administratör;
    private javax.swing.JTextField agentID;
    private com.toedter.calendar.JDateChooser datum;
    private javax.swing.JRadioButton döljaLösenord;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField lösenord;
    private javax.swing.JTextField namn;
    private javax.swing.JComboBox<String> område;
    private javax.swing.JButton spara;
    private javax.swing.JTextField telefon;
    // End of variables declaration//GEN-END:variables
}
