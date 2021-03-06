
import java.sql.*;
import javax.swing.JOptionPane;

public class NewJFrame_1 extends javax.swing.JFrame {

    Connection con;
    Statement stmt;
    ResultSet rs;
    PreparedStatement pst;

    public NewJFrame_1() {
        initComponents();
        try {
            con = DBConnect.connectMySQL();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public NewJFrame_1(String str) {
        this();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        adminTF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        okBTN = new javax.swing.JButton();
        proceedBTN = new javax.swing.JButton();
        passwordPF = new javax.swing.JPasswordField();
        backBTN = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Bodoni MT", 0, 24)); // NOI18N
        jLabel2.setText("Admin Login");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(160, 0, 150, 32);
        jPanel1.add(adminTF);
        adminTF.setBounds(250, 60, 180, 30);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Username");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(100, 60, 100, 22);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Password");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(100, 110, 80, 22);

        okBTN.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        okBTN.setText("OK");
        okBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okBTNActionPerformed(evt);
            }
        });
        jPanel1.add(okBTN);
        okBTN.setBounds(210, 170, 73, 30);

        proceedBTN.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        proceedBTN.setText("PROCEED");
        proceedBTN.setEnabled(false);
        proceedBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proceedBTNActionPerformed(evt);
            }
        });
        jPanel1.add(proceedBTN);
        proceedBTN.setBounds(360, 250, 120, 31);
        jPanel1.add(passwordPF);
        passwordPF.setBounds(250, 110, 180, 30);

        backBTN.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        backBTN.setText("BACK");
        backBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBTNActionPerformed(evt);
            }
        });
        jPanel1.add(backBTN);
        backBTN.setBounds(30, 250, 90, 31);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/bigstock-Red-Classic-Chair-33969761-500x375.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 500, 300);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-514)/2, (screenSize.height-336)/2, 514, 336);
    }// </editor-fold>//GEN-END:initComponents

    private void okBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okBTNActionPerformed
        String sql = "select*from admin where UserName=? and Password=?";
        String uid = adminTF.getText();
        String pwd = new String(passwordPF.getPassword());
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, uid);
            pst.setString(2, pwd);
            rs = pst.executeQuery();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Login successful");

            } else {
                JOptionPane.showMessageDialog(null, "Login failed...Better luck next time");

            }
        } catch (Exception e) {
          JOptionPane.showMessageDialog(null,e.getMessage()) ;
        }

        proceedBTN.setEnabled(true);
    }//GEN-LAST:event_okBTNActionPerformed

    private void proceedBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proceedBTNActionPerformed
        new ModifyCustDetails().setVisible(true);
        dispose();
    }//GEN-LAST:event_proceedBTNActionPerformed

    private void backBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBTNActionPerformed
        new Homepage().setVisible(true);
        dispose();
    }//GEN-LAST:event_backBTNActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame_1().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adminTF;
    private javax.swing.JButton backBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton okBTN;
    private javax.swing.JPasswordField passwordPF;
    private javax.swing.JButton proceedBTN;
    // End of variables declaration//GEN-END:variables
}
