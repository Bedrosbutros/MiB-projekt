
package mib.projekt;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

public class AdminPanel extends javax.swing.JFrame {

    private InfDB idb;
    private String ID;

    public AdminPanel(InfDB idb, String ID) 
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
        hanteraAgenter = new javax.swing.JButton();
        registreraAlien = new javax.swing.JButton();
        registreraAgent = new javax.swing.JButton();
        hanteraUtrustning = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        hej.setText("jLabel1");

        loggaUt.setText("Logga ut");
        loggaUt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loggaUtActionPerformed(evt);
            }
        });

        mittKonto.setText("Mitt konto");
        mittKonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mittKontoActionPerformed(evt);
            }
        });

        hanteraAliens.setText("Aliens");
        hanteraAliens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hanteraAliensActionPerformed(evt);
            }
        });

        hanteraAgenter.setText("Agenter");
        hanteraAgenter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hanteraAgenterActionPerformed(evt);
            }
        });

        registreraAlien.setText("Ny Alien");
        registreraAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registreraAlienActionPerformed(evt);
            }
        });

        registreraAgent.setText("Ny Agent");
        registreraAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registreraAgentActionPerformed(evt);
            }
        });

        hanteraUtrustning.setText("Hantera Utrustning");
        hanteraUtrustning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hanteraUtrustningActionPerformed(evt);
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
                                .addComponent(hanteraAliens, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(hanteraAgenter, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(registreraAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(registreraAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(mittKonto, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(hanteraUtrustning, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                    .addComponent(hanteraAgenter, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hanteraAliens, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registreraAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registreraAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(loggaUt, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
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

    private void hanteraAgenterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hanteraAgenterActionPerformed
        
        new AgentAgenter(idb, ID).setVisible(true);
        
    }//GEN-LAST:event_hanteraAgenterActionPerformed

    private void registreraAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registreraAgentActionPerformed
        
        new NyAgent(idb, ID).setVisible(true);
        
    }//GEN-LAST:event_registreraAgentActionPerformed

    private void loggaUtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loggaUtActionPerformed

        new Agent(idb).setVisible(true);
        dispose();

    }//GEN-LAST:event_loggaUtActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton hanteraAgenter;
    private javax.swing.JButton hanteraAliens;
    private javax.swing.JButton hanteraUtrustning;
    private javax.swing.JLabel hej;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loggaUt;
    private javax.swing.JButton mittKonto;
    private javax.swing.JButton registreraAgent;
    private javax.swing.JButton registreraAlien;
    // End of variables declaration//GEN-END:variables
}
