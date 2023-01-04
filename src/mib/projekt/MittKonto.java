package mib.projekt;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;
import java.util.Date;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class MittKonto extends javax.swing.JFrame {

    private InfDB idb;
    private String ID;
    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    
    public MittKonto(InfDB idb, String ID) {
        initComponents();
        this.idb = idb;
        this.ID =ID;
        this.setLocationRelativeTo(null); //Gör så att fönstret körs i mitten av skärmen
        start();
        fyllAdminStatus();
        hämtaInfo();
        fyllOmråden();
        fyllUtrustning();
        MittKonto.this.setDefaultCloseOperation(DISPOSE_ON_CLOSE); //Gör så att programmet inte stänger helt när man trycker på X
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
        textNamn = new javax.swing.JLabel();
        namn = new javax.swing.JTextField();
        telefon = new javax.swing.JTextField();
        textTelefon = new javax.swing.JLabel();
        textAdmin = new javax.swing.JLabel();
        administratör = new javax.swing.JComboBox<>();
        datum = new com.toedter.calendar.JDateChooser();
        textAnställningsdatum = new javax.swing.JLabel();
        textOmråde = new javax.swing.JLabel();
        textUtrustning = new javax.swing.JLabel();
        utrustning = new javax.swing.JComboBox<>();
        område = new javax.swing.JComboBox<>();
        redigera = new javax.swing.JButton();
        spara = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        ändraLösenord = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        titel = new javax.swing.JLabel();

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
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        textNamn.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        textNamn.setForeground(new java.awt.Color(51, 51, 51));
        textNamn.setText("Namn");

        namn.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N

        telefon.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N

        textTelefon.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        textTelefon.setForeground(new java.awt.Color(51, 51, 51));
        textTelefon.setText("Telefon");

        textAdmin.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        textAdmin.setForeground(new java.awt.Color(51, 51, 51));
        textAdmin.setText("Administratör?");

        administratör.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N

        datum.setDateFormatString("yyyy-MM-dd");
        datum.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N

        textAnställningsdatum.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        textAnställningsdatum.setForeground(new java.awt.Color(51, 51, 51));
        textAnställningsdatum.setText("Anställningsdatum");

        textOmråde.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        textOmråde.setForeground(new java.awt.Color(51, 51, 51));
        textOmråde.setText("Område");

        textUtrustning.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        textUtrustning.setForeground(new java.awt.Color(51, 51, 51));
        textUtrustning.setText("Utrustning");

        utrustning.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        utrustning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                utrustningActionPerformed(evt);
            }
        });

        område.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        område.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                områdeActionPerformed(evt);
            }
        });

        redigera.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        redigera.setForeground(new java.awt.Color(51, 51, 51));
        redigera.setText("Redigera");
        redigera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redigeraActionPerformed(evt);
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

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        ändraLösenord.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        ändraLösenord.setForeground(new java.awt.Color(51, 51, 51));
        ändraLösenord.setText("Ändra Lösenord");
        ändraLösenord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ändraLösenordActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mib/projekt/cog.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ändraLösenord, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel8)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(ändraLösenord, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );

        titel.setFont(new java.awt.Font("Futura", 0, 36)); // NOI18N
        titel.setForeground(new java.awt.Color(51, 51, 51));
        titel.setText("Mitt konto");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(titel)
                        .addGap(91, 91, 91))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textNamn)
                                    .addComponent(textOmråde)
                                    .addComponent(textUtrustning)
                                    .addComponent(textAnställningsdatum)
                                    .addComponent(textAdmin)
                                    .addComponent(textTelefon))
                                .addGap(59, 59, 59)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(telefon)
                                        .addComponent(administratör, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(datum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(område, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(utrustning, javax.swing.GroupLayout.Alignment.TRAILING, 0, 140, Short.MAX_VALUE)
                                        .addComponent(namn, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(redigera, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(spara, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(titel)
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textNamn)
                    .addComponent(namn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textTelefon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textAdmin)
                    .addComponent(administratör))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(datum, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(textAnställningsdatum, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textOmråde, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(område))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textUtrustning, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(utrustning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(redigera, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spara, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ändraLösenordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ändraLösenordActionPerformed

        new ÄndraLösenord(idb, ID).setVisible(true);
    }//GEN-LAST:event_ändraLösenordActionPerformed

    private void sparaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sparaActionPerformed

        if (Validering.endastNummerTillåten(telefon)){
        if (Validering.rutanÄrTom(namn, textNamn)){
        if (Validering.rutanÄrTom(telefon, textTelefon)){    
        
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
                }
            }
        }
    }//GEN-LAST:event_sparaActionPerformed

    private void redigeraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redigeraActionPerformed

        spara.setEnabled(true);
        telefon.setEnabled(true);
        område.setEnabled(true);
        datum.setEnabled(true);
        administratör.setEnabled(true);
        kontrolleraText();
        
    }//GEN-LAST:event_redigeraActionPerformed

    private void områdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_områdeActionPerformed
       
    }//GEN-LAST:event_områdeActionPerformed

    private void utrustningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_utrustningActionPerformed
        
    }//GEN-LAST:event_utrustningActionPerformed

    // Gör så att texten i rutorna konstant kontrolleras och returnar fel ifall valideringsklassen triggas.
    
    private void kontrolleraText(){
        
        telefon.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                endastNummer();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                endastNummer();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                endastNummer();
            }
        });
        
    }

    private void endastNummer(){
        
        if (telefon.getText().matches("[a-zA-Z]+")){
            JOptionPane.showMessageDialog(null, "Endast siffror tillåtna!");
        }
        
    } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> administratör;
    private com.toedter.calendar.JDateChooser datum;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField namn;
    private javax.swing.JComboBox<String> område;
    private javax.swing.JButton redigera;
    private javax.swing.JButton spara;
    private javax.swing.JTextField telefon;
    private javax.swing.JLabel textAdmin;
    private javax.swing.JLabel textAnställningsdatum;
    private javax.swing.JLabel textNamn;
    private javax.swing.JLabel textOmråde;
    private javax.swing.JLabel textTelefon;
    private javax.swing.JLabel textUtrustning;
    private javax.swing.JLabel titel;
    private javax.swing.JComboBox<String> utrustning;
    private javax.swing.JButton ändraLösenord;
    // End of variables declaration//GEN-END:variables
}
