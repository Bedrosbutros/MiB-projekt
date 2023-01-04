package mib.projekt;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;
import java.util.Date;

public class AlienStatistik extends javax.swing.JFrame {

    private InfDB idb;
    private String ID;
    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    public AlienStatistik(InfDB idb, String ID) {
        initComponents();
        this.setLocationRelativeTo(null); //Gör så att fönstret körs i mitten av skärmen
        this.idb=idb;
        this.ID=ID;
        AlienStatistik.this.setDefaultCloseOperation(DISPOSE_ON_CLOSE); //Gör så att programmet inte stänger helt när man trycker på X
        fyllInformation();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        info = new javax.swing.JLabel();
        sorteraEfter = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista = new javax.swing.JList<>();
        rasPlats = new javax.swing.JComboBox<>();
        förstaDatum = new com.toedter.calendar.JDateChooser();
        andraDatum = new com.toedter.calendar.JDateChooser();
        ok = new javax.swing.JButton();
        titel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        info.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        info.setForeground(new java.awt.Color(51, 51, 51));
        info.setText("Sortera efter:");

        sorteraEfter.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        sorteraEfter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sorteraEfterActionPerformed(evt);
            }
        });

        lista.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        lista.setForeground(new java.awt.Color(51, 51, 51));
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
        ok.setForeground(new java.awt.Color(51, 51, 51));
        ok.setText("OK");
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });

        titel.setFont(new java.awt.Font("Futura", 0, 36)); // NOI18N
        titel.setForeground(new java.awt.Color(51, 51, 51));
        titel.setText("Statistik");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(info)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(sorteraEfter, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(rasPlats, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(förstaDatum, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(andraDatum, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(ok, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(titel)
                        .addGap(118, 118, 118))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(titel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(info)
                        .addGap(18, 18, 18)
                        .addComponent(sorteraEfter, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rasPlats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(förstaDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(andraDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ok, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34))
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

    private void fyllInformation()
    {
        sorteraEfter.addItem("Plats");
        sorteraEfter.addItem("Ras");
        sorteraEfter.addItem("Datum");
        förstaDatum.setEnabled(false);
        andraDatum.setEnabled(false);
        ok.setEnabled(false);

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
    
    private void hämtaEfterPlats()
    {
        
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
    
    private void hämtaEfterDatum()
    {
        
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
    private javax.swing.JList<String> lista;
    private javax.swing.JButton ok;
    private javax.swing.JComboBox<String> rasPlats;
    private javax.swing.JComboBox<String> sorteraEfter;
    private javax.swing.JLabel titel;
    // End of variables declaration//GEN-END:variables
}
