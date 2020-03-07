package mallmanagementsystem;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import java.sql.*;
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class CompanyNotifications extends javax.swing.JFrame {

    private final Connection con;
    private ResultSet res;
    private final JTable sellHistory;
    private final JTable visitHistory;
    JTable jTable1;

    public CompanyNotifications() {
        con = MyConnection.con();
        sellHistory = new JTable();
        visitHistory = new JTable();
        initComponents();
        getShopList();

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
        jid = new javax.swing.JTextField();
        jSellHistory = new javax.swing.JButton();
        jback = new javax.swing.JButton();
        jVisitHistory = new javax.swing.JButton();
        jSellHistory1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();

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
        jLabel2.setText("New Notifications");

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
        jLabel4.setText("Notification ID:");

        jid.setBackground(new java.awt.Color(108, 122, 137));
        jid.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jid.setForeground(new java.awt.Color(228, 241, 254));
        jid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jidActionPerformed(evt);
            }
        });
        jid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jidKeyPressed(evt);
            }
        });

        jSellHistory.setBackground(new java.awt.Color(34, 167, 240));
        jSellHistory.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jSellHistory.setForeground(new java.awt.Color(255, 255, 255));
        jSellHistory.setText("Mark all as Read");
        jSellHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSellHistoryActionPerformed(evt);
            }
        });

        jback.setBackground(new java.awt.Color(242, 38, 19));
        jback.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jback.setForeground(new java.awt.Color(255, 255, 255));
        jback.setText("Back");
        jback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbackActionPerformed(evt);
            }
        });

        jVisitHistory.setBackground(new java.awt.Color(34, 167, 240));
        jVisitHistory.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jVisitHistory.setForeground(new java.awt.Color(255, 255, 255));
        jVisitHistory.setText("Report a Problem");
        jVisitHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jVisitHistoryActionPerformed(evt);
            }
        });

        jSellHistory1.setBackground(new java.awt.Color(34, 167, 240));
        jSellHistory1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jSellHistory1.setForeground(new java.awt.Color(255, 255, 255));
        jSellHistory1.setText("Mark as Read");
        jSellHistory1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSellHistory1ActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 837, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jback, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jVisitHistory, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSellHistory, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSellHistory1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jid, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSellHistory1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSellHistory)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jVisitHistory)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jback)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel2)
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jVisitHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jVisitHistoryActionPerformed

        String rid = jid.getText();
        if (rid.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter Shop ID");
        } else if (checkShopID(rid) == false) {
            JOptionPane.showMessageDialog(null, "this Shop ID is not Found");
        } else {
            viewVistHistory();
        }
    }//GEN-LAST:event_jVisitHistoryActionPerformed

    private void jbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbackActionPerformed

        this.dispose();
        new AdminProfile().setVisible(true);
    }//GEN-LAST:event_jbackActionPerformed

    private void jSellHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSellHistoryActionPerformed

        viewSellHistory();
    }//GEN-LAST:event_jSellHistoryActionPerformed

    private void jidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jidActionPerformed

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked

        System.exit(0);
    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jLabelMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseClicked

        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMinMouseClicked

    private void jSellHistory1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSellHistory1ActionPerformed
        
        PreparedStatement ps;
        String mid = jid.getText();
        if (mid.equals("")) {
            JOptionPane.showMessageDialog(null, "Please Enter Message ID");
        } else if (checkMessageID(mid) == false) {
            JOptionPane.showMessageDialog(null, "This Message Is Not Found");
        } else {
            try {
                String query = "update guestbook set isread = ? where mid = ?";
                ps = con.prepareStatement(query);
                ps.setBoolean(1, true);
                ps.setInt(2, Integer.parseInt(mid));
                ps.executeUpdate();
            } catch (NumberFormatException | SQLException ex) {
                Logger.getLogger(SignupForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jSellHistory1ActionPerformed

    private void jidKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jidKeyPressed

        if(evt.)
    }//GEN-LAST:event_jidKeyPressed
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
            Logger.getLogger(CompanyNotifications.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jSellHistory;
    private javax.swing.JButton jSellHistory1;
    private javax.swing.JTable jTable3;
    private javax.swing.JButton jVisitHistory;
    private javax.swing.JButton jback;
    private javax.swing.JTextField jid;
    // End of variables declaration//GEN-END:variables

    private void getNotifications() {

        PreparedStatement ps;
        String query = "SELECT S.sname, S.sarea, N.n_message FROM shop S JOIN new_shop N ON N.sid = S.sid where N.is_read = 0 order by N.sid;";
        try {
            ps = con.prepareStatement(query);
            res = ps.executeQuery();
            String[] strs = {"Shop Name", "Shop Area", "Message content"};
            jTable3.setModel(BuildDefultModel.buildTableModel(res, Arrays.asList(strs)));
        } catch (SQLException ex) {
            Logger.getLogger(CompanyNotifications.class.getName()).log(Level.SEVERE, null, ex);
        }
        jScrollPane2.setViewportView(jTable3);
    }

    private void viewSellHistory() {

        if (sellHistory.getDefaultLocale() != null) {
            JOptionPane.showMessageDialog(null, new JScrollPane(sellHistory));
            return;
        }
        PreparedStatement ps;
        String query = "SELECT  I.cname , P.sname ,  F.iname  , O.amount , O.totalprice , O.sdate  FROM sellhistory O JOIN shop P ON O.sid = P.sid JOIN customer I ON I.cid = O.cid JOIN item F ON F.iid = O.iid  order by O.sdate;";
        try {
            ps = con.prepareStatement(query);
            res = ps.executeQuery();
            String[] strs = {"Customer Name", "Shop Name", "Item Name", "Amount", "Total Price", "Sell Date"};
            sellHistory.setModel(BuildDefultModel.buildTableModel(res, Arrays.asList(strs)));

        } catch (SQLException ex) {
            Logger.getLogger(CompanyNotifications.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, new JScrollPane(sellHistory));

    }

    private void viewVistHistory() {
        if (visitHistory.getDefaultLocale() != null) {
            JOptionPane.showMessageDialog(null, new JScrollPane(visitHistory));
            return;
        }
        PreparedStatement ps;
        String query = "SELECT  I.cname , P.sname , K.vdate  FROM customervisit K JOIN shop P ON K.sid = P.sid JOIN customer I ON I.cid = K.cid order by K.vdate;";
        try {
            ps = con.prepareStatement(query);
            res = ps.executeQuery();
            String[] strs = {"Customer Name", "Shop Name", "Visit Date"};
            visitHistory.setModel(BuildDefultModel.buildTableModel(res, Arrays.asList(strs)));

        } catch (SQLException ex) {
            Logger.getLogger(CompanyNotifications.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, new JScrollPane(visitHistory));
    }
}
