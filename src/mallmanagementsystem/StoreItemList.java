package mallmanagementsystem;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import java.sql.*;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class StoreItemList extends javax.swing.JFrame {

    private final Connection con;
    private ResultSet res;
    private final String Username;
    private final int ID;

    public StoreItemList(String uname) {
        con = MyConnection.con();
        Username = uname;
        initComponents();
        this.setLocationRelativeTo(null);
        ID = setID();
        getStoreList();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelClose = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelMin = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jItem = new javax.swing.JTextField();
        jBack = new javax.swing.JButton();
        jPreferences = new javax.swing.JButton();
        jAdd = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jItems = new javax.swing.JButton();
        jOrder = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jAmount = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jItem1 = new javax.swing.JTextField();
        jAmount1 = new javax.swing.JTextField();
        jItems1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jAmount2 = new javax.swing.JTextField();
        jAmount3 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jItem2 = new javax.swing.JTextField();
        jAmount4 = new javax.swing.JTextField();
        jPreferences1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jAmount5 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jItem3 = new javax.swing.JTextField();
        jPreferences2 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jItem4 = new javax.swing.JTextField();
        jAmount6 = new javax.swing.JTextField();
        jPreferences3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(249, 202, 36));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel1MouseReleased(evt);
            }
        });

        jLabelClose.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelClose.setForeground(new java.awt.Color(255, 255, 255));
        jLabelClose.setText("X");
        jLabelClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("MV Boli", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Item List");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel2MouseReleased(evt);
            }
        });

        jLabelMin.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelMin.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMin.setText("-");
        jLabelMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinMouseClicked(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(19, 15, 64));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(236, 240, 241));
        jLabel4.setText("Item Id:");

        jItem.setBackground(new java.awt.Color(108, 122, 137));
        jItem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jItem.setForeground(new java.awt.Color(228, 241, 254));
        jItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jItemActionPerformed(evt);
            }
        });
        jItem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jItemKeyPressed(evt);
            }
        });

        jBack.setBackground(new java.awt.Color(242, 38, 19));
        jBack.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBack.setForeground(new java.awt.Color(255, 255, 255));
        jBack.setText("Back");
        jBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBackActionPerformed(evt);
            }
        });

        jPreferences.setBackground(new java.awt.Color(34, 167, 240));
        jPreferences.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPreferences.setForeground(new java.awt.Color(255, 255, 255));
        jPreferences.setText("Modify");
        jPreferences.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPreferencesActionPerformed(evt);
            }
        });

        jAdd.setBackground(new java.awt.Color(34, 167, 240));
        jAdd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jAdd.setForeground(new java.awt.Color(255, 255, 255));
        jAdd.setText("Add");
        jAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAddActionPerformed(evt);
            }
        });

        jScrollPane2.setBackground(new java.awt.Color(19, 15, 64));
        jScrollPane2.setForeground(new java.awt.Color(34, 167, 240));

        jTable3.setAutoCreateRowSorter(true);
        jTable3.setBackground(new java.awt.Color(19, 15, 64));
        jTable3.setForeground(new java.awt.Color(34, 167, 240));
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable3);

        jItems.setBackground(new java.awt.Color(34, 167, 240));
        jItems.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jItems.setForeground(new java.awt.Color(255, 255, 255));
        jItems.setText("View Store Items");
        jItems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jItemsActionPerformed(evt);
            }
        });

        jOrder.setBackground(new java.awt.Color(34, 167, 240));
        jOrder.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jOrder.setForeground(new java.awt.Color(255, 255, 255));
        jOrder.setText("View Order List");
        jOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOrderActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(236, 240, 241));
        jLabel5.setText("Amount:");

        jAmount.setBackground(new java.awt.Color(108, 122, 137));
        jAmount.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jAmount.setForeground(new java.awt.Color(228, 241, 254));
        jAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAmountActionPerformed(evt);
            }
        });
        jAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jAmountKeyPressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(236, 240, 241));
        jLabel6.setText("Item name:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(236, 240, 241));
        jLabel7.setText("Category:");

        jItem1.setBackground(new java.awt.Color(108, 122, 137));
        jItem1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jItem1.setForeground(new java.awt.Color(228, 241, 254));
        jItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jItem1ActionPerformed(evt);
            }
        });
        jItem1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jItem1KeyPressed(evt);
            }
        });

        jAmount1.setBackground(new java.awt.Color(108, 122, 137));
        jAmount1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jAmount1.setForeground(new java.awt.Color(228, 241, 254));
        jAmount1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAmount1ActionPerformed(evt);
            }
        });
        jAmount1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jAmount1KeyPressed(evt);
            }
        });

        jItems1.setBackground(new java.awt.Color(34, 167, 240));
        jItems1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jItems1.setForeground(new java.awt.Color(255, 255, 255));
        jItems1.setText("Refresh");
        jItems1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jItems1ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(236, 240, 241));
        jLabel8.setText("Item price:");

        jAmount2.setBackground(new java.awt.Color(108, 122, 137));
        jAmount2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jAmount2.setForeground(new java.awt.Color(228, 241, 254));
        jAmount2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAmount2ActionPerformed(evt);
            }
        });
        jAmount2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jAmount2KeyPressed(evt);
            }
        });

        jAmount3.setBackground(new java.awt.Color(108, 122, 137));
        jAmount3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jAmount3.setForeground(new java.awt.Color(228, 241, 254));
        jAmount3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAmount3ActionPerformed(evt);
            }
        });
        jAmount3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jAmount3KeyPressed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(236, 240, 241));
        jLabel9.setText("Amount:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(236, 240, 241));
        jLabel10.setText("Item Id:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(236, 240, 241));
        jLabel11.setText("Name:");

        jItem2.setBackground(new java.awt.Color(108, 122, 137));
        jItem2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jItem2.setForeground(new java.awt.Color(228, 241, 254));
        jItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jItem2ActionPerformed(evt);
            }
        });
        jItem2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jItem2KeyPressed(evt);
            }
        });

        jAmount4.setBackground(new java.awt.Color(108, 122, 137));
        jAmount4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jAmount4.setForeground(new java.awt.Color(228, 241, 254));
        jAmount4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAmount4ActionPerformed(evt);
            }
        });
        jAmount4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jAmount4KeyPressed(evt);
            }
        });

        jPreferences1.setBackground(new java.awt.Color(34, 167, 240));
        jPreferences1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPreferences1.setForeground(new java.awt.Color(255, 255, 255));
        jPreferences1.setText("Modify");
        jPreferences1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPreferences1ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(236, 240, 241));
        jLabel12.setText("Amount:");

        jAmount5.setBackground(new java.awt.Color(108, 122, 137));
        jAmount5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jAmount5.setForeground(new java.awt.Color(228, 241, 254));
        jAmount5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAmount5ActionPerformed(evt);
            }
        });
        jAmount5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jAmount5KeyPressed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(236, 240, 241));
        jLabel13.setText("Item Id:");

        jItem3.setBackground(new java.awt.Color(108, 122, 137));
        jItem3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jItem3.setForeground(new java.awt.Color(228, 241, 254));
        jItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jItem3ActionPerformed(evt);
            }
        });
        jItem3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jItem3KeyPressed(evt);
            }
        });

        jPreferences2.setBackground(new java.awt.Color(34, 167, 240));
        jPreferences2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPreferences2.setForeground(new java.awt.Color(255, 255, 255));
        jPreferences2.setText("Modify");
        jPreferences2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPreferences2ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(236, 240, 241));
        jLabel14.setText("Item Id:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(236, 240, 241));
        jLabel15.setText("Name:");

        jItem4.setBackground(new java.awt.Color(108, 122, 137));
        jItem4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jItem4.setForeground(new java.awt.Color(228, 241, 254));
        jItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jItem4ActionPerformed(evt);
            }
        });
        jItem4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jItem4KeyPressed(evt);
            }
        });

        jAmount6.setBackground(new java.awt.Color(108, 122, 137));
        jAmount6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jAmount6.setForeground(new java.awt.Color(228, 241, 254));
        jAmount6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAmount6ActionPerformed(evt);
            }
        });
        jAmount6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jAmount6KeyPressed(evt);
            }
        });

        jPreferences3.setBackground(new java.awt.Color(34, 167, 240));
        jPreferences3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPreferences3.setForeground(new java.awt.Color(255, 255, 255));
        jPreferences3.setText("Modify");
        jPreferences3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPreferences3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 942, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jItem1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jAmount3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jAmount1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jAmount2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jItem, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jPreferences, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jItem3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jAmount5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jPreferences2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jItem2, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                            .addComponent(jAmount4)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPreferences1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jPreferences3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jItem4)
                                        .addComponent(jAmount6, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBack, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jItems, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jItems1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel14)
                                .addComponent(jItem4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jItems))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(jAmount6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jItems1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jPreferences3)
                            .addComponent(jBack)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(jItem2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(jAmount4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jPreferences1)
                                    .addComponent(jOrder))
                                .addGap(18, 18, 18))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(jItem1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(jItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel5)
                                            .addComponent(jAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jPreferences)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel7))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jAmount3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jAmount1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jAmount2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addGap(29, 29, 29))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13)
                                    .addComponent(jItem3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(jAmount5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jPreferences2)
                            .addComponent(jAdd))))
                .addGap(54, 54, 54))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelMin)
                .addGap(18, 18, 18)
                .addComponent(jLabelClose)
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelClose)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    private void jPreferencesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPreferencesActionPerformed
        String name = jItem.getText();
        if (name.equals("")) {
            JOptionPane.showMessageDialog(null, "Add A Shop ID");
        } else if (!checkShopID(name)) {
            JOptionPane.showMessageDialog(null, "This Shop Is Not Found");
        } else {
            int sid = Integer.parseInt(name);
            new StoreCustomerPrefernces(sid, Username).setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jPreferencesActionPerformed

    private void jBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBackActionPerformed

        new BussinessProfile(Username).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBackActionPerformed

    private void jItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jItemActionPerformed

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked

        System.exit(0);
    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jLabelMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseClicked

        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMinMouseClicked

    private void jAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAddActionPerformed


    }//GEN-LAST:event_jAddActionPerformed

    private void jItemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jItemKeyPressed
        char in = evt.getKeyChar();
        if (Character.isDigit(in)) {
            jItem.setEditable(true);
        } else {
            jItem.setEditable(false);
        }

    }//GEN-LAST:event_jItemKeyPressed

    private void jPanel1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseReleased
    }//GEN-LAST:event_jPanel1MouseReleased

    private void jLabel2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseReleased
        this.setLocation(evt.getXOnScreen(), evt.getYOnScreen());
    }//GEN-LAST:event_jLabel2MouseReleased

    private void jItemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jItemsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jItemsActionPerformed

    private void jOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jOrderActionPerformed
        String name = jItem.getText();
        if (name.equals("")) {
            JOptionPane.showMessageDialog(null, "Add A Store ID");
        } else if (!checkShopID(name)) {
            JOptionPane.showMessageDialog(null, "This Store Is Not Found");
        } else {
            int sid = Integer.parseInt(name);
            new StoreCustomerOreders(sid, Username).setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jOrderActionPerformed

    private void jAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jAmountActionPerformed

    private void jAmountKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jAmountKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jAmountKeyPressed

    private void jItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jItem1ActionPerformed

    private void jItem1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jItem1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jItem1KeyPressed

    private void jAmount1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAmount1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jAmount1ActionPerformed

    private void jAmount1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jAmount1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jAmount1KeyPressed

    private void jItems1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jItems1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jItems1ActionPerformed

    private void jAmount2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAmount2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jAmount2ActionPerformed

    private void jAmount2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jAmount2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jAmount2KeyPressed

    private void jAmount3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAmount3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jAmount3ActionPerformed

    private void jAmount3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jAmount3KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jAmount3KeyPressed

    private void jItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jItem2ActionPerformed

    private void jItem2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jItem2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jItem2KeyPressed

    private void jAmount4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAmount4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jAmount4ActionPerformed

    private void jAmount4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jAmount4KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jAmount4KeyPressed

    private void jPreferences1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPreferences1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPreferences1ActionPerformed

    private void jAmount5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAmount5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jAmount5ActionPerformed

    private void jAmount5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jAmount5KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jAmount5KeyPressed

    private void jItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jItem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jItem3ActionPerformed

    private void jItem3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jItem3KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jItem3KeyPressed

    private void jPreferences2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPreferences2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPreferences2ActionPerformed

    private void jItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jItem4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jItem4ActionPerformed

    private void jItem4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jItem4KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jItem4KeyPressed

    private void jAmount6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAmount6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jAmount6ActionPerformed

    private void jAmount6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jAmount6KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jAmount6KeyPressed

    private void jPreferences3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPreferences3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPreferences3ActionPerformed
    private boolean checkShopID(String sid) {

        PreparedStatement ps;
        String query = "select sid from shop where sid=?";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, Integer.parseInt(sid));
            if (ps.executeQuery().next()) {
                return true;
            }
            return false;
        } catch (SQLException | NumberFormatException ex) {
            Logger.getLogger(StoreItemList.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jAdd;
    private javax.swing.JTextField jAmount;
    private javax.swing.JTextField jAmount1;
    private javax.swing.JTextField jAmount2;
    private javax.swing.JTextField jAmount3;
    private javax.swing.JTextField jAmount4;
    private javax.swing.JTextField jAmount5;
    private javax.swing.JTextField jAmount6;
    private javax.swing.JButton jBack;
    private javax.swing.JTextField jItem;
    private javax.swing.JTextField jItem1;
    private javax.swing.JTextField jItem2;
    private javax.swing.JTextField jItem3;
    private javax.swing.JTextField jItem4;
    private javax.swing.JButton jItems;
    private javax.swing.JButton jItems1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JButton jOrder;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jPreferences;
    private javax.swing.JButton jPreferences1;
    private javax.swing.JButton jPreferences2;
    private javax.swing.JButton jPreferences3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable3;
    // End of variables declaration//GEN-END:variables

    private void getStoreList() {

        PreparedStatement ps;
        String query = "SELECT O.sid, O.sname , O.sarea , O.budget, COUNT(C.vdate), SUM(P.totalprice) FROM shop O JOIN sellhistory P ON P.sid = O.sid JOIN customervisit C ON C.sid = O.sid where O.oid = ? order by O.sid;";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, ID);
            res = ps.executeQuery();
            String[] strs = {"Shop ID", "Shop Name", "Shop Area", "Rent Value", "number of visits", "Total Sell"};
            jTable3.setModel(BuildDefultModel.buildTableModel(res, Arrays.asList(strs)));
        } catch (SQLException ex) {
            Logger.getLogger(StoreItemList.class.getName()).log(Level.SEVERE, null, ex);
        }
        jScrollPane2.setViewportView(jTable3);
    }

    private int setID() {
        PreparedStatement ps;
        String query = "SELECT oid from owner where uname = ?;";
        try {
            ps = con.prepareStatement(query);
            ps.setString(1, Username);
            res = ps.executeQuery();
            if (res.next()) {
                return res.getInt("oid");
            }
        } catch (SQLException ex) {
            Logger.getLogger(StoreItemList.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

}
