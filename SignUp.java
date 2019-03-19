
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.sql.*;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
public class SignUp extends javax.swing.JFrame {
Connection con;
Statement st;
ResultSet rs;
PreparedStatement ps;
        public SignUp() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Email = new javax.swing.JTextField();
        Password = new javax.swing.JPasswordField();
        rp = new javax.swing.JPasswordField();
        Username = new javax.swing.JTextField();
        icon = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ans = new javax.swing.JTextField();
        Message = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jComboBox1 = new javax.swing.JComboBox();
        Firstname = new javax.swing.JTextField();
        lastname = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Email.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        Email.setBorder(null);
        Email.setOpaque(false);
        Email.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EmailMouseClicked(evt);
            }
        });
        getContentPane().add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 290, 30));

        Password.setBorder(null);
        Password.setOpaque(false);
        Password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PasswordMouseClicked(evt);
            }
        });
        getContentPane().add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 290, 30));

        rp.setBorder(null);
        rp.setOpaque(false);
        rp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rpMouseClicked(evt);
            }
        });
        rp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rpActionPerformed(evt);
            }
        });
        getContentPane().add(rp, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 290, 30));

        Username.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        Username.setBorder(null);
        Username.setOpaque(false);
        Username.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UsernameMouseClicked(evt);
            }
        });
        Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameActionPerformed(evt);
            }
        });
        getContentPane().add(Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 290, 30));
        getContentPane().add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 470, 90, 40));

        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 590, 100, 40));

        ans.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        ans.setText("Please Write Your Answer here");
        ans.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ansMouseClicked(evt);
            }
        });
        ans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ansActionPerformed(evt);
            }
        });
        getContentPane().add(ans, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, 370, 40));

        Message.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        Message.setForeground(new java.awt.Color(0, 153, 51));
        getContentPane().add(Message, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 210, 40));

        jComboBox2.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Gender", "Male", "Female" }));
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 340, 50));

        jComboBox1.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select your question...", "What is your profession?", "What is your place of Birth?", "What is your hobby?", "Which institute did you graduate from?" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 400, 30));

        Firstname.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        Firstname.setText("Firstname");
        Firstname.setBorder(null);
        Firstname.setOpaque(false);
        Firstname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FirstnameMouseClicked(evt);
            }
        });
        getContentPane().add(Firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 130, 30));

        lastname.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        lastname.setText("Lastname");
        lastname.setBorder(null);
        lastname.setOpaque(false);
        lastname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lastnameMouseClicked(evt);
            }
        });
        getContentPane().add(lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 140, 30));
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, -1, 30));
        getContentPane().add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, -1, 30));

        jButton1.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jButton1.setText("Already registered/login in");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 590, -1, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Signup1.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 650));

        setSize(new java.awt.Dimension(417, 687));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ansActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ansActionPerformed
ans.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_ansActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
if(jCheckBox1.isSelected()== true){
    

        JFileChooser chooser=new JFileChooser();
        chooser.showOpenDialog(null);
        File F=chooser.getSelectedFile();
        String Filename=F.getAbsolutePath();
        try{
            File im=new File(Filename);
            FileInputStream fis=new FileInputStream(im);
            ByteArrayOutputStream bos=new  ByteArrayOutputStream();
            byte[] buf=new byte[1024];
            for(int i;(i=fis.read(buf))!=-1;){
                bos.write(buf,0,i);
            }
            p_image=bos.toByteArray();
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage(),"",JOptionPane.WARNING_MESSAGE);
        }
  Icon b=new ImageIcon(getClass().getResource("alert-triangle-red-32.png"));
        Icon c=new ImageIcon(getClass().getResource("okay.png"));
        String Passwords=Password.getText();

        int a=Passwords.length();

        if(a<5 || Password.equals("")){
            Message.setText("RewritePassword!!");
            icon.setIcon(b);
            JOptionPane.showMessageDialog(null,"Logined Failed","",JOptionPane.ERROR_MESSAGE,b);
            this.setVisible(false);
            new HomeScreen().setVisible(false);
        }
        else{
            Message.setText("Strong Password");
            icon.setIcon(c);
            JOptionPane.showMessageDialog(null,"Signed Up Successfully","",JOptionPane.ERROR_MESSAGE,c);

        }

        if(Username.getText()!=null  && Email.getText() !=null  && Password.getText() !=null && rp.getText()!=null  && (jComboBox1.getSelectedItem())!= "Select your question..."  && ans.getText()!=null && jComboBox2.getSelectedItem()!="Gender")
        {
            if(Password.getText().equals(rp.getText()))
            {
                
                
                
        try{
            Class.forName("org.sqlite.JDBC");
            con=DriverManager.getConnection("jdbc:sqlite:D:\\My Disk\\My Data\\FinalProjectToDisplay\\All databases\\adi.sqlite");
            String sql="insert into login values(?,?,?,?,?,?,?,?,?,?);";
            ps=con.prepareStatement(sql);
            ps.setString(1,Username.getText());
            ps.setString(2,Password.getText());
            ps.setString(3,Email.getText());
            ps.setString(4,rp.getText());
            ps.setString(5,(String) jComboBox1.getSelectedItem());
            ps.setString(6,ans.getText());
            ps.setString(7,(String) jComboBox2.getSelectedItem());
            ps.setString(8,Firstname.getText());
            ps.setString(9,lastname.getText());
            ps.setBytes(10,p_image);
            ps.execute();
              this.setVisible(false);
              new SignIn().setVisible(true);
            JOptionPane.showMessageDialog(null, "Successfully");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Bad-gateway", e.getMessage(),1);
       
        }
            }
            else{
                JOptionPane.showMessageDialog(null, "Passwords don't match.");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Records can't be left empty");
        }
}else{
    this.setVisible(true);
    JOptionPane.showMessageDialog(rootPane, "Please Agree to terms and conditions!!");
}
    }//GEN-LAST:event_jLabel3MouseClicked

    private void UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameActionPerformed

    }//GEN-LAST:event_UsernameActionPerformed

    private void ansMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ansMouseClicked
ans.setText("");           // TODO add your handling code here:
    }//GEN-LAST:event_ansMouseClicked

    private void UsernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsernameMouseClicked
Username.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameMouseClicked

    private void EmailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmailMouseClicked
Email.setText("");          // TODO add your handling code here:
    }//GEN-LAST:event_EmailMouseClicked

    private void FirstnameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FirstnameMouseClicked
Firstname.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_FirstnameMouseClicked

    private void lastnameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lastnameMouseClicked
lastname.setText("");          // TODO add your handling code here:
    }//GEN-LAST:event_lastnameMouseClicked

    private void PasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PasswordMouseClicked
Password.setText("");          // TODO add your handling code here:
    }//GEN-LAST:event_PasswordMouseClicked

    private void rpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rpMouseClicked
rp.setText("");          // TODO add your handling code here:
    }//GEN-LAST:event_rpMouseClicked

    private void rpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rpActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
/*(for(double i=0.0; i<=1.0;i=i+0.1){
   String val=i+"F";
   float f=Float.valueOf(val);

this.setOpacity(f);
   try{


        Thread.sleep(30);
    }catch(Exception e){

    }
} */
// TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     this.setVisible(false);
        new SignIn().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


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
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
       
        java.awt.EventQueue.invokeLater(new Runnable() {
         @Override
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Email;
    private javax.swing.JTextField Firstname;
    private javax.swing.JLabel Message;
    private javax.swing.JPasswordField Password;
    private javax.swing.JTextField Username;
    private javax.swing.JTextField ans;
    private javax.swing.JLabel icon;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField lastname;
    private javax.swing.JPasswordField rp;
    // End of variables declaration//GEN-END:variables
private ImageIcon format=null;
String filename=null;
int s=0;
byte p_image[]=null;

}
