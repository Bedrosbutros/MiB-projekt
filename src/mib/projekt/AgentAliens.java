package mib.projekt;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;
import java.util.Date;
import java.util.HashMap;

public class AgentAliens extends javax.swing.JFrame {

private InfDB idb;
private String ID;
private boolean showingPassword = false;
private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    public AgentAliens(InfDB idb, String ID) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.idb=idb;
        this.ID=ID;
        spara.setEnabled(false);
        ändra.setVisible(false);
        fyllListor();
        AgentAliens.this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        namn = new javax.swing.JTextField();
        datum = new com.toedter.calendar.JDateChooser();
        telefon = new javax.swing.JTextField();
        lösenord = new javax.swing.JPasswordField();
        område = new javax.swing.JComboBox<>();
        agenter = new javax.swing.JComboBox<>();
        aliens = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        redigera = new javax.swing.JButton();
        spara = new javax.swing.JButton();
        döljaLösenord = new javax.swing.JRadioButton();
        taBort = new javax.swing.JButton();
        ras = new javax.swing.JComboBox<>();
        statistik = new javax.swing.JButton();
        ändra = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        namn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namnActionPerformed(evt);
            }
        });

        lösenord.setText("jPasswordField1");

        område.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                områdeActionPerformed(evt);
            }
        });

        aliens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aliensActionPerformed(evt);
            }
        });

        jLabel1.setText("Registrerade Aliens");

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
        statistik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statistikActionPerformed(evt);
            }
        });

        ändra.setText("Ändra");
        ändra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ändraActionPerformed(evt);
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 292, Short.MAX_VALUE)
                                        .addComponent(döljaLösenord))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(ändra)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(telefon)
                                    .addComponent(namn)
                                    .addComponent(datum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lösenord)
                                    .addComponent(område, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(agenter, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ras, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(statistik)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(spara, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(redigera, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(taBort, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(53, 53, 53))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(aliens, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(aliens, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(område, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(agenter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ändra))
                .addGap(18, 18, 18)
                .addComponent(redigera)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spara)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(taBort)
                    .addComponent(statistik))
                .addGap(38, 38, 38))
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

    private void adminKontroll(){
        
        try
        {
            String hämtaAdminStatus = idb.fetchSingle("select Administrator from Agent where Agent_ID="+ID);
            
            if (hämtaAdminStatus.equals("N")){
                taBort.setEnabled(false);
            }else {
                taBort.setEnabled(true);
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
    
    
    private void fyllListor()
    {
        
        String hämtaNamn = "SELECT Namn from Alien";
        String hämtaPlats = "Select Benamning from Plats";
        String hämtaAgent= "Select Namn from Agent";
        
        ras.addItem("Squid");
        ras.addItem("Worm");
        ras.addItem("Boglodite");
        
        ArrayList<String> allaAlienNamn;
        ArrayList<String> allaOmrådesNamn;
        ArrayList<String> allaAgentNamn;
        
        try {
            
            allaAlienNamn = idb.fetchColumn(hämtaNamn);
            allaOmrådesNamn = idb.fetchColumn(hämtaPlats);
            allaAgentNamn = idb.fetchColumn(hämtaAgent);

            for (String namn : allaAlienNamn) {
                aliens.addItem(namn);
            }            
            
            for (String benämning : allaOmrådesNamn) {
                område.addItem(benämning);
            }  
            
            for (String agent : allaAgentNamn) {
                agenter.addItem(agent);
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
    
    
    private void namnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namnActionPerformed

    private void hämtaRas()
    {
        String hittaID = "Select Alien_ID from Alien where Namn='"+aliens.getSelectedItem().toString()+"'";
        
        try {
            
            String upphittadID = idb.fetchSingle(hittaID);
            
            ArrayList<HashMap<String,String>> squid = idb.fetchRows("select Alien_ID from Squid where Alien_ID="+upphittadID);
            ArrayList<HashMap<String,String>> worm = idb.fetchRows("select Alien_ID from Worm where Alien_ID="+upphittadID);
            ArrayList<HashMap<String,String>> boglodite = idb.fetchRows("select Alien_ID from Boglodite where Alien_ID="+upphittadID);
            
            for (HashMap<String,String> squidLista : squid){
                for (String key : squidLista.keySet()){
                    if (upphittadID.equals(squidLista.get(key))){
                        ras.setSelectedItem("Squid");
                    }
                }
            }
            
            for (HashMap<String,String> wormLista : worm){
                for (String key : wormLista.keySet()){
                    if (upphittadID.equals(wormLista.get(key))){
                        ras.setSelectedItem("Worm");
                    }
                }
            }
            
            for (HashMap<String,String> boloditeLista : boglodite){
                for (String key : boloditeLista.keySet()){
                    if (upphittadID.equals(boloditeLista.get(key))){
                        ras.setSelectedItem("Boglodite");
                    }
                }
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
    
    private void hämtaDatum()
    {
        
        try {
            
            String hämtaDatum = idb.fetchSingle("Select Registreringsdatum from Alien where Namn='"+aliens.getSelectedItem().toString()+"'");
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
    
    private void aliensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aliensActionPerformed
        
        
        try {
            
            String valdAlien = aliens.getSelectedItem().toString();
            String hämtaLösen = idb.fetchSingle("Select Losenord from Alien where Namn='"+valdAlien+"'");
            String hämtaTel = idb.fetchSingle("Select Telefon from Alien where Namn='"+valdAlien+"'");
            String hämtaDatum = "Select Registreringsdatum from Alien where Namn='"+valdAlien+"'";
            String hämtaOmråde = idb.fetchSingle("Select Benamning from Plats join Alien A on Plats.Plats_ID = A.Plats where Namn = '"+valdAlien+"'");
            String hämtaAgent = idb.fetchSingle("Select Agent.Namn from Agent join Alien A on Agent.Agent_ID = A.Ansvarig_Agent where A.Namn = '"+valdAlien+"'");
            
            namn.setText(valdAlien);
            lösenord.setText(hämtaLösen);
            telefon.setText(hämtaTel);
            område.setSelectedItem(hämtaOmråde);
            agenter.setSelectedItem(hämtaAgent);
            hämtaDatum();
            hämtaRas();
            
            namn.setEnabled(false);
            telefon.setEnabled(false);
            datum.setEnabled(false);
            lösenord.setEnabled(false);
            område.setEnabled(false);
            agenter.setEnabled(false);
            döljaLösenord.setEnabled(false);
            taBort.setEnabled(false);
            ras.setEnabled(false);
            
        } catch (InfException ettUndantag) {
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        }
        
        catch (Exception ettUndantag) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        }
        
    }//GEN-LAST:event_aliensActionPerformed

    private void ändraTillSquid()
    {
        String hittaID = "Select Alien_ID from Alien where Namn='"+aliens.getSelectedItem().toString()+"'";
        
        try {
            
            String upphittadID = idb.fetchSingle(hittaID);
            idb.delete("DELETE FROM mibdb.Squid WHERE Alien_ID ="+upphittadID);
            idb.delete("DELETE FROM mibdb.Worm WHERE Alien_ID ="+upphittadID);
            idb.delete("DELETE FROM mibdb.Boglodite WHERE Alien_ID ="+upphittadID);
            String antal = JOptionPane.showInputDialog("Hur många armar?");
            idb.insert("INSERT INTO mibdb.Squid (Alien_ID, Antal_Armar) VALUES ("+upphittadID+", "+antal+")");
            
            
        } catch (InfException ettUndantag) {
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        }
        
        catch (Exception ettUndantag) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        }
    }
    
    private void ändraTillBoglodite()
    {
        String hittaID = "Select Alien_ID from Alien where Namn='"+aliens.getSelectedItem().toString()+"'";
        
        try {
            
            String upphittadID = idb.fetchSingle(hittaID);
            idb.delete("DELETE FROM mibdb.Squid WHERE Alien_ID ="+upphittadID);
            idb.delete("DELETE FROM mibdb.Worm WHERE Alien_ID ="+upphittadID);
            idb.delete("DELETE FROM mibdb.Boglodite WHERE Alien_ID ="+upphittadID);
            String antal = JOptionPane.showInputDialog("Hur många boogies?");
            idb.insert("INSERT INTO mibdb.Boglodite (Alien_ID, Antal_Boogies) VALUES ("+upphittadID+", "+antal+")");
            
            
        } catch (InfException ettUndantag) {
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        }
        
        catch (Exception ettUndantag) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        }
    }
    
    private void ändraTillWorm()
    {
        String hittaID = "Select Alien_ID from Alien where Namn='"+aliens.getSelectedItem().toString()+"'";
        
        try {
            
            String upphittadID = idb.fetchSingle(hittaID);
            idb.delete("DELETE FROM mibdb.Squid WHERE Alien_ID ="+upphittadID);
            idb.delete("DELETE FROM mibdb.Worm WHERE Alien_ID ="+upphittadID);
            idb.delete("DELETE FROM mibdb.Boglodite WHERE Alien_ID ="+upphittadID);
            idb.insert("INSERT INTO mibdb.Worm (Alien_ID) VALUES ("+upphittadID+")");
            
            
        } catch (InfException ettUndantag) {
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        }
        
        catch (Exception ettUndantag) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        }
    }
    
    private void redigeraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redigeraActionPerformed
        
        adminKontroll();
        namn.setEnabled(true);
        telefon.setEnabled(true);
        datum.setEnabled(true);
        lösenord.setEnabled(true);
        område.setEnabled(true);
        agenter.setEnabled(true);
        spara.setEnabled(true);
        döljaLösenord.setEnabled(true);
        ras.setEnabled(true);
        ändra.setVisible(true);
        
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
                String nyOmråde = område.getSelectedItem().toString();
                String nyAgent = agenter.getSelectedItem().toString();
                String ändraInfo = "UPDATE mibdb.Alien t SET t.Registreringsdatum = '"+nyDatum+"',t.Losenord='"+nyLösen+"',t.Namn='"+nyNamn+"',t.Telefon='"+nyTelefon+"',t.Plats=(select Plats_ID from Plats where Benamning = '"+nyOmråde+"'),t.Ansvarig_Agent=(select Agent_ID from Agent where Namn ='"+nyAgent+"')WHERE t.Namn ='"+aliens.getSelectedItem().toString()+"'";
                idb.update(ändraInfo);
                
                JOptionPane.showMessageDialog(null, "Ändringar sparade!");
                new AgentAliens(idb,ID).setVisible(true);
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

        String hittaID = "Select Alien_ID from Alien where Namn='"+aliens.getSelectedItem().toString()+"'";
        
        try {
            
            String tabort = "DELETE FROM mibdb.Alien WHERE Namn = '"+aliens.getSelectedItem().toString()+"'";
            int resultat = JOptionPane.showConfirmDialog(null, "Är du säker att du vill ta bort denna Alien", "Bekräfta borttaggning", JOptionPane.YES_NO_OPTION);
            
            if(resultat == JOptionPane.YES_OPTION)
            {
                
                String upphittadID = idb.fetchSingle(hittaID);
                idb.delete("DELETE FROM mibdb.Squid WHERE Alien_ID ="+upphittadID);
                idb.delete("DELETE FROM mibdb.Worm WHERE Alien_ID ="+upphittadID);
                idb.delete("DELETE FROM mibdb.Boglodite WHERE Alien_ID ="+upphittadID);
                idb.delete(tabort);
                
                new AgentAliens(idb,ID).setVisible(true);
                dispose();
                
            } else {
                
                new AgentAliens(idb,ID).setVisible(true);
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

    private void områdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_områdeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_områdeActionPerformed

    private void statistikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statistikActionPerformed
        
        new AlienStatistik(idb,ID).setVisible(true);
        
    }//GEN-LAST:event_statistikActionPerformed

    private void ändraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ändraActionPerformed

    int resultat = JOptionPane.showConfirmDialog(null, "Är du säker att du vill ändra rasen?", "Bekräfta uppgifter", JOptionPane.YES_NO_OPTION);
    
    if(resultat == JOptionPane.YES_OPTION){
        
        if (ras.getSelectedItem().toString().equals("Squid")){
            
                ändraTillSquid();
                JOptionPane.showMessageDialog(null, "Ändring sparade!");
                new AgentAliens(idb,ID).setVisible(true);
                dispose();
                
            }else if (ras.getSelectedItem().toString().equals("Worm")){
                
                ändraTillWorm();
                JOptionPane.showMessageDialog(null, "Ändring sparade!");
                new AgentAliens(idb,ID).setVisible(true);
                dispose();
                
            }else if (ras.getSelectedItem().toString().equals("Boglodite")){
                
                ändraTillBoglodite();
                JOptionPane.showMessageDialog(null, "Ändring sparade!");
                new AgentAliens(idb,ID).setVisible(true);
                dispose();
                    
        }
    
    } else {
                    
    }
        
        
    }//GEN-LAST:event_ändraActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> agenter;
    private javax.swing.JComboBox<String> aliens;
    private com.toedter.calendar.JDateChooser datum;
    private javax.swing.JRadioButton döljaLösenord;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField lösenord;
    private javax.swing.JTextField namn;
    private javax.swing.JComboBox<String> område;
    private javax.swing.JComboBox<String> ras;
    private javax.swing.JButton redigera;
    private javax.swing.JButton spara;
    private javax.swing.JButton statistik;
    private javax.swing.JButton taBort;
    private javax.swing.JTextField telefon;
    private javax.swing.JButton ändra;
    // End of variables declaration//GEN-END:variables
}
