 
package Auth_test;
 
import Main_PAck.demo_user1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class Create_Login_Pin extends javax.swing.JFrame {

       Connection ct=null;
    PreparedStatement ps=null;
    ResultSet rs=null;
    Statement st=null;
    public Create_Login_Pin() {
        initComponents();
        Update.setVisible(false); 
        jLabel8.setVisible(false);
        user1.setVisible(false);
        jLabel3.setVisible(false);
    }

     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        user1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        Create = new javax.swing.JLabel();
        Update = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("*Create Pin");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(0, 0, 100, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("RMC CHEMICAL COMPANY LTD.");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(0, 50, 590, 50);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("All Kinds of Construction Chemical & Paints Manufacturer Company");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 100, 590, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("X");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4);
        jLabel4.setBounds(550, 0, 50, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("create");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(230, 20, 100, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("User Id");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(90, 190, 290, 20);

        user.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        user.setForeground(new java.awt.Color(255, 255, 255));
        user.setOpaque(false);
        jPanel1.add(user);
        user.setBounds(90, 220, 390, 30);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/upd.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel6);
        jLabel6.setBounds(430, 170, 40, 40);

        user1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        user1.setForeground(new java.awt.Color(255, 255, 255));
        user1.setOpaque(false);
        jPanel1.add(user1);
        user1.setBounds(90, 290, 390, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Old User Id");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(90, 260, 290, 20);

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "User", "Admin" }));
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(90, 150, 120, 30);

        Create.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Create.setForeground(new java.awt.Color(255, 255, 255));
        Create.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Create.setText("Create");
        Create.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CreateMouseClicked(evt);
            }
        });
        jPanel1.add(Create);
        Create.setBounds(230, 330, 110, 50);

        Update.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Update.setForeground(new java.awt.Color(255, 255, 255));
        Update.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Update.setText("Update");
        Update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateMouseClicked(evt);
            }
        });
        jPanel1.add(Update);
        Update.setBounds(230, 330, 110, 50);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/22.jpeg"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 51, 0), 3));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 600, 520);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 600, 520);

        setSize(new java.awt.Dimension(600, 519));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
     
     Main_PAck.demo ob=new Main_PAck.demo("1");
        ob.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel4MouseClicked
public void contest() {
        try {
            ct = DriverManager.getConnection("jdbc:mysql://localhost:3306/rmc_chemical_ltd", "root", "");
        } catch (SQLException ex) {
            Logger.getLogger(Create_Login_Pin.class.getName()).log(Level.SEVERE, null, ex);
        } }
    private void CreateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreateMouseClicked

        if(user.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "User Id Is Empty");
            user.requestFocus();
        }else{
            try {
                contest();
                String s="INSERT INTO `rmc_chemical_ltd`.`user_id`(`id`,`status`) VALUES (?,?)";
                ps=ct.prepareCall(s);
                
                ps.setString(1,user.getText());
                   ps.setString(2,jComboBox1.getSelectedItem().toString());
                int m=ps.executeUpdate();
                if(m>0){
                user.setText("");
                user.requestFocus();
                jComboBox1.setSelectedIndex(0);
                }else{
                JOptionPane.showMessageDialog(rootPane, "Failed.....");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Create_Login_Pin.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
    }//GEN-LAST:event_CreateMouseClicked

    private void UpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateMouseClicked
           try {
               // TODO add your handling code here:
               if(user.getText().isEmpty()){
                   JOptionPane.showMessageDialog(this, "User Id Is Empty");
                   user.requestFocus();
               }else if(user1.getText().isEmpty()){
                   JOptionPane.showMessageDialog(this, "Old User Id Is Empty");
                   user1.requestFocus();
               }else{
                   contest();
               String s="UPDATE `rmc_chemical_ltd`.`user_id`SET `id`= '"+user.getText()+"'  WHERE `id` = '"+user1.getText()+"'   AND `status` ='"+jComboBox1.getSelectedItem()+"'";
             
              //   String s="UPDATE `pharmacy_management`.`user_id` SET `id` = '"+user.getText()+"' WHERE `id` = '"+user1.getText()+"' AND `status`='"+jComboBox1.getSelectedItem()+"'";
             ps = ct.prepareCall(s);
               int m=ps.executeUpdate();
               if(m>0){
                   JOptionPane.showMessageDialog(rootPane, "Id Update.....");
                   user.setText("");
                    user1.setText("");
               }else{
                   JOptionPane.showMessageDialog(rootPane, "Id  Update Failed.....");
               }
               
               
               }
           } catch (SQLException ex) {
               Logger.getLogger(Create_Login_Pin.class.getName()).log(Level.SEVERE, null, ex);
           }
        
    }//GEN-LAST:event_UpdateMouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
   if(jLabel3.getText().equalsIgnoreCase("create")){
        Update.setVisible(true); 
        jLabel8.setVisible(true);
        user1.setVisible(true);
        Create.setVisible(false); 
        jLabel3.setText("update");
        jLabel5.setText("New User ID");
   }else{
      Update.setVisible(false); 
        jLabel8.setVisible(false);
        user1.setVisible(false);
        Create.setVisible(true); 
        jLabel3.setText("create");
      jLabel5.setText("User ID");
   
   }
        
    }//GEN-LAST:event_jLabel6MouseClicked

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
            java.util.logging.Logger.getLogger(Create_Login_Pin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Create_Login_Pin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Create_Login_Pin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Create_Login_Pin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Create_Login_Pin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Create;
    private javax.swing.JLabel Update;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField user;
    private javax.swing.JTextField user1;
    // End of variables declaration//GEN-END:variables
}
