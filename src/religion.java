/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CRYSTAL
 */
public class religion extends javax.swing.JFrame {

    String str;

    public religion() {
        initComponents();
    }

    religion(String str) {
        this();
        this.str = str;
        get.setText(str);
        System.out.println(str);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        RELIGION = new javax.swing.ButtonGroup();
        jLabel3 = new javax.swing.JLabel();
        muslimRBN = new javax.swing.JRadioButton();
        hinduRBN = new javax.swing.JRadioButton();
        christianRBN = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        next2BTN = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        backBTN = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        get = new javax.swing.JTextField();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(500, 320));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("CHOOSE YOUR BELIEVED WAY:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 0, 430, 40);

        muslimRBN.setBackground(new java.awt.Color(204, 51, 0));
        RELIGION.add(muslimRBN);
        muslimRBN.setText("MUSLIM");
        getContentPane().add(muslimRBN);
        muslimRBN.setBounds(340, 80, 120, 23);

        hinduRBN.setBackground(new java.awt.Color(0, 102, 0));
        RELIGION.add(hinduRBN);
        hinduRBN.setText("HINDU");
        getContentPane().add(hinduRBN);
        hinduRBN.setBounds(80, 80, 90, 23);

        christianRBN.setBackground(new java.awt.Color(255, 204, 204));
        RELIGION.add(christianRBN);
        christianRBN.setText("CHRISTIAN");
        getContentPane().add(christianRBN);
        christianRBN.setBounds(210, 120, 110, 23);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("NOTE:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 270, 50, 14);

        next2BTN.setBackground(new java.awt.Color(0, 0, 0));
        next2BTN.setFont(new java.awt.Font("Brush Script MT", 1, 14)); // NOI18N
        next2BTN.setForeground(new java.awt.Color(0, 0, 153));
        next2BTN.setText("N E X T > >");
        next2BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                next2BTNActionPerformed(evt);
            }
        });
        getContentPane().add(next2BTN);
        next2BTN.setBounds(350, 200, 120, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("No Intention Of \"RELIGION\"  Di scr i m i nation Is Exhibited..");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 270, 420, 20);

        backBTN.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        backBTN.setForeground(new java.awt.Color(0, 0, 153));
        backBTN.setText("BACK");
        backBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBTNActionPerformed(evt);
            }
        });
        getContentPane().add(backBTN);
        backBTN.setBounds(30, 200, 90, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/religion.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 790, 310);

        get.setText("jTextField1");
        getContentPane().add(get);
        get.setBounds(380, 150, 59, 20);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-505)/2, (screenSize.height-338)/2, 505, 338);
    }// </editor-fold>//GEN-END:initComponents

    private void next2BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_next2BTNActionPerformed
        String string = get.getText();
        if (hinduRBN.isSelected()) {
            string = "hindu" + string;
            string = string.toLowerCase();
            new hindu().setVisible(true);
            setVisible(false);
        } else if (muslimRBN.isSelected()) {
            string = "muslim" + string;
            string = string.toLowerCase();
            new muslim().setVisible(true);
            setVisible(false);
        } else if (christianRBN.isSelected()) {
            string = "christian" + string;
            string = string.toLowerCase();
            new christian().setVisible(true);
            setVisible(false);
        }
        System.out.println(string);
    }//GEN-LAST:event_next2BTNActionPerformed

    private void backBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBTNActionPerformed
       new event_selection().setVisible(true);
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
            java.util.logging.Logger.getLogger(religion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(religion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(religion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(religion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new religion().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup RELIGION;
    private javax.swing.JButton backBTN;
    private javax.swing.JRadioButton christianRBN;
    private javax.swing.JTextField get;
    private javax.swing.JRadioButton hinduRBN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton muslimRBN;
    private javax.swing.JButton next2BTN;
    // End of variables declaration//GEN-END:variables
}
