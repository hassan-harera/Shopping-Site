package mallmanagementsystem;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import java.sql.*;
import java.time.LocalDate;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class AvailableStoreList extends javax.swing.JFrame {

    private final Connection con;
    private ResultSet res;
    private final String Username;
    private final int companyId;

    public AvailableStoreList(String uname) {
        con = MyConnection.con();
        Username = uname;
        companyId = setId();
        initComponents();
        this.setLocationRelativeTo(null);
        getAvailableStoreList();

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
        jStoreId = new javax.swing.JTextField();
        jRequestRent = new javax.swing.JButton();
        jBack = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jPudget = new javax.swing.JTextField();

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
        jLabel2.setText("Available Store List");
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
        jLabel4.setText("Store ID:");

        jStoreId.setBackground(new java.awt.Color(108, 122, 137));
        jStoreId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jStoreId.setForeground(new java.awt.Color(228, 241, 254));
        jStoreId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jStoreIdActionPerformed(evt);
            }
        });
        jStoreId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jStoreIdKeyPressed(evt);
            }
        });

        jRequestRent.setBackground(new java.awt.Color(34, 167, 240));
        jRequestRent.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRequestRent.setForeground(new java.awt.Color(255, 255, 255));
        jRequestRent.setText("Request rent");
        jRequestRent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRequestRentActionPerformed(evt);
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

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(236, 240, 241));
        jLabel12.setText("Offer Pudget:");

        jPudget.setBackground(new java.awt.Color(108, 122, 137));
        jPudget.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPudget.setForeground(new java.awt.Color(228, 241, 254));
        jPudget.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPudgetKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jRequestRent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(31, 31, 31)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPudget)
                            .addComponent(jStoreId, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jStoreId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPudget, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(21, 21, 21)
                .addComponent(jRequestRent)
                .addGap(18, 18, 18)
                .addComponent(jBack)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked

        System.exit(0);
    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jLabelMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseClicked

        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMinMouseClicked

    private void jPanel1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseReleased
    }//GEN-LAST:event_jPanel1MouseReleased

    private void jLabel2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseReleased
        this.setLocation(evt.getXOnScreen(), evt.getYOnScreen());
    }//GEN-LAST:event_jLabel2MouseReleased

    private void jBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBackActionPerformed

        new BussinessProfile(Username).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBackActionPerformed

    private void jRequestRentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRequestRentActionPerformed
        String storeId = jStoreId.getText();
        String pudgetVlaue = jPudget.getText();
        if (storeId.equals("")) {
            JOptionPane.showMessageDialog(null, "Add A Store ID");
        } else if (pudgetVlaue.equals("")) {
            JOptionPane.showMessageDialog(null, "Put your pudget");
        } else if (!checkStoreId(storeId)) {
            JOptionPane.showMessageDialog(null, "This store Is Not Found");
        } else {
            PreparedStatement ps;
            String query = "INSERT INTO rent_request (sid,oid,budget,date) SELECT * FROM (SELECT ?,?,?,?) AS tmp WHERE NOT EXISTS ( SELECT budget FROM rent_request WHERE sid = ? and oid = ? ) LIMIT 1;";
            try {
                ps = con.prepareStatement(query);
                ps.setInt(1, Integer.parseInt(storeId));
                ps.setInt(2, companyId);
                ps.setDouble(3, Double.parseDouble(pudgetVlaue));
                ps.setDate(4, Date.valueOf(LocalDate.now()));
                ps.setInt(5, Integer.parseInt(storeId));
                ps.setInt(6, companyId);
                ps.execute();
            } catch (SQLException ex) {
                Logger.getLogger(AvailableStoreList.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jRequestRentActionPerformed

    private void jStoreIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jStoreIdKeyPressed
        char in = evt.getKeyChar();
        if (Character.isDigit(in)) {
            jStoreId.setEditable(true);
        } else {
            jStoreId.setEditable(false);
        }
    }//GEN-LAST:event_jStoreIdKeyPressed

    private void jStoreIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jStoreIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jStoreIdActionPerformed

    private void jPudgetKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPudgetKeyPressed
        char in = evt.getKeyChar();
        if (Character.isDigit(in) || in == '.') {
            jPudget.setEditable(true);
        } else {
            jPudget.setEditable(false);
        }
    }//GEN-LAST:event_jPudgetKeyPressed
    private boolean checkStoreId(String sid) {

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
            Logger.getLogger(AvailableStoreList.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBack;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jPudget;
    private javax.swing.JButton jRequestRent;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jStoreId;
    private javax.swing.JTable jTable3;
    // End of variables declaration//GEN-END:variables

    private void getAvailableStoreList() {

        PreparedStatement ps;
        String query = "SELECT sid, sname , sarea FROM shop where oid is null order by sid;";
        try {
            ps = con.prepareStatement(query);
            res = ps.executeQuery();
            String[] strs = {"Shop ID", "Shop Name", "Shop Area"};
            jTable3.setModel(BuildDefultModel.buildTableModel(res, Arrays.asList(strs)));
        } catch (SQLException ex) {
            Logger.getLogger(AvailableStoreList.class.getName()).log(Level.SEVERE, null, ex);
        }
        jScrollPane2.setViewportView(jTable3);
    }

    private int setId() {
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
            Logger.getLogger(AvailableStoreList.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

}
