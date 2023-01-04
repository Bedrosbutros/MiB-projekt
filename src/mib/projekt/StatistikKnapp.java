package mib.projekt;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import oru.inf.InfDB;
import javax.swing.JOptionPane;
import oru.inf.InfException;

public class StatistikKnapp extends javax.swing.JFrame {

    private InfDB idb;
    private String ID;
    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    public StatistikKnapp(InfDB idb, String ID) {
        initComponents();
        this.idb = idb;
        this.ID =ID;
        this.setLocationRelativeTo(null); //Gör så att fönstret körs i mitten av skärmen
        fyllInformation();
        StatistikKnapp.this.setDefaultCloseOperation(DISPOSE_ON_CLOSE); //Gör så att programmet inte stänger helt när man trycker på X

    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        info = new javax.swing.JLabel();
        sorteraEfter = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista = new javax.swing.JList<>();
        rasPlats = new javax.swing.JComboBox<>();
        förstaDatum = new com.toedter.calendar.JDateChooser();
        andraDatum = new com.toedter.calendar.JDateChooser();
        ok = new javax.swing.JButton();
        titel = new javax.swing.JLabel();
        textKontorschef = new javax.swing.JLabel();
        kontorschef = new javax.swing.JComboBox<>();
        textOmråde = new javax.swing.JLabel();
        område = new javax.swing.JComboBox<>();
        textOmrådeschef = new javax.swing.JLabel();
        områdeschef = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        info.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        info.setText("Sortera efter:");

        sorteraEfter.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        sorteraEfter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sorteraEfterActionPerformed(evt);
            }
        });

        lista.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        jScrollPane1.setViewportView(lista);

        rasPlats.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        rasPlats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rasPlatsActionPerformed(evt);
            }
        });

        förstaDatum.setDateFormatString("yyyy-MM-dd");
        förstaDatum.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N

        andraDatum.setDateFormatString("yyyy-MM-dd");
        andraDatum.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N

        ok.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        ok.setText("OK");
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });

        titel.setFont(new java.awt.Font("Futura", 0, 24)); // NOI18N
        titel.setText("Statistik");

        textKontorschef.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        textKontorschef.setText("Kontrorschef");

        kontorschef.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N

        textOmråde.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        textOmråde.setText("Område");

        område.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        område.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                områdeActionPerformed(evt);
            }
        });

        textOmrådeschef.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        textOmrådeschef.setText("Områdeschef");

        områdeschef.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mib/projekt/pie-chart.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 268, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel8)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 503, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel8)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(sorteraEfter, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rasPlats, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(förstaDatum, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(andraDatum, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(kontorschef, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(textKontorschef)
                                .addComponent(textOmrådeschef)
                                .addComponent(textOmråde)
                                .addComponent(område, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(områdeschef, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(info)
                            .addComponent(ok, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(titel)
                        .addGap(147, 147, 147))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(titel)
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(info)
                        .addGap(27, 27, 27)
                        .addComponent(sorteraEfter, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rasPlats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(förstaDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(andraDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ok)))
                .addGap(17, 17, 17)
                .addComponent(textKontorschef)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kontorschef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textOmråde)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(område, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textOmrådeschef)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(områdeschef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fyllInformation(){
        
        sorteraEfter.addItem("Plats");
        sorteraEfter.addItem("Ras");
        sorteraEfter.addItem("Datum");
        förstaDatum.setEnabled(false);
        kontorschef.setEnabled(false);
        områdeschef.setEnabled(false);
        andraDatum.setEnabled(false);
        ok.setEnabled(false);
        
        String hämtaNamn = "SELECT Namn from Agent";
        String hämtaOmråde = "Select Benamning from Omrade";
        
        ArrayList<String> allaAlienNamn;
        ArrayList<String> allaOmrådesNamn;
        
        try {
            
            allaAlienNamn = idb.fetchColumn(hämtaNamn);
            allaOmrådesNamn = idb.fetchColumn(hämtaOmråde);

            for (String namn : allaAlienNamn) {
                kontorschef.addItem(namn);
                områdeschef.addItem(namn);
            }            
            
            for (String benämning : allaOmrådesNamn) {
                område.addItem(benämning);
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
    
    private void sorteraEfterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sorteraEfterActionPerformed

        try {

            if (sorteraEfter.getSelectedItem().toString().equals("Ras")){

                rasPlats.removeAllItems();
                rasPlats.addItem("Worm");
                rasPlats.addItem("Squid");
                rasPlats.addItem("Boglodite");
                rasPlats.setEnabled(true);
                förstaDatum.setEnabled(false);
                andraDatum.setEnabled(false);
                ok.setEnabled(false);

            }else if(sorteraEfter.getSelectedItem().toString().equals("Plats")){

                String hämtaPlats = "Select Benamning from Plats";
                rasPlats.removeAllItems();

                ArrayList<String> allaOmrådesNamn;
                allaOmrådesNamn = idb.fetchColumn(hämtaPlats);

                for (String benämning : allaOmrådesNamn) {
                    rasPlats.addItem(benämning);
                }

                rasPlats.setEnabled(true);
                förstaDatum.setEnabled(false);
                andraDatum.setEnabled(false);
                ok.setEnabled(false);

            }else if(sorteraEfter.getSelectedItem().toString().equals("Datum")){
                lista.clearSelection();
                rasPlats.setEnabled(false);
                förstaDatum.setEnabled(true);
                andraDatum.setEnabled(true);
                ok.setEnabled(true);
            }

        } catch (InfException ettUndantag) {
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        }

        catch (Exception ettUndantag) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        }

    }//GEN-LAST:event_sorteraEfterActionPerformed

    private void rasPlatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rasPlatsActionPerformed

        if(sorteraEfter.getSelectedItem().toString().equals("Ras")){
            hämtaEfterRas();
        }else if(sorteraEfter.getSelectedItem().toString().equals("Plats")){
            hämtaEfterPlats();
        }else if (sorteraEfter.getSelectedItem().toString().equals("Datum")){
            hämtaEfterDatum();
            lista.clearSelection();
        }

    }//GEN-LAST:event_rasPlatsActionPerformed

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed

        hämtaEfterDatum();

    }//GEN-LAST:event_okActionPerformed

    private void områdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_områdeActionPerformed

        väljAgent();

    }//GEN-LAST:event_områdeActionPerformed

    private void väljAgent(){
    
        String valdOmråde = område.getSelectedItem().toString();
        String väljOmrådeschef = "select Namn from Agent join Omradeschef O on Agent.Agent_ID = O.Agent_ID join Omrade O2 on O2.Omrades_ID = O.Omrade where Benamning='"+valdOmråde+"'";
        String valdKontorschef = "select Namn from Agent join Kontorschef K on Agent.Agent_ID = K.Agent_ID where Kontorsbeteckning='Örebrokontoret'";
        
        try {
            
            kontorschef.setSelectedItem(idb.fetchSingle(valdKontorschef));
            områdeschef.setSelectedItem(idb.fetchSingle(väljOmrådeschef));
            
        } catch (InfException ettUndantag) {
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        }
        
        catch (Exception ettUndantag) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        }
        
    }
    
    private void hämtaEfterRas(){
        
        try {
            
            ArrayList<String> hämtaSquid = idb.fetchColumn("select Namn from Alien join Squid S on Alien.Alien_ID = S.Alien_ID");
            ArrayList<String> hämtaWorm = idb.fetchColumn("select Namn from Alien join Worm W on Alien.Alien_ID = W.Alien_ID");
            ArrayList<String> hämtaBoglodite = idb.fetchColumn("select Namn from Alien join Boglodite B on Alien.Alien_ID = B.Alien_ID");
            
            if (rasPlats.getSelectedItem().toString().equals("Squid")){
                lista.setListData(hämtaSquid.toArray(new String[0]));
            }else if (rasPlats.getSelectedItem().toString().equals("Worm")){
                lista.setListData(hämtaWorm.toArray(new String[0]));
            }else if (rasPlats.getSelectedItem().toString().equals("Boglodite")){
                lista.setListData(hämtaBoglodite.toArray(new String[0]));
            }
            
            
        } catch (InfException ettUndantag) {
            //JOptionPane.showMessageDialog(null, "Databasfel!");
            //System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        }
        
        catch (Exception ettUndantag) {
            //JOptionPane.showMessageDialog(null, "Något gick fel!");
            //System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        }
        
    }
    
    private void hämtaEfterPlats(){
        
        try {
            
            String valdPlats = rasPlats.getSelectedItem().toString();
            ArrayList<String> hämtaFrånOmråde = idb.fetchColumn("select Namn from Alien join Plats P on P.Plats_ID = Alien.Plats where Benamning='"+valdPlats+"'");

            lista.setListData(hämtaFrånOmråde.toArray(new String[0]));
            
            
        } catch (InfException ettUndantag) {
            //JOptionPane.showMessageDialog(null, "Databasfel!");
            //System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        }
        
        catch (Exception ettUndantag) {
            //JOptionPane.showMessageDialog(null, "Något gick fel!");
            //System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        }
        
    }
    
    private void hämtaEfterDatum(){
        
        try {
            
            Date datum1 = förstaDatum.getDate();
            Date datum2 = andraDatum.getDate();
            String förstaDatumet = dateFormat.format(datum1);
            String andraDatumet = dateFormat.format(datum2);
            
            ArrayList<String> hämtaMellanDatum = idb.fetchColumn("select Namn from Alien where Registreringsdatum between '"+förstaDatumet+"' and '"+andraDatumet+"'");
            lista.setListData(hämtaMellanDatum.toArray(new String[0]));
            
        } catch (InfException ettUndantag) {
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        }
        
        catch (Exception ettUndantag) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        }
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser andraDatum;
    private com.toedter.calendar.JDateChooser förstaDatum;
    private javax.swing.JLabel info;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> kontorschef;
    private javax.swing.JList<String> lista;
    private javax.swing.JButton ok;
    private javax.swing.JComboBox<String> område;
    private javax.swing.JComboBox<String> områdeschef;
    private javax.swing.JComboBox<String> rasPlats;
    private javax.swing.JComboBox<String> sorteraEfter;
    private javax.swing.JLabel textKontorschef;
    private javax.swing.JLabel textOmråde;
    private javax.swing.JLabel textOmrådeschef;
    private javax.swing.JLabel titel;
    // End of variables declaration//GEN-END:variables
}
