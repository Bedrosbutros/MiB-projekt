package mib.projekt;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;
import java.util.Date;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class AgentAgenter extends javax.swing.JFrame {

private InfDB idb;
private String ID;
private boolean showingPassword = false;
private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); //skapar en datumFormat

    public AgentAgenter(InfDB idb, String ID) {
        initComponents();
        this.setLocationRelativeTo(null); //Gör så att fönstret körs i mitten av skärmen
        this.idb=idb;
        this.ID=ID;
        spara.setEnabled(false);
        fyllListor();
        kontrolleraText();
        AgentAgenter.this.setDefaultCloseOperation(DISPOSE_ON_CLOSE); //Gör så att programmet inte stänger helt när man trycker på X
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        namn = new javax.swing.JTextField();
        datum = new com.toedter.calendar.JDateChooser();
        telefon = new javax.swing.JTextField();
        lösenord = new javax.swing.JPasswordField();
        administratör = new javax.swing.JComboBox<>();
        område = new javax.swing.JComboBox<>();
        agenter = new javax.swing.JComboBox<>();
        titel = new javax.swing.JLabel();
        redigera = new javax.swing.JButton();
        spara = new javax.swing.JButton();
        döljaLösenord = new javax.swing.JRadioButton();
        taBort = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        statistik = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        textValdAgent = new javax.swing.JLabel();
        textNamn = new javax.swing.JLabel();
        textTelefon = new javax.swing.JLabel();
        textAnställningsdatum = new javax.swing.JLabel();
        textLösenord = new javax.swing.JLabel();
        textAdmin = new javax.swing.JLabel();
        textOmråde = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        namn.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        namn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namnActionPerformed(evt);
            }
        });

        telefon.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N

        lösenord.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        lösenord.setText("jPasswordField1");

        administratör.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N

        område.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N

        agenter.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        agenter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agenterActionPerformed(evt);
            }
        });

        titel.setFont(new java.awt.Font("Futura", 0, 36)); // NOI18N
        titel.setForeground(new java.awt.Color(51, 51, 51));
        titel.setText("Registrerade Agenter");

        redigera.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        redigera.setForeground(new java.awt.Color(51, 51, 51));
        redigera.setText("Redigera");
        redigera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redigeraActionPerformed(evt);
            }
        });

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

        taBort.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        taBort.setForeground(new java.awt.Color(51, 51, 51));
        taBort.setText("Ta bort");
        taBort.setToolTipText("");
        taBort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taBortActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jButton1.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setText("Verksamhet");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        statistik.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        statistik.setForeground(new java.awt.Color(51, 51, 51));
        statistik.setText("Statistik");
        statistik.setToolTipText("");
        statistik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statistikActionPerformed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mib/projekt/briefcase.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(statistik, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jLabel10)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(68, 68, 68)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(statistik, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        textValdAgent.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        textValdAgent.setForeground(new java.awt.Color(51, 51, 51));
        textValdAgent.setText("Vald Agent");

        textNamn.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        textNamn.setForeground(new java.awt.Color(51, 51, 51));
        textNamn.setText("Namn");

        textTelefon.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        textTelefon.setForeground(new java.awt.Color(51, 51, 51));
        textTelefon.setText("Telefon");

        textAnställningsdatum.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        textAnställningsdatum.setForeground(new java.awt.Color(51, 51, 51));
        textAnställningsdatum.setText("Anställningsdatum");

        textLösenord.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        textLösenord.setForeground(new java.awt.Color(51, 51, 51));
        textLösenord.setText("Lösenord");

        textAdmin.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        textAdmin.setForeground(new java.awt.Color(51, 51, 51));
        textAdmin.setText("Administratör?");

        textOmråde.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        textOmråde.setForeground(new java.awt.Color(51, 51, 51));
        textOmråde.setText("Område");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textNamn)
                                    .addComponent(textTelefon)
                                    .addComponent(textValdAgent)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(textAnställningsdatum))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textAdmin)
                                    .addComponent(textLösenord)
                                    .addComponent(textOmråde))))
                        .addGap(69, 69, 69)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(döljaLösenord)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(administratör, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lösenord, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(område, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(datum, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                                    .addComponent(telefon, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(namn))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(taBort, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spara)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(redigera))
                            .addComponent(titel)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(agenter, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(titel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agenter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textValdAgent))
                .addGap(55, 55, 55)
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
                    .addComponent(textAnställningsdatum))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(textLösenord)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textAdmin))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(döljaLösenord, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lösenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(administratör, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(område, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textOmråde))
                .addGap(89, 89, 89)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(taBort, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spara, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(redigera, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
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
        
        String hämtaNamn = "SELECT Namn from Agent";
        String hämtaOmråde = "Select Benamning from Omrade";
        
        ArrayList<String> allaAlienNamn;
        ArrayList<String> allaOmrådesNamn;
        
        try {
            
            allaAlienNamn = idb.fetchColumn(hämtaNamn);
            allaOmrådesNamn = idb.fetchColumn(hämtaOmråde);

            for (String namn : allaAlienNamn) {
                agenter.addItem(namn);
            }            
            
            for (String benämning : allaOmrådesNamn) {
                område.addItem(benämning);
            }  
            
            administratör.addItem("Ja");
            administratör.addItem("Nej");
            
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

    private void hämtaDatum()
    {
        
        try {
            
            String hämtaDatum = idb.fetchSingle("select Anstallningsdatum from Agent where Namn='"+agenter.getSelectedItem().toString()+"'");
            Date datumet = dateFormat.parse(hämtaDatum);
            dateFormat.format(datumet);
            datum.setDate(datumet);

        } catch (InfException ettUndantag) {
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        }
        
        catch (Exception ettUndantag) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        }
        
    }
    
    private void agenterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agenterActionPerformed
        
        
        try {
            
            String valdAgent = agenter.getSelectedItem().toString();
            String hämtaLösen = idb.fetchSingle("Select Losenord from Agent where Namn='"+valdAgent+"'");
            String hämtaTel = idb.fetchSingle("Select Telefon from Agent where Namn='"+valdAgent+"'");
            String hämtaDatum = "select Anstallningsdatum from Agent where Namn='"+valdAgent+"'";
            String hämtaOmråde = idb.fetchSingle("select Benamning from Omrade join Agent A on Omrade.Omrades_ID = A.Omrade where Namn ='"+valdAgent+"'");
            String hämtaStatus = idb.fetchSingle("select Administrator from Agent where Namn='"+valdAgent+"'");
            
            namn.setText(valdAgent);
            lösenord.setText(hämtaLösen);
            telefon.setText(hämtaTel);
            administratör.setSelectedItem(hämtaStatus);
            område.setSelectedItem(hämtaOmråde);
            hämtaDatum();
            
            if (hämtaStatus.equals("J"))
            {
                administratör.setSelectedItem("Ja");
            }else if (hämtaStatus.equals("N")){
                administratör.setSelectedItem("Nej");
            }
            
            namn.setEnabled(false);
            telefon.setEnabled(false);
            datum.setEnabled(false);
            lösenord.setEnabled(false);
            administratör.setEnabled(false);
            område.setEnabled(false);
            döljaLösenord.setEnabled(false);
            taBort.setEnabled(false);
            
        } catch (InfException ettUndantag) {
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        }
        
        catch (Exception ettUndantag) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        }
        
    }//GEN-LAST:event_agenterActionPerformed

    private void redigeraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redigeraActionPerformed
        
        telefon.setEnabled(true);
        datum.setEnabled(true);
        lösenord.setEnabled(true);
        administratör.setEnabled(true);
        område.setEnabled(true);
        spara.setEnabled(true);
        döljaLösenord.setEnabled(true);
        taBort.setEnabled(true);
        
    }//GEN-LAST:event_redigeraActionPerformed

    private void sparaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sparaActionPerformed
        
    if (Validering.rutanÄrTom(namn, textNamn)){
    if (Validering.rutanÄrTom(telefon, textTelefon)){    
    if (Validering.rutanÄrTom(lösenord, textLösenord)){
    if (Validering.endastNummerTillåten(telefon)){    
    if (Validering.lösenordetÄrLång(lösenord)){
        
    int resultat = JOptionPane.showConfirmDialog(null, "Är du nöjd med allt du har skrivit?", "Bekräfta uppgifter", JOptionPane.YES_NO_OPTION);

    
    
    if(resultat == JOptionPane.YES_OPTION){
        
        try {
            
                Date datumet = datum.getDate();
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
                        
                String ändraInfo = "UPDATE mibdb.Agent t SET t.Namn = '"+nyNamn+"', t.Telefon = '"+nyTelefon+"', t.Anstallningsdatum = '"+nyDatum+"', t.Administrator = '"+nyStatus+"',  t.Losenord = '"+nyLösen+"', t.Omrade = (Select Omrades_ID from Omrade where Benamning= '"+nyOmråde+"') Where Namn='"+agenter.getSelectedItem().toString()+"'";
                
                idb.update(ändraInfo);
                JOptionPane.showMessageDialog(null, "Ändringar sparade!");
                new AgentAgenter(idb,ID).setVisible(true);
                dispose();
            
        } catch (InfException ettUndantag) {
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        }
        
        catch (Exception ettUndantag) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        }
        
 
    } else {
                    
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

    private void taBortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taBortActionPerformed
        
        try {
            
            String tabort = "DELETE FROM mibdb.Agent WHERE Namn = '"+agenter.getSelectedItem().toString()+"'";
            int resultat = JOptionPane.showConfirmDialog(null, "Är du säker att du vill ta bort denna Agent", "Bekräfta borttaggning", JOptionPane.YES_NO_OPTION);
            
            if(resultat == JOptionPane.YES_OPTION)
            {
                idb.delete(tabort);
                new AgentAgenter(idb,ID).setVisible(true);
                dispose();
            } else {
                new AgentAgenter(idb,ID).setVisible(true);
                dispose();
            }

        } catch (InfException ettUndantag) {
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        }
        
        catch (Exception ettUndantag) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        }
        
    }//GEN-LAST:event_taBortActionPerformed

    private void statistikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statistikActionPerformed
        
        new AgentStatistik(idb,ID).setVisible(true);
        
    }//GEN-LAST:event_statistikActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        new VerksamhetsInformation(idb, ID).setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    // Gör så att texten i rutorna konstant kontrolleras och returnar fel ifall valideringsklassen triggas.
    
    private void kontrolleraText(){
        
        telefon.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                Validering.endastNummerTillåten(telefon);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                Validering.endastNummerTillåten(telefon);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                Validering.endastNummerTillåten(telefon);
            }
        });
        
        lösenord.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                Validering.lösenordetÄrLång(lösenord);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                Validering.lösenordetÄrLång(lösenord);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                Validering.lösenordetÄrLång(lösenord);
            }
        });
        
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> administratör;
    private javax.swing.JComboBox<String> agenter;
    private com.toedter.calendar.JDateChooser datum;
    private javax.swing.JRadioButton döljaLösenord;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField lösenord;
    private javax.swing.JTextField namn;
    private javax.swing.JComboBox<String> område;
    private javax.swing.JButton redigera;
    private javax.swing.JButton spara;
    private javax.swing.JButton statistik;
    private javax.swing.JButton taBort;
    private javax.swing.JTextField telefon;
    private javax.swing.JLabel textAdmin;
    private javax.swing.JLabel textAnställningsdatum;
    private javax.swing.JLabel textLösenord;
    private javax.swing.JLabel textNamn;
    private javax.swing.JLabel textOmråde;
    private javax.swing.JLabel textTelefon;
    private javax.swing.JLabel textValdAgent;
    private javax.swing.JLabel titel;
    // End of variables declaration//GEN-END:variables
}
