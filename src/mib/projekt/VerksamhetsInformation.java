
package mib.projekt;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

public class VerksamhetsInformation extends javax.swing.JFrame {

    private InfDB idb;
    private String ID;
    
    public VerksamhetsInformation(InfDB idb, String ID) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.idb=idb;
        this.ID=ID;
        spara.setEnabled(false);
        kontorschef.setEnabled(false);
        områdeschef.setEnabled(false);
        fyllListor();
        väljAgent();
        VerksamhetsInformation.this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        områdeschef = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        kontorschef = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ändra = new javax.swing.JButton();
        spara = new javax.swing.JButton();
        område = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setText("Områdeschef");

        jLabel2.setText("Kontrorschef");

        jLabel1.setText("Verksamhetsinformation");

        ändra.setText("Ändra");
        ändra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ändraActionPerformed(evt);
            }
        });

        spara.setText("Spara");
        spara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sparaActionPerformed(evt);
            }
        });

        område.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                områdeActionPerformed(evt);
            }
        });

        jLabel4.setText("Område");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(kontorschef, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(områdeschef, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(område, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addContainerGap(45, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(spara, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ändra, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kontorschef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(område, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(områdeschef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ändra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(spara)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void områdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_områdeActionPerformed
        
        väljAgent();
                
    }//GEN-LAST:event_områdeActionPerformed

    private void ändraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ändraActionPerformed
        
        spara.setEnabled(true);
        områdeschef.setEnabled(true);
        kontorschef.setEnabled(true);
        
    }//GEN-LAST:event_ändraActionPerformed

    private void sparaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sparaActionPerformed
        
    int resultat = JOptionPane.showConfirmDialog(null, "Är du säker att du vill ändra?", "Bekräfta uppgifter", JOptionPane.YES_NO_OPTION);
        
    if(resultat == JOptionPane.YES_OPTION){
        
        String hittaKontorschefID = "select Agent_ID from Agent where Namn='"+kontorschef.getSelectedItem().toString()+"'";
        String hittaOmrådesID = "select Omrades_ID from Omrade where Benamning= '"+område.getSelectedItem().toString()+"'";
        String hittaOmrådeschefID = "select Agent_ID from Agent where Namn='"+områdeschef.getSelectedItem().toString()+"'";
        
        try {
            
            String upphittadKontorschefID = idb.fetchSingle(hittaKontorschefID);
            String upphittadOmrådesID = idb.fetchSingle(hittaOmrådesID);
            String upphittadOmrådeschefID = idb.fetchSingle(hittaOmrådeschefID);
            
            String ändraKontorschef = "UPDATE mibdb.Kontorschef t SET t.Agent_ID = "+upphittadKontorschefID+" WHERE Kontorsbeteckning= 'Örebrokontoret'";
            idb.update(ändraKontorschef);
            
            String ändraOmrådeschef= "UPDATE mibdb.Omradeschef t SET t.Agent_ID ="+upphittadOmrådeschefID+" WHERE Omrade="+upphittadOmrådesID;
            idb.update(ändraOmrådeschef);
            
            JOptionPane.showMessageDialog(null, "Ändringar sparade!");
            new VerksamhetsInformation(idb, ID).setVisible(true);
            dispose();
            
            
            } catch (InfException ettUndantag) {
                JOptionPane.showMessageDialog(null, "Databasfel!");
                System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
            }
        
            catch (Exception ettUndantag) {
                JOptionPane.showMessageDialog(null, "Något gick fel!");
                System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
            }
        
        
            } else {
                    
        }   
         
    }//GEN-LAST:event_sparaActionPerformed

    private void fyllListor()
    {
        
        String hämtaNamn = "SELECT Namn from Agent";
        String hämtaOmråde = "Select Benamning from Omrade";
        
        ArrayList<String> allaAlienNamn;
        ArrayList<String> allaOmrådesNamn;
        
        try {
            
            allaAlienNamn = idb.fetchColumn(hämtaNamn);
            allaOmrådesNamn = idb.fetchColumn(hämtaOmråde);

            for (String namn : allaAlienNamn) {
                kontorschef.addItem(namn);
                områdeschef.addItem(namn);
            }            
            
            for (String benämning : allaOmrådesNamn) {
                område.addItem(benämning);
            }
            
        } catch (InfException ettUndantag) {
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        }
        
        catch (Exception ettUndantag) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        }
        
    }
    
    private void väljAgent()
    {
    
        String valdOmråde = område.getSelectedItem().toString();
        String väljOmrådeschef = "select Namn from Agent join Omradeschef O on Agent.Agent_ID = O.Agent_ID join Omrade O2 on O2.Omrades_ID = O.Omrade where Benamning='"+valdOmråde+"'";
        String valdKontorschef = "select Namn from Agent join Kontorschef K on Agent.Agent_ID = K.Agent_ID where Kontorsbeteckning='Örebrokontoret'";
        
        try {
            
            kontorschef.setSelectedItem(idb.fetchSingle(valdKontorschef));
            områdeschef.setSelectedItem(idb.fetchSingle(väljOmrådeschef));
            
        } catch (InfException ettUndantag) {
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        }
        
        catch (Exception ettUndantag) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> kontorschef;
    private javax.swing.JComboBox<String> område;
    private javax.swing.JComboBox<String> områdeschef;
    private javax.swing.JButton spara;
    private javax.swing.JButton ändra;
    // End of variables declaration//GEN-END:variables
}
