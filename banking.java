/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aditya
 */
public class banking extends javax.swing.JFrame {

    /**
     * Creates new form banking
     */
    public banking() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        InternetBanking = new javax.swing.JRadioButton();
        visa = new javax.swing.JRadioButton();
        PAYONDELEIVERY = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 153, 255));
        jButton1.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arrow-left-circle-blue-64.png"))); // NOI18N
        jButton1.setToolTipText("BACK");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 80));

        jLabel2.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PLEASE SELECT YOUR PAYMENT OPTIONS:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        InternetBanking.setBackground(new java.awt.Color(255, 153, 102));
        InternetBanking.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        InternetBanking.setForeground(new java.awt.Color(255, 255, 255));
        InternetBanking.setText("InternetBanking");
        InternetBanking.setToolTipText("InternetBankingi");
        InternetBanking.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        InternetBanking.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bank-48.png"))); // NOI18N
        InternetBanking.setOpaque(false);
        InternetBanking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InternetBankingActionPerformed(evt);
            }
        });
        getContentPane().add(InternetBanking, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, -1, -1));

        visa.setBackground(new java.awt.Color(153, 153, 255));
        visa.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        visa.setForeground(new java.awt.Color(255, 255, 255));
        visa.setText("VISA");
        visa.setToolTipText("VISA");
        visa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/V.png"))); // NOI18N
        visa.setOpaque(false);
        visa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visaActionPerformed(evt);
            }
        });
        getContentPane().add(visa, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, -1, -1));

        PAYONDELEIVERY.setBackground(new java.awt.Color(255, 102, 102));
        PAYONDELEIVERY.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        PAYONDELEIVERY.setForeground(new java.awt.Color(255, 255, 255));
        PAYONDELEIVERY.setText("PAY ON DELEIVERY");
        PAYONDELEIVERY.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pay_on_Delivery-48.png"))); // NOI18N
        PAYONDELEIVERY.setOpaque(false);
        PAYONDELEIVERY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PAYONDELEIVERYActionPerformed(evt);
            }
        });
        getContentPane().add(PAYONDELEIVERY, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, -1, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/010_x-32.png"))); // NOI18N
        jButton2.setContentAreaFilled(false);
        jButton2.setOpaque(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, 40, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simple-wallpapers-16-simple_wallpaper_by_mikro098.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 350));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        new Wishlist().setVisible(true);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void InternetBankingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InternetBankingActionPerformed

        if(InternetBanking.isSelected()){
            this.setVisible(false);
            new BankOption().setVisible(true);
        }

    }//GEN-LAST:event_InternetBankingActionPerformed

    private void visaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visaActionPerformed
        if(visa.isSelected()){

            this.setVisible(false);
            new Visa4().setVisible(true);

        }
    }//GEN-LAST:event_visaActionPerformed

    private void PAYONDELEIVERYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PAYONDELEIVERYActionPerformed
        this.setVisible(false);
        new details().setVisible(true);
    }//GEN-LAST:event_PAYONDELEIVERYActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
for(double i=0.0; i<=1.0;i=i+0.1){
   String val=i+"F";
   float f=Float.valueOf(val);

this.setOpacity(f);
   try{


        Thread.sleep(30);
    }catch(Exception e){

    }
}         // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(banking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(banking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(banking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(banking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new banking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton InternetBanking;
    private javax.swing.JRadioButton PAYONDELEIVERY;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton visa;
    // End of variables declaration//GEN-END:variables
}
