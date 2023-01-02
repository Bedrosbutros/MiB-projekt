package mib.projekt;

import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class NyUtrustning extends javax.swing.JFrame {

    private InfDB idb;
    String ID;
    
    public NyUtrustning(InfDB idb, String ID) {
        initComponents();
        this.idb = idb;
        this.setLocationRelativeTo(null);
        this.ID = ID;
        fyllUtrustningsTyper();
        kontrolleraText();
        NyUtrustning.this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }


    private void fyllUtrustningsTyper()
    {
        utrustningsTyp.addItem("Vapen");
        utrustningsTyp.addItem("Teknik");
        utrustningsTyp.addItem("Kommunikation");
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        namn = new javax.swing.JTextField();
        egenskap = new javax.swing.JTextField();
        utrustningsTyp = new javax.swing.JComboBox<>();
        egenskapsNamn = new javax.swing.JLabel();
        spara = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        namn.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N

        egenskap.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        egenskap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                egenskapActionPerformed(evt);
            }
        });

        utrustningsTyp.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        utrustningsTyp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                utrustningsTypActionPerformed(evt);
            }
        });

        egenskapsNamn.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        egenskapsNamn.setText("A");

        spara.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        spara.setText("Spara");
        spara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sparaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        jLabel1.setText("Utrustningstyp");

        jLabel2.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        jLabel2.setText("Utrustningsnamn");

        jLabel3.setFont(new java.awt.Font("Futura", 0, 24)); // NOI18N
        jLabel3.setText("Registrera ny utrustning");

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mib/projekt/weapon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(39, 39, 39))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(egenskapsNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(namn)
                                        .addComponent(egenskap)
                                        .addComponent(utrustningsTyp, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(52, 52, 52))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(19, 19, 19))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(spara, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(31, 31, 31)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(namn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(utrustningsTyp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(egenskapsNamn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(egenskap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(spara, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
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

    private void sparaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sparaActionPerformed
        
        try
        {
            
            String nyUtrustningsID = idb.getAutoIncrement("Utrustning", "Utrustnings_ID");
            String utrustningsNamn = namn.getText();
            String läggTillUtrustning = "INSERT INTO mibdb.Utrustning (Utrustnings_ID, Benamning) VALUES ("+nyUtrustningsID+", '"+utrustningsNamn+"')";
            String valdUtrustningsTyp = utrustningsTyp.getSelectedItem().toString();
            
            int resultat = JOptionPane.showConfirmDialog(null, "Är du nöjd med allt du har skrivit?", "Bekräfta uppgifter", JOptionPane.YES_NO_OPTION);
            
            if(resultat == JOptionPane.YES_OPTION)
                {
                    idb.insert(läggTillUtrustning);
            
                    if (valdUtrustningsTyp.equals("Vapen")){
                        idb.insert("INSERT INTO mibdb.Vapen (Utrustnings_ID, Kaliber) VALUES ("+nyUtrustningsID+", +"+egenskap.getText()+")");
                        new HanteraUtrustning(idb,ID).setVisible(true);
                        dispose();
                    }
        
                    if (valdUtrustningsTyp.equals("Teknik")){
                        idb.insert("INSERT INTO mibdb.Teknik (Utrustnings_ID, Kraftkalla) VALUES ("+nyUtrustningsID+", '"+egenskap.getText()+"')");
                        new HanteraUtrustning(idb,ID).setVisible(true);
                        dispose();
                    }
        
                    if (valdUtrustningsTyp.equals("Kommunikation")){
                        idb.insert("INSERT INTO mibdb.Kommunikation (Utrustnings_ID, Overforingsteknik) VALUES ("+nyUtrustningsID+", '"+egenskap.getText()+"')");
                        new HanteraUtrustning(idb,ID).setVisible(true);
                        dispose();
                    }
                    
                } else {
                    
                }  
            
        }catch (InfException ettUndantag) {
            
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
            
        }
        
        catch (Exception ettUndantag) {
            
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
            
        }
        
    }//GEN-LAST:event_sparaActionPerformed

    private void utrustningsTypActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_utrustningsTypActionPerformed
        
        String valdUtrustningsTyp = utrustningsTyp.getSelectedItem().toString();
        
        if (valdUtrustningsTyp.equals("Vapen")){
            egenskapsNamn.setText("Antal kaliber");
        }
        
        if (valdUtrustningsTyp.equals("Teknik")){
            egenskapsNamn.setText("Vilken kraftkälla");
        }
        
        if (valdUtrustningsTyp.equals("Kommunikation")){
            egenskapsNamn.setText("Vilken överförningsteknik");
        }
        
    }//GEN-LAST:event_utrustningsTypActionPerformed

    private void egenskapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_egenskapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_egenskapActionPerformed

    private void kontrolleraText(){
        
        egenskap.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if (utrustningsTyp.getSelectedItem().toString().equals("Vapen")){
                    Validering.endastNummerTillåten(egenskap);
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                if (utrustningsTyp.getSelectedItem().toString().equals("Vapen")){
                    Validering.endastNummerTillåten(egenskap);
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                if (utrustningsTyp.getSelectedItem().toString().equals("Vapen")){
                    Validering.endastNummerTillåten(egenskap);
                }
            }
        });
        
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField egenskap;
    private javax.swing.JLabel egenskapsNamn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField namn;
    private javax.swing.JButton spara;
    private javax.swing.JComboBox<String> utrustningsTyp;
    // End of variables declaration//GEN-END:variables
}
