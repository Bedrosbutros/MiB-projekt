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
        this.setLocationRelativeTo(null);
        this.idb=idb;
        this.ID=ID;
        AlienStatistik.this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        info.setText("Sortera efter:");

        sorteraEfter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sorteraEfterActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(lista);

        rasPlats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rasPlatsActionPerformed(evt);
            }
        });

        förstaDatum.setDateFormatString("yyyy-MM-dd");

        andraDatum.setDateFormatString("yyyy-MM-dd");

        ok.setText("OK");
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(info)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(förstaDatum, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                            .addComponent(andraDatum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rasPlats, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sorteraEfter, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ok, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(info)
                .addGap(40, 40, 40)
                .addComponent(sorteraEfter, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rasPlats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(förstaDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(andraDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ok)
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
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

    private void hämtaEfterRas()
    {
        
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lista;
    private javax.swing.JButton ok;
    private javax.swing.JComboBox<String> rasPlats;
    private javax.swing.JComboBox<String> sorteraEfter;
    // End of variables declaration//GEN-END:variables
}
