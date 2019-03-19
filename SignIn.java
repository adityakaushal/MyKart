import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java .sql.*;
import javax.swing.JFileChooser;
import javax.swing.Timer;

public class SignIn extends javax.swing.JFrame {
Connection con;
Statement st;
ResultSet rs;
PreparedStatement ps;
public String username;
    private Timer t;
    private ActionListener al;
    public SignIn() {
        al=new ActionListener(){
@Override
public void actionPerformed(ActionEvent ae){
if(jProgressBar1.getValue()<100){
jProgressBar1.setValue(jProgressBar1.getValue()+1);

}
else
{t.stop();

}
}
};

t=new Timer(1,al);



    
        initComponents();
        
        anstf.setVisible(false);
        go.setVisible(false);

        try{
            Class.forName("org.sqlite.JDBC");
            con=DriverManager.getConnection("jdbc:sqlite:D:\\My Disk\\My Data\\FinalProjectToDisplay\\All databases\\adi.sqlite");
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usernames = new javax.swing.JTextField();
        passlabel = new javax.swing.JLabel();
        qlabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        anstf = new javax.swing.JTextField();
        go = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        main = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usernames.setBackground(new java.awt.Color(236, 240, 241));
        usernames.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        usernames.setOpaque(false);
        usernames.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernamesActionPerformed(evt);
            }
        });
        getContentPane().add(usernames, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 110, 250, 30));

        passlabel.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        passlabel.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(passlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 650, 470, 30));

        qlabel.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        qlabel.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(qlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 620, 420, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vector_325_23-512.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 380));

        jLabel7.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("1.Please Enter your Password");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 60, 420, 30));

        jProgressBar1.setForeground(new java.awt.Color(51, 153, 0));
        jProgressBar1.setStringPainted(true);
        getContentPane().add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 270, 550, 20));

        jButton2.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/unlock-48.png"))); // NOI18N
        jButton2.setText("Forgot you password");
        jButton2.setOpaque(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, -1, 80));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ud.png"))); // NOI18N
        jButton1.setText("LOGIN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 490, 150, 80));

        jButton3.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/avatar-login-round-profile-64.png"))); // NOI18N
        jButton3.setText("Admin Login");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 490, 230, 80));

        jLabel12.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("4.Forgot Your Password?");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, -1, -1));

        jLabel15.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("3.Inactive users can still log in if the user is not locked out");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, -1, 20));

        anstf.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        anstf.setText("Enter the Answer");
        anstf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                anstfMouseClicked(evt);
            }
        });
        getContentPane().add(anstf, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 600, 190, -1));

        go.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        go.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Enter-Key-48.png"))); // NOI18N
        go.setText("Enter");
        go.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goActionPerformed(evt);
            }
        });
        go.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                goKeyPressed(evt);
            }
        });
        getContentPane().add(go, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 600, 170, 70));

        jLabel13.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("2.Ensure that any page used as a login page has a login dialog, otherwise users will be locked.");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 1070, -1));
        //Icon i=new IconImage(getClass().getResource("copyright-1-32.png"));

        password.setBackground(new java.awt.Color(236, 240, 241));
        password.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        password.setOpaque(false);
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 150, 250, 30));

        jLabel5.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Username:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, -1, -1));

        jLabel6.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Password:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, -1, -1));

        jLabel8.setFont(new java.awt.Font("Monospaced", 0, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("SignIn To your Account");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, 500, 40));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 90, 80, 70));

        jToggleButton1.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jToggleButton1.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eye-32.png"))); // NOI18N
        jToggleButton1.setText("See Your Password");
        jToggleButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jToggleButton1MouseReleased(evt);
            }
        });
        jToggleButton1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jToggleButton1MouseDragged(evt);
            }
        });
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 210, 210, 40));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/024_033_delete_close-64.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 10, 70, 70));

        jButton5.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arrow-left-circle-blue-64.png"))); // NOI18N
        jButton5.setText("SignUp ");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 490, 240, 80));

        jButton6.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture-1-64.png"))); // NOI18N
        jButton6.setText("Change the Wallpaper");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 310, 450, 70));

        main.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simple_wallpaper_by_mikro098.png"))); // NOI18N
        getContentPane().add(main, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1160, 710));

        setSize(new java.awt.Dimension(1160, 707));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usernamesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernamesActionPerformed

    }//GEN-LAST:event_usernamesActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed

    }//GEN-LAST:event_passwordActionPerformed

    private void anstfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_anstfMouseClicked
        anstf.setText("");
    }//GEN-LAST:event_anstfMouseClicked

    private void goActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goActionPerformed
        try{
            st=con.createStatement();

            String usernamepass=usernames.getText();
            rs = st.executeQuery("SELECT * FROM login WHERE UserName='"+usernamepass + "'");
            if(rs.next()){
                String question=rs.getString("Question");
                String answer=rs.getString("Answer");
                String password=rs.getString("Password");
                String givenanswer=anstf.getText();
                if(givenanswer.equals(answer))
                {
                    passlabel.setText("Hover here to see your password.");
                    passlabel.setToolTipText(""+password);

                }
                else{
                    JOptionPane.showMessageDialog(null, "Please enter the correct answer.");
                }

            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage() ,"Error", 1);
        }
    }//GEN-LAST:event_goActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(!t.isRunning()){
            t.start();
        }
        if(usernames.getText().equals("")==(false))
        {
            try{
                st=con.createStatement();
                String usernamepass=usernames.getText();
                rs=st.executeQuery("SELECT * FROM login WHERE Username= '"+usernamepass+"' ");
                if(rs.next()){
                    anstf.setVisible(true);
                    go.setVisible(true);
                    String question=rs.getString("Question");
                    String answer=rs.getString("Answer");
                    String Passwords=rs.getString("Password");
                    String givenanswer=anstf.getText();
                    qlabel.setText(question);

                    if(givenanswer.equals(answer))
                    {
                        passlabel.setText("Hover Here to see your password.");
                        passlabel.setToolTipText(""+Passwords);
                    }

                }

                else
                {
                    JOptionPane.showMessageDialog(null,"Check the UserName You have Entered or contact Administrator.");}
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,e.getMessage());
            }

        }
        else{
            JOptionPane.showMessageDialog(null,"Please Enter Correct UserName.");
        }
        jProgressBar1.setValue(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Icon i=new ImageIcon(getClass().getResource("thin-0649_secret_passcode_keypad_password_access-48_1.png"));
        Icon j=new ImageIcon(getClass().getResource("customer.png"));
        Icon k=new ImageIcon(getClass().getResource("id_card_identification_document-128.png"));
        Icon a=new ImageIcon(getClass().getResource("010_x-32.png"));
        if(!t.isRunning()){
            t.start();
        }
        try{
            int flag=0;
            String sql="Select * from login;";
            st=con.createStatement();
            rs=st.executeQuery(sql);
            username=usernames.getText();
            String pass=password.getText();
            while(rs.next()){
                if(username.equals(rs.getString("Username")) && pass.equals(rs.getString("Password"))){
                    flag=1;
                    break;
                }
            }
            if(flag ==1){
                try{
                    
                Class.forName("org.sqlite.JDBC");
                con=DriverManager.getConnection("jdbc:sqlite:D:\\My Disk\\My Data\\FinalProjectToDisplay\\All databases\\adi.sqlite");
                st=con.createStatement();
                String query="Select Image from login where Username=;";
                rs=st.executeQuery(query);
                while(rs.next()){
                byte[] login=rs.getBytes("Image");
                format=new ImageIcon(login);
                HomeScreen.account.setIcon(format);
               }
               

                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, "Temporary_Error");
                }
 HomeScreen nf1=new HomeScreen();
                HomeScreen.account.setText("Welcome"+" "+SignIn.usernames.getText());
                nf1.setVisible(true);

            }
            else
            {jLabel2.setIcon(a);
             new Password().setVisible(true);
            }

        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage(),"",JOptionPane.ERROR_MESSAGE,i);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        new Apple().setVisible(true);
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void goKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_goKeyPressed
   
    }//GEN-LAST:event_goKeyPressed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
     // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton1MouseDragged
          // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton1MouseDragged

    private void jToggleButton1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton1MouseReleased
if(jToggleButton1.isSelected()){
       password.setEchoChar((char) 0);

       }
       else{
       password.setEchoChar('*');

       }            // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton1MouseReleased

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
for(double i=0.0; i<=1.0;i=i+0.1){
   String val=i+"F";
   float f=Float.valueOf(val);

this.setOpacity(f);
   try{


        Thread.sleep(30);
    }catch(Exception e){

    }
}// TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
 new SignUp().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
 JFileChooser chooser=new JFileChooser();
        chooser.showOpenDialog(null);
        File F=chooser.getSelectedFile();
        String Filename=F.getAbsolutePath();
        main.setIcon(new ImageIcon(""+F));        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField anstf;
    private javax.swing.JButton go;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel12;
    public javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel main;
    private javax.swing.JLabel passlabel;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel qlabel;
    public static javax.swing.JTextField usernames;
    // End of variables declaration//GEN-END:variables
private ImageIcon format=null;
String filename=null;
int s=0;
byte p_image[]=null;
}

