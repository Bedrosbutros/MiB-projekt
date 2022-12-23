package mib.projekt;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;
import java.util.Date;

public class NyAlien extends javax.swing.JFrame {

private InfDB idb;
private String ID;
private boolean showingPassword = false;
private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    public NyAlien(InfDB idb, String ID) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.idb=idb;
        this.ID=ID;
        fyllListor();
        NyAlien.this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        alienID.setEnabled(false);
        
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        alienID = new javax.swing.JTextField();
        namn = new javax.swing.JTextField();
        datum = new com.toedter.calendar.JDateChooser();
        telefon = new javax.swing.JTextField();
        lösenord = new javax.swing.JPasswordField();
        område = new javax.swing.JComboBox<>();
        agenter = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        spara = new javax.swing.JButton();
        döljaLösenord = new javax.swing.JRadioButton();
        ras = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        alienID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alienIDActionPerformed(evt);
            }
        });

        namn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namnActionPerformed(evt);
            }
        });

        lösenord.setText("jPasswordField1");

        jLabel1.setText("Registrerade Aliens");

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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(328, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(döljaLösenord)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(telefon)
                            .addComponent(namn)
                            .addComponent(datum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lösenord, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                            .addComponent(område, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(agenter, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(alienID, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ras, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(spara, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(53, 53, 53)
                .addComponent(alienID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(område, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(agenter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(spara)
                .addGap(35, 35, 35))
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
        
        String hämtaPlats = "Select Benamning from Plats";
        String hämtaAgent= "Select Namn from Agent";
        String bestämmID = "select MAX(Alien_ID) from Alien";
        
        ras.addItem("Squid");
        ras.addItem("Worm");
        ras.addItem("Boglodite");
        
        ArrayList<String> allaOmrådesNamn;
        ArrayList<String> allaAgentNamn;
        
        try {
            
            allaOmrådesNamn = idb.fetchColumn(hämtaPlats);
            allaAgentNamn = idb.fetchColumn(hämtaAgent);

            for (String benämning : allaOmrådesNamn) {
                område.addItem(benämning);
            }  
            
            for (String agent : allaAgentNamn) {
                agenter.addItem(agent);
            }
            
            int nyAlienID = Integer.parseInt(idb.fetchSingle(bestämmID));
            nyAlienID = nyAlienID +1;
            alienID.setText(Integer.toString(nyAlienID));
            
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
                String nyID = alienID.getText();
                String nyDatum = dateFormat.format(datumet);
                String nyLösen = lösenord.getText();
                String nyNamn = namn.getText();
                String nyTelefon = telefon.getText();
                String nyOmråde = område.getSelectedItem().toString();
                String nyAgent = agenter.getSelectedItem().toString();
                String ändraInfo = "INSERT INTO mibdb.Alien (Alien_ID, Registreringsdatum, Losenord, Namn, Telefon, Plats, Ansvarig_Agent) VALUES ("+nyID+", '"+nyDatum+"', '"+nyLösen+"', '"+nyNamn+"', '"+nyTelefon+"', (select Plats_ID from Plats where Benamning='"+nyOmråde+"'), (select Agent_ID from Agent where Namn= '"+nyAgent+"'))";
                
                int resultat = JOptionPane.showConfirmDialog(null, "Är du nöjd med allt du har skrivit?", "Bekräfta uppgifter", JOptionPane.YES_NO_OPTION);
                
                if(resultat == JOptionPane.YES_OPTION)
                {
                    idb.insert(ändraInfo);
                    
                    if (ras.getSelectedItem().toString().equals("Squid")){
                        String antal = JOptionPane.showInputDialog("Hur många armar?");
                        idb.insert("INSERT INTO mibdb.Squid (Alien_ID, Antal_Armar) VALUES ("+nyID+", "+antal+")");
                    }else if (ras.getSelectedItem().toString().equals("Worm")){
                        idb.insert("INSERT INTO mibdb.Worm (Alien_ID) VALUES ("+nyID+")");
                    }else if (ras.getSelectedItem().toString().equals("Boglodite")){
                        String antal = JOptionPane.showInputDialog("Hur många boogies?");
                        idb.insert("INSERT INTO mibdb.Boglodite (Alien_ID, Antal_Boogies) VALUES ("+nyID+", "+antal+")");
                    }
                    
                    JOptionPane.showMessageDialog(null, "Ny Alien är nu registrerat!");
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

    private void alienIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alienIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alienIDActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> agenter;
    private javax.swing.JTextField alienID;
    private com.toedter.calendar.JDateChooser datum;
    private javax.swing.JRadioButton döljaLösenord;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField lösenord;
    private javax.swing.JTextField namn;
    private javax.swing.JComboBox<String> område;
    private javax.swing.JComboBox<String> ras;
    private javax.swing.JButton spara;
    private javax.swing.JTextField telefon;
    // End of variables declaration//GEN-END:variables
}
