
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

public class HomeScreen extends javax.swing.JFrame {
 
   public Timer t;// for timer
   public ActionListener al; //ActionListener
   
   
   Connection con;
    Statement st;
    ResultSet rs;
    PreparedStatement ps;
    
    
    
    
    String msg="";
   
    
    
    
    
    public HomeScreen() {
        
        
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
        jLabel10.setVisible(false);
        Like.setEnabled(false);
        Unlike.setEnabled(false);
        jButton5.setEnabled(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton9 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        product = new javax.swing.JTextField();
        quantity = new javax.swing.JTextField();
        price = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        Like = new javax.swing.JButton();
        Unlike = new javax.swing.JButton();
        Criteria = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        images = new javax.swing.JLabel();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        reviews = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        rate = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        main = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        account = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu14 = new javax.swing.JMenu();
        Buy = new javax.swing.JMenu();
        Billing = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SHOPPING CART", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monospaced", 0, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setOpaque(false);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sale-pointer-128.png"))); // NOI18N

        jButton3.setBackground(new java.awt.Color(51, 204, 255));
        jButton3.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wishlist-64.png"))); // NOI18N
        jButton3.setMnemonic('c');
        jButton3.setText("Add to wish list");
        jButton3.setToolTipText("ADD TO WISHLIST");
        jButton3.setOpaque(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(0, 102, 204));
        jButton7.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/024_044_rotate_clockwise_arrow_circle-64.png"))); // NOI18N
        jButton7.setText("Refresh");
        jButton7.setToolTipText("Click to refresh the table");
        jButton7.setEnabled(false);
        jButton7.setOpaque(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product_Name_Id", "Quantity", "Price", "Reviews", "Rating(out of 5)", "Like or unlike"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
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
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
        }

        jButton9.setBackground(new java.awt.Color(0, 102, 204));
        jButton9.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/024_033_delete_close-64.png"))); // NOI18N
        jButton9.setText("ClearScreen");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Money-Bag-64.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/shoppingbag-64.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/P-1-83-64.png"))); // NOI18N

        jProgressBar1.setForeground(new java.awt.Color(51, 153, 0));
        jProgressBar1.setStringPainted(true);

        product.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N

        quantity.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        quantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityActionPerformed(evt);
            }
        });

        price.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Product-name-id");

        jLabel11.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Quantity");

        jLabel13.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Price");

        jComboBox1.setBackground(new java.awt.Color(0, 153, 153));
        jComboBox1.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Product_name_id", "Quantity", "Price" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox2.setBackground(new java.awt.Color(0, 153, 153));
        jComboBox2.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "=", ">", "<", "!=" }));

        jLabel9.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Search by criteria");

        jButton4.setBackground(new java.awt.Color(0, 153, 153));
        jButton4.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Investigate-64.png"))); // NOI18N
        jButton4.setText("Search By Criteria Taken");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel14.setText("jLabel14");

        Like.setIcon(new javax.swing.ImageIcon(getClass().getResource("/612398-like-64.png"))); // NOI18N
        Like.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LikeActionPerformed(evt);
            }
        });

        Unlike.setIcon(new javax.swing.ImageIcon(getClass().getResource("/612382-unlike-64.png"))); // NOI18N
        Unlike.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UnlikeActionPerformed(evt);
            }
        });

        Criteria.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N

        jButton5.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/patterns-64.png"))); // NOI18N
        jButton5.setText("<html>Sequence Products<br> by rating");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Specify the Criteria");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(product, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(133, 133, 133)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addGap(22, 22, 22)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(jLabel3)
                                .addGap(60, 60, 60))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(49, 49, 49)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addComponent(jLabel5)
                .addGap(80, 80, 80))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel16)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(Criteria, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Like, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28)
                                        .addComponent(Unlike, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(62, 62, 62)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel11)))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(product, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(60, 60, 60)))
                        .addComponent(jLabel13)
                        .addGap(1, 1, 1)))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton7)
                    .addComponent(jButton9))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Like, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Unlike, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Criteria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 740, 570));

        jButton8.setBackground(new java.awt.Color(0, 153, 255));
        jButton8.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/window-48.png"))); // NOI18N
        jButton8.setMnemonic(1);
        jButton8.setText("Back to Login");
        jButton8.setOpaque(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 660, 190, 70));

        images.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        images.setForeground(new java.awt.Color(255, 255, 255));
        images.setToolTipText("ATTACH YOUR IMAGE");
        images.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Product image", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monospaced", 0, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        getContentPane().add(images, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, 450, 570));

        update.setBackground(new java.awt.Color(0, 102, 102));
        update.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/024_100_refresh_update_sign_arrow-64.png"))); // NOI18N
        update.setText("Update ");
        update.setToolTipText("Click to update");
        update.setEnabled(false);
        update.setOpaque(false);
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        getContentPane().add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 660, 160, 70));

        delete.setBackground(new java.awt.Color(153, 204, 255));
        delete.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/024_033_delete_close-64.png"))); // NOI18N
        delete.setText("Delete");
        delete.setToolTipText("Delete Product");
        delete.setEnabled(false);
        delete.setOpaque(false);
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        getContentPane().add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 660, 150, 70));

        jButton1.setBackground(new java.awt.Color(0, 153, 255));
        jButton1.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/id-48.png"))); // NOI18N
        jButton1.setText("Click to see Products");
        jButton1.setToolTipText("CLICK TO LOAD DATA");
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 660, -1, 70));

        reviews.setColumns(20);
        reviews.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        reviews.setRows(5);
        reviews.setToolTipText("Write Review About the product");
        reviews.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reviewsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(reviews);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 660, 440, 70));

        jLabel7.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/message-64.png"))); // NOI18N
        jLabel7.setText("Add comments about the Product:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 580, 510, 70));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/024_033_delete_close-64.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 10, 70, 70));

        jButton6.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture-1-64.png"))); // NOI18N
        jButton6.setText("Change the Wallpaper");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 580, 390, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rate-64.png"))); // NOI18N
        jLabel1.setToolTipText("Rate");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 580, 70, -1));

        rate.setFont(new java.awt.Font("Monospaced", 0, 36)); // NOI18N
        rate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rateActionPerformed(evt);
            }
        });
        getContentPane().add(rate, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 580, 70, 60));

        jLabel10.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Rating out of 5");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 580, 170, 20));

        main.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simple_wallpaper_by_mikro098.png"))); // NOI18N
        main.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mainMouseClicked(evt);
            }
        });
        getContentPane().add(main, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 740));

        jMenuBar1.setBackground(new java.awt.Color(204, 204, 204));

        account.setBackground(new java.awt.Color(0, 102, 153));
        account.setIcon(new javax.swing.ImageIcon(getClass().getResource("/profile2-64.png"))); // NOI18N
        account.setText("Your Account");
        account.setFocusable(false);
        account.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture-48.png"))); // NOI18N
        jMenu1.setText("Click to Add image on your Account!");
        jMenu1.setFocusable(false);
        jMenu1.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        account.add(jMenu1);

        jMenu4.setBackground(new java.awt.Color(0, 102, 153));
        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Basket-48.png"))); // NOI18N
        jMenu4.setText("My cart");
        jMenu4.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });
        account.add(jMenu4);

        jMenu14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/power-button-64.png"))); // NOI18N
        jMenu14.setText("Logout");
        jMenu14.setFont(new java.awt.Font("Monospaced", 0, 11)); // NOI18N
        jMenu14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu14MouseClicked(evt);
            }
        });
        jMenu14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu14ActionPerformed(evt);
            }
        });
        account.add(jMenu14);

        jMenuBar1.add(account);

        Buy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wallet-64.png"))); // NOI18N
        Buy.setText("ClickToBuy");
        Buy.setFont(new java.awt.Font("Monospaced", 0, 11)); // NOI18N
        Buy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BuyMouseClicked(evt);
            }
        });
        jMenuBar1.add(Buy);

        Billing.setBackground(new java.awt.Color(0, 102, 153));
        Billing.setIcon(new javax.swing.ImageIcon(getClass().getResource("/credit_cards-64.png"))); // NOI18N
        Billing.setText("Billing");
        Billing.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        Billing.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BillingMouseClicked(evt);
            }
        });
        Billing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BillingActionPerformed(evt);
            }
        });
        jMenuBar1.add(Billing);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(1280, 806));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(!t.isRunning()){
            t.start();
        }
int rates=Integer.parseInt(rate.getText());
if(rates<=5){       
Icon a =new ImageIcon(getClass().getResource("picture-48.png"));
        JOptionPane.showMessageDialog(null,"Attaching image","Prompt",JOptionPane.INFORMATION_MESSAGE,a);
        if(!t.isRunning()){
            t.start();
        }
        JFileChooser chooser=new JFileChooser();
        chooser.showOpenDialog(null);
        File F=chooser.getSelectedFile();
        String Filename=F.getAbsolutePath();
        images.setIcon(new ImageIcon(""+F));
        try{
            File im=new File(Filename);
            FileInputStream fis=new FileInputStream(im);
            ByteArrayOutputStream bos=new  ByteArrayOutputStream();
            byte[] buf=new byte[1024];
            for(int i;(i=fis.read(buf))!=-1;){
                bos.write(buf,0,i);
            }
            p_image=bos.toByteArray();
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage(),"",JOptionPane.WARNING_MESSAGE);
        }

        

        try{
            Class.forName("org.sqlite.JDBC");
            con=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\aditya\\Desktop\\All databases\\New.sqlite");
            String sql="Insert into image values(?,?,?,?,?,?,?);";
            ps=con.prepareStatement(sql);
            ps.setBytes(1,p_image);
            ps.setString(2,product.getText());
            ps.setString(3,quantity.getText());
            ps.setString(4,price.getText());
            ps.setString(5,reviews.getText());
            ps.setString(6,rate.getText());
            ps.setString(7,"Notrated");
            
            ps.execute();
            JOptionPane.showMessageDialog(null, "Successfully");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
            
            System.out.print(e.getMessage()+"  "+"hi");
        }
        }else{
            jLabel10.setVisible(true);
        }
        jProgressBar1.setValue(0);
        product.setText("");
        quantity.setText("");
        price.setText("");
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        JOptionPane.showMessageDialog(null,"Refreshing the Screen !!!!");
        DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
        model.setRowCount(0);
        rate.setText("");
        product.setText("");
        quantity.setText("");
        price.setText("");
        jProgressBar1.setValue(0);
        images.setIcon(new ImageIcon(""));

        try{
            //JOptionPane.showMessageDialog(null,"Wait While we refresh the System");
            Class.forName("org.sqlite.JDBC");
            con=DriverManager.getConnection("jdbc:sqlite:D:\\My Disk\\My Data\\FinalProjectToDisplay\\All databases\\New.sqlite");
            st=con.createStatement();
            String query="Select* from image;";
            rs=st.executeQuery(query);
            while(rs.next()){
                model.addRow(new Object[]{
                    rs.getString("Product_name_ID"),rs.getString("Quantity"),rs.getString("Price"),rs.getString("review"),rs.getString("Rating"),rs.getString("likeUnlike")
                });
                byte[] image=rs.getBytes("image");
                format=new ImageIcon(image);
                images.setIcon(format);
            }
        }catch(Exception e) {

            JOptionPane.showMessageDialog(null,e.getMessage());

        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
        model.setRowCount(0);
        rate.setText("");
        product.setText("");
        quantity.setText("");
        price.setText("");
        jProgressBar1.setValue(0);
        images.setIcon(new ImageIcon(""));
        jButton1.setEnabled(true);
       // jButton9.setEnabled(false);
        jButton7.setEnabled(false);
        delete.setEnabled(false);
        update.setEnabled(false);
        jProgressBar1.setValue(0);
         Like.setEnabled(false);
        Unlike.setEnabled(false);
        jButton5.setEnabled(false);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        JFileChooser chooser=new JFileChooser();
        chooser.showOpenDialog(null);
        File F=chooser.getSelectedFile();
        String Filename=F.getAbsolutePath();
        account.setIcon(new ImageIcon(""+F));
       
    }//GEN-LAST:event_jMenu1MouseClicked

    private void BillingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BillingMouseClicked
        HomeScreen nf1 = new HomeScreen();
        Billing nf2=new Billing();
     // Billing.Bill.append("\n"+"Product Name:"+product.getText()+"\n"+"Quantity:"+quantity.getText()+"\n"+"Price:"+price.getText());
        
        
        nf1.setVisible(false);
        nf2.setVisible(true);

    }//GEN-LAST:event_BillingMouseClicked

    private void BillingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BillingActionPerformed

    }//GEN-LAST:event_BillingActionPerformed

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
        if(model.equals(null)){
jMenu4.setText("My cart (0)");
}else
            
        try{

            Class.forName("org.sqlite.JDBC");
            con=DriverManager.getConnection("jdbc:sqlite:D:\\My Disk\\My Data\\FinalProjectToDisplay\\All databases\\New.sqlite");
            st=con.createStatement();
            String sql="Select count(*) from image;";
            rs= st.executeQuery(sql);
            rs.next();
            int rec=rs.getInt(1);

            jMenu4.setText("(My cart)"+" "+ +(rec));
        } catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error");
        }
    }//GEN-LAST:event_jMenu4MouseClicked

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed

    }//GEN-LAST:event_jMenu4ActionPerformed
    private void BuyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuyMouseClicked
          try{
            Class.forName("java.sql.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/adi","root","pragyan");
            String sql="Insert into productdesc values('"+product.getText()+"','"+quantity.getText()+"','"+price.getText()+"')";
            st=con.createStatement();
            st.executeUpdate(sql);
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error in Uploading to Database!");
        }
        HomeScreen nf1=new HomeScreen();
        Wishlist nf2=new Wishlist();
        String a=product.getText();
        String b=quantity.getText();
        String c=price.getText();
       Wishlist.a.setText(a);
       Wishlist.b.setText(b);
        Wishlist.c.setText(c);
        Wishlist.ProductImage.setIcon(format);
        nf2.setVisible(true);

        //details.subject.append(""+product.getText());

    }//GEN-LAST:event_BuyMouseClicked

    private void jMenu14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu14MouseClicked
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu14MouseClicked

    private void jMenu14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu14ActionPerformed
        dispose();
    }//GEN-LAST:event_jMenu14ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        this.setVisible(false);
        new SignIn().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
        if(!t.isRunning()){
            t.start();
        }
    int rates=Integer.parseInt(rate.getText());
    if(rates<=5){
        try{
            Class.forName("org.sqlite.JDBC");
            con=DriverManager.getConnection("jdbc:sqlite:D:\\My Disk\\My Data\\FinalProjectToDisplay\\All databases\\New.sqlite");
            st=con.createStatement();
            String query="UPDATE image SET Product_name_ID='"+product.getText()+"',Review='"+reviews.getText()+"',Quantity='"+quantity.getText()+"',Rating='"+rate.getText()+"',Price='"+price.getText()+"' WHERE Price="+price.getText()+" ;";
            st.executeUpdate(query);
             
            JOptionPane.showMessageDialog(null,"Updating The  WishList");
        
            
            
        } catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }
        else
    {          
                jLabel10.setVisible(true);
    }
         model.setRowCount(0);
          try{
        ///    JOptionPane.showMessageDialog(null,"Connecting To The Server...Please Wait While The Data is Bieng Uploaded!");
            Class.forName("org.sqlite.JDBC");
            con=DriverManager.getConnection("jdbc:sqlite:D:\\My Disk\\My Data\\FinalProjectToDisplay\\All databases\\New.sqlite");
            st=con.createStatement();
            String query="Select* from image;";
            rs=st.executeQuery(query);
            while(rs.next()){
                model.addRow(new Object[]{
                    rs.getString("Product_name_ID"),rs.getString("Quantity"),rs.getString("Price"),rs.getString("review"),rs.getString("rating"),rs.getString("LikeUnlike")
                });
                byte[] image=rs.getBytes("image");
                format=new ImageIcon(image);
                images.setIcon(format);
            }
        }catch(Exception e) {

            JOptionPane.showMessageDialog(null,e.getMessage());

        }
        jProgressBar1.setValue(0);
    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        if(!t.isRunning()){
            t.start();
        }        int a=JOptionPane.showConfirmDialog(null,"Do You Want To Delete From Your Wishlist ");
        if(a==JOptionPane.YES_OPTION){
            try{
                Class.forName("org.sqlite.JDBC");
                con=DriverManager.getConnection("jdbc:sqlite:D:\\My Disk\\My Data\\FinalProjectToDisplay\\All databases\\New.sqlite");
                st=con.createStatement();
                String query="Delete from image Where Product_name_ID='"+product.getText()+"';";
                st.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Product Deleted From Wishlist Successfully");

                product.setText("");
                quantity.setText("");
                price.setText("");
                reviews.setText("");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
        }
        DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
        model.setRowCount(0);

        product.setText("");
        quantity.setText("");
        price.setText("");
        jProgressBar1.setValue(0);
        images.setIcon(new ImageIcon(""));

        try{
            //JOptionPane.showMessageDialog(null,"Wait While we refresh the System");
            Class.forName("org.sqlite.JDBC");
            con=DriverManager.getConnection("jdbc:sqlite:D:\\My Disk\\My Data\\FinalProjectToDisplay\\All databases\\New.sqlite");
            st=con.createStatement();
            String query="Select* from image;";
            rs=st.executeQuery(query);
            while(rs.next()){
                model.addRow(new Object[]{
                    rs.getString("Product_name_ID"),rs.getString("Quantity"),rs.getString("Price"),rs.getString("review"),rs.getString("rating"),rs.getString("LikeUnlike")
                });
                byte[] image=rs.getBytes("image");
                format=new ImageIcon(image);
                images.setIcon(format);
            }
        }catch(Exception e) {

            JOptionPane.showMessageDialog(null,e.getMessage());

        }
    }//GEN-LAST:event_deleteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
if(!t.isRunning()){
            t.start();
        }
        DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
        model.setRowCount(0);
        try{
           
             
            //JOptionPane.showMessageDialog(null,"Connecting To The Server...Please Wait While The Data is Bieng Uploaded!");
            
            Class.forName("org.sqlite.JDBC");
            con=DriverManager.getConnection("jdbc:sqlite:D:\\My Disk\\My Data\\FinalProjectToDisplay\\All databases\\New.sqlite");
            st=con.createStatement();
            String query="Select* from image;";
            rs=st.executeQuery(query);
            while(rs.next()){
                model.addRow(new Object[]{
                    rs.getString("Product_name_ID"),rs.getString("Quantity"),rs.getString("Price"),rs.getString("review"),rs.getString("rating"),rs.getString("likeUnlike")
                });
                byte[] image=rs.getBytes("image");
                format=new ImageIcon(image);
                images.setIcon(format);
            }
        }catch(Exception e) {

            JOptionPane.showMessageDialog(null,e.getMessage());

        }
        jProgressBar1.setValue(0);
        jButton7.setEnabled(true);
        jButton9.setEnabled(true);
        HomeScreen nf1 = new HomeScreen();
        details nf2=new details();
        details.subject.append("Product Name:" +" "+ product.getText());
        details.subject.append("\n"+"Quantity:"+" "+quantity.getText());
        details.subject.append("\n"+"Price:"+" "+price.getText());
        details.subject.append("\n"+"Thank you for shopping");
      //  new details().setVisible(true);
                
        jMenu4.setEnabled(true);
        //Billing.setEnabled(true);
        Buy.setEnabled(true);
        jButton1.setEnabled(true);
        delete.setEnabled(true);
        update.setEnabled(true);
        Like.setEnabled(true);
        Unlike.setEnabled(true);       
        jButton5.setEnabled(true);        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void reviewsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reviewsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_reviewsMouseClicked

    private void jTable1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTable1PropertyChange
        Color ivory = new Color(41, 128, 185);
        jTable1.setOpaque(true);
        jTable1.setFillsViewportHeight(true);
        jTable1.setBackground(ivory);
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1PropertyChange

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
    int row =jTable1.getSelectedRow();
        String Table_click=(jTable1.getModel().getValueAt(row,0).toString());
        try{
          
            Class.forName("org.sqlite.JDBC");
            con=DriverManager.getConnection("jdbc:sqlite:D:\\My Disk\\My Data\\FinalProjectToDisplay\\All databases\\New.sqlite");
            String sql="Select * from image where Product_Name_id = '"+Table_click+"'";
            st=con.createStatement();
            rs=st.executeQuery(sql);
            while(rs.next()){
            byte[] image=rs.getBytes("image");
            format=new ImageIcon(image);
            images.setIcon(format);    
            String Quantity=rs.getString("Quantity");
            String review=rs.getString("Review");
            String j=rs.getString("Product_Name_id");
            String Price=rs.getString("Price");
            String Rating=rs.getString("Rating");
            
            quantity.setText(Quantity);
            price.setText(Price);
            reviews.setText(review);
            product.setText(j);
            rate.setText(Rating);
            }
        }catch(Exception e) {

            JOptionPane.showMessageDialog(null,e.getMessage());

        }
        jProgressBar1.setValue(0);


        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
/*    try{
            st=con.createStatement();
            rs = st.executeQuery("SELECT * FROM login WHERE UserName='"+account.getText()+"'");
            while(rs.next()){
                String name=rs.getString("Username");
                account.setText("Welcome "+name);
            }
         
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage() ,"Error",1);
        }        // TODO add your handling code here:*/
    }//GEN-LAST:event_formWindowActivated

    private void quantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityActionPerformed

    private void mainMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainMouseClicked
        reviews.setText("");                // TODO add your handling code here:
}//GEN-LAST:event_mainMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
dispose();        // TODO add your handling code here:
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

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
       // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        JFileChooser chooser=new JFileChooser();
        chooser.showOpenDialog(null);
        File F=chooser.getSelectedFile();
        String Filename=F.getAbsolutePath();
        main.setIcon(new ImageIcon(""+F));        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
DefaultTableModel model=(DefaultTableModel)jTable1.getModel();

try{
    Class.forName("org.sqlite.JDBC");
    con=DriverManager.getConnection("jdbc:sqlite:D:\\My Disk\\My Data\\FinalProjectToDisplay\\All databases\\New.sqlite");
    st=con.createStatement();
    String slfd=(String)jComboBox1.getSelectedItem();
    String op=(String)jComboBox2.getSelectedItem();
    String criteria=Criteria.getText();
    String sql="SELECT Product_Name_id,Quantity,Price,Image,review,Rating,LikeUnlike FROM image WHERE  "+slfd+"  "+op+"  '"+criteria+"' ;";
    rs=st.executeQuery(sql);
    int count =0;
    if(rs.next()){
       count ++;
        model.addRow(new Object[]{
           rs.getString("Product_name_ID"),rs.getString("Quantity"),rs.getString("Price"),rs.getString("review"),rs.getString("Rating"),rs.getString("LikeUnlike")
        });
    
    
msg="Product Found According to your Specifications!!";
    }
     else{
msg="Product Not Found According to your Specifications!!";

    }
JOptionPane.showMessageDialog(null, msg);

}catch(Exception e){
JOptionPane.showMessageDialog(null, e.getMessage());
}        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void rateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rateActionPerformed

    private void LikeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LikeActionPerformed
DefaultTableModel model=(DefaultTableModel)jTable1.getModel();


        try{    
    Class.forName("org.sqlite.JDBC");
    con=DriverManager.getConnection("jdbc:sqlite:D:\\My Disk\\My Data\\FinalProjectToDisplay\\All databases\\New.sqlite");
    st=con.createStatement();
    String  sql="UPDATE image SET LikeUnlike='Like'  WHERE Product_name_id='"+product.getText()+"' ";
    st.executeUpdate(sql);
    while(rs.next()){
        model.addRow(new Object[]{
            rs.getString("Product_name_ID"),rs.getString("Quantity"),rs.getString("Price"),rs.getString("review"),rs.getString("Rating"),rs.getString("LikeUnlike")
        });
    
    JOptionPane.showMessageDialog(null,"Prodcut in your Wishlist is Liked");
    
        }
    
}catch(Exception e){
    JOptionPane.showMessageDialog(null,e.getMessage());
}
        model.setRowCount(0);
          try{
        ///    JOptionPane.showMessageDialog(null,"Connecting To The Server...Please Wait While The Data is Bieng Uploaded!");
            Class.forName("org.sqlite.JDBC");
            con=DriverManager.getConnection("jdbc:sqlite:D:\\My Disk\\My Data\\FinalProjectToDisplay\\All databases\\New.sqlite");
            st=con.createStatement();
            String query="Select* from image;";
            rs=st.executeQuery(query);
            while(rs.next()){
                model.addRow(new Object[]{
                    rs.getString("Product_name_ID"),rs.getString("Quantity"),rs.getString("Price"),rs.getString("review"),rs.getString("rating"),rs.getString("LikeUnlike")
                });
                byte[] image=rs.getBytes("image");
                format=new ImageIcon(image);
                images.setIcon(format);
            }
        }catch(Exception e) {

            JOptionPane.showMessageDialog(null,e.getMessage());

        }
        jProgressBar1.setValue(0);
    }//GEN-LAST:event_LikeActionPerformed

    private void UnlikeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UnlikeActionPerformed
DefaultTableModel model=(DefaultTableModel)jTable1.getModel();


        try{    
    Class.forName("org.sqlite.JDBC");
    con=DriverManager.getConnection("jdbc:sqlite:D:\\My Disk\\My Data\\FinalProjectToDisplay\\All databases\\New.sqlite");
    st=con.createStatement();
    String  sql="UPDATE image SET LikeUnlike= 'Unlike' WHERE Product_name_id='"+product.getText()+"' ";
    st.executeUpdate(sql);
    if(rs.next()){
        model.addRow(new Object[]{
            rs.getString("Product_name_ID"),rs.getString("Quantity"),rs.getString("Price"),rs.getString("review"),rs.getString("Rating"),rs.getString("LikeUnlike")
        });
    
    JOptionPane.showMessageDialog(null,"Prodcut in your Wishlist is UnLiked");
     jButton1.doClick();
    }
    
}catch(Exception e){
    JOptionPane.showMessageDialog(null,e.getMessage());
}   
     model.setRowCount(0);
          try{
        ///    JOptionPane.showMessageDialog(null,"Connecting To The Server...Please Wait While The Data is Bieng Uploaded!");
            Class.forName("org.sqlite.JDBC");
            con=DriverManager.getConnection("jdbc:sqlite:D:\\My Disk\\My Data\\FinalProjectToDisplay\\All databases\\New.sqlite");
            st=con.createStatement();
            String query="Select* from image;";
            rs=st.executeQuery(query);
            while(rs.next()){
                model.addRow(new Object[]{
                    rs.getString("Product_name_ID"),rs.getString("Quantity"),rs.getString("Price"),rs.getString("review"),rs.getString("rating"),rs.getString("LikeUnlike")
                });
                byte[] image=rs.getBytes("image");
                format=new ImageIcon(image);
                images.setIcon(format);
            }
        }catch(Exception e) {

            JOptionPane.showMessageDialog(null,e.getMessage());

        }
        jProgressBar1.setValue(0);   // TODO add your handling code here:
    }//GEN-LAST:event_UnlikeActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        
        
        
        
        DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
       model.setRowCount(0);
        try{
    Class.forName("org.sqlite.JDBC");
    con=DriverManager.getConnection("jdbc:sqlite:D:\\My Disk\\My Data\\FinalProjectToDisplay\\All databases\\New.sqlite");
    st=con.createStatement();
    String sql="Select * from image Order by Rating  ;";
    rs=st.executeQuery(sql);
     while(rs.next()){
                model.addRow(new Object[]{
                    rs.getString("Product_name_ID"),rs.getString("Quantity"),rs.getString("Price"),rs.getString("review"),rs.getString("rating"),rs.getString("LikeUnlike")
                });
     }
}catch(Exception e){
    JOptionPane.showMessageDialog(null,e.getMessage());
}// TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Billing;
    private javax.swing.JMenu Buy;
    private javax.swing.JTextField Criteria;
    private javax.swing.JButton Like;
    private javax.swing.JButton Unlike;
    public static javax.swing.JMenu account;
    private javax.swing.JButton delete;
    private javax.swing.JLabel images;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu14;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel main;
    private javax.swing.JTextField price;
    private javax.swing.JTextField product;
    private javax.swing.JTextField quantity;
    private javax.swing.JTextField rate;
    private javax.swing.JTextArea reviews;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
private ImageIcon format=null;
String filename=null;
int s=0;
byte p_image[]=null;
}
