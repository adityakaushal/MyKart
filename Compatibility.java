
import AppPackage.AnimationClass;


public class Compatibility extends javax.swing.JFrame {
    
private final AnimationClass ac=new AnimationClass();
    
    public Compatibility() {
        
        initComponents();
     
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        google = new javax.swing.JLabel();
        facebook = new javax.swing.JLabel();
        windows = new javax.swing.JLabel();
        applestore = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        shop = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FIND US ON");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        google.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Google_Play_3.png"))); // NOI18N
        getContentPane().add(google, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 130, 140));

        facebook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facebook-128.png"))); // NOI18N
        getContentPane().add(facebook, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 130, 130));

        windows.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Windows_phone.png"))); // NOI18N
        windows.setText(" ");
        getContentPane().add(windows, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 350, 130, 130));

        applestore.setIcon(new javax.swing.ImageIcon(getClass().getResource("/appstore2.png"))); // NOI18N
        getContentPane().add(applestore, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 620, 130, 130));

        jLabel8.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/business_marketing-16-256.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(336, 250, 260, -1));

        shop.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        shop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/02_play-64.png"))); // NOI18N
        shop.setText("Shop here");
        shop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shopActionPerformed(evt);
            }
        });
        getContentPane().add(shop, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, -1));

        jLabel2.setFont(new java.awt.Font("Monospaced", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Find us on ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 480, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simple_wallpaper_by_mikro098.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 800));

        setSize(new java.awt.Dimension(946, 829));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
     
        {     
         google.setLocation(0, 340);
         windows.setLocation(790, 350);
         facebook.setLocation(410, 0);
         applestore.setLocation(390,620);}
  {      
    
      
         ac.jLabelYUp(620, 520, 3, 1, applestore);    
         ac.jLabelXRight(0, 200, 5, 1, google);
         ac.jLabelXLeft(790, 600, 5, 1, windows);
         ac.jLabelYDown(0, 110, 4, 1, facebook);    
         
      
      }
    
  
  
  
         
  
  
      
    }//GEN-LAST:event_formWindowOpened

    private void shopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shopActionPerformed
  new SignUp().setVisible(true);      // TODO add your handling code here:
  this.setVisible(false);
    }//GEN-LAST:event_shopActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
         // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

    }//GEN-LAST:event_formWindowActivated

   
    public static void main(String args[]) {
       
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
            java.util.logging.Logger.getLogger(Compatibility.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Compatibility.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Compatibility.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Compatibility.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Compatibility().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel applestore;
    private javax.swing.JLabel facebook;
    private javax.swing.JLabel google;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton shop;
    private javax.swing.JLabel windows;
    // End of variables declaration//GEN-END:variables
}
