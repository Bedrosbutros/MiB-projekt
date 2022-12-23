package mib.projekt;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;
import java.util.Date;

public class MittKonto extends javax.swing.JFrame {

    private InfDB idb;
    private String ID;
    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    
    public MittKonto(InfDB idb, String ID) {
        initComponents();
        this.idb = idb;
        this.ID =ID;
        this.setLocationRelativeTo(null);
        start();
        fyllAdminStatus();
        hämtaInfo();
        fyllOmråden();
        fyllUtrustning();
        
        MittKonto.this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    private void start()
    {
        spara.setEnabled(false);
        namn.setEnabled(false);
        telefon.setEnabled(false);
        område.setEnabled(false);
        datum.setEnabled(false);
        administratör.setEnabled(false);
    }
 
    private void fyllUtrustning()
    {
        
        try
        {
            String hämtaUtrusning = "select Benamning from Innehar_Utrustning join Agent A on A.Agent_ID = Innehar_Utrustning.Agent_ID join Utrustning U on U.Utrustnings_ID = Innehar_Utrustning.Utrustnings_ID where A.Agent_ID="+ID;
            ArrayList<String> agentUtrustning;
            agentUtrustning = idb.fetchColumn(hämtaUtrusning);
            
            for (String utrustningar : agentUtrustning){
                    utrustning.addItem(utrustningar);
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
    
    private void fyllAdminStatus()
    {
        String fråga = "select Administrator from Agent where Agent_ID="+ID;
        String ja = "Ja";
        String nej = "Nej";
        administratör.addItem(ja);
        administratör.addItem(nej);
        
        try
        {
            if (idb.fetchSingle(fråga).equals("J")){
                administratör.setSelectedItem(ja);
            }else if (idb.fetchSingle(fråga).equals("N")){
                administratör.setSelectedItem(nej);
            }
            
        }catch (InfException ettUndantag){
            
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
            
        }
        
        catch (Exception ettUndantag) {
            
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
            
        }
    }
    
    private void fyllOmråden()
    {
        try
        {
            String fråga = "select Benamning from Omrade";
            String hämtaOmråde = "select Benamning from Omrade join Agent A on Omrade.Omrades_ID = A.Omrade where Agent_ID="+ID;
            ArrayList<String> allaOmråden;
            allaOmråden = idb.fetchColumn(fråga);
            
        
            for(String områden : allaOmråden)
            {
                område.addItem(områden);
                område.setSelectedItem(idb.fetchSingle(hämtaOmråde));
            }
            
        }catch (InfException ettUndantag){
            
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
            
        }
        
        catch (Exception ettUndantag) {
            
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
            
        }
        
    }
    
    private void hämtaInfo()
    {
        String hämtaNamn= "select Namn from Agent where Agent_ID="+ID;
        String hämtaTelefon= "select Telefon from Agent where Agent_ID="+ID;
        String hämtaDatum ="select Anstallningsdatum from Agent where Agent_ID="+ID;
        
        try
        {
            namn.setText(idb.fetchSingle(hämtaNamn));
            telefon.setText(idb.fetchSingle(hämtaTelefon));
            Date datumet = dateFormat.parse(idb.fetchSingle(hämtaDatum));
            datum.setDate(datumet);
            
        }catch (InfException ettUndantag){
            
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
            
        }
        
        catch (Exception ettUndantag) {
            
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
            
        }
        
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        ändraLösenord = new javax.swing.JButton();
        namn = new javax.swing.JTextField();
        telefon = new javax.swing.JTextField();
        datum = new com.toedter.calendar.JDateChooser();
        område = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        administratör = new javax.swing.JComboBox<>();
        spara = new javax.swing.JButton();
        redigera = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        utrustning = new javax.swing.JComboBox<>();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ändraLösenord.setText("Ändra Lösenord");
        ändraLösenord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ändraLösenordActionPerformed(evt);
            }
        });

        datum.setDateFormatString("yyyy-MM-dd");

        område.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                områdeActionPerformed(evt);
            }
        });

        jLabel1.setText("Namn");

        jLabel2.setText("Telefon");

        jLabel3.setText("Anställningsdatum");

        jLabel4.setText("Administratör?");

        jLabel5.setText("Område");

        spara.setText("Spara");
        spara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sparaActionPerformed(evt);
            }
        });

        redigera.setText("Redigera");
        redigera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redigeraActionPerformed(evt);
            }
        });

        jLabel6.setText("Utrustning");

        utrustning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                utrustningActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(ändraLösenord, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(redigera, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spara, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(område, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(datum, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                            .addComponent(administratör, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(telefon, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(namn, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(utrustning, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(administratör))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(datum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(område)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(utrustning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(redigera, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ändraLösenord, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spara, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void redigeraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redigeraActionPerformed
        
        spara.setEnabled(true);
        namn.setEnabled(true);
        telefon.setEnabled(true);
        område.setEnabled(true);
        datum.setEnabled(true);
        administratör.setEnabled(true);
        
    }//GEN-LAST:event_redigeraActionPerformed

    
    private void sparaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sparaActionPerformed

    int resultat = JOptionPane.showConfirmDialog(null, "Är du säker att du vill ändra?", "Bekräfta uppgifter", JOptionPane.YES_NO_OPTION);
    
    if(resultat == JOptionPane.YES_OPTION){
        
        try
        {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date datumet = datum.getDate(); 
            String nyDatum = dateFormat.format(datumet);
            String nyNamn = namn.getText();
            String nyTelefon = telefon.getText();
            String nyOmråde = område.getSelectedItem().toString();
            String nyStatus = administratör.getSelectedItem().toString();
            
            if (nyStatus.equals("Ja")){
                nyStatus = "J";
            }else if (nyStatus.equals("Nej")){
                nyStatus = "N";
            }
            
            String ändraInfo = "UPDATE mibdb.Agent t SET t.Namn = '"+nyNamn+"', t.Telefon = '"+nyTelefon+"', t.Anstallningsdatum = '"+nyDatum+"', t.Administrator = '"+nyStatus+"', t.Omrade= (select Omrades_ID from Omrade where Benamning = '"+nyOmråde+"') WHERE t.Agent_ID ="+ID;
            idb.update(ändraInfo);
            JOptionPane.showMessageDialog(null, "Ändringar sparade!");
            new MittKonto(idb, ID).setVisible(true);
            dispose();
            
        }catch (InfException ettUndantag){
            
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
            
        }
        
        catch (Exception ettUndantag) {
            
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
            
        }
    }
        
    }//GEN-LAST:event_sparaActionPerformed

    private void områdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_områdeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_områdeActionPerformed

    private void ändraLösenordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ändraLösenordActionPerformed
      
        new ÄndraLösenord(idb, ID).setVisible(true);
        
    }//GEN-LAST:event_ändraLösenordActionPerformed

    private void utrustningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_utrustningActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_utrustningActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> administratör;
    private com.toedter.calendar.JDateChooser datum;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField namn;
    private javax.swing.JComboBox<String> område;
    private javax.swing.JButton redigera;
    private javax.swing.JButton spara;
    private javax.swing.JTextField telefon;
    private javax.swing.JComboBox<String> utrustning;
    private javax.swing.JButton ändraLösenord;
    // End of variables declaration//GEN-END:variables
}
