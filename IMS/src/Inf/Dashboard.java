package Inf;

import Codes.DBconnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class Dashboard extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public Dashboard() {
        initComponents();
        conn = DBconnect.connect();
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        try {

            String Access_lvl = Login.txt_Username.getText();
            String sql = "SELECT * FROM users WHERE user='" + Access_lvl + "'";
            pst = conn.prepareStatement(sql);

            rs = pst.executeQuery(sql);
            //  while (rs.next()) {
            rs.next();
            {

                if (rs.getString("level").equals("admin")) {

                    btn_pwd_reset1.setEnabled(true);
                    btn_create_usr.setEnabled(true);

                } else {

                    btn_pwd_reset1.setEnabled(false);
                    btn_create_usr.setEnabled(false);

                }

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btn_vehicle = new javax.swing.JButton();
        btn_customer = new javax.swing.JButton();
        btn_claims = new javax.swing.JButton();
        btn_insplcy = new javax.swing.JButton();
        btn_marketer = new javax.swing.JButton();
        btn_payments = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btn_close = new javax.swing.JButton();
        btn_create_usr = new javax.swing.JButton();
        btn_pwd_reset1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setMaximumSize(new java.awt.Dimension(100, 100));
        jPanel1.setMinimumSize(new java.awt.Dimension(0, 0));

        jPanel2.setBackground(new java.awt.Color(58, 173, 231));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 255)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_vehicle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Inf/Images/Vehicle.png"))); // NOI18N
        btn_vehicle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_vehicleActionPerformed(evt);
            }
        });
        jPanel2.add(btn_vehicle, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 190, 130));

        btn_customer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Inf/Images/Customer.png"))); // NOI18N
        btn_customer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_customerActionPerformed(evt);
            }
        });
        jPanel2.add(btn_customer, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 190, 130));

        btn_claims.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Inf/Images/Claim.png"))); // NOI18N
        btn_claims.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_claimsActionPerformed(evt);
            }
        });
        jPanel2.add(btn_claims, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 190, 130));

        btn_insplcy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Inf/Images/Ins_policy.png"))); // NOI18N
        btn_insplcy.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_insplcy.setDefaultCapable(false);
        btn_insplcy.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_insplcy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_insplcyActionPerformed(evt);
            }
        });
        jPanel2.add(btn_insplcy, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 190, 130));

        btn_marketer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Inf/Images/Agent.png"))); // NOI18N
        btn_marketer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_marketerActionPerformed(evt);
            }
        });
        jPanel2.add(btn_marketer, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 440, 190, 130));

        btn_payments.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Inf/Images/Payments.png"))); // NOI18N
        btn_payments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_paymentsActionPerformed(evt);
            }
        });
        jPanel2.add(btn_payments, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, 190, 130));

        jLabel1.setBackground(new java.awt.Color(178, 191, 131));
        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel1.setLabelFor(btn_vehicle);
        jLabel1.setText("Claims");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, 60, 30));

        jLabel2.setBackground(new java.awt.Color(178, 191, 131));
        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel2.setLabelFor(btn_vehicle);
        jLabel2.setText("Marketing officer details");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 410, 170, 30));

        jLabel3.setBackground(new java.awt.Color(178, 191, 131));
        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel3.setLabelFor(btn_vehicle);
        jLabel3.setText("Insurance policy");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 120, 30));

        jLabel4.setBackground(new java.awt.Color(178, 191, 131));
        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel4.setLabelFor(btn_vehicle);
        jLabel4.setText("Vehicle details");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 110, 30));

        jLabel5.setBackground(new java.awt.Color(178, 191, 131));
        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel5.setLabelFor(btn_vehicle);
        jLabel5.setText("Customer details");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 120, 30));

        jLabel6.setBackground(new java.awt.Color(178, 191, 131));
        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel6.setLabelFor(btn_vehicle);
        jLabel6.setText("Payment details");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, 120, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Dashboard");

        btn_close.setBackground(new java.awt.Color(255, 102, 102));
        btn_close.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_close.setText("Back");
        btn_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_closeActionPerformed(evt);
            }
        });

        btn_create_usr.setBackground(new java.awt.Color(204, 204, 255));
        btn_create_usr.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_create_usr.setText("Create User");
        btn_create_usr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_create_usrActionPerformed(evt);
            }
        });

        btn_pwd_reset1.setBackground(new java.awt.Color(204, 204, 255));
        btn_pwd_reset1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_pwd_reset1.setText("Password Reset");
        btn_pwd_reset1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pwd_reset1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(212, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_close)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_create_usr)
                        .addGap(20, 20, 20))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(826, Short.MAX_VALUE)
                    .addComponent(btn_pwd_reset1)
                    .addGap(20, 20, 20)))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn_create_usr, btn_pwd_reset1});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(btn_create_usr, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_close, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(btn_pwd_reset1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(693, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1005, 788));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_insplcyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_insplcyActionPerformed

        INSPLCY_LOGIN ins_plcy = new INSPLCY_LOGIN();
        ins_plcy.setVisible(true);
    }//GEN-LAST:event_btn_insplcyActionPerformed

    private void btn_claimsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_claimsActionPerformed

        CLM_LOGIN clm_data = new CLM_LOGIN();
        clm_data.setVisible(true);
    }//GEN-LAST:event_btn_claimsActionPerformed

    private void btn_vehicleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_vehicleActionPerformed

        VEHICLEDTA_LOGIN vehi_data = new VEHICLEDTA_LOGIN();
        vehi_data.setVisible(true);
    }//GEN-LAST:event_btn_vehicleActionPerformed

    private void btn_customerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_customerActionPerformed

        CUSTDTA_LOGIN cust_data = new CUSTDTA_LOGIN();
        cust_data.setVisible(true);

    }//GEN-LAST:event_btn_customerActionPerformed

    private void btn_paymentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_paymentsActionPerformed

        PYMNTDTA_LOGIN pymnt_data = new PYMNTDTA_LOGIN();
        pymnt_data.setVisible(true);

    }//GEN-LAST:event_btn_paymentsActionPerformed

    private void btn_marketerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_marketerActionPerformed

        MARKTDTA_LOGIN mark_data = new MARKTDTA_LOGIN();
        mark_data.setVisible(true);
    }//GEN-LAST:event_btn_marketerActionPerformed

    private void btn_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_closeActionPerformed
        dispose();
    }//GEN-LAST:event_btn_closeActionPerformed

    private void btn_create_usrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_create_usrActionPerformed

        FRM_USER_CREATE create_user = new FRM_USER_CREATE();
        create_user.setVisible(true);

    }//GEN-LAST:event_btn_create_usrActionPerformed

    private void btn_pwd_reset1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pwd_reset1ActionPerformed

        FRM_PSWRD_RST pwd_rst = new FRM_PSWRD_RST();
        pwd_rst.setVisible(true);

    }//GEN-LAST:event_btn_pwd_reset1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_claims;
    private javax.swing.JButton btn_close;
    private javax.swing.JButton btn_create_usr;
    private javax.swing.JButton btn_customer;
    private javax.swing.JButton btn_insplcy;
    private javax.swing.JButton btn_marketer;
    private javax.swing.JButton btn_payments;
    private javax.swing.JButton btn_pwd_reset1;
    private javax.swing.JButton btn_vehicle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
