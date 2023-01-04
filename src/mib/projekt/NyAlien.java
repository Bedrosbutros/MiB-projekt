package mib.projekt;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;
import java.util.Date;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class NyAlien extends javax.swing.JFrame {

private InfDB idb;
private String ID;
private boolean showingPassword = false;
private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    public NyAlien(InfDB idb, String ID) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.idb=idb;
        this.ID=ID;
        fyllListor();
        NyAlien.this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        alienID.setEnabled(false);
        kontrolleraText();
        
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        alienID = new javax.swing.JTextField();
        namn = new javax.swing.JTextField();
        datum = new com.toedter.calendar.JDateChooser();
        telefon = new javax.swing.JTextField();
        lösenord = new javax.swing.JPasswordField();
        område = new javax.swing.JComboBox<>();
        agenter = new javax.swing.JComboBox<>();
        titel = new javax.swing.JLabel();
        spara = new javax.swing.JButton();
        döljaLösenord = new javax.swing.JRadioButton();
        ras = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        textAlienID = new javax.swing.JLabel();
        textNamn = new javax.swing.JLabel();
        textTelefon = new javax.swing.JLabel();
        textRegistreringsdatum = new javax.swing.JLabel();
        textLösenord = new javax.swing.JLabel();
        textPlats = new javax.swing.JLabel();
        textAgent = new javax.swing.JLabel();
        textRas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        alienID.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        alienID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alienIDActionPerformed(evt);
            }
        });

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

        agenter.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N

        titel.setFont(new java.awt.Font("Futura", 0, 24)); // NOI18N
        titel.setForeground(new java.awt.Color(51, 51, 51));
        titel.setText("Registrerade Aliens");

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

        ras.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mib/projekt/edit.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel10))
                    .addComponent(jLabel9))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        textAlienID.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        textAlienID.setForeground(new java.awt.Color(51, 51, 51));
        textAlienID.setText("Alien ID");

        textNamn.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        textNamn.setForeground(new java.awt.Color(51, 51, 51));
        textNamn.setText("Namn");

        textTelefon.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        textTelefon.setForeground(new java.awt.Color(51, 51, 51));
        textTelefon.setText("Telefon");

        textRegistreringsdatum.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        textRegistreringsdatum.setForeground(new java.awt.Color(51, 51, 51));
        textRegistreringsdatum.setText("Registreringsdatum");

        textLösenord.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        textLösenord.setForeground(new java.awt.Color(51, 51, 51));
        textLösenord.setText("Lösenord");

        textPlats.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        textPlats.setForeground(new java.awt.Color(51, 51, 51));
        textPlats.setText("Plats");

        textAgent.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        textAgent.setForeground(new java.awt.Color(51, 51, 51));
        textAgent.setText("Agent");

        textRas.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        textRas.setForeground(new java.awt.Color(51, 51, 51));
        textRas.setText("Ras");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(spara, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(textLösenord)
                                            .addComponent(textAlienID)
                                            .addComponent(textNamn)
                                            .addComponent(textTelefon)
                                            .addComponent(textRegistreringsdatum))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                                        .addComponent(döljaLösenord))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(textPlats)
                                            .addComponent(textAgent)
                                            .addComponent(textRas))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(telefon)
                                    .addComponent(namn)
                                    .addComponent(datum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lösenord, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(område, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(agenter, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(alienID, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ras, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(titel)
                        .addGap(80, 80, 80))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(titel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(alienID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textAlienID))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(namn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textNamn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(telefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textTelefon))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(datum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textRegistreringsdatum))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lösenord)
                            .addComponent(döljaLösenord, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textLösenord)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(område, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textPlats))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agenter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textAgent))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textRas))
                .addGap(34, 34, 34)
                .addComponent(spara)
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

    private void fyllListor(){
        
        String hämtaPlats = "Select Benamning from Plats";
        String hämtaAgent= "Select Namn from Agent";
        String bestämmID = "select MAX(Alien_ID) from Alien";
        
        ras.addItem("Squid");
        ras.addItem("Worm");
        ras.addItem("Boglodite");
        
        ArrayList<String> allaOmrådesNamn;
        ArrayList<String> allaAgentNamn;
        
        try {
            
            allaOmrådesNamn = idb.fetchColumn(hämtaPlats);
            allaAgentNamn = idb.fetchColumn(hämtaAgent);

            for (String benämning : allaOmrådesNamn) {
                område.addItem(benämning);
            }  
            
            for (String agent : allaAgentNamn) {
                agenter.addItem(agent);
            }
            
            String nyAlienID = idb.getAutoIncrement("Alien", "Alien_ID");
            alienID.setText(nyAlienID);
            
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
        
    }//GEN-LAST:event_namnActionPerformed

    private void kontrolleraText(){
        
        telefon.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                endastNummer();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                endastNummer();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                endastNummer();
            }
        });
        
        lösenord.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                långLösenord();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                långLösenord();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                långLösenord();
            }
        });
        
    }
    
    private void endastNummer(){
        
        if (telefon.getText().matches("[a-zA-Z]+")){
            JOptionPane.showMessageDialog(null, "Endast siffror tillåtna!");
        }
        
    }
    
    private void långLösenord(){
        
        char[] lösenordet = lösenord.getPassword();
        if(lösenordet.length>6){
            JOptionPane.showMessageDialog(null, "Lösenord får inte vara mer än 6 karaktärer!");
        }
        
    }
    
    private void sparaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sparaActionPerformed
        
    if (Validering.endastNummerTillåten(telefon)){
    if (Validering.lösenordetÄrLång(lösenord)){
    if (Validering.rutanÄrTom(namn, textNamn)){    
    if (Validering.rutanÄrTom(telefon, textTelefon)){   
    if (Validering.rutanÄrTom(lösenord, textLösenord)){    
    
        try {
            
                Date datumet = datum.getDate();
                String nyID = alienID.getText();
                String nyDatum = dateFormat.format(datumet);
                String nyLösen = lösenord.getText();
                String nyNamn = namn.getText();
                String nyTelefon = telefon.getText();
                String nyOmråde = område.getSelectedItem().toString();
                String nyAgent = agenter.getSelectedItem().toString();
                String ändraInfo = "INSERT INTO mibdb.Alien (Alien_ID, Registreringsdatum, Losenord, Namn, Telefon, Plats, Ansvarig_Agent) VALUES ("+nyID+", '"+nyDatum+"', '"+nyLösen+"', '"+nyNamn+"', '"+nyTelefon+"', (select Plats_ID from Plats where Benamning='"+nyOmråde+"'), (select Agent_ID from Agent where Namn= '"+nyAgent+"'))";
                
                int resultat = JOptionPane.showConfirmDialog(null, "Är du nöjd med allt du har skrivit?", "Bekräfta uppgifter", JOptionPane.YES_NO_OPTION);
                
                if(resultat == JOptionPane.YES_OPTION)
                {
                    idb.insert(ändraInfo);
                    
                    if (ras.getSelectedItem().toString().equals("Squid")){
                        String antal = JOptionPane.showInputDialog("Hur många armar?");
                        idb.insert("INSERT INTO mibdb.Squid (Alien_ID, Antal_Armar) VALUES ("+nyID+", "+antal+")");
                    }else if (ras.getSelectedItem().toString().equals("Worm")){
                        idb.insert("INSERT INTO mibdb.Worm (Alien_ID) VALUES ("+nyID+")");
                    }else if (ras.getSelectedItem().toString().equals("Boglodite")){
                        String antal = JOptionPane.showInputDialog("Hur många boogies?");
                        idb.insert("INSERT INTO mibdb.Boglodite (Alien_ID, Antal_Boogies) VALUES ("+nyID+", "+antal+")");
                    }
                    
                    JOptionPane.showMessageDialog(null, "Ny Alien är nu registrerat!");
                    dispose();
                } else {
                    
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

    private void alienIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alienIDActionPerformed
        
    }//GEN-LAST:event_alienIDActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> agenter;
    private javax.swing.JTextField alienID;
    private com.toedter.calendar.JDateChooser datum;
    private javax.swing.JRadioButton döljaLösenord;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField lösenord;
    private javax.swing.JTextField namn;
    private javax.swing.JComboBox<String> område;
    private javax.swing.JComboBox<String> ras;
    private javax.swing.JButton spara;
    private javax.swing.JTextField telefon;
    private javax.swing.JLabel textAgent;
    private javax.swing.JLabel textAlienID;
    private javax.swing.JLabel textLösenord;
    private javax.swing.JLabel textNamn;
    private javax.swing.JLabel textPlats;
    private javax.swing.JLabel textRas;
    private javax.swing.JLabel textRegistreringsdatum;
    private javax.swing.JLabel textTelefon;
    private javax.swing.JLabel titel;
    // End of variables declaration//GEN-END:variables
}
