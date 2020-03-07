package mallmanagementsystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    private Connection con = null;

    public Login() {
        con = MyConnection.con();
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelClose = new javax.swing.JLabel();
        jlogintext = new javax.swing.JLabel();
        jLabelMin = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        juname = new javax.swing.JTextField();
        jpass = new javax.swing.JPasswordField();
        jlogin = new javax.swing.JButton();
        jcancel = new javax.swing.JButton();
        jsignup = new javax.swing.JButton();

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

        jlogintext.setFont(new java.awt.Font("MV Boli", 1, 24)); // NOI18N
        jlogintext.setForeground(new java.awt.Color(255, 255, 255));
        jlogintext.setText("Login");

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
        jLabel4.setText("Username:");

        jLabel5.setFont(new java.awt.Font("Serif", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(236, 240, 241));
        jLabel5.setText("Password:");

        juname.setBackground(new java.awt.Color(108, 122, 137));
        juname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        juname.setForeground(new java.awt.Color(228, 241, 254));

        jpass.setBackground(new java.awt.Color(108, 122, 137));
        jpass.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jpass.setForeground(new java.awt.Color(228, 241, 254));

        jlogin.setBackground(new java.awt.Color(34, 167, 240));
        jlogin.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jlogin.setForeground(new java.awt.Color(255, 255, 255));
        jlogin.setText("Login");
        jlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jloginActionPerformed(evt);
            }
        });

        jcancel.setBackground(new java.awt.Color(242, 38, 19));
        jcancel.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jcancel.setForeground(new java.awt.Color(255, 255, 255));
        jcancel.setText("Cancel");
        jcancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcancelActionPerformed(evt);
            }
        });

        jsignup.setBackground(new java.awt.Color(249, 202, 36));
        jsignup.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jsignup.setForeground(new java.awt.Color(255, 255, 255));
        jsignup.setText("Sign up");
        jsignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsignupActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jpass))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(juname, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jsignup, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jcancel, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(juname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlogin)
                    .addComponent(jcancel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jsignup)
                .addGap(56, 56, 56))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jlogintext, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelMin)
                .addGap(18, 18, 18)
                .addComponent(jLabelClose)
                .addGap(21, 21, 21))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelClose)
                    .addComponent(jlogintext, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
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

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked

        System.exit(0);

    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jLabelMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseClicked

        this.setState(JFrame.ICONIFIED);

    }//GEN-LAST:event_jLabelMinMouseClicked

    private void jcancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcancelActionPerformed

        this.dispose();
        new HomePage().setVisible(true);

    }//GEN-LAST:event_jcancelActionPerformed

    private void jloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jloginActionPerformed

        PreparedStatement ps;
        String uname = juname.getText();
        String pass = String.valueOf(jpass.getPassword());

        if (uname.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter username");
        } else if (pass.equals("")) {
            JOptionPane.showMessageDialog(null, "please enter password");
        } else if (checkUsername(uname) == false) {
            JOptionPane.showMessageDialog(null, "this user name is not registered enter another or sign up");
        } else if (checkPassword(uname, pass) == false) {
            JOptionPane.showMessageDialog(null, "Incorrect password");
        } else {
            try {
                String query = "select isadmin from user where uname=?";
                ps = con.prepareStatement(query);
                ps.setString(1, uname);
                if (ps.executeQuery().next()) {
                    if (ps.getResultSet().getBoolean("isadmin")) {
                        this.dispose();
                        new AdminProfile().setVisible(true);
                        this.dispose();
                        return;
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                String query = "select isowner from user where uname=?";
                ps = con.prepareStatement(query);
                ps.setString(1, uname);
                if (ps.executeQuery().next()) {
                    if (ps.getResultSet().getBoolean("isowner")) {
                        this.dispose();
                        new BussinessProfile(uname).setVisible(true);
                    } else {
                        new CustomerProfile(uname).setVisible(true);
                        this.dispose();
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(SignupForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }


    }//GEN-LAST:event_jloginActionPerformed

    private void jsignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsignupActionPerformed
        this.dispose();
        new ChooseSignup().setVisible(true);
    }//GEN-LAST:event_jsignupActionPerformed

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
            Logger.getLogger(SignupForm.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jcancel;
    private javax.swing.JButton jlogin;
    private javax.swing.JLabel jlogintext;
    private javax.swing.JPasswordField jpass;
    private javax.swing.JButton jsignup;
    private javax.swing.JTextField juname;
    // End of variables declaration//GEN-END:variables

    private boolean checkPassword(String uname, String pass) {

        PreparedStatement ps;
        String query = "select upassword from user where uname=?";
        try {
            ps = con.prepareStatement(query);
            ps.setString(1, uname);
            if (ps.executeQuery().next()) {
                if (ps.getResultSet().getString("upassword").equals(pass)) {
                    return true;
                }
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(SignupForm.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;

    }
}
