package mallmanagementsystem;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import java.sql.*;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class RentRequests extends javax.swing.JFrame {

    private final Connection con;
    private ResultSet res;

    RentRequests() {
        con = MyConnection.con();
        initComponents();
        this.setLocationRelativeTo(null);
        getRequests();
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
        jRequestId = new javax.swing.JTextField();
        jAccept = new javax.swing.JButton();
        jBack = new javax.swing.JButton();
        jRefuse = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jRefresh = new javax.swing.JButton();

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
        jLabel2.setText("Rent Requests");
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

        jLabel4.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(236, 240, 241));
        jLabel4.setText("Request ID:");

        jRequestId.setBackground(new java.awt.Color(108, 122, 137));
        jRequestId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRequestId.setForeground(new java.awt.Color(228, 241, 254));
        jRequestId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRequestIdActionPerformed(evt);
            }
        });
        jRequestId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jRequestIdKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jRequestIdKeyReleased(evt);
            }
        });

        jAccept.setBackground(new java.awt.Color(34, 167, 240));
        jAccept.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jAccept.setForeground(new java.awt.Color(255, 255, 255));
        jAccept.setText("Accept Request");
        jAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAcceptActionPerformed(evt);
            }
        });

        jBack.setBackground(new java.awt.Color(242, 38, 19));
        jBack.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jBack.setForeground(new java.awt.Color(255, 255, 255));
        jBack.setText("Back");
        jBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBackActionPerformed(evt);
            }
        });

        jRefuse.setBackground(new java.awt.Color(34, 167, 240));
        jRefuse.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jRefuse.setForeground(new java.awt.Color(255, 255, 255));
        jRefuse.setText("Refuse Request");
        jRefuse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRefuseActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable1);

        jRefresh.setBackground(new java.awt.Color(34, 167, 240));
        jRefresh.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jRefresh.setForeground(new java.awt.Color(255, 255, 255));
        jRefresh.setText("Refresh");
        jRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 791, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jRequestId, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jRefuse, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBack, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jAccept, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRefresh, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jRequestId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jAccept)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRefuse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRefresh)
                .addGap(10, 10, 10)
                .addComponent(jBack)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelMin)
                .addGap(18, 18, 18)
                .addComponent(jLabelClose)
                .addGap(21, 21, 21))
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRefuseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRefuseActionPerformed

        PreparedStatement ps;
        String rid = jRequestId.getText();

        if (rid.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter Request ID");
        } else if (checkRequestID(rid) == false) {
            JOptionPane.showMessageDialog(null, "this Request is not Found");
        } else {
            try {
                String query = "delete from shoprequest where rid = ?";
                ps = con.prepareStatement(query);
                ps.setInt(1, Integer.parseInt(rid));
                ps.executeUpdate();
            } catch (SQLException | NumberFormatException ex) {
                Logger.getLogger(RentRequests.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jRefuseActionPerformed

    private void jBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBackActionPerformed

        this.dispose();
        new AdminProfile().setVisible(true);
    }//GEN-LAST:event_jBackActionPerformed

    private void jAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAcceptActionPerformed

        PreparedStatement ps;
        String rid = jRequestId.getText();

        if (rid.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter Request ID");
        } else if (checkRequestID(rid) == false) {
            JOptionPane.showMessageDialog(null, "this Request is not Found");
        } else {
            double budget = 0;
            try {
                String query = "select offerbudget from shoprequest where rid = " + rid;
                ps = con.prepareStatement(query);
                if (ps.executeQuery().next()) {
                    budget = ps.getResultSet().getDouble("budget");
                }
            } catch (SQLException ex) {
                Logger.getLogger(RentRequests.class.getName()).log(Level.SEVERE, null, ex);
            }

            //update Shop To Make the owner id refer to the new owner
            try {
                int sid = 0, oid = 0;
                try {
                    String query = "select sid from shoprequest where rid = " + rid;
                    ps = con.prepareStatement(query);
                    if (ps.executeQuery().next()) {
                        sid = ps.getResultSet().getInt("sid");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(RentRequests.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    String query = "select oid from shoprequest where rid = " + rid;
                    ps = con.prepareStatement(query);
                    if (ps.executeQuery().next()) {
                        oid = ps.getResultSet().getInt("sid");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(RentRequests.class.getName()).log(Level.SEVERE, null, ex);
                }
                String query = "update shop set oid = ? , budget = ? where sid = ?";
                ps = con.prepareStatement(query);
                ps.setInt(1, oid);
                ps.setDouble(2, budget);
                ps.setInt(3, (sid));
                if (ps.executeQuery().next()) {
                    if (ps.getResultSet().getBoolean("isowner")) {
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(RentRequests.class.getName()).log(Level.SEVERE, null, ex);
            }
            //remove Request from shop request table
            try {
                String query = "delete from shoprequest where rid = ?";
                ps = con.prepareStatement(query);
                ps.setInt(1, Integer.parseInt(rid));
                ps.executeUpdate();
            } catch (SQLException | NumberFormatException ex) {
                Logger.getLogger(RentRequests.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jAcceptActionPerformed

    private void jRequestIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRequestIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRequestIdActionPerformed

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked

        System.exit(0);
    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jLabelMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseClicked

        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMinMouseClicked

    private void jRequestIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jRequestIdKeyPressed

        char in = evt.getKeyChar();
        if (Character.isDigit(in)) {
            jRequestId.setEditable(true);
        } else {
            jRequestId.setEditable(false);
        }
    }//GEN-LAST:event_jRequestIdKeyPressed

    private void jRequestIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jRequestIdKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jRequestIdKeyReleased

    private void jRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRefreshActionPerformed

        getRequests();
    }//GEN-LAST:event_jRefreshActionPerformed

    private void jPanel1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseReleased
    }//GEN-LAST:event_jPanel1MouseReleased

    private void jLabel2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseReleased
        this.setLocation(evt.getXOnScreen(), evt.getYOnScreen());
    }//GEN-LAST:event_jLabel2MouseReleased
    private boolean checkRequestID(String rid) {

        PreparedStatement ps;
        String query = "select rid from shoprequest where rid=?";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, Integer.parseInt(rid));
            if (ps.executeQuery().next()) {
                return true;
            }
            return false;
        } catch (SQLException | NumberFormatException ex) {
            Logger.getLogger(RentRequests.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jAccept;
    private javax.swing.JButton jBack;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jRefresh;
    private javax.swing.JButton jRefuse;
    private javax.swing.JTextField jRequestId;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void getRequests() {

        PreparedStatement ps;
        String query = "SELECT O.rid, O.sid , O.date , I.sarea , P.uname , P.oname , O.offerbudget FROM shoprequest O JOIN shop I ON O.sid = I.sid JOIN owner P ON P.oid = O.oid order by O.date;";
        try {
            ps = con.prepareStatement(query);
            res = ps.executeQuery();
            String[] strs = {"Request ID", "Shop ID", "Request Date", "Shop Area", "Company Username", "Company Name", "Offer Budget"};
            jTable1.setModel(BuildDefultModel.buildTableModel(res, Arrays.asList(strs)));

        } catch (SQLException ex) {
            Logger.getLogger(RentRequests.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        jScrollPane2.setViewportView(jTable1);

    }

}
