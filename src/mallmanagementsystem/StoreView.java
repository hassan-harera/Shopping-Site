package mallmanagementsystem;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import java.sql.*;
import java.time.LocalDate;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class StoreView extends javax.swing.JFrame {

    private final Connection con;
    private ResultSet res;
    private final String Username;
    private final int storeId;
    private final int customerId;

    public StoreView(int sid, String uname) {
        con = MyConnection.con();
        Username = uname;
        storeId = sid;
        setStoreName();
        customerId = getCustomerId();
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
        jItemId = new javax.swing.JTextField();
        jAmount = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jStoreCart = new javax.swing.JButton();
        jStoreName = new javax.swing.JLabel();

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
        jLabel2.setText("Store ");
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
        jAdd.setText("Add to the cart");
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

        jStoreCart.setBackground(new java.awt.Color(34, 167, 240));
        jStoreCart.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jStoreCart.setForeground(new java.awt.Color(255, 255, 255));
        jStoreCart.setText("View my store cart");
        jStoreCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jStoreCartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRefresh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jStoreCart, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jAmount)
                            .addComponent(jItemId, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jItemId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addComponent(jAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jStoreCart)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRefresh)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBack))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jStoreName.setFont(new java.awt.Font("MV Boli", 1, 24)); // NOI18N
        jStoreName.setForeground(new java.awt.Color(255, 255, 255));
        jStoreName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jStoreNameMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jStoreName, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jStoreName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        new CustomerStoreList(Username).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBackActionPerformed

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jLabelMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMinMouseClicked

    private void jAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAddActionPerformed
        String itemId = jItemId.getText();
        String amount = jAmount.getText();
        if (itemId.equals("")) {
            JOptionPane.showMessageDialog(null, "Add the item id");
        } else if (amount.equals("")) {
            JOptionPane.showMessageDialog(null, "Add the amount you want");
        } else if (!checkItemId(Integer.parseInt(itemId))) {
            JOptionPane.showMessageDialog(null, "This item is not existed in item list");
        } else {
            if (checkOrder(Integer.parseInt(itemId))) {
                JOptionPane.showMessageDialog(null, "This item is already existed in your cart");
                return;
            }
            double price = getItemPrice(Integer.parseInt(itemId));
            PreparedStatement ps;
            String query = "INSERT INTO customeritems (cid,sid,date,iid,amount,totalprice,ischeckedout) SELECT * FROM (SELECT ?,?,?,?,?,?,0) AS tmp WHERE NOT EXISTS ( SELECT iid,sid,cid FROM customeritems WHERE iid,sid,cid  = ? ) LIMIT 1;";
            try {
                ps = con.prepareStatement(query);
                ps.setInt(1, customerId);
                ps.setInt(2, storeId);
                ps.setDate(3, Date.valueOf(LocalDate.now()));
                ps.setInt(4, Integer.parseInt(itemId));
                ps.setInt(5, Integer.parseInt(amount));
                ps.setDouble(6, price * Integer.parseInt(amount));
                ps.execute();

                JOptionPane.showMessageDialog(null, "New item was added to your cart");
            } catch (SQLException ex) {
                Logger.getLogger(AddStore.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jAddActionPerformed

    private void jPanel1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseReleased
    }//GEN-LAST:event_jPanel1MouseReleased

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

    private void jStoreCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jStoreCartActionPerformed
        String itemId = jItemId.getText();
        if (itemId == null) {
            JOptionPane.showMessageDialog(null, "Add the item id");
        } else if (!checkItemId(Integer.parseInt(itemId))) {
            JOptionPane.showMessageDialog(null, "This item is not existed in item list");
        } else {
            new StoreCart(storeId, Username).setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jStoreCartActionPerformed

    private void jAmountKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jAmountKeyPressed
        char in = evt.getKeyChar();
        if (Character.isDigit(in)) {
            jAmount.setEditable(true);
        } else {
            jAmount.setEditable(false);
        }
    }//GEN-LAST:event_jAmountKeyPressed

    private void jStoreNameMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jStoreNameMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jStoreNameMouseReleased

 


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jAdd;
    private javax.swing.JTextField jAmount;
    private javax.swing.JButton jBack;
    private javax.swing.JTextField jItemId;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jRefresh;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jStoreCart;
    private javax.swing.JLabel jStoreName;
    private javax.swing.JTable jTable3;
    // End of variables declaration//GEN-END:variables

    private void getItems() {

        PreparedStatement ps;
        String query = "SELECT  O.iid , I.iname ,  C.cname  ,O.iprice, O.amount ,  O.date  FROM shopitems O JOIN item I ON O.iid = I.iiid JOIN category C ON C.cid = I.cid where O.sid = ?  order by O.iid;";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, storeId);
            res = ps.executeQuery();
            String[] strs = {"Item Id", "Item Name", "Category", "Price"};
            jTable3.setModel(BuildDefultModel.buildTableModel(res, Arrays.asList(strs)));
        } catch (SQLException ex) {
            Logger.getLogger(StoreView.class.getName()).log(Level.SEVERE, null, ex);
        }
        jScrollPane2.setViewportView(jTable3);
    }
    
    private void setStoreName() {
        PreparedStatement ps;
        try {
            String query = "select sname from shop where sid = ?;";
            ps = con.prepareStatement(query);
            ps.setInt(1, storeId);
            res = ps.executeQuery();
            if (res.next()) {
                jStoreName.setText(res.getString("sname"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(StoreView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private boolean checkItemId(int itemId) {
        PreparedStatement ps;
        try {
            String query = "select iiid from item where iiid = ?;";
            ps = con.prepareStatement(query);
            ps.setInt(1, itemId);
            res = ps.executeQuery();
            if (res.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(StoreView.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    private double getItemPrice(int itemId) {
        PreparedStatement ps;
        try {
            String query = "select price from item where iiid = ?;";
            ps = con.prepareStatement(query);
            ps.setInt(1, itemId);
            res = ps.executeQuery();
            if (res.next()) {
                return res.getDouble("price");
            }
        } catch (SQLException ex) {
            Logger.getLogger(StoreView.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    private boolean checkOrder(int itemId) {
        PreparedStatement ps;
        try {
            String query = "select date from customeritems where cid = ? and sid = ? and iid = ?;";
            ps = con.prepareStatement(query);
            ps.setInt(1, customerId);
            ps.setInt(2, storeId);
            ps.setInt(3, itemId);
            res = ps.executeQuery();
            if (res.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(StoreView.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    private int getCustomerId() {
        PreparedStatement ps;
        try {
            String query = "select cid from customer where uname = ?;";
            ps = con.prepareStatement(query);
            ps.setString(1, Username);
            res = ps.executeQuery();
            if (res.next()) {
                return res.getInt("cid");
            }
        } catch (SQLException ex) {
            Logger.getLogger(StoreView.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
}