
package mib.projekt;

import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import oru.inf.InfDB;
import oru.inf.InfException;

public class ÄndraLösenord extends javax.swing.JFrame {

 private InfDB idb;
 private String ID;
 private boolean showingPassword = false;
    
    public ÄndraLösenord(InfDB idb, String ID) {
        initComponents();
        this.idb = idb;
        this.ID =ID;
        this.setLocationRelativeTo(null); //Gör så att fönstret körs i mitten av skärmen
        kontrolleraText();
        ÄndraLösenord.this.setDefaultCloseOperation(DISPOSE_ON_CLOSE); //Gör så att programmet inte stänger helt när man trycker på X
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        textNuvarandeLösenord = new javax.swing.JLabel();
        textNyLösenord = new javax.swing.JLabel();
        instruktion = new javax.swing.JLabel();
        nuvarandeLösenord = new javax.swing.JPasswordField();
        nyLösenord = new javax.swing.JPasswordField();
        sparaÄndringar = new javax.swing.JButton();
        döljLösenord1 = new javax.swing.JRadioButton();
        döljLösenord2 = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        textNuvarandeLösenord.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        textNuvarandeLösenord.setText("Nuvarande Lösenord");

        textNyLösenord.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        textNyLösenord.setText("Ny Lösenord");

        instruktion.setFont(new java.awt.Font("Futura", 0, 24)); // NOI18N
        instruktion.setText("Ändra Lösenord");

        nuvarandeLösenord.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        nuvarandeLösenord.setText("dField1");

        nyLösenord.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        nyLösenord.setText("jPaield2");
        nyLösenord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nyLösenordActionPerformed(evt);
            }
        });

        sparaÄndringar.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        sparaÄndringar.setText("Spara ändringar");
        sparaÄndringar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sparaÄndringarActionPerformed(evt);
            }
        });

        döljLösenord1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                döljLösenord1ActionPerformed(evt);
            }
        });

        döljLösenord2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                döljLösenord2ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mib/projekt/padlock.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel3)
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sparaÄndringar, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textNyLösenord)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(nuvarandeLösenord, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(döljLösenord1))
                                    .addComponent(textNuvarandeLösenord)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(nyLösenord, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(döljLösenord2)))))
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(instruktion)
                        .addGap(46, 46, 46))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(instruktion)
                .addGap(28, 28, 28)
                .addComponent(textNuvarandeLösenord)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nuvarandeLösenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(döljLösenord1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textNyLösenord)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nyLösenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(döljLösenord2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(sparaÄndringar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nyLösenordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nyLösenordActionPerformed
        
    }//GEN-LAST:event_nyLösenordActionPerformed

    private void sparaÄndringarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sparaÄndringarActionPerformed
        
        try
        {
            
            String nuvarandeLösen = nuvarandeLösenord.getText();
            String nyLösen = nyLösenord.getText();
            boolean lösenKontroll = false;
            String lösenordKontrollAgent = "select Losenord from Agent where Agent_ID="+ID;
            String ändraLösenAgent = "UPDATE mibdb.Agent t SET t.Losenord = '"+nyLösen+"'WHERE t.Agent_ID = "+ID;
            
            if(idb.fetchSingle(lösenordKontrollAgent).equals(nuvarandeLösen))
            {
                lösenKontroll = true;
            } 
            
            if (lösenKontroll = true)
            {
                idb.update(ändraLösenAgent);
                JOptionPane.showMessageDialog(null, "Lösenordet är nu ändrat!");
                dispose();
            }
            
        }catch (InfException ettUndantag){
            
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
            
        }
        
        catch (Exception ettUndantag) {
            
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
            
        }
        
    }//GEN-LAST:event_sparaÄndringarActionPerformed

    private void döljLösenord1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_döljLösenord1ActionPerformed
        
        if(showingPassword)
        {
            nuvarandeLösenord.setEchoChar('*');
            showingPassword = false;
        }else
        {
            nuvarandeLösenord.setEchoChar('\u0000');
            showingPassword = true;
        }
        
    }//GEN-LAST:event_döljLösenord1ActionPerformed

    private void döljLösenord2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_döljLösenord2ActionPerformed
        
        if(showingPassword)
        {
            nyLösenord.setEchoChar('*');
            showingPassword = false;
        }else
        {
            nyLösenord.setEchoChar('\u0000');
            showingPassword = true;
        }
        
    }//GEN-LAST:event_döljLösenord2ActionPerformed

    // Gör så att texten i rutorna konstant kontrolleras och returnar fel ifall valideringsklassen triggas.
    
    private void kontrolleraText(){
     
     nyLösenord.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                kontrolleraLösenord();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                kontrolleraLösenord();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                kontrolleraLösenord();
            }
        });
     
    }

    private void kontrolleraLösenord(){
     
        char[] lösenordet = nyLösenord.getPassword();
        if(lösenordet.length>6){
            JOptionPane.showMessageDialog(null, "Lösenord får inte vara mer än 6 karaktärer!");
        }
     
    }
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton döljLösenord1;
    private javax.swing.JRadioButton döljLösenord2;
    private javax.swing.JLabel instruktion;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField nuvarandeLösenord;
    private javax.swing.JPasswordField nyLösenord;
    private javax.swing.JButton sparaÄndringar;
    private javax.swing.JLabel textNuvarandeLösenord;
    private javax.swing.JLabel textNyLösenord;
    // End of variables declaration//GEN-END:variables
}
