package mib.projekt;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;
import java.util.Date;
import java.util.HashMap;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

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
        kontrolleraText();
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
        ändra = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        statistik = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        namn.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        namn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namnActionPerformed(evt);
            }
        });

        telefon.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N

        lösenord.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        lösenord.setText("jPasswordField1");

        område.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        område.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                områdeActionPerformed(evt);
            }
        });

        agenter.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N

        aliens.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        aliens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aliensActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Futura", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Registrerade Aliens");

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

        taBort.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        taBort.setForeground(new java.awt.Color(51, 51, 51));
        taBort.setText("Ta bort");
        taBort.setToolTipText("");
        taBort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taBortActionPerformed(evt);
            }
        });

        ras.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        ras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rasActionPerformed(evt);
            }
        });

        ändra.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        ändra.setForeground(new java.awt.Color(51, 51, 51));
        ändra.setText("Ändra");
        ändra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ändraActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        statistik.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        statistik.setForeground(new java.awt.Color(51, 51, 51));
        statistik.setText("Statistik");
        statistik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statistikActionPerformed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mib/projekt/ufo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(statistik, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jLabel10)))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(103, 103, 103)
                .addComponent(statistik, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );

        jLabel2.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Namn");

        jLabel3.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Telefon");

        jLabel4.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Registreringsdatum");

        jLabel5.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Lösenord");

        jLabel6.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Område");

        jLabel7.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Agent");

        jLabel8.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Ras");

        jLabel9.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Vald Alien");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 58, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(73, 73, 73))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel5))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(döljaLösenord, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(ändra, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel9))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(agenter, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(område, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lösenord, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(datum, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                                    .addComponent(telefon, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(namn, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(aliens, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ras, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(taBort, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spara, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(redigera)))
                        .addGap(65, 65, 65))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aliens, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(namn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(telefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(datum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(döljaLösenord, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lösenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(område, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agenter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ändra)
                        .addComponent(jLabel8))
                    .addComponent(ras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spara, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(taBort, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(redigera, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        
    if (Validering.endastNummerTillåten(telefon)){
    if (Validering.lösenordetÄrLång(lösenord)){    
    if (Validering.rutanÄrTom(namn, jLabel2)){
    if (Validering.rutanÄrTom(telefon, jLabel3)){ 
    if (Validering.rutanÄrTom(lösenord, jLabel5)){
    
       
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
    }
    }
    }
    }
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

    private void rasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rasActionPerformed

    private void kontrolleraText(){
        
        telefon.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                Validering.endastNummerTillåten(telefon);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                Validering.endastNummerTillåten(telefon);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                Validering.endastNummerTillåten(telefon);
            }
        });
        
        lösenord.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                Validering.lösenordetÄrLång(lösenord);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                Validering.lösenordetÄrLång(lösenord);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                Validering.lösenordetÄrLång(lösenord);
            }
        });
        
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> agenter;
    private javax.swing.JComboBox<String> aliens;
    private com.toedter.calendar.JDateChooser datum;
    private javax.swing.JRadioButton döljaLösenord;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
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
