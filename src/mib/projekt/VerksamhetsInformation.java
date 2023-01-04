
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
        this.setLocationRelativeTo(null); //Gör så att fönstret körs i mitten av skärmen
        this.idb=idb;
        this.ID=ID;
        spara.setEnabled(false);
        kontorschef.setEnabled(false);
        områdeschef.setEnabled(false);
        fyllListor();
        väljAgent();
        VerksamhetsInformation.this.setDefaultCloseOperation(DISPOSE_ON_CLOSE); //Gör så att programmet inte stänger helt när man trycker på X
    }

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        områdeschef = new javax.swing.JComboBox<>();
        textOmrådeschef = new javax.swing.JLabel();
        kontorschef = new javax.swing.JComboBox<>();
        textKontorschef = new javax.swing.JLabel();
        titel = new javax.swing.JLabel();
        ändra = new javax.swing.JButton();
        spara = new javax.swing.JButton();
        område = new javax.swing.JComboBox<>();
        textOmråde = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        områdeschef.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N

        textOmrådeschef.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        textOmrådeschef.setForeground(new java.awt.Color(51, 51, 51));
        textOmrådeschef.setText("Områdeschef");

        kontorschef.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N

        textKontorschef.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        textKontorschef.setForeground(new java.awt.Color(51, 51, 51));
        textKontorschef.setText("Kontrorschef");

        titel.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        titel.setForeground(new java.awt.Color(51, 51, 51));
        titel.setText("Verksamhetsinformation");

        ändra.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        ändra.setForeground(new java.awt.Color(51, 51, 51));
        ändra.setText("Ändra");
        ändra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ändraActionPerformed(evt);
            }
        });

        spara.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        spara.setForeground(new java.awt.Color(51, 51, 51));
        spara.setText("Spara");
        spara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sparaActionPerformed(evt);
            }
        });

        område.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        område.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                områdeActionPerformed(evt);
            }
        });

        textOmråde.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        textOmråde.setForeground(new java.awt.Color(51, 51, 51));
        textOmråde.setText("Område");

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mib/projekt/business-and-trade.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel8)
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textKontorschef)
                            .addComponent(kontorschef, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(områdeschef, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textOmrådeschef)
                            .addComponent(område, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textOmråde)
                            .addComponent(titel))
                        .addGap(32, 32, 32))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spara, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ändra, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(titel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(textKontorschef)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kontorschef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textOmråde)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(område, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textOmrådeschef)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(områdeschef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ändra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(spara)
                .addGap(21, 21, 21))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void fyllListor(){
        
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
    
    private void väljAgent(){
    
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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> kontorschef;
    private javax.swing.JComboBox<String> område;
    private javax.swing.JComboBox<String> områdeschef;
    private javax.swing.JButton spara;
    private javax.swing.JLabel textKontorschef;
    private javax.swing.JLabel textOmråde;
    private javax.swing.JLabel textOmrådeschef;
    private javax.swing.JLabel titel;
    private javax.swing.JButton ändra;
    // End of variables declaration//GEN-END:variables
}
