package mib.projekt;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;
import java.util.Date;
import java.util.HashMap;

public class MittKontoAlien extends javax.swing.JFrame {

    private InfDB idb;
    private String ID;
    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    
    public MittKontoAlien(InfDB idb, String ID) {
        initComponents();
        this.idb = idb;
        this.ID =ID;
        this.setLocationRelativeTo(null);
        start();
        hämtaInfo();
        fyllPlats();
        MittKontoAlien.this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    private void start(){
        
        namn.setEnabled(false);
        telefon.setEnabled(false);
        plats.setEnabled(false);
        datum.setEnabled(false);
        ras.setEnabled(false);
        agent.setEnabled(false);
        hämtaRas();
    }
     
    private void hämtaRas(){
        
        try {
            
            
            ArrayList<HashMap<String,String>> squid = idb.fetchRows("select Alien_ID from Squid where Alien_ID="+ID);
            ArrayList<HashMap<String,String>> worm = idb.fetchRows("select Alien_ID from Worm where Alien_ID="+ID);
            ArrayList<HashMap<String,String>> boglodite = idb.fetchRows("select Alien_ID from Boglodite where Alien_ID="+ID);
            
            for (HashMap<String,String> squidLista : squid){
                for (String key : squidLista.keySet()){
                    if (ID.equals(squidLista.get(key))){
                        ras.setText("Squid");
                    }
                }
            }
            
            for (HashMap<String,String> wormLista : worm){
                for (String key : wormLista.keySet()){
                    if (ID.equals(wormLista.get(key))){
                        ras.setText("Worm");
                    }
                }
            }
            
            for (HashMap<String,String> boloditeLista : boglodite){
                for (String key : boloditeLista.keySet()){
                    if (ID.equals(boloditeLista.get(key))){
                        ras.setText("Boglodite");
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
    
    private void fyllPlats(){
        
        try
        {
            String fråga = "select Benamning from Plats";
            String hämtaOmråde = "select Benamning from Plats join Alien A on Plats.Plats_ID = A.Plats where Alien_ID="+ID;
            plats.setText(idb.fetchSingle(fråga));
            
            
        }catch (InfException ettUndantag){
            
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
            
        }
        
        catch (Exception ettUndantag) {
            
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
            
        }
        
    }
    
    private void hämtaInfo(){
        
        String hämtaNamn= "select Namn from Alien where Alien_ID="+ID;
        String hämtaTelefon= "select Telefon from Alien where Alien_ID="+ID;
        String hämtaDatum ="select Registreringsdatum from Alien where Alien_ID="+ID;
        String hämtaAgent = "select Agent.Namn from Agent join Alien A on Agent.Agent_ID = A.Ansvarig_Agent where Alien_ID="+ID;
        
        try
        {
            namn.setText(idb.fetchSingle(hämtaNamn));
            telefon.setText(idb.fetchSingle(hämtaTelefon));
            Date datumet = dateFormat.parse(idb.fetchSingle(hämtaDatum));
            datum.setDate(datumet);
            agent.setText(idb.fetchSingle(hämtaAgent));
            
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

        jPanel1 = new javax.swing.JPanel();
        textNamn = new javax.swing.JLabel();
        textTelefon = new javax.swing.JLabel();
        textRegistreringsdatum = new javax.swing.JLabel();
        textPlats = new javax.swing.JLabel();
        textAgent = new javax.swing.JLabel();
        namn = new javax.swing.JTextField();
        telefon = new javax.swing.JTextField();
        datum = new com.toedter.calendar.JDateChooser();
        textRas = new javax.swing.JLabel();
        ras = new javax.swing.JTextField();
        plats = new javax.swing.JTextField();
        agent = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        ändraLösenord = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        titel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        textNamn.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        textNamn.setForeground(new java.awt.Color(51, 51, 51));
        textNamn.setText("Namn");

        textTelefon.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        textTelefon.setForeground(new java.awt.Color(51, 51, 51));
        textTelefon.setText("Telefon");

        textRegistreringsdatum.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        textRegistreringsdatum.setForeground(new java.awt.Color(51, 51, 51));
        textRegistreringsdatum.setText("Registreringsdatum");

        textPlats.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        textPlats.setForeground(new java.awt.Color(51, 51, 51));
        textPlats.setText("Plats");

        textAgent.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        textAgent.setForeground(new java.awt.Color(51, 51, 51));
        textAgent.setText("Agent");

        namn.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        namn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namnActionPerformed(evt);
            }
        });

        telefon.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N

        datum.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N

        textRas.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        textRas.setForeground(new java.awt.Color(51, 51, 51));
        textRas.setText("Ras");

        ras.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        ras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rasActionPerformed(evt);
            }
        });

        plats.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        plats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                platsActionPerformed(evt);
            }
        });

        agent.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        agent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agentActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        ändraLösenord.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        ändraLösenord.setForeground(new java.awt.Color(51, 51, 51));
        ändraLösenord.setText("Ändra Lösenord");
        ändraLösenord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ändraLösenordActionPerformed(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mib/projekt/cog.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ändraLösenord)
                    .addComponent(jLabel9))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(72, 72, 72)
                .addComponent(ändraLösenord, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        titel.setFont(new java.awt.Font("Futura", 0, 36)); // NOI18N
        titel.setForeground(new java.awt.Color(51, 51, 51));
        titel.setText("Mitt konto");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textRas)
                            .addComponent(textRegistreringsdatum)
                            .addComponent(textPlats)
                            .addComponent(textAgent)
                            .addComponent(textTelefon)
                            .addComponent(textNamn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ras)
                                    .addComponent(plats)
                                    .addComponent(telefon, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(agent, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(namn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(datum, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(titel)
                        .addGap(96, 96, 96))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(titel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textNamn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(telefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textTelefon))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(datum, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textRegistreringsdatum, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(plats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(agent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(textPlats, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(textRas)))
                .addGap(125, 125, 125))
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

    
    private void ändraLösenordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ändraLösenordActionPerformed
      
        new ÄndraLösenordAlien(idb, ID).setVisible(true);
        
    }//GEN-LAST:event_ändraLösenordActionPerformed

    private void namnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namnActionPerformed
        
    }//GEN-LAST:event_namnActionPerformed

    private void rasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rasActionPerformed
        
    }//GEN-LAST:event_rasActionPerformed

    private void platsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_platsActionPerformed
        
    }//GEN-LAST:event_platsActionPerformed

    private void agentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agentActionPerformed
        
    }//GEN-LAST:event_agentActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField agent;
    private com.toedter.calendar.JDateChooser datum;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField namn;
    private javax.swing.JTextField plats;
    private javax.swing.JTextField ras;
    private javax.swing.JTextField telefon;
    private javax.swing.JLabel textAgent;
    private javax.swing.JLabel textNamn;
    private javax.swing.JLabel textPlats;
    private javax.swing.JLabel textRas;
    private javax.swing.JLabel textRegistreringsdatum;
    private javax.swing.JLabel textTelefon;
    private javax.swing.JLabel titel;
    private javax.swing.JButton ändraLösenord;
    // End of variables declaration//GEN-END:variables
}
