package mallmanagementsystem;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import java.sql.*;
import java.time.LocalDate;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class StoreItemList extends javax.swing.JFrame {

    private final Connection con;
    private ResultSet res;
    private final String Username;
    private final int storeId;

    public StoreItemList(int sid, String uname) {
        con = MyConnection.con();
        Username = uname;
        storeId = sid;
        initComponents();
        this.setLocationRelativeTo(null);
        getItems();
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
        jBack = new javax.swing.JButton();
        jAdd = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jRefresh = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jModify = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jItemId = new javax.swing.JTextField();
        jAmount = new javax.swing.JTextField();
        jPrice = new javax.swing.JTextField();
        jName = new javax.swing.JTextField();
        jCategory = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(249, 202, 36));

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

        jBack.setBackground(new java.awt.Color(242, 38, 19));
        jBack.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBack.setForeground(new java.awt.Color(255, 255, 255));
        jBack.setText("Back");
        jBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBackActionPerformed(evt);
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

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(236, 240, 241));
        jLabel5.setText("Amount:");

        jRefresh.setBackground(new java.awt.Color(34, 167, 240));
        jRefresh.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRefresh.setForeground(new java.awt.Color(255, 255, 255));
        jRefresh.setText("Refresh");
        jRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRefreshActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(236, 240, 241));
        jLabel12.setText("Price:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(236, 240, 241));
        jLabel13.setText("Category:");

        jModify.setBackground(new java.awt.Color(34, 167, 240));
        jModify.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jModify.setForeground(new java.awt.Color(255, 255, 255));
        jModify.setText("Modify");
        jModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jModifyActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(236, 240, 241));
        jLabel15.setText("Name:");

        jItemId.setBackground(new java.awt.Color(108, 122, 137));
        jItemId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jItemId.setForeground(new java.awt.Color(228, 241, 254));
        jItemId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jItemIdKeyPressed(evt);
            }
        });

        jAmount.setBackground(new java.awt.Color(108, 122, 137));
        jAmount.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jAmount.setForeground(new java.awt.Color(228, 241, 254));
        jAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jAmountKeyPressed(evt);
            }
        });

        jPrice.setBackground(new java.awt.Color(108, 122, 137));
        jPrice.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPrice.setForeground(new java.awt.Color(228, 241, 254));
        jPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPriceKeyPressed(evt);
            }
        });

        jName.setBackground(new java.awt.Color(108, 122, 137));
        jName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jName.setForeground(new java.awt.Color(228, 241, 254));

        jCategory.setBackground(new java.awt.Color(108, 122, 137));
        jCategory.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCategory.setForeground(new java.awt.Color(228, 241, 254));

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
        jTable3.setColumnSelectionAllowed(true);
        jScrollPane2.setViewportView(jTable3);

        jDelete.setBackground(new java.awt.Color(34, 167, 240));
        jDelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jDelete.setForeground(new java.awt.Color(255, 255, 255));
        jDelete.setText("Delete");
        jDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRefresh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jModify, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                                .addComponent(jItemId)
                                .addComponent(jPrice, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jName))
                            .addComponent(jAmount, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCategory, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(19, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jItemId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jAdd)
                            .addComponent(jModify))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRefresh)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelMin)
                .addGap(18, 18, 18)
                .addComponent(jLabelClose)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBackActionPerformed
        new BussinessProfile(Username).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBackActionPerformed

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jLabelMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMinMouseClicked

    private void jAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAddActionPerformed
        String name = jName.getText();
        String category = jCategory.getText();
        String amount = jAmount.getText();
        String price = jPrice.getText();

        int categoryId = 0;
        int itemId = 0;
        if (name.equals("")) {
            JOptionPane.showMessageDialog(null, "Add a name");
        } else if (category.equals("")) {
            JOptionPane.showMessageDialog(null, "Add the item category");
        } else if (amount.equals("")) {
            JOptionPane.showMessageDialog(null, "Add the amount of item");
        } else if (price == null) {
            JOptionPane.showMessageDialog(null, "Add the item price");
        } else {
            PreparedStatement ps;
            String query = "INSERT INTO category (cname) SELECT * FROM (SELECT ?) AS tmp WHERE NOT EXISTS ( SELECT cname FROM category WHERE cname = ? ) LIMIT 1;";
            try {
                ps = con.prepareStatement(query);
                ps.setString(1, category);
                ps.setString(2, category);
                ps.execute();

                query = "select cid from category where cname = ?;";
                ps = con.prepareStatement(query);
                ps.setString(1, category);
                res = ps.executeQuery();
                if (res.next()) {
                    categoryId = res.getInt("cid");
                }

                query = "INSERT INTO item (iname,cid,price) SELECT * FROM (SELECT ?,?,?) AS tmp WHERE NOT EXISTS ( SELECT iname FROM item WHERE iname = ? ) LIMIT 1;";
                ps = con.prepareStatement(query);
                ps.setString(1, name);
                ps.setInt(2, categoryId);
                ps.setDouble(3, Double.parseDouble(price));
                ps.setString(4, name);
                ps.setString(5, name);
                ps.execute();

                query = "select iiid from item where iname = ?;";
                ps = con.prepareStatement(query);

                ps.setString(1, name);
                res = ps.executeQuery();
                if (res.next()) {
                    itemId = res.getInt("iiid");
                }

                query = "INSERT INTO shopitems (iid,amount,price,date,sid) SELECT * FROM (SELECT ?,?,?,?,?) AS tmp WHERE NOT EXISTS (SELECT iid FROM shopitems WHERE iid = ? and sid = ?) LIMIT 1;";
                ps = con.prepareStatement(query);

                ps.setInt(1, itemId);
                ps.setInt(2, Integer.parseInt(amount));
                ps.setDouble(3, Double.parseDouble(price));
                ps.setDate(4, Date.valueOf(LocalDate.now()));
                ps.setInt(5, storeId);
                ps.setDouble(6, itemId);
                ps.setDouble(7, storeId);

                ps.execute();

                JOptionPane.showMessageDialog(null, "New Item Was Added");

            } catch (SQLException ex) {
                Logger.getLogger(AddStore.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_jAddActionPerformed

    private void jLabel2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseReleased
        this.setLocation(evt.getXOnScreen(), evt.getYOnScreen());
    }//GEN-LAST:event_jLabel2MouseReleased

    private void jRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRefreshActionPerformed
        getItems();
    }//GEN-LAST:event_jRefreshActionPerformed

    private void jItemIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jItemIdKeyPressed
        char in = evt.getKeyChar();
        if (Character.isDigit(in)) {
            jItemId.setEditable(true);
        } else {
            jItemId.setEditable(false);
        }
    }//GEN-LAST:event_jItemIdKeyPressed

    private void jAmountKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jAmountKeyPressed
        char in = evt.getKeyChar();
        if (Character.isDigit(in)) {
            jAmount.setEditable(true);
        } else {
            jAmount.setEditable(false);
        }
    }//GEN-LAST:event_jAmountKeyPressed

    private void jPriceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPriceKeyPressed
        char in = evt.getKeyChar();
        if (Character.isDigit(in) || in == '.') {
            jPrice.setEditable(true);
        } else {
            jPrice.setEditable(false);
        }
    }//GEN-LAST:event_jPriceKeyPressed

    private void jDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDeleteActionPerformed
        String itemId = jItemId.getText();
        Double price = Double.parseDouble(jAmount.getText());
        if (itemId == null) {
            JOptionPane.showMessageDialog(null, "Add an id");
        } else if (!checkItemIsFound(Integer.parseInt(itemId))) {
            JOptionPane.showMessageDialog(null, "This item is not found");
        } else {
            deleteItem(Integer.parseInt(itemId));
        }
    }//GEN-LAST:event_jDeleteActionPerformed

    private void jModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jModifyActionPerformed
        Integer itemId = Integer.parseInt(jItemId.getText());
        String category = jCategory.getText();
        Integer amount = Integer.parseInt(jAmount.getText());
        Double price = Double.parseDouble(jPrice.getText());
        String name = jPrice.getText();
        PreparedStatement ps;
        String query = "";
        if (itemId == null) {
            JOptionPane.showMessageDialog(null, "write the item id which you want to modify it");
        } else {
            if (name != null) {
                modifyName(itemId, name);
            }
            if (category != null) {
                modifyCategory(itemId, category);
            }
            if (amount != null) {
                modifyAmount(itemId, amount);
            }
            if (price != null) {
                modifyPrice(itemId, price);
            }
        }
    }//GEN-LAST:event_jModifyActionPerformed

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
            Logger.getLogger(StoreItemList.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jAdd;
    private javax.swing.JTextField jAmount;
    private javax.swing.JButton jBack;
    private javax.swing.JTextField jCategory;
    private javax.swing.JButton jDelete;
    private javax.swing.JTextField jItemId;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JButton jModify;
    private javax.swing.JTextField jName;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jPrice;
    private javax.swing.JButton jRefresh;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable3;
    // End of variables declaration//GEN-END:variables

    private void getItems() {

        PreparedStatement ps;
        String query = "SELECT  O.iid , I.iname ,  C.cname  ,O.iprice, O.amount ,  O.date  FROM shopitems O JOIN item I ON O.iid = I.iiid JOIN category C ON C.cid = I.cid where O.sid = ?  order by O.iid;";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, storeId);
            res = ps.executeQuery();
            String[] strs = {"Item Id", "Item Name", "Category", "Price", "Amount", "Last Add"};
            jTable3.setModel(BuildDefultModel.buildTableModel(res, Arrays.asList(strs)));
        } catch (SQLException ex) {
            Logger.getLogger(StoreItems.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        jScrollPane2.setViewportView(jTable3);
    }

    private boolean checkItemIsFound(Integer itemId) {
        PreparedStatement ps;
        try {
            String query = "select iiid from item where iiid = ?";
            ps = con.prepareStatement(query);
            ps.setInt(1, itemId);
            res = ps.executeQuery();
            if (res.next()) {
                return true;
            }
        } catch (SQLException | NumberFormatException ex) {
            Logger.getLogger(StoreItemList.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    private void modifyCategory(Integer itemId, String category) {
        PreparedStatement ps;
        int categoryId = 0;
        String query = "select cid from category where cname = ?;";
        try {
            ps = con.prepareStatement(query);
            ps.setString(1, category);
            res = ps.executeQuery();
            if (res.next()) {
                categoryId = res.getInt("cid");
                try {
                    query = "update item set cid = ? where iiid";
                    ps = con.prepareStatement(query);
                    ps.setInt(1, categoryId);
                    ps.setInt(2, itemId);
                    ps.executeUpdate();
                } catch (SQLException | NumberFormatException ex) {
                    Logger.getLogger(StoreItemList.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                query = "insert into ctegory(cname) VALUES (?);";
                try {
                    ps = con.prepareStatement(query);
                    ps.setString(1, category);
                    ps.execute();
                    query = "select cid from category where cname = ?;";
                    try {
                        ps = con.prepareStatement(query);
                        ps.setString(1, category);
                        res = ps.executeQuery();
                        if (res.next()) {
                            categoryId = res.getInt("cid");
                        }
                        try {
                            query = "update item set cid = ? where iiid = ?";
                            ps = con.prepareStatement(query);
                            ps.setInt(1, categoryId);
                            ps.setInt(2, itemId);
                            ps.executeUpdate();
                        } catch (SQLException | NumberFormatException ex) {
                            Logger.getLogger(StoreItemList.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(AddStore.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(AddStore.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(AddStore.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void modifyName(Integer itemId, String name) {
        PreparedStatement ps;
        try {
            String query = "update item set iname = ? where iiid = ?";
            ps = con.prepareStatement(query);
            ps.setString(1, name);
            ps.setInt(2, itemId);
            ps.executeUpdate();
        } catch (SQLException | NumberFormatException ex) {
            Logger.getLogger(StoreItemList.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void modifyAmount(Integer itemId, Integer amount) {
        PreparedStatement ps;
        try {
            String query = "update shopitems set amount = ? where iiid = ?";
            ps = con.prepareStatement(query);
            ps.setInt(1, amount);
            ps.setInt(2, itemId);
            ps.executeUpdate();
        } catch (SQLException | NumberFormatException ex) {
            Logger.getLogger(StoreItemList.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void modifyPrice(Integer itemId, Double price) {
        PreparedStatement ps;
        try {
            String query = "update shopitems set iprice = ? where iid = ?";
            ps = con.prepareStatement(query);
            ps.setDouble(1, price);
            ps.setInt(2, itemId);
            ps.executeUpdate();

            query = "update item set price = ? where iiid = ?";
            ps = con.prepareStatement(query);
            ps.setDouble(1, price);
            ps.setInt(2, itemId);
            ps.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(StoreItemList.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void deleteItem(int itemId) {
        PreparedStatement ps;
        try {
            String query = "delete from shopitems where iid = ? and sid = ?";
            ps = con.prepareStatement(query);
            ps.setInt(1, itemId);
            ps.setInt(2, storeId);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(StoreItemList.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
