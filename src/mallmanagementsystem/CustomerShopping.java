package mallmanagementsystem;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import java.sql.*;
import java.util.Arrays;

public class CustomerShopping extends javax.swing.JFrame {

    private final Connection con;
    private final String userName;
    private ResultSet res;

    public CustomerShopping(String uname) {
        con = MyConnection.con();
        userName = uname;
        getStoreList();
        initComponents();
        this.setLocationRelativeTo(null);

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
        jShopId = new javax.swing.JTextField();
        jback = new javax.swing.JButton();
        jEnter = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();

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
        jLabel2.setText("Store List");

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

        jLabel4.setFont(new java.awt.Font("Serif", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(236, 240, 241));
        jLabel4.setText("Store Id:");

        jShopId.setBackground(new java.awt.Color(108, 122, 137));
        jShopId.setFont(new java.awt.Font("Serif", 1, 16)); // NOI18N
        jShopId.setForeground(new java.awt.Color(228, 241, 254));
        jShopId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jShopIdActionPerformed(evt);
            }
        });
        jShopId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jShopIdKeyPressed(evt);
            }
        });

        jback.setBackground(new java.awt.Color(242, 38, 19));
        jback.setFont(new java.awt.Font("Serif", 1, 16)); // NOI18N
        jback.setForeground(new java.awt.Color(255, 255, 255));
        jback.setText("Back");
        jback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbackActionPerformed(evt);
            }
        });

        jEnter.setBackground(new java.awt.Color(34, 167, 240));
        jEnter.setFont(new java.awt.Font("Serif", 1, 16)); // NOI18N
        jEnter.setForeground(new java.awt.Color(255, 255, 255));
        jEnter.setText("Enter this store");
        jEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEnterActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jback, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jShopId, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jShopId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(jEnter)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jback)))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelMin)
                .addGap(18, 18, 18)
                .addComponent(jLabelClose)
                .addGap(21, 21, 21))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMin, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbackActionPerformed
        new CustomerProfile(userName).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbackActionPerformed

    private void jShopIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jShopIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jShopIdActionPerformed

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked

        System.exit(0);
    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jLabelMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseClicked

        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMinMouseClicked

    private void jEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEnterActionPerformed

        getShopList();
    }//GEN-LAST:event_jEnterActionPerformed

    private void jShopIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jShopIdKeyPressed

        char in = evt.getKeyChar();
        if (Character.isDigit(in)) {
            jShopId.setEditable(true);
        } else {
            jShopId.setEditable(false);
        }

    }//GEN-LAST:event_jShopIdKeyPressed

    private void jPanel1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseReleased
        this.setLocation(evt.getXOnScreen(), evt.getYOnScreen());
    }//GEN-LAST:event_jPanel1MouseReleased
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
            Logger.getLogger(CustomerShopping.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jEnter;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jShopId;
    private javax.swing.JTable jTable3;
    private javax.swing.JButton jback;
    // End of variables declaration//GEN-END:variables

    private void getStoreList() {

        PreparedStatement ps;
        String query = "SELECT O.sid, O.sname , P.oname FROM shop O JOIN owner P ON P.oid = O.sid where O.oid npt null order by O.sid;";
        try {
            ps = con.prepareStatement(query);
            res = ps.executeQuery();
            String[] strs = {"Shop ID", "Shop Name", "Company Name"};
            jTable3.setModel(BuildDefultModel.buildTableModel(res, Arrays.asList(strs)));
        } catch (SQLException ex) {
            Logger.getLogger(CustomerShopping.class.getName()).log(Level.SEVERE, null, ex);
        }
        jScrollPane2.setViewportView(jTable3);
    }
}
