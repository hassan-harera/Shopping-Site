package mallmanagementsystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class CustomerFeedback extends javax.swing.JFrame {

    private Connection con = null;
    private final int CustomerId;
    private final String UserName;

    public CustomerFeedback(String uname, int cid) {
        this.CustomerId = cid;
        this.UserName = uname;
        con = MyConnection.con();
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabelClose = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelMin = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jCancel = new javax.swing.JButton();
        jMessage = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSend = new javax.swing.JButton();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

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
        jLabel2.setText("Send Feedback");

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

        jCancel.setBackground(new java.awt.Color(242, 38, 19));
        jCancel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCancel.setForeground(new java.awt.Color(255, 255, 255));
        jCancel.setText("Cancel");
        jCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCancelActionPerformed(evt);
            }
        });

        jMessage.setBackground(new java.awt.Color(108, 122, 137));
        jMessage.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jMessage.setForeground(new java.awt.Color(228, 241, 254));

        jLabel6.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(236, 240, 241));
        jLabel6.setText("Message:");

        jLabel8.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(236, 240, 241));

        jSend.setBackground(new java.awt.Color(34, 167, 240));
        jSend.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jSend.setForeground(new java.awt.Color(255, 255, 255));
        jSend.setText("Send");
        jSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSendActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jSend, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel6)
                .addGap(36, 36, 36)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 59, Short.MAX_VALUE)
                .addComponent(jMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSend)
                    .addComponent(jCancel))
                .addGap(110, 110, 110))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void jCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCancelActionPerformed
        this.dispose();
        new HomePage().setVisible(true);
    }//GEN-LAST:event_jCancelActionPerformed

    private void jSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSendActionPerformed

        String message = jMessage.getText();
        if (message.equals("")) {
            JOptionPane.showMessageDialog(null, "Please Add A Message");
        } else {
            PreparedStatement ps;
            String query = "insert into guestbook(cid,message,date) VALUES (?,?,?);";
            try {
                ps = con.prepareStatement(query);
                ps.setInt(1, CustomerId);
                ps.setString(2, message);
                SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
                java.util.Date d = new java.util.Date(System.currentTimeMillis());
                String date = s.format(d);
                ps.setString(3, date);
                ps.execute();
                JOptionPane.showMessageDialog(null, "Your Message Was Sent");
            } catch (SQLException ex) {
                Logger.getLogger(CustomerFeedback.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.dispose();
            new CustomerProfile(UserName).setVisible(true);
        }
    }//GEN-LAST:event_jSendActionPerformed

    private void jPanel1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseReleased
        this.setLocation(evt.getXOnScreen(), evt.getYOnScreen());
    }//GEN-LAST:event_jPanel1MouseReleased


    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jCancel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JTextField jMessage;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JButton jSend;
    // End of variables declaration//GEN-END:variables

    private boolean checkUsername(String uname) {
        PreparedStatement ps;
        String query = "select uname from user where uname=?";
        try {
            ps = con.prepareStatement(query);
            ps.setString(1, uname);
            if (ps.executeQuery().next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(CustomerFeedback.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }
}
