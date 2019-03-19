
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;


public class details extends javax.swing.JFrame {
Connection con;
Statement st;
ResultSet rs;
    public Timer t;
   public ActionListener al;
   
   
    public details() {
        al=new ActionListener(){
            @Override
             public void actionPerformed(ActionEvent ae){
                if(jProgressBar1.getValue()<100){
            jProgressBar1.setValue(jProgressBar1.getValue()+1);

                }
                else
                {t.stop();}

        
            }
        };

        t=new Timer(1,al);

      


        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        Name = new javax.swing.JTextField();
        Pincode = new javax.swing.JTextField();
        Address = new javax.swing.JTextField();
        Landmark = new javax.swing.JTextField();
        Phone = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        to = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        subject = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Message = new javax.swing.JTextArea();
        jLabel19 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        main = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 204, 255));
        jButton1.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/612408-email-64.png"))); // NOI18N
        jButton1.setText("Save and mail");
        jButton1.setToolTipText("Save the details");
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 260, 70));

        jButton3.setBackground(new java.awt.Color(0, 153, 255));
        jButton3.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/notes-64.png"))); // NOI18N
        jButton3.setText("Load Details");
        jButton3.setToolTipText("Show details");
        jButton3.setOpaque(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, 260, 80));

        update.setBackground(new java.awt.Color(0, 153, 255));
        update.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/024_044_rotate_clockwise_arrow_circle-64.png"))); // NOI18N
        update.setText("Update Details");
        update.setToolTipText("Update ");
        update.setEnabled(false);
        update.setOpaque(false);
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        getContentPane().add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 340, 260, 80));

        delete.setBackground(new java.awt.Color(0, 153, 255));
        delete.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/024_033_delete_close-64.png"))); // NOI18N
        delete.setText("Delete Details");
        delete.setToolTipText("Delete ");
        delete.setEnabled(false);
        delete.setOpaque(false);
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        getContentPane().add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 450, 260, 80));

        jButton8.setBackground(new java.awt.Color(51, 204, 255));
        jButton8.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/024_100_refresh_update_sign_arrow-64.png"))); // NOI18N
        jButton8.setText("Refresh Page");
        jButton8.setToolTipText("Refresh the page");
        jButton8.setEnabled(false);
        jButton8.setOpaque(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 550, 260, 80));

        Name.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        Name.setOpaque(false);
        getContentPane().add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 220, 40));

        Pincode.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        Pincode.setOpaque(false);
        Pincode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PincodeActionPerformed(evt);
            }
        });
        getContentPane().add(Pincode, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 220, 40));

        Address.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        Address.setOpaque(false);
        getContentPane().add(Address, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 220, 40));

        Landmark.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        Landmark.setOpaque(false);
        getContentPane().add(Landmark, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 220, 40));

        Phone.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        Phone.setOpaque(false);
        Phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneActionPerformed(evt);
            }
        });
        getContentPane().add(Phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 450, 220, 40));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iPhone_Back-48.png"))); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 50, 50));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/34-48.png"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 50, 50));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon-31-48.png"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 50, 50));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pin_2-48.png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 50, 50));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/256x256_user-48.png"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 50, 50));

        jButton5.setBackground(new java.awt.Color(0, 204, 255));
        jButton5.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home_house-64.png"))); // NOI18N
        jButton5.setText("Home page");
        jButton5.setToolTipText("Back to HomeScreenPage");
        jButton5.setOpaque(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 510, 330, 80));

        jButton6.setBackground(new java.awt.Color(0, 204, 204));
        jButton6.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/window-48.png"))); // NOI18N
        jButton6.setText("Login page");
        jButton6.setToolTipText("Back to login");
        jButton6.setOpaque(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 600, 330, 80));

        jButton7.setBackground(new java.awt.Color(0, 204, 204));
        jButton7.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arrow-left-circle-blue-64.png"))); // NOI18N
        jButton7.setToolTipText("Back ");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 80));

        jButton10.setBackground(new java.awt.Color(51, 153, 255));
        jButton10.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/024_033_delete_close-64.png"))); // NOI18N
        jButton10.setText("Clear Screen");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 660, 260, 80));

        jTable1.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Pincode", "Address", "Landmark", "Phone", "EmailId"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setColumnSelectionAllowed(true);
        jTable1.setFillsViewportHeight(true);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jTable1PropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 140, 590, 210));

        jLabel8.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Email Id:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 400, 110, 30));

        jLabel9.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Details of Product:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 580, 220, 30));

        to.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        to.setOpaque(false);
        to.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toActionPerformed(evt);
            }
        });
        getContentPane().add(to, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 400, 320, 30));

        subject.setColumns(20);
        subject.setRows(5);
        subject.setText("Thank you for shopping with us!!\n\n");
        subject.setEnabled(false);
        subject.setOpaque(false);
        jScrollPane2.setViewportView(subject);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 440, 340, 140));

        jLabel2.setFont(new java.awt.Font("Monospaced", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Online Shopping");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 340, 40));

        jLabel7.setBackground(new java.awt.Color(0, 153, 153));
        jLabel7.setFont(new java.awt.Font("AR CARTER", 1, 24)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/go1.png"))); // NOI18N
        jLabel7.setText(" ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 10, 130, -1));

        jLabel6.setBackground(new java.awt.Color(0, 153, 153));
        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/go.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 140, 130));

        jButton11.setBackground(new java.awt.Color(0, 102, 204));
        jButton11.setFont(new java.awt.Font("AR CARTER", 0, 18)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/024_033_delete_close-64.png"))); // NOI18N
        jButton11.setToolTipText("Exit from the Application");
        jButton11.setBorder(null);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1195, 0, 80, 70));

        jProgressBar1.setForeground(new java.awt.Color(0, 153, 0));
        jProgressBar1.setStringPainted(true);
        getContentPane().add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 360, 410, 20));

        jLabel3.setFont(new java.awt.Font("Monospaced", 0, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Customer Details");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, 470, 40));

        jLabel4.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 50, -1));

        jLabel5.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Pincode");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, -1, -1));

        jLabel15.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Address");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, -1, -1));

        jLabel16.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Landmark");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, -1, -1));

        jLabel17.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Phone no");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/manager-128.png"))); // NOI18N
        jLabel18.setText("jLabel18");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 120, 120));

        Message.setEditable(false);
        Message.setColumns(20);
        Message.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        Message.setRows(5);
        Message.setOpaque(false);
        jScrollPane3.setViewportView(Message);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 590, 340, 190));

        jLabel19.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Message:");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 450, 100, 30));

        jButton2.setBackground(new java.awt.Color(0, 204, 255));
        jButton2.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Shopping_Bags-128.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 660, 170, 110));

        jButton9.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture-1-64.png"))); // NOI18N
        jButton9.setText("Change the Wallpaper");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 690, 330, -1));

        main.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simple_wallpaper_by_mikro098.png"))); // NOI18N
        getContentPane().add(main, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 800));

        setSize(new java.awt.Dimension(1280, 801));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(!t.isRunning())
        t.start();

     
        Sendemail se=new Sendemail(to.getText(),subject.getText(),Message.getText());

        DefaultTableModel Model=(DefaultTableModel) jTable1.getModel();
        try{
            Class.forName("java.sql.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/adi","root","pragyan");
            st=con.createStatement();
            String query="Insert into details values('"+Name.getText()+"','"+Pincode.getText()+"','"+Address.getText()+"','"+Landmark.getText()+"','"+Phone.getText()+"','"+to.getText()+"')";
            st.executeUpdate(query);

            JOptionPane.showMessageDialog(null,"Details Saved");

            Name.setText("");
            Pincode.setText("");
            Address.setText("");
            Landmark.setText("");
            Phone.setText("");

        }catch(Exception e){
            Icon i=new ImageIcon(getClass().getResource("alert-circle-red-48"));
            JOptionPane.showMessageDialog(null,"Error in Connectivity","Prompt",JOptionPane.INFORMATION_MESSAGE,i);

        }

        JOptionPane.showMessageDialog(null,"Please Click load Orders to Check all Your Details");
        JOptionPane.showMessageDialog(null,"Thank You for Shopping with us!!!!");

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(!t.isRunning()){
            t.start();
        }
        DefaultTableModel model=( DefaultTableModel)  jTable1.getModel();
        try{

            Class.forName("java.sql.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/adi","root","pragyan");
            st=con.createStatement();
            String query="Select*from details;";
            rs=st.executeQuery(query);
            while(rs.next()){

                model.addRow(new Object[]{
                    rs.getString("Name"),rs.getString("Pincode"),rs.getString("Address"),rs.getString("landmark"),rs.getString("Phone"),rs.getString("EmailID")
                });

            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null,"Please Wait!");
        }

        jButton8.setEnabled(true);
        delete.setEnabled(true);
        update.setEnabled(true);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        if(!t.isRunning()){
            t.start();
        }
        try{
            Class.forName("java.sql.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/adi","root","pragyan");
            st=con.createStatement();
            String query="Update details  set Name='"+Name.getText()+"',Pincode='"+Pincode.getText()+"',Address='"+Address.getText()+"',landmark='"+Landmark.getText()+"',Phone='"+Phone.getText()+"',EmailId='"+to.getText()+"' where Name='"+Name.getText()+"';";
            st.executeUpdate(query);
            JOptionPane.showMessageDialog(null,"Updated_SucessFully");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error in the server");
        }
    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        if(!t.isRunning()){
            t.start();
        }
        DefaultTableModel model=( DefaultTableModel)  jTable1.getModel();
        try{
            Class.forName("java.sql.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/adi","root","pragyan");
            st=con.createStatement();
            String query="Delete from details Where Name='"+Name.getText()+"';";
            st.executeUpdate(query);
            JOptionPane.showMessageDialog(null,"Order Canceled  Successfully");
            Name.setText("");
            Pincode.setText("");
            Address.setText("");
            Landmark.setText("");
            Phone.setText("");

            model.addRow(new Object[]{

            });

        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error in Deleting");
        }
         model.setRowCount(0);
        to.setText("");
        Name.setText("");
        Pincode.setText("");
        Address.setText("");
        Landmark.setText("");
        Phone.setText("");
        jProgressBar1.setValue(0);
        try{

            Class.forName("java.sql.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/adi","root","pragyan");
            st=con.createStatement();
            String query="Select*from details;";
            rs=st.executeQuery(query);
            while(rs.next()){

                model.addRow(new Object[]{
                    rs.getString("Name"),rs.getString("Pincode"),rs.getString("Address"),rs.getString("landmark"),rs.getString("Phone"),rs.getString("EmailID")
                });

            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null,"Please Wait!");
        }

    }//GEN-LAST:event_deleteActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

        if(!t.isRunning()){
            t.start();
        }
        DefaultTableModel model=( DefaultTableModel)  jTable1.getModel();
        model.setRowCount(0);
        to.setText("");
        Name.setText("");
        Pincode.setText("");
        Address.setText("");
        Landmark.setText("");
        Phone.setText("");
        jProgressBar1.setValue(0);
        try{

            Class.forName("java.sql.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/adi","root","pragyan");
            st=con.createStatement();
            String query="Select*from details;";
            rs=st.executeQuery(query);
            while(rs.next()){

                model.addRow(new Object[]{
                    rs.getString("Name"),rs.getString("Pincode"),rs.getString("Address"),rs.getString("landmark"),rs.getString("Phone"),rs.getString("EmailID")
                });
   
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null,"Please Wait!");
       
        }
     jProgressBar1.setValue(0);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void PincodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PincodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PincodeActionPerformed

    private void PhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PhoneActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.setVisible(false);
        new HomeScreen().setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        this.setVisible(false);
        new Apple().setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        this.setVisible(false);
        new banking().setVisible(true);       // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed

        { DefaultTableModel model=( DefaultTableModel)  jTable1.getModel();
            model.setRowCount(0);
            to.setText("");
            Name.setText("");
            Pincode.setText("");
            Address.setText("");
            Landmark.setText("");
            Phone.setText("");
            jProgressBar1.setValue(0);
            delete.setEnabled(false);
            update.setEnabled(false);
            jButton8.setEnabled(false);
            Message.setText("");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
try{
    Class.forName("java.sql.Driver");
    con=DriverManager.getConnection("jdbc:mysql://localhost/adi","root","pragyan");
    st=con.createStatement();
    String sql="Delete from productdesc;";
    st.executeUpdate(sql);
   
}catch(Exception e){
    JOptionPane.showMessageDialog(null,"Error");
}
        ImageIcon a=new ImageIcon(getClass().getResource("024_033_delete_close-64.png"));
        JOptionPane.showMessageDialog(null,"Good-Bye!!!!","prompt",JOptionPane.ERROR_MESSAGE,a);
        new Developers().setVisible(true);
        dispose();
        
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
    int row =jTable1.getSelectedRow();
String Table_click=(jTable1.getModel().getValueAt(row,0).toString());
try{

            Class.forName("java.sql.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/adi","root","pragyan");
            st=con.createStatement();
            String query="Select*from details Where Name='"+Table_click+"'";
            rs=st.executeQuery(query);
            while(rs.next()){

           String Names=rs.getString("Name");
           String Pincodes=rs.getString("Pincode");
           String Address1=rs.getString("Address");
           String landmark=rs.getString("landmark");
           String phone=rs.getString("Phone");
           String EmailId=rs.getString("EmailId");
           Name.setText(Names); 
           Pincode.setText(Pincodes); 
           Address.setText(Address1);
           Landmark.setText(landmark);
           Phone.setText(phone);
           to.setText(EmailId);
            }

        }catch(Exception e) {

            JOptionPane.showMessageDialog(null,"Error In Loading Data");

        }        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTable1PropertyChange
   Color ivory = new Color(41, 128, 185);
        jTable1.setOpaque(true);
        jTable1.setFillsViewportHeight(true);
        jTable1.setBackground(ivory);

// TODO add your handling code here:
    }//GEN-LAST:event_jTable1PropertyChange

    private void toActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_toActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 try{
    Class.forName("java.sql.Driver");
    con=DriverManager.getConnection("jdbc:mysql://localhost/adi","root","pragyan");
    st=con.createStatement();
    String sql="Select *from productdesc;";
    rs=st.executeQuery(sql);
    while(rs.next()){

        String Productname=rs.getString("Productname");
        String Quantity=rs.getString("Quantity");
        String Price=rs.getString("Price");
       
        Message.append("Productname:"+Productname+"\n"+"Quantity:"+Quantity+"\n"+"Price:"+Price);
    }
}catch(Exception e){
    JOptionPane.showMessageDialog(null,"Error");
}        // TODO add your handling code here:
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
}            // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        JFileChooser chooser=new JFileChooser();
        chooser.showOpenDialog(null);
        File F=chooser.getSelectedFile();
        String Filename=F.getAbsolutePath();
        main.setIcon(new ImageIcon(""+F));        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

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
            java.util.logging.Logger.getLogger(details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new details().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Address;
    private javax.swing.JTextField Landmark;
    private javax.swing.JTextArea Message;
    private javax.swing.JTextField Name;
    private javax.swing.JTextField Phone;
    private javax.swing.JTextField Pincode;
    private javax.swing.JButton delete;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel main;
    public static javax.swing.JTextArea subject;
    private javax.swing.JTextField to;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
