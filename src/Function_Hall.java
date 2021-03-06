
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


public class Function_Hall extends javax.swing.JFrame {
    Connection con;
    ResultSet rs;
    Statement stmt;
    PreparedStatement pst;
    String sql = "select * from functionhall where name=?";
    public Function_Hall() {
        initComponents();
         con = DBConnect.connectMySQL();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        hallpriceTF = new javax.swing.JTextField();
        backBTN = new javax.swing.JButton();
        proceedBTN = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        rb2 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setText("Choose your function hall");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(190, 20, 400, 42);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel3.setText("PRICE");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(180, 270, 120, 30);

        hallpriceTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hallpriceTFActionPerformed(evt);
            }
        });
        jPanel1.add(hallpriceTF);
        hallpriceTF.setBounds(350, 270, 210, 30);

        backBTN.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        backBTN.setText("BACK");
        backBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBTNActionPerformed(evt);
            }
        });
        jPanel1.add(backBTN);
        backBTN.setBounds(30, 470, 85, 40);

        proceedBTN.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        proceedBTN.setText("PROCEED");
        proceedBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proceedBTNActionPerformed(evt);
            }
        });
        jPanel1.add(proceedBTN);
        proceedBTN.setBounds(590, 470, 119, 40);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jRadioButton1.setText("The Ballroom At Park Kyatt");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton1);
        jRadioButton1.setBounds(50, 160, 270, 30);

        buttonGroup1.add(rb2);
        rb2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        rb2.setText("Peackock At Marigold");
        rb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb2ActionPerformed(evt);
            }
        });
        jPanel1.add(rb2);
        rb2.setBounds(420, 160, 220, 31);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/nice-peach-color-wedding-backdrop-collection.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(-16, -6, 760, 550);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 737, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-753)/2, (screenSize.height-581)/2, 753, 581);
    }// </editor-fold>//GEN-END:initComponents

    private void hallpriceTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hallpriceTFActionPerformed
        
    }//GEN-LAST:event_hallpriceTFActionPerformed

    private void proceedBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proceedBTNActionPerformed
         new Choose_Food().setVisible(true);
         dispose();
    }//GEN-LAST:event_proceedBTNActionPerformed

    private void backBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBTNActionPerformed
        new event_selection().setVisible(true);
        dispose();
    }//GEN-LAST:event_backBTNActionPerformed

    private void rb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb2ActionPerformed
        String fh="Marigold";
            try{
            pst = con.prepareStatement(sql);
            pst.setString(1, fh);
            rs = pst.executeQuery();
            if (rs.next()) {
                hallpriceTF.setText(rs.getInt("event_charges") + "");
            }
            pst.close();
            rs.close();
             } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_rb2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
      String fh="Ballroom";
            try {
            pst = con.prepareStatement(sql);
            pst.setString(1, fh);
            rs = pst.executeQuery();
            if (rs.next()) {
                hallpriceTF.setText(rs.getInt("event_charges") + "");
            }
            pst.close();
            rs.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jRadioButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Function_Hall.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Function_Hall.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Function_Hall.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Function_Hall.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Function_Hall().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBTN;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTextField hallpriceTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JButton proceedBTN;
    private javax.swing.JRadioButton rb2;
    // End of variables declaration//GEN-END:variables

   
}
