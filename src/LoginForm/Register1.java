/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginForm;

import java.awt.Color;

/**
 *
 * @author Admin
 */
public class Register1 extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    public Register1() {
        initComponents();
        
    }
Color navcolor=new Color(255,66,66);
    Color logcolor=new Color(51,51,255);
    Color navecolor=new Color(0,43,50);
    Color headcolor=new Color(255,66,66);
    Color bodycolor=new Color(102,102,102);
    Color closecolor=new Color(0,153,255);
    Color mincolor=new Color(197,67,67);
    Color backcolor= new Color(255,255,204);
    Color lightcolor=new Color(204,204,204);
    Color logincolor=new Color(0,43,50);
     Color whitecolor=new Color(255,255,255);
    Color graycolor=new Color(51,51,51);
    Color dgreencolor=new Color(27,102,102);
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
        bUsername = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bContact = new javax.swing.JLabel();
        bPassword = new javax.swing.JLabel();
        bAddress = new javax.swing.JLabel();
        jUsername = new javax.swing.JTextField();
        jAddress = new javax.swing.JTextField();
        jContact = new javax.swing.JTextField();
        jPassword = new javax.swing.JPasswordField();
        jSubmit = new javax.swing.JButton();
        jReset = new javax.swing.JButton();
        jGender = new javax.swing.JComboBox<>();
        backArrow = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(45,50,155,70));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Register");

        bUsername.setBackground(new java.awt.Color(0, 0, 0));
        bUsername.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        bUsername.setForeground(new java.awt.Color(255, 255, 255));
        bUsername.setText("Username: ");

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Gender: ");

        bContact.setBackground(new java.awt.Color(0, 0, 0));
        bContact.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        bContact.setForeground(new java.awt.Color(255, 255, 255));
        bContact.setText("Contact No.: ");

        bPassword.setBackground(new java.awt.Color(0, 0, 0));
        bPassword.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        bPassword.setForeground(new java.awt.Color(255, 255, 255));
        bPassword.setText("Password: ");

        bAddress.setBackground(new java.awt.Color(0, 0, 0));
        bAddress.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        bAddress.setForeground(new java.awt.Color(255, 255, 255));
        bAddress.setText("Address: ");

        jSubmit.setBackground(new java.awt.Color(9, 233, 255));
        jSubmit.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        jSubmit.setForeground(new java.awt.Color(255, 255, 255));
        jSubmit.setText("Submit");

        jReset.setBackground(new java.awt.Color(9, 233, 255));
        jReset.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        jReset.setForeground(new java.awt.Color(255, 255, 255));
        jReset.setText("Reset");

        jGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jReset)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addComponent(jSubmit)
                .addGap(85, 85, 85))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bUsername)
                            .addComponent(jLabel3)
                            .addComponent(bContact)
                            .addComponent(bAddress)
                            .addComponent(bPassword))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                            .addComponent(jGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jUsername)
                            .addComponent(jContact, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                            .addComponent(jPassword)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bUsername)
                    .addComponent(jUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bContact)
                    .addComponent(jContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bPassword)
                    .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bAddress))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSubmit)
                    .addComponent(jReset))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 460, 420));

        backArrow.setBackground(new java.awt.Color(204, 255, 204));
        backArrow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backArrowMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backArrowMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backArrowMouseExited(evt);
            }
        });
        backArrow.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel54.setBackground(new java.awt.Color(0, 255, 255));
        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconFolder/icons8-back-arrow-26.png"))); // NOI18N
        backArrow.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 30, 30));

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        backArrow.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 530));

        getContentPane().add(backArrow, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 40));

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconImagesFolder/27565.png"))); // NOI18N
        getContentPane().add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backArrowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backArrowMouseClicked
        this.toBack();
       LoginForm lf= new LoginForm();
        setVisible(false);
        new LoginForm().toFront();
        new LoginForm().setState(java.awt.Frame.NORMAL);
        lf.toFront();
    }//GEN-LAST:event_backArrowMouseClicked

    private void backArrowMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backArrowMouseEntered
        backArrow.setBackground(lightcolor);
    }//GEN-LAST:event_backArrowMouseEntered

    private void backArrowMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backArrowMouseExited
        backArrow.setBackground(backcolor);
    }//GEN-LAST:event_backArrowMouseExited

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
            java.util.logging.Logger.getLogger(Register1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bAddress;
    private javax.swing.JLabel bContact;
    private javax.swing.JLabel bPassword;
    private javax.swing.JLabel bUsername;
    private javax.swing.JPanel backArrow;
    private javax.swing.JTextField jAddress;
    private javax.swing.JTextField jContact;
    private javax.swing.JComboBox<String> jGender;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JButton jReset;
    private javax.swing.JButton jSubmit;
    private javax.swing.JTextField jUsername;
    // End of variables declaration//GEN-END:variables
}
