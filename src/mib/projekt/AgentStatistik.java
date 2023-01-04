package mib.projekt;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

public class AgentStatistik extends javax.swing.JFrame {

    private InfDB idb;
    private String ID;

    public AgentStatistik(InfDB idb, String ID) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.idb=idb;
        this.ID=ID;
        AgentStatistik.this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        fyllInformation();
        
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista = new javax.swing.JList<>();
        områden = new javax.swing.JComboBox<>();
        områdeschef = new javax.swing.JTextField();
        textOmrådeschef = new javax.swing.JLabel();
        textValdOmråde = new javax.swing.JLabel();
        topTre = new javax.swing.JButton();
        titel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lista.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        jScrollPane1.setViewportView(lista);

        områden.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        områden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                områdenActionPerformed(evt);
            }
        });

        områdeschef.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        områdeschef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                områdeschefActionPerformed(evt);
            }
        });

        textOmrådeschef.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        textOmrådeschef.setText("Områdeschef");

        textValdOmråde.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        textValdOmråde.setText("Välj ett område");

        topTre.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        topTre.setText("Top 3");
        topTre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                topTreActionPerformed(evt);
            }
        });

        titel.setFont(new java.awt.Font("Futura", 0, 36)); // NOI18N
        titel.setText("Agent Statistik");

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mib/projekt/pie-chart.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel8)
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(områden, 0, 131, Short.MAX_VALUE)
                                        .addComponent(områdeschef))
                                    .addComponent(textOmrådeschef)
                                    .addComponent(textValdOmråde))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(topTre)
                                .addGap(49, 49, 49)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(titel)
                        .addGap(51, 51, 51))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(titel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(textValdOmråde)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(områden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textOmrådeschef)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(områdeschef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(topTre)
                        .addGap(51, 51, 51))))
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

    private void fyllInformation(){
        
        områdeschef.setEnabled(false);
        
        try
        {
            String hämtaUtrusning = "select Benamning from Omrade";
            ArrayList<String> allaOmråden;
            allaOmråden = idb.fetchColumn(hämtaUtrusning);
            
            
            for (String namn : allaOmråden){
                områden.addItem(namn);
            }
            
            hittaOmrådeschef();
            
        }catch (InfException ettUndantag) {
            
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
            
        }
        
        catch (Exception ettUndantag) {
            
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
            
        }
        
    }
    
    private void hittaOmrådeschef(){
        
        try
        {
            
            String valdOmråde = områden.getSelectedItem().toString();
            String hittaOmrådesChef = "select Namn from Agent join Omradeschef O on Agent.Agent_ID = O.Agent_ID join Omrade O2 on O.Omrade = O2.Omrades_ID where Benamning='"+valdOmråde+"'";
            områdeschef.setText(idb.fetchSingle(hittaOmrådesChef));
            
        }catch (InfException ettUndantag) {
            
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
            
        }
        
        catch (Exception ettUndantag) {
            
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
            
        }
        
    }
    
    private void områdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_områdenActionPerformed
        
        hittaOmrådeschef();
        
    }//GEN-LAST:event_områdenActionPerformed

    private void områdeschefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_områdeschefActionPerformed
        
        
        
    }//GEN-LAST:event_områdeschefActionPerformed

    private void topTreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_topTreActionPerformed
        
        try
        {
            
            String valdOmråde = områden.getSelectedItem().toString();
            String hämtaTopTre = "select Agent.Namn from Agent join Alien A on Agent.Agent_ID = A.Ansvarig_Agent join Omrade O on Agent.Omrade = O.Omrades_ID where Benamning='"+valdOmråde+"' GROUP BY Namn order by count(*) DESC limit 3";
            
            ArrayList<String> hämtaStatistik = idb.fetchColumn(hämtaTopTre);
            lista.setListData(hämtaStatistik.toArray(new String[0]));
            
        }catch (InfException ettUndantag) {
            
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
            
        }
        
        catch (Exception ettUndantag) {
            
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
            
        }
        
    }//GEN-LAST:event_topTreActionPerformed

 
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lista;
    private javax.swing.JComboBox<String> områden;
    private javax.swing.JTextField områdeschef;
    private javax.swing.JLabel textOmrådeschef;
    private javax.swing.JLabel textValdOmråde;
    private javax.swing.JLabel titel;
    private javax.swing.JButton topTre;
    // End of variables declaration//GEN-END:variables
}
