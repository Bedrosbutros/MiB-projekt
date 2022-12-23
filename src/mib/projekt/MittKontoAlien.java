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

    private void start()
    {
        namn.setEnabled(false);
        telefon.setEnabled(false);
        plats.setEnabled(false);
        datum.setEnabled(false);
        ras.setEnabled(false);
        agent.setEnabled(false);
        hämtaRas();
    }
     
    private void hämtaRas()
    {
        
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
    
    private void fyllPlats()
    {
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
    
    private void hämtaInfo()
    {
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
        ändraLösenord = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        namn = new javax.swing.JTextField();
        telefon = new javax.swing.JTextField();
        datum = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        ras = new javax.swing.JTextField();
        plats = new javax.swing.JTextField();
        agent = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ändraLösenord.setText("Ändra Lösenord");
        ändraLösenord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ändraLösenordActionPerformed(evt);
            }
        });

        jLabel1.setText("Namn");

        jLabel2.setText("Telefon");

        jLabel3.setText("Registreringsdatum");

        jLabel5.setText("Plats");

        jLabel6.setText("Agent");

        namn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namnActionPerformed(evt);
            }
        });

        jLabel7.setText("Ras");

        ras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rasActionPerformed(evt);
            }
        });

        plats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                platsActionPerformed(evt);
            }
        });

        agent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(ändraLösenord, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(254, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ras)
                    .addComponent(namn)
                    .addComponent(telefon, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(datum, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                    .addComponent(plats)
                    .addComponent(agent))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(namn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(telefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(datum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(agent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(53, 53, 53)
                .addComponent(ändraLösenord, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
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
        // TODO add your handling code here:
    }//GEN-LAST:event_namnActionPerformed

    private void rasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rasActionPerformed

    private void platsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_platsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_platsActionPerformed

    private void agentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_agentActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField agent;
    private com.toedter.calendar.JDateChooser datum;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField namn;
    private javax.swing.JTextField plats;
    private javax.swing.JTextField ras;
    private javax.swing.JTextField telefon;
    private javax.swing.JButton ändraLösenord;
    // End of variables declaration//GEN-END:variables
}
