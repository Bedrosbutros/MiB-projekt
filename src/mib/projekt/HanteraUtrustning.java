package mib.projekt;

import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;
import java.util.HashMap;
import java.util.ArrayList;

public class HanteraUtrustning extends javax.swing.JFrame {

    private InfDB idb;
    String ID;
    
    public HanteraUtrustning(InfDB idb, String ID) {
        initComponents();
        this.idb = idb;
        this.setLocationRelativeTo(null);
        this.ID = ID;
        fyllUtrusning();
        utrustningTyp.setEnabled(false);
        HanteraUtrustning.this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        egenskapText.setEnabled(false);
        egenskap.setEnabled(false);
        adminKontroll();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        info = new javax.swing.JLabel();
        utrustningNamn = new javax.swing.JComboBox<>();
        utrustningTyp = new javax.swing.JComboBox<>();
        läggTillUtrustning = new javax.swing.JButton();
        taBort = new javax.swing.JButton();
        egenskap = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        egenskapText = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        info.setText("Utrustning");

        utrustningNamn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                utrustningNamnActionPerformed(evt);
            }
        });

        utrustningTyp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                utrustningTypActionPerformed(evt);
            }
        });

        läggTillUtrustning.setText("Ny utrustning");
        läggTillUtrustning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                läggTillUtrustningActionPerformed(evt);
            }
        });

        taBort.setText("Ta bort");
        taBort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taBortActionPerformed(evt);
            }
        });

        jLabel1.setText("Utrustningsnamn");

        jLabel2.setText("Utrustningstyp");

        egenskapText.setText("Egenskap");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(info))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(utrustningNamn, 0, 171, Short.MAX_VALUE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(egenskapText)
                            .addComponent(utrustningTyp, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(egenskap)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(läggTillUtrustning, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(taBort, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(info)
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(utrustningNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(utrustningTyp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(egenskapText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(egenskap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(läggTillUtrustning)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(taBort)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void utrustningTypActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_utrustningTypActionPerformed
        
        
    }//GEN-LAST:event_utrustningTypActionPerformed
    
    private void adminKontroll(){
        
        try
        {
            String hämtaAdminStatus = idb.fetchSingle("select Administrator from Agent where Agent_ID="+ID);
            
            if (hämtaAdminStatus.equals("N")){
                taBort.setEnabled(false);
            }
            
            
        }catch (InfException ettUndantag) {
            
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
            
        }
        
        catch (Exception ettUndantag) {
            
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
            
        }
        
    }
    
    private void utrustningNamnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_utrustningNamnActionPerformed

        String benämning = utrustningNamn.getSelectedItem().toString();
        String hittaID= "select Utrustnings_ID from Utrustning where Benamning='"+benämning+"'";
        
        try
        {
            String utrustningsID = idb.fetchSingle(hittaID);
            
            ArrayList<HashMap<String,String>> vapen = idb.fetchRows("select Utrustnings_ID from Vapen");
            ArrayList<HashMap<String,String>> teknik = idb.fetchRows("select Utrustnings_ID from Teknik");
            ArrayList<HashMap<String,String>> kommunikation = idb.fetchRows("select Utrustnings_ID from Kommunikation");
            
            for (HashMap<String,String> vapenLista : vapen){
                for (String key : vapenLista.keySet()){
                    if (utrustningsID.equals(vapenLista.get(key))){
                        utrustningTyp.setSelectedItem("Vapen");
                        hittaKaliber();
                    }
                }
            }
            
            for (HashMap<String,String> teknikLista : teknik){
                for (String key : teknikLista.keySet()){
                    if (utrustningsID.equals(teknikLista.get(key))){
                        utrustningTyp.setSelectedItem("Teknik");
                        hittaKraftkälla();
                    }
                }
            }
            
            for (HashMap<String,String> kommunikationLista : kommunikation){
                for (String key : kommunikationLista.keySet()){
                    if (utrustningsID.equals(kommunikationLista.get(key))){
                        utrustningTyp.setSelectedItem("Kommunikation");
                        hittaÖverförningsteknik();
                        
                    }
                }
            }
            
        }catch (InfException ettUndantag) {
            
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
            
        }
        
        catch (Exception ettUndantag) {
            
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
            
        }
    }
    
    private void fyllUtrusning()
    {
        try
        {
            String hämtaUtrusning = "select Benamning from Utrustning";
            ArrayList<String> allUtrusning;
            allUtrusning = idb.fetchColumn(hämtaUtrusning);
            
            
            for (String namn : allUtrusning){
                utrustningNamn.addItem(namn);
            }
            
            utrustningTyp.addItem("Vapen");
            utrustningTyp.addItem("Teknik");
            utrustningTyp.addItem("Kommunikation");
            
            
            
        }catch (InfException ettUndantag) {
            
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
            
        }
        
        catch (Exception ettUndantag) {
            
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
            
        }
        
    }//GEN-LAST:event_utrustningNamnActionPerformed

    private void läggTillUtrustningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_läggTillUtrustningActionPerformed
        
        new NyUtrustning(idb,ID).setVisible(true);
        dispose();

    }//GEN-LAST:event_läggTillUtrustningActionPerformed

    private void taBortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taBortActionPerformed
        
        try
        {
            String hittaID= "select Utrustnings_ID from Utrustning where Benamning= '"+utrustningNamn.getSelectedItem().toString()+"'";
            String tabort = "DELETE FROM mibdb.Utrustning WHERE Benamning='"+utrustningNamn.getSelectedItem().toString()+"'";
            int resultat = JOptionPane.showConfirmDialog(null, "Är du säker att du vill ta bort denna utrustning", "Bekräfta borttaggning", JOptionPane.YES_NO_OPTION);
            String valdUtrustningsTyp = utrustningTyp.getSelectedItem().toString();
            
            String upphittadID = idb.fetchSingle(hittaID);
            
            if(resultat == JOptionPane.YES_OPTION)
            {
                if (valdUtrustningsTyp.equals("Vapen")){
                    idb.delete("DELETE FROM mibdb.Vapen WHERE Utrustnings_ID ="+upphittadID);
                    idb.delete(tabort);
                    new HanteraUtrustning(idb,ID).setVisible(true);
                    dispose();
                    }
        
                if (valdUtrustningsTyp.equals("Teknik")){
                    idb.delete("DELETE FROM mibdb.Teknik WHERE Utrustnings_ID = "+upphittadID);
                    idb.delete(tabort);
                    new HanteraUtrustning(idb,ID).setVisible(true);
                    dispose();
                    }
        
                if (valdUtrustningsTyp.equals("Kommunikation")){
                    idb.delete("DELETE FROM mibdb.Kommunikation WHERE Utrustnings_ID ="+upphittadID);
                    idb.delete(tabort);
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
        
    }//GEN-LAST:event_taBortActionPerformed

    private void hittaKaliber()
    {
        String benämning = utrustningNamn.getSelectedItem().toString();
        String hittaID= "select Utrustnings_ID from Utrustning where Benamning='"+benämning+"'";
        
        try
        {
            String upphittadID= idb.fetchSingle(hittaID);
            egenskapText.setText("Antal kaliber");
            String hämtaAntal = "select Kaliber from Vapen where Utrustnings_ID="+upphittadID;
            egenskap.setText(idb.fetchSingle(hämtaAntal));
            
        }catch (InfException ettUndantag) {
            
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
            
        }
        
        catch (Exception ettUndantag) {
            
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
            
        }
        
    }
    
    private void hittaKraftkälla()
    {
        
        String benämning = utrustningNamn.getSelectedItem().toString();
        String hittaID= "select Utrustnings_ID from Utrustning where Benamning='"+benämning+"'";
        
        try
        {
            String upphittadID= idb.fetchSingle(hittaID);
            egenskapText.setText("Kraftkälla");
            String hämtaKälla = "select Kraftkalla from Teknik where Utrustnings_ID="+upphittadID;
            egenskap.setText(idb.fetchSingle(hämtaKälla));
            
        }catch (InfException ettUndantag) {
            
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
            
        }
        
        catch (Exception ettUndantag) {
            
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
            
        }
        
    }
    
    private void hittaÖverförningsteknik()
    {
        
        String benämning = utrustningNamn.getSelectedItem().toString();
        String hittaID= "select Utrustnings_ID from Utrustning where Benamning='"+benämning+"'";
        
        try
        {
            String upphittadID= idb.fetchSingle(hittaID);
            egenskapText.setText("Överförningskraft");
            String hämtaTeknik = "select Overforingsteknik from Kommunikation where Utrustnings_ID="+upphittadID;
            egenskap.setText(idb.fetchSingle(hämtaTeknik));
            
        }catch (InfException ettUndantag) {
            
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
            
        }
        
        catch (Exception ettUndantag) {
            
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
            
        }
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField egenskap;
    private javax.swing.JLabel egenskapText;
    private javax.swing.JLabel info;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton läggTillUtrustning;
    private javax.swing.JButton taBort;
    private javax.swing.JComboBox<String> utrustningNamn;
    private javax.swing.JComboBox<String> utrustningTyp;
    // End of variables declaration//GEN-END:variables
}
