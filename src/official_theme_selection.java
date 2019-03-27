import java.sql.*;
public class official_theme_selection extends javax.swing.JFrame {

    Connection con;
    ResultSet rs;
    Statement stmt;
    PreparedStatement pst;
    String sql = "select * from events natural join other_themes where theme_name=?";
    public official_theme_selection() {
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

        official = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        re_unionRBN = new javax.swing.JRadioButton();
        buissiness_meetingRBN = new javax.swing.JRadioButton();
        retirmentRBN = new javax.swing.JRadioButton();
        priceTF = new javax.swing.JTextField();
        conferenceRBN = new javax.swing.JRadioButton();
        thanks_givingRBN = new javax.swing.JRadioButton();
        seminarRBN = new javax.swing.JRadioButton();
        nextBTN = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        backBTN = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("OFFICIAL THEMES  :) :");
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(1000, 380));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Bradley Hand ITC", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("select your's theme:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 10, 230, 30);

        re_unionRBN.setBackground(new java.awt.Color(0, 0, 0));
        official.add(re_unionRBN);
        re_unionRBN.setFont(new java.awt.Font("Bradley Hand ITC", 1, 14)); // NOI18N
        re_unionRBN.setForeground(new java.awt.Color(240, 240, 240));
        re_unionRBN.setText("RE_UNION");
        re_unionRBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                re_unionRBNActionPerformed(evt);
            }
        });
        getContentPane().add(re_unionRBN);
        re_unionRBN.setBounds(530, 330, 110, 20);

        buissiness_meetingRBN.setBackground(new java.awt.Color(0, 0, 0));
        official.add(buissiness_meetingRBN);
        buissiness_meetingRBN.setFont(new java.awt.Font("Bradley Hand ITC", 1, 14)); // NOI18N
        buissiness_meetingRBN.setForeground(java.awt.Color.white);
        buissiness_meetingRBN.setText("BUISSINESS_MEETING");
        buissiness_meetingRBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buissiness_meetingRBNActionPerformed(evt);
            }
        });
        getContentPane().add(buissiness_meetingRBN);
        buissiness_meetingRBN.setBounds(230, 170, 210, 20);

        retirmentRBN.setBackground(new java.awt.Color(0, 0, 0));
        official.add(retirmentRBN);
        retirmentRBN.setFont(new java.awt.Font("Bradley Hand ITC", 1, 14)); // NOI18N
        retirmentRBN.setForeground(new java.awt.Color(240, 240, 240));
        retirmentRBN.setText("RETIREMENT");
        retirmentRBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retirmentRBNActionPerformed(evt);
            }
        });
        getContentPane().add(retirmentRBN);
        retirmentRBN.setBounds(810, 330, 123, 27);

        priceTF.setEditable(false);
        priceTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceTFActionPerformed(evt);
            }
        });
        getContentPane().add(priceTF);
        priceTF.setBounds(100, 60, 130, 30);

        conferenceRBN.setBackground(new java.awt.Color(0, 0, 0));
        official.add(conferenceRBN);
        conferenceRBN.setFont(new java.awt.Font("Bradley Hand ITC", 1, 14)); // NOI18N
        conferenceRBN.setForeground(new java.awt.Color(240, 240, 240));
        conferenceRBN.setText("CONFERENCE");
        conferenceRBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conferenceRBNActionPerformed(evt);
            }
        });
        getContentPane().add(conferenceRBN);
        conferenceRBN.setBounds(510, 170, 140, 20);

        thanks_givingRBN.setBackground(new java.awt.Color(0, 0, 0));
        official.add(thanks_givingRBN);
        thanks_givingRBN.setFont(new java.awt.Font("Bradley Hand ITC", 1, 14)); // NOI18N
        thanks_givingRBN.setForeground(new java.awt.Color(240, 240, 240));
        thanks_givingRBN.setText("THANKS_GIVING");
        thanks_givingRBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thanks_givingRBNActionPerformed(evt);
            }
        });
        getContentPane().add(thanks_givingRBN);
        thanks_givingRBN.setBounds(250, 330, 160, 20);

        seminarRBN.setBackground(new java.awt.Color(0, 0, 0));
        official.add(seminarRBN);
        seminarRBN.setFont(new java.awt.Font("Bradley Hand ITC", 1, 14)); // NOI18N
        seminarRBN.setForeground(new java.awt.Color(240, 240, 240));
        seminarRBN.setText("SEMINAR");
        seminarRBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seminarRBNActionPerformed(evt);
            }
        });
        getContentPane().add(seminarRBN);
        seminarRBN.setBounds(810, 170, 97, 20);

        nextBTN.setBackground(new java.awt.Color(51, 51, 51));
        nextBTN.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        nextBTN.setForeground(new java.awt.Color(0, 51, 204));
        nextBTN.setText(" N E X T > >");
        nextBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBTNActionPerformed(evt);
            }
        });
        getContentPane().add(nextBTN);
        nextBTN.setBounds(830, 20, 120, 40);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("price:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 60, 40, 17);

        backBTN.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        backBTN.setText("BACK");
        backBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBTNActionPerformed(evt);
            }
        });
        getContentPane().add(backBTN);
        backBTN.setBounds(70, 290, 100, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/official.jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(1000, 380));
        jLabel1.setMinimumSize(new java.awt.Dimension(1000, 380));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1000, 350);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-984)/2, (screenSize.height-363)/2, 984, 363);
    }// </editor-fold>//GEN-END:initComponents

    private void priceTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceTFActionPerformed

    private void seminarRBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seminarRBNActionPerformed
        String theme = "seminar";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, theme);
            rs = pst.executeQuery();
            if (rs.next()) {

                priceTF.setText(rs.getInt("charges") + "");

            }
            pst.close();
            rs.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }//GEN-LAST:event_seminarRBNActionPerformed

    private void buissiness_meetingRBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buissiness_meetingRBNActionPerformed
        String theme = "buissiness_meeting";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, theme);
            rs = pst.executeQuery();
            if (rs.next()) {

                priceTF.setText(rs.getInt("charges") + "");

            }
            pst.close();
            rs.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }//GEN-LAST:event_buissiness_meetingRBNActionPerformed

    private void conferenceRBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conferenceRBNActionPerformed
        String theme = "conference";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, theme);
            rs = pst.executeQuery();
            if (rs.next()) {

                priceTF.setText(rs.getInt("charges") + "");

            }
            pst.close();
            rs.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }//GEN-LAST:event_conferenceRBNActionPerformed

    private void thanks_givingRBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thanks_givingRBNActionPerformed
        String theme = "thanks";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, theme);
            rs = pst.executeQuery();
            if (rs.next()) {

                priceTF.setText(rs.getInt("charges") + "");

            }
            pst.close();
            rs.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }//GEN-LAST:event_thanks_givingRBNActionPerformed

    private void re_unionRBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_re_unionRBNActionPerformed
        String theme = "re_union";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, theme);
            rs = pst.executeQuery();
            if (rs.next()) {

                priceTF.setText(rs.getInt("charges") + "");

            }
            pst.close();
            rs.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }//GEN-LAST:event_re_unionRBNActionPerformed

    private void retirmentRBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retirmentRBNActionPerformed
        String theme = "retirement";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, theme);
            rs = pst.executeQuery();
            if (rs.next()) {

                priceTF.setText(rs.getInt("charges") + "");

            }
            pst.close();
            rs.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }//GEN-LAST:event_retirmentRBNActionPerformed

    private void nextBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBTNActionPerformed
        new Function_Hall().setVisible(true);
        dispose();
    }//GEN-LAST:event_nextBTNActionPerformed

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
            java.util.logging.Logger.getLogger(official_theme_selection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(official_theme_selection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(official_theme_selection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(official_theme_selection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new official_theme_selection().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBTN;
    private javax.swing.JRadioButton buissiness_meetingRBN;
    private javax.swing.JRadioButton conferenceRBN;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton nextBTN;
    private javax.swing.ButtonGroup official;
    private javax.swing.JTextField priceTF;
    private javax.swing.JRadioButton re_unionRBN;
    private javax.swing.JRadioButton retirmentRBN;
    private javax.swing.JRadioButton seminarRBN;
    private javax.swing.JRadioButton thanks_givingRBN;
    // End of variables declaration//GEN-END:variables
}
