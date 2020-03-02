package mallmanagementsystem;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import java.sql.*;
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class GuestBookMessagesForm extends javax.swing.JFrame {

    private final Connection con;
    private ResultSet res;
    private final JTable GuestBookMessages;

    GuestBookMessagesForm() {
        GuestBookMessages = new JTable();
        con = MyConnection.con();
        initComponents();
        getGuestBookMessages();
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
        jMessageId = new javax.swing.JTextField();
        jread = new javax.swing.JButton();
        jback = new javax.swing.JButton();
        jmessage = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jread1 = new javax.swing.JButton();

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

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("GuestBook");

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
        jLabel4.setText("Message ID:");

        jMessageId.setBackground(new java.awt.Color(108, 122, 137));
        jMessageId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jMessageId.setForeground(new java.awt.Color(228, 241, 254));
        jMessageId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMessageIdActionPerformed(evt);
            }
        });
        jMessageId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMessageIdKeyPressed(evt);
            }
        });

        jread.setBackground(new java.awt.Color(34, 167, 240));
        jread.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jread.setForeground(new java.awt.Color(255, 255, 255));
        jread.setText("Mark As Read");
        jread.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jreadActionPerformed(evt);
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

        jmessage.setBackground(new java.awt.Color(34, 167, 240));
        jmessage.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jmessage.setForeground(new java.awt.Color(255, 255, 255));
        jmessage.setText("Send Message to the User");
        jmessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmessageActionPerformed(evt);
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

        jread1.setBackground(new java.awt.Color(34, 167, 240));
        jread1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jread1.setForeground(new java.awt.Color(255, 255, 255));
        jread1.setText("Mark all As Read");
        jread1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jread1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 807, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jback, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jmessage, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jread, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jMessageId, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jread1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jMessageId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(13, 13, 13)
                .addComponent(jread)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jread1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jmessage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jback)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel2)
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked

        System.exit(0);

    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jLabelMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseClicked

        this.setState(JFrame.ICONIFIED);

    }//GEN-LAST:event_jLabelMinMouseClicked

    private void jmessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmessageActionPerformed

        PreparedStatement ps;
        String rid = jMessageId.getText();

        if (rid.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter Request ID");
        } else if (checkMessageID(rid) == false) {
            JOptionPane.showMessageDialog(null, "this Request is not Found");
        } else {
            try {
                String query = "delete from shoprequest where rid = ?";
                ps = con.prepareStatement(query);
                ps.setInt(1, Integer.parseInt(rid));
                ps.executeUpdate();
            } catch (SQLException | NumberFormatException ex) {
                Logger.getAnonymousLogger(GuestBookMessagesForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_jmessageActionPerformed

    private void jbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbackActionPerformed

        this.dispose();
        new AdminProfileForm().setVisible(true);
    }//GEN-LAST:event_jbackActionPerformed

    private void jreadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jreadActionPerformed

        PreparedStatement ps;
        String mid = jMessageId.getText();
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

    }//GEN-LAST:event_jreadActionPerformed

    private void jMessageIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMessageIdActionPerformed
        PreparedStatement ps;
        String mid = jMessageId.getText();
        if (mid.equals("")) {
            JOptionPane.showMessageDialog(null, "Please Enter Message ID");
        } else if (checkMessageID(mid) == false) {
            JOptionPane.showMessageDialog(null, "This Message Is Not Found");
        } else {
            try {
                String query = "update guestbook set isread = ?";
                ps = con.prepareStatement(query);
                ps.setBoolean(1, true);
                ps.executeUpdate();
            } catch (NumberFormatException | SQLException ex) {
                Logger.getLogger(SignupForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_jMessageIdActionPerformed

    private void jread1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jread1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jread1ActionPerformed

    private void jMessageIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMessageIdKeyPressed

        char in = evt.getKeyChar();
        if (Character.isDigit(in)) {
            jMessageId.setEditable(true);
        } else {
            jMessageId.setEditable(false);
        }
    }//GEN-LAST:event_jMessageIdKeyPressed
    private boolean checkMessageID(String mid) {

        PreparedStatement ps;
        String query = "select mid from guestbook where mid=?";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, Integer.parseInt(mid));
            if (ps.executeQuery().next()) {
                return true;
            }
            return false;
        } catch (SQLException ex) {
            Logger.getLogger(SignupForm.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JTextField jMessageId;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jback;
    private javax.swing.JButton jmessage;
    private javax.swing.JButton jread;
    private javax.swing.JButton jread1;
    // End of variables declaration//GEN-END:variables

    private void getGuestBookMessages() {
        PreparedStatement ps;
        String query = "SELECT O.mid , O.Message , O.date , I.cname  FROM guestbook O  JOIN customer I ON I.cid = O.cid  where O.isread = 0 order by O.date ;";
        try {
            ps = con.prepareStatement(query);
            res = ps.executeQuery();
            String[] strs = {"Message ID", "Message Content", "Message Date", "Customer Name"};
            jTable1.setModel(BuildDefultModel.buildTableModel(res, Arrays.asList(strs)));
        } catch (SQLException ex) {
            Logger.getLogger(GuestBookMessagesForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        jScrollPane2.setViewportView(jTable1);

    }

}

class request implements Comparable<request> {

    String companyName, Username, telephone;
    int shopId, area, offerBudget, oid, rid;
    Date requestDate;

    public request(String companyName, String Username, String telephone, int shopId, int size, int offerBudget, int oid, int rid, Date requestDate) {
        this.companyName = companyName;
        this.Username = Username;
        this.telephone = telephone;
        this.shopId = shopId;
        this.area = size;
        this.offerBudget = offerBudget;
        this.oid = oid;
        this.rid = rid;
        this.requestDate = requestDate;
    }

    @Override
    public int compareTo(request o) {
        return this.requestDate.compareTo(o.requestDate);
    }

}
