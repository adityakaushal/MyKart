
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;




public class Apple extends javax.swing.JFrame
{


//These are the dataMembers.    
String masterCode="0123";
int code1;
int code2;
int code3;
int code4;
int count;
int ButtonClick;






    ImageIcon filled=new ImageIcon(getClass().getResource("circle_filled.png"));
    ImageIcon unfilled=new ImageIcon(getClass().getResource("circle_unfilled.png"));

    
    
    
    
    
    
    
    
    
    
    public Apple() 
    {
        initComponents();
    }
    
    
    
    
    
    
    
    
    
    //This is the  class which is called in the NumberKey.
    public void circleControl()
    {
        count++;
        switch(count)
        {
          case 1:
                code1=ButtonClick;
                Code1.setIcon(filled);
                

            break;
          case 2:
                code2=ButtonClick;
                Code2.setIcon(filled);
                
            break;
          case 3:
                 code3=ButtonClick;
                 Code3.setIcon(filled);
             
            break;
          case 4:
                code4=ButtonClick;
                Code4.setIcon(filled);
                

                
                
                
              String masterTest = code1 + "" + code2 + "" + code3 + "" + code4;
              if(masterTest.equals(masterCode))
             
              {
                  JOptionPane.showMessageDialog(null, "Welcome");
                   new HomeScreen().setVisible(true);
                   HomeScreen.account.setText("Welcome Admin");

              }
              else
              {
                  JOptionPane.showMessageDialog(null, "Please try Again!!");
                  System.out.println(masterTest);                   
                  new HomeScreen().setVisible(true);
                  HomeScreen.account.setText("Welcome Admin");
              }
                  Code1.setIcon(unfilled);
                  Code2.setIcon(unfilled);
                  Code3.setIcon(unfilled);
                  Code4.setIcon(unfilled);
                  count=0;
                  break;
              
        }

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Code4 = new javax.swing.JLabel();
        Code3 = new javax.swing.JLabel();
        Code2 = new javax.swing.JLabel();
        Code1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Enter Password");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 160, 30));

        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 60, 60));

        jLabel4.setToolTipText("");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel4MouseReleased(evt);
            }
        });
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 70, 60));

        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 70, 60));

        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 60, 60));

        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 60, 60));

        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel13MouseEntered(evt);
            }
        });
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 60, 60));

        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel7MouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel7MouseReleased(evt);
            }
        });
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 60, 60));

        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 60, 60));

        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel6MouseReleased(evt);
            }
        });
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 60, 60));

        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel5MouseReleased(evt);
            }
        });
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 60, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/numbers.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 290, 290));

        Code4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circle_unfilled.png"))); // NOI18N
        getContentPane().add(Code4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, -1, -1));

        Code3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circle_unfilled.png"))); // NOI18N
        getContentPane().add(Code3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, -1, -1));

        Code2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circle_unfilled.png"))); // NOI18N
        getContentPane().add(Code2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, -1, -1));

        Code1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circle_unfilled.png"))); // NOI18N
        getContentPane().add(Code1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iphone_5s_5c_ios_7_wallpaper_minimalist_16.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 420));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
{//The circleControl() class function is called from the 
             circleControl();
              ButtonClick=1;
              
        }     
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
{
             circleControl();
              ButtonClick=2;
               
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
{
             circleControl();
              ButtonClick=3;
               
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseEntered

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
     {
             circleControl();
              ButtonClick=4;
              
        }     // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
{
             circleControl();
              ButtonClick=5;
              
        }          // TODO add your handling code here:
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
{
             circleControl();
              ButtonClick=6;
               
        }          // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
{
             circleControl();
              ButtonClick=7;
             
        }          // TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
{
             circleControl();
              ButtonClick=8;
               
        }          // TODO add your handling code here:
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
{
             circleControl();
              ButtonClick=9;
               
        }          // TODO add your handling code here:
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel13MouseEntered

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
{
             circleControl();
              ButtonClick=0;
}
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4MouseReleased

    private void jLabel6MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseReleased

    private void jLabel7MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseReleased

    private void jLabel5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseReleased

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
/*for(double i=0.0; i<=1.0;i=i+0.1){
   String val=i+"F";
   float f=Float.valueOf(val);

this.setOpacity(f);
   try{


        Thread.sleep(30);
    }catch(Exception e){

    }
} 
        */// TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(Apple.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Apple.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Apple.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Apple.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Apple().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Code1;
    private javax.swing.JLabel Code2;
    private javax.swing.JLabel Code3;
    private javax.swing.JLabel Code4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
