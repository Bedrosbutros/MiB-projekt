
package mib.projekt;

import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

public class AgentPanel extends javax.swing.JFrame {

    private InfDB idb;
    private String ID;

    public AgentPanel(InfDB idb, String ID) 
    {
        initComponents();
        this.idb = idb;
        this.ID =ID;
        this.setLocationRelativeTo(null);
        hej();
    }
    
    private void hej()
    {
        try
        {
            
            String hejMeddelande = idb.fetchSingle("Select Namn from Agent where Agent_ID="+ID);
            String welcome = "Välkommen"+" "+hejMeddelande+" "+"vad vill du göra idag?";
            hej.setText(welcome);
            
        }catch (InfException ettUndantag) {
            
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
            
        }
        
        catch (Exception ettUndantag) {
            
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
            
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        hej = new javax.swing.JLabel();
        loggaUt = new javax.swing.JButton();
        mittKonto = new javax.swing.JButton();
        hanteraAliens = new javax.swing.JButton();
        registreraAlien = new javax.swing.JButton();
        hanteraUtrustning = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        hej.setBackground(new java.awt.Color(255, 255, 255));
        hej.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        hej.setForeground(new java.awt.Color(255, 255, 255));
        hej.setText("jLabel1");

        loggaUt.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        loggaUt.setForeground(new java.awt.Color(51, 51, 51));
        loggaUt.setText("Logga ut");
        loggaUt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loggaUtActionPerformed(evt);
            }
        });

        mittKonto.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        mittKonto.setForeground(new java.awt.Color(51, 51, 51));
        mittKonto.setText("Mitt konto");
        mittKonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mittKontoActionPerformed(evt);
            }
        });

        hanteraAliens.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        hanteraAliens.setForeground(new java.awt.Color(51, 51, 51));
        hanteraAliens.setText("Aliens");
        hanteraAliens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hanteraAliensActionPerformed(evt);
            }
        });

        registreraAlien.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        registreraAlien.setForeground(new java.awt.Color(51, 51, 51));
        registreraAlien.setText("Ny Alien");
        registreraAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registreraAlienActionPerformed(evt);
            }
        });

        hanteraUtrustning.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        hanteraUtrustning.setForeground(new java.awt.Color(51, 51, 51));
        hanteraUtrustning.setText("Hantera Utrustning");
        hanteraUtrustning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hanteraUtrustningActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setText("Statistik");
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(hej))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(mittKonto, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(hanteraUtrustning, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(hanteraAliens, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(registreraAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(loggaUt, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(hej)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mittKonto, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hanteraUtrustning, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hanteraAliens, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registreraAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(loggaUt, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
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

    private void mittKontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mittKontoActionPerformed
        
        new MittKonto(idb, ID).setVisible(true);
        
    }//GEN-LAST:event_mittKontoActionPerformed

    private void hanteraAliensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hanteraAliensActionPerformed
        
        new AgentAliens(idb, ID).setVisible(true);
        
    }//GEN-LAST:event_hanteraAliensActionPerformed

    private void registreraAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registreraAlienActionPerformed
       
        new NyAlien(idb, ID).setVisible(true);
        
    }//GEN-LAST:event_registreraAlienActionPerformed

    private void hanteraUtrustningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hanteraUtrustningActionPerformed
        
        new HanteraUtrustning(idb, ID).setVisible(true);
        
    }//GEN-LAST:event_hanteraUtrustningActionPerformed

    private void loggaUtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loggaUtActionPerformed

        new Agent(idb).setVisible(true);
        dispose();

    }//GEN-LAST:event_loggaUtActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        new StatistikKnapp(idb,ID).setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton hanteraAliens;
    private javax.swing.JButton hanteraUtrustning;
    private javax.swing.JLabel hej;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loggaUt;
    private javax.swing.JButton mittKonto;
    private javax.swing.JButton registreraAlien;
    // End of variables declaration//GEN-END:variables
}
