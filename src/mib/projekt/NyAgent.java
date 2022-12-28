package mib.projekt;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;
import java.util.Date;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class NyAgent extends javax.swing.JFrame {

private InfDB idb;
private String ID;
private boolean showingPassword = false;
private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    public NyAgent(InfDB idb, String ID) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.idb=idb;
        this.ID=ID;
        fyllListor();
        kontrollerText();
        NyAgent.this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        agentID.setEnabled(false);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        namn = new javax.swing.JTextField();
        agentID = new javax.swing.JTextField();
        datum = new com.toedter.calendar.JDateChooser();
        telefon = new javax.swing.JTextField();
        lösenord = new javax.swing.JPasswordField();
        administratör = new javax.swing.JComboBox<>();
        område = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        spara = new javax.swing.JButton();
        döljaLösenord = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        namn.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        namn.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                namnInputMethodTextChanged(evt);
            }
        });
        namn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namnActionPerformed(evt);
            }
        });

        agentID.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        agentID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agentIDActionPerformed(evt);
            }
        });

        datum.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N

        telefon.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N

        lösenord.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        lösenord.setText("jPasswordField1");
        lösenord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lösenordActionPerformed(evt);
            }
        });

        administratör.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N

        område.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Futura", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Registrera ny Agent");

        spara.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        spara.setForeground(new java.awt.Color(51, 51, 51));
        spara.setText("Spara");
        spara.setToolTipText("");
        spara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sparaActionPerformed(evt);
            }
        });

        döljaLösenord.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        döljaLösenord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                döljaLösenordActionPerformed(evt);
            }
        });

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

        jLabel2.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Agent ID");

        jLabel3.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Namn");

        jLabel4.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Telefon");

        jLabel5.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Anställningsdatum");

        jLabel6.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Lösenord");

        jLabel7.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Administratör?");

        jLabel8.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Område");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(döljaLösenord))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(agentID, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(telefon)
                                .addComponent(namn)
                                .addComponent(datum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lösenord, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(administratör, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(område, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(spara, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(59, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(agentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(namn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(telefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(datum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lösenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(döljaLösenord)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(administratör, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(område, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(35, 35, 35)
                .addComponent(spara)
                .addGap(20, 20, 20))
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

    private void fyllListor()
    {
        
        String hämtaOmråde = "Select Benamning from Omrade";
        String bestämmID = "select MAX(Agent_ID) from Agent";
        
        ArrayList<String> allaAlienNamn;
        ArrayList<String> allaOmrådesNamn;
        
        try {
            
            allaOmrådesNamn = idb.fetchColumn(hämtaOmråde);            
            
            for (String benämning : allaOmrådesNamn) {
                område.addItem(benämning);
            }  
            
            administratör.addItem("Nej");
            administratör.addItem("Ja");
            
            int nyAgentID = Integer.parseInt(idb.fetchSingle(bestämmID));
            nyAgentID = nyAgentID +1;
            agentID.setText(Integer.toString(nyAgentID));
            
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

    private void kontrollerText(){
        
        namn.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                existerandeAgent();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                existerandeAgent();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                existerandeAgent();
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
        
    }
    
    private void existerandeAgent(){
        
        try {
            
            String hämtaAgent = "select Namn from Agent";
            ArrayList<String> agentNamn = idb.fetchColumn(hämtaAgent);
            String fåNamn = namn.getText();
            
            if (agentNamn.contains(fåNamn)){
                JOptionPane.showMessageDialog(null, "Agent med denna namn finns redan!");
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
    
    private void endastNummer(){
        
        if (telefon.getText().matches("[a-zA-Z]+")){
            JOptionPane.showMessageDialog(null, "Endast siffror tillåtna!");
        }
        
    }
    
    private void sparaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sparaActionPerformed
        
        try {
            
                Date datumet = datum.getDate();
                String nyID = agentID.getText();
                String nyDatum = dateFormat.format(datumet);
                String nyLösen = lösenord.getText();
                String nyNamn = namn.getText();
                String nyTelefon = telefon.getText();
                String nyStatus = administratör.getSelectedItem().toString();
                String nyOmråde = område.getSelectedItem().toString(); 
                
                if (nyStatus.equals("Ja")){
                    nyStatus = "J";
                }else if (nyStatus.equals("Nej")){
                    nyStatus= "N";
                }
                        
                String ändraInfo = "INSERT INTO mibdb.Agent (Agent_ID, Namn, Telefon, Anstallningsdatum, Administrator, Losenord, Omrade) VALUES ("+nyID+", '"+nyNamn+"', '"+nyTelefon+"', '"+nyDatum+"', '"+nyStatus+"', '"+nyLösen+"', (select Omrades_ID from Omrade where Benamning='"+nyOmråde+"'))";
                
                int resultat = JOptionPane.showConfirmDialog(null, "Är du nöjd med allt du har skrivit?", "Bekräfta uppgifter", JOptionPane.YES_NO_OPTION);
                
                if(resultat == JOptionPane.YES_OPTION){
                    if (telefon.getText().matches("[a-zA-Z]+")){
                        JOptionPane.showMessageDialog(null, "Endast siffror tillåtna!");
                    } else{
                        idb.insert(ändraInfo);
                        JOptionPane.showMessageDialog(null, "Ny Agent är nu registrerat!");
                        dispose();
                    }   
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

    private void agentIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agentIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_agentIDActionPerformed

    private void namnInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_namnInputMethodTextChanged
        
        
    }//GEN-LAST:event_namnInputMethodTextChanged

    private void lösenordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lösenordActionPerformed
        
        
    }//GEN-LAST:event_lösenordActionPerformed

    private void långLösenord(){
        
        char[] lösenordet = lösenord.getPassword();
        if(lösenordet.length>6){
            JOptionPane.showMessageDialog(null, "Lösenord får inte vara mer än 6 karaktärer!");
        }
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> administratör;
    private javax.swing.JTextField agentID;
    private com.toedter.calendar.JDateChooser datum;
    private javax.swing.JRadioButton döljaLösenord;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField lösenord;
    private javax.swing.JTextField namn;
    private javax.swing.JComboBox<String> område;
    private javax.swing.JButton spara;
    private javax.swing.JTextField telefon;
    // End of variables declaration//GEN-END:variables
}
