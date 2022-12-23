package mib.projekt;

import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;
import java.util.HashMap;
import java.util.ArrayList;

public class NyUtrustning extends javax.swing.JFrame {

    private InfDB idb;
    String ID;
    
    public NyUtrustning(InfDB idb, String ID) {
        initComponents();
        this.idb = idb;
        this.setLocationRelativeTo(null);
        this.ID = ID;
        fyllUtrustningsTyper();
        NyUtrustning.this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }


    private void fyllUtrustningsTyper()
    {
        utrustningsTyp.addItem("Vapen");
        utrustningsTyp.addItem("Teknik");
        utrustningsTyp.addItem("Kommunikation");
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        namn = new javax.swing.JTextField();
        egenskap = new javax.swing.JTextField();
        utrustningsTyp = new javax.swing.JComboBox<>();
        egenskapsNamn = new javax.swing.JLabel();
        spara = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        utrustningsTyp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                utrustningsTypActionPerformed(evt);
            }
        });

        egenskapsNamn.setText("A");

        spara.setText("Spara");
        spara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sparaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(spara, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(egenskapsNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(namn, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                                .addComponent(egenskap)
                                .addComponent(utrustningsTyp, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(namn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(utrustningsTyp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(egenskapsNamn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(egenskap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(spara)
                .addGap(36, 36, 36))
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

    private void sparaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sparaActionPerformed
        
        try
        {
            
            String nyUtrustningsID = idb.getAutoIncrement("Utrustning", "Utrustnings_ID");
            String utrustningsNamn = namn.getText();
            String läggTillUtrustning = "INSERT INTO mibdb.Utrustning (Utrustnings_ID, Benamning) VALUES ("+nyUtrustningsID+", '"+utrustningsNamn+"')";
            String valdUtrustningsTyp = utrustningsTyp.getSelectedItem().toString();
            
            int resultat = JOptionPane.showConfirmDialog(null, "Är du nöjd med allt du har skrivit?", "Bekräfta uppgifter", JOptionPane.YES_NO_OPTION);
            
            if(resultat == JOptionPane.YES_OPTION)
                {
                    idb.insert(läggTillUtrustning);
            
                    if (valdUtrustningsTyp.equals("Vapen")){
                        idb.insert("INSERT INTO mibdb.Vapen (Utrustnings_ID, Kaliber) VALUES ("+nyUtrustningsID+", +"+egenskap.getText()+")");
                        new HanteraUtrustning(idb,ID).setVisible(true);
                        dispose();
                    }
        
                    if (valdUtrustningsTyp.equals("Teknik")){
                        idb.insert("INSERT INTO mibdb.Teknik (Utrustnings_ID, Kraftkalla) VALUES ("+nyUtrustningsID+", '"+egenskap.getText()+"')");
                        new HanteraUtrustning(idb,ID).setVisible(true);
                        dispose();
                    }
        
                    if (valdUtrustningsTyp.equals("Kommunikation")){
                        idb.insert("INSERT INTO mibdb.Kommunikation (Utrustnings_ID, Overforingsteknik) VALUES ("+nyUtrustningsID+", '"+egenskap.getText()+"')");
                        new HanteraUtrustning(idb,ID).setVisible(true);
                        dispose();
                    }
                    
                } else {
                    
                }  
            
        }catch (InfException ettUndantag) {
            
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
            
        }
        
        catch (Exception ettUndantag) {
            
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
            
        }
        
    }//GEN-LAST:event_sparaActionPerformed

    private void utrustningsTypActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_utrustningsTypActionPerformed
        
        String valdUtrustningsTyp = utrustningsTyp.getSelectedItem().toString();
        
        if (valdUtrustningsTyp.equals("Vapen")){
            egenskapsNamn.setText("Antal kaliber");
        }
        
        if (valdUtrustningsTyp.equals("Teknik")){
            egenskapsNamn.setText("Vilken kraftkälla");
        }
        
        if (valdUtrustningsTyp.equals("Kommunikation")){
            egenskapsNamn.setText("Vilken överförningsteknik");
        }
        
    }//GEN-LAST:event_utrustningsTypActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField egenskap;
    private javax.swing.JLabel egenskapsNamn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField namn;
    private javax.swing.JButton spara;
    private javax.swing.JComboBox<String> utrustningsTyp;
    // End of variables declaration//GEN-END:variables
}
