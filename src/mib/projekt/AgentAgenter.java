package mib.projekt;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;
import java.util.Date;

public class AgentAgenter extends javax.swing.JFrame {

private InfDB idb;
private String ID;
private boolean showingPassword = false;
private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    public AgentAgenter(InfDB idb, String ID) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.idb=idb;
        this.ID=ID;
        spara.setEnabled(false);
        fyllListor();
        AgentAgenter.this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        namn = new javax.swing.JTextField();
        datum = new com.toedter.calendar.JDateChooser();
        telefon = new javax.swing.JTextField();
        lösenord = new javax.swing.JPasswordField();
        administratör = new javax.swing.JComboBox<>();
        område = new javax.swing.JComboBox<>();
        agenter = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        redigera = new javax.swing.JButton();
        spara = new javax.swing.JButton();
        döljaLösenord = new javax.swing.JRadioButton();
        taBort = new javax.swing.JButton();
        statistik = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        namn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namnActionPerformed(evt);
            }
        });

        lösenord.setText("jPasswordField1");

        agenter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agenterActionPerformed(evt);
            }
        });

        jLabel1.setText("Registrerade Agenter");

        redigera.setText("Redigera");
        redigera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redigeraActionPerformed(evt);
            }
        });

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

        taBort.setText("Ta bort");
        taBort.setToolTipText("");
        taBort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taBortActionPerformed(evt);
            }
        });

        statistik.setText("Statistik");
        statistik.setToolTipText("");
        statistik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statistikActionPerformed(evt);
            }
        });

        jButton1.setText("Verksamhet");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(agenter, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(döljaLösenord)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(telefon)
                                    .addComponent(namn)
                                    .addComponent(datum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lösenord)
                                    .addComponent(administratör, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(område, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(statistik, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(276, 276, 276)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(spara, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(redigera, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(taBort, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(53, 53, 53))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(agenter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
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
                .addComponent(redigera)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spara)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(taBort)
                    .addComponent(statistik))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
                agenter.addItem(namn);
            }            
            
            for (String benämning : allaOmrådesNamn) {
                område.addItem(benämning);
            }  
            
            administratör.addItem("Ja");
            administratör.addItem("Nej");
            
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

    private void hämtaDatum()
    {
        
        try {
            
            String hämtaDatum = idb.fetchSingle("select Anstallningsdatum from Agent where Namn='"+agenter.getSelectedItem().toString()+"'");
            Date datumet = dateFormat.parse(hämtaDatum);
            dateFormat.format(datumet);
            datum.setDate(datumet);

        } catch (InfException ettUndantag) {
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        }
        
        catch (Exception ettUndantag) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        }
        
    }
    
    private void agenterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agenterActionPerformed
        
        
        try {
            
            String valdAgent = agenter.getSelectedItem().toString();
            String hämtaLösen = idb.fetchSingle("Select Losenord from Agent where Namn='"+valdAgent+"'");
            String hämtaTel = idb.fetchSingle("Select Telefon from Agent where Namn='"+valdAgent+"'");
            String hämtaDatum = "select Anstallningsdatum from Agent where Namn='"+valdAgent+"'";
            String hämtaOmråde = idb.fetchSingle("select Benamning from Omrade join Agent A on Omrade.Omrades_ID = A.Omrade where Namn ='"+valdAgent+"'");
            String hämtaStatus = idb.fetchSingle("select Administrator from Agent where Namn='"+valdAgent+"'");
            
            namn.setText(valdAgent);
            lösenord.setText(hämtaLösen);
            telefon.setText(hämtaTel);
            administratör.setSelectedItem(hämtaStatus);
            område.setSelectedItem(hämtaOmråde);
            hämtaDatum();
            
            if (hämtaStatus.equals("J"))
            {
                administratör.setSelectedItem("Ja");
            }else if (hämtaStatus.equals("N")){
                administratör.setSelectedItem("Nej");
            }
            
            namn.setEnabled(false);
            telefon.setEnabled(false);
            datum.setEnabled(false);
            lösenord.setEnabled(false);
            administratör.setEnabled(false);
            område.setEnabled(false);
            döljaLösenord.setEnabled(false);
            taBort.setEnabled(false);
            
        } catch (InfException ettUndantag) {
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        }
        
        catch (Exception ettUndantag) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        }
        
    }//GEN-LAST:event_agenterActionPerformed

    private void redigeraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redigeraActionPerformed
        
        namn.setEnabled(true);
        telefon.setEnabled(true);
        datum.setEnabled(true);
        lösenord.setEnabled(true);
        administratör.setEnabled(true);
        område.setEnabled(true);
        spara.setEnabled(true);
        döljaLösenord.setEnabled(true);
        taBort.setEnabled(true);
        
    }//GEN-LAST:event_redigeraActionPerformed

    private void sparaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sparaActionPerformed
        
    int resultat = JOptionPane.showConfirmDialog(null, "Är du nöjd med allt du har skrivit?", "Bekräfta uppgifter", JOptionPane.YES_NO_OPTION);

    if(resultat == JOptionPane.YES_OPTION){
        
        try {
            
                Date datumet = datum.getDate();
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
                        
                String ändraInfo = "UPDATE mibdb.Agent t SET t.Namn = '"+nyNamn+"', t.Telefon = '"+nyTelefon+"', t.Anstallningsdatum = '"+nyDatum+"', t.Administrator = '"+nyStatus+"',  t.Losenord = '"+nyLösen+"', t.Omrade = (Select Omrades_ID from Omrade where Benamning= '"+nyOmråde+"') Where Namn='"+agenter.getSelectedItem().toString()+"'";
                
                idb.update(ändraInfo);
                JOptionPane.showMessageDialog(null, "Ändringar sparade!");
                new AgentAgenter(idb,ID).setVisible(true);
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

    private void taBortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taBortActionPerformed
        
        try {
            
            String tabort = "DELETE FROM mibdb.Agent WHERE Namn = '"+agenter.getSelectedItem().toString()+"'";
            int resultat = JOptionPane.showConfirmDialog(null, "Är du säker att du vill ta bort denna Agent", "Bekräfta borttaggning", JOptionPane.YES_NO_OPTION);
            
            if(resultat == JOptionPane.YES_OPTION)
            {
                idb.delete(tabort);
                new AgentAgenter(idb,ID).setVisible(true);
                dispose();
            } else {
                new AgentAgenter(idb,ID).setVisible(true);
                dispose();
            }

        } catch (InfException ettUndantag) {
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        }
        
        catch (Exception ettUndantag) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        }
        
    }//GEN-LAST:event_taBortActionPerformed

    private void statistikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statistikActionPerformed
        
        new AgentStatistik(idb,ID).setVisible(true);
        
    }//GEN-LAST:event_statistikActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        new VerksamhetsInformation(idb, ID).setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> administratör;
    private javax.swing.JComboBox<String> agenter;
    private com.toedter.calendar.JDateChooser datum;
    private javax.swing.JRadioButton döljaLösenord;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField lösenord;
    private javax.swing.JTextField namn;
    private javax.swing.JComboBox<String> område;
    private javax.swing.JButton redigera;
    private javax.swing.JButton spara;
    private javax.swing.JButton statistik;
    private javax.swing.JButton taBort;
    private javax.swing.JTextField telefon;
    // End of variables declaration//GEN-END:variables
}