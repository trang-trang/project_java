/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentattendance;

/**
 *
 * @author tthuo
 */
public class Main_form extends javax.swing.JFrame implements Mainmenucallback {
    public static Login user;
    

    /**
     * Creates new form Main_form
     */
    public Main_form() {
        initComponents();
        ///setGuessmenu();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuitem_login = new javax.swing.JMenuItem();
        menuCourse = new javax.swing.JMenu();
        menuitem_course = new javax.swing.JMenuItem();
        menuitem_class = new javax.swing.JMenuItem();
        menuitem_object = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("File");

        menuitem_login.setText("Login");
        menuitem_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitem_loginActionPerformed(evt);
            }
        });
        jMenu1.add(menuitem_login);

        jMenuBar1.add(jMenu1);

        menuCourse.setText("Course");

        menuitem_course.setText("Manage Course");
        menuitem_course.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitem_courseActionPerformed(evt);
            }
        });
        menuCourse.add(menuitem_course);

        menuitem_class.setText("Manage Class");
        menuCourse.add(menuitem_class);

        menuitem_object.setText("Manage Object");
        menuitem_object.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuitem_objectMouseClicked(evt);
            }
        });
        menuitem_object.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitem_objectActionPerformed(evt);
            }
        });
        menuCourse.add(menuitem_object);

        jMenuBar1.add(menuCourse);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 578, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 443, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuitem_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitem_loginActionPerformed
      // TODO add your handling code here:
      Login_form dlg = new Login_form(this);
      dlg.setVisible(true);
    }//GEN-LAST:event_menuitem_loginActionPerformed

    private void menuitem_courseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitem_courseActionPerformed
        // TODO add your handling code here:
        Course_form dlg = new Course_form();
        dlg.setVisible(true);
    }//GEN-LAST:event_menuitem_courseActionPerformed

    private void menuitem_objectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuitem_objectMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_menuitem_objectMouseClicked

    private void menuitem_objectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitem_objectActionPerformed
        // TODO add your handling code here:
        Subject_form dlg = new Subject_form();
        dlg.setVisible(true);
    }//GEN-LAST:event_menuitem_objectActionPerformed

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
            java.util.logging.Logger.getLogger(Main_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_form().setVisible(true);
            }
        });
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menuCourse;
    private javax.swing.JMenuItem menuitem_class;
    private javax.swing.JMenuItem menuitem_course;
    private javax.swing.JMenuItem menuitem_login;
    private javax.swing.JMenuItem menuitem_object;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setAdminmenu() {
        menuitem_class.setEnabled(true);
        menuitem_course.setEnabled(true);
         menuitem_object.setEnabled(true);
       
    }

    @Override
    public void setTeachermenu() {
       menuitem_class.setEnabled(false);
       menuitem_course.setEnabled(false);
         menuitem_object.setEnabled(false);
    }

    @Override
    public void setGuessmenu() {
          menuitem_class.setEnabled(false);
           menuitem_class.setEnabled(false);
       menuitem_course.setEnabled(false);
         menuitem_object.setEnabled(false);
    }

    @Override
    public void setLoginuser(Login login) {
            user = new Login();
            user.id = login.id;
            user.role = login.role;
            user.username = login.username;
            user.pass = login.pass;
    }
}
