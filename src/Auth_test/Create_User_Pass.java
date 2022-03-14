
package Auth_test;

 
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane; 
public class Create_User_Pass extends javax.swing.JFrame { 
    Connection ct=null;
    PreparedStatement ps=null;
    ResultSet rs=null;
    Statement st=null;
    public Create_User_Pass() {
        initComponents();
        jLabel8.setVisible(false);
         password1.setVisible(false);
         update.setVisible(false); 
         cu.setVisible(false); 
    }

     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        id = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        password1 = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cu = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        create = new javax.swing.JLabel();
        update = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

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
        jLabel4.setBounds(560, 0, 40, 40);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("All Kinds of Construction Chemical & Paints Manufacturer Company");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 100, 590, 20);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("RMC CHEMICAL COMPANY LTD.");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(0, 50, 590, 50);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("*Create User Account");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 0, 160, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("User Name");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(100, 250, 280, 20);

        user.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        user.setForeground(new java.awt.Color(255, 255, 255));
        user.setOpaque(false);
        jPanel1.add(user);
        user.setBounds(100, 270, 390, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Password");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(100, 300, 280, 20);

        password.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        password.setForeground(new java.awt.Color(255, 255, 255));
        password.setOpaque(false);
        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                passwordKeyTyped(evt);
            }
        });
        jPanel1.add(password);
        password.setBounds(100, 320, 390, 30);

        id.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        id.setForeground(new java.awt.Color(255, 255, 255));
        id.setOpaque(false);
        jPanel1.add(id);
        id.setBounds(100, 220, 390, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("User Id");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(100, 200, 220, 20);

        password1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        password1.setForeground(new java.awt.Color(255, 255, 255));
        password1.setOpaque(false);
        password1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                password1KeyTyped(evt);
            }
        });
        jPanel1.add(password1);
        password1.setBounds(100, 370, 390, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Old Password");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(100, 350, 280, 20);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/upd.png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel7);
        jLabel7.setBounds(450, 150, 40, 40);

        cu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cu.setForeground(new java.awt.Color(255, 255, 255));
        cu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cu.setText("create");
        jPanel1.add(cu);
        cu.setBounds(220, 0, 100, 30);

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "User", "Admin" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(100, 160, 130, 30);

        create.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        create.setForeground(new java.awt.Color(255, 255, 255));
        create.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        create.setText("Create");
        create.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createMouseClicked(evt);
            }
        });
        create.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                createKeyPressed(evt);
            }
        });
        jPanel1.add(create);
        create.setBounds(210, 410, 110, 50);

        update.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        update.setForeground(new java.awt.Color(255, 255, 255));
        update.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        update.setText("Update");
        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateMouseClicked(evt);
            }
        });
        update.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                updateKeyPressed(evt);
            }
        });
        jPanel1.add(update);
        update.setBounds(220, 410, 100, 50);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/22.jpeg"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 51, 0), 3));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 600, 520);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 600, 530);

        setSize(new java.awt.Dimension(600, 519));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
public void contest() {
        try {
            ct = DriverManager.getConnection("jdbc:mysql://localhost:3306/rmc_chemical_ltd", "root", "");
        } catch (SQLException ex) {
            Logger.getLogger(Create_User_Pass.class.getName()).log(Level.SEVERE, null, ex);
        } }
    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
     LogingPage l=new LogingPage();
     l.setVisible(true);
         
        dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void createKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_createKeyPressed
     
    }//GEN-LAST:event_createKeyPressed

    private void passwordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyTyped
       char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE|| c==KeyEvent.VK_SPACE)) {
            evt.consume();
        }
    }//GEN-LAST:event_passwordKeyTyped

    private void createMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createMouseClicked
       if(id.getText().isEmpty()){
          JOptionPane.showMessageDialog(rootPane, "Id Is Empty");
          id.requestFocus();
       }
      else if(user.getText().isEmpty()){
        JOptionPane.showMessageDialog(rootPane, "User Name Is Empty");
          user.requestFocus();
      
      }else if(password.getText().isEmpty()){
        JOptionPane.showMessageDialog(rootPane, "Password Is Empty");
          password.requestFocus();
      }
          else{
          if(jComboBox1.getSelectedIndex()==0){
          try {
              contest();
              String s="SELECT  `id` FROM `rmc_chemical_ltd`.`user_id` WHERE `id`='"+id.getText()+"' AND `status`='"+jComboBox1.getSelectedItem()+"'";
              st=ct.prepareCall(s);
              rs=st.executeQuery(s);
              if(rs.next()){
              String u="SELECT `username` FROM `rmc_chemical_ltd`.`user_accounts` WHERE `username`='"+user.getText()+"'";
              st=ct.prepareCall(u);
              rs=st.executeQuery(u);
              if(rs.next()){
              JOptionPane.showMessageDialog(rootPane,"Please Change User Name...!!!!");
              user.requestFocus();
              }else{
              String in=" INSERT INTO `rmc_chemical_ltd`.`user_accounts` (`id`, `username`, `password`,`status`) VALUES (?,?,?,?)";
              ps=ct.prepareCall(in);
              ps.setString(1, id.getText());
               ps.setString(2, user.getText());
               ps.setString(3, password.getText());
               ps.setString(4, jComboBox1.getSelectedItem().toString());
               int m=ps.executeUpdate();
               if(m>0){
                JOptionPane.showMessageDialog(rootPane, "Account Create");
                id.setText("");
                user.setText("");
                password.setText("");
                jComboBox1.setSelectedIndex(0);
                id.requestFocus();
                }
              }
              
              
              }
              else{
              JOptionPane.showMessageDialog(rootPane, "Sorry...!!\nWrong Id...");
              }
              
              
          } catch (SQLException ex) {
              Logger.getLogger(Create_User_Pass.class.getName()).log(Level.SEVERE, null, ex);
          }
             
   
  }else{
       
            
         try {
              contest();
              String s="SELECT  `id` FROM `rmc_chemical_ltd`.`user_id` WHERE `id`='"+id.getText()+"' AND `status`='"+jComboBox1.getSelectedItem()+"'";
              st=ct.prepareCall(s);
              rs=st.executeQuery(s);
              if(rs.next()){
              String u="SELECT `username` FROM `rmc_chemical_ltd`.`user_accounts` WHERE `username`='"+user.getText()+"'";
              st=ct.prepareCall(u);
              rs=st.executeQuery(u);
              if(rs.next()){
              JOptionPane.showMessageDialog(rootPane,"Please Change User Name...!!!!");
              user.requestFocus();
              }else{
              String in=" INSERT INTO `rmc_chemical_ltd`.`user_accounts` (`id`, `username`, `password`,`status`) VALUES (?,?,?,?)";
              ps=ct.prepareCall(in);
              ps.setString(1, id.getText());
               ps.setString(2, user.getText());
               ps.setString(3, password.getText());
               ps.setString(4, jComboBox1.getSelectedItem().toString());
               int m=ps.executeUpdate();
                if(m>0){
                JOptionPane.showMessageDialog(rootPane, "Account Create");
                id.setText("");
                user.setText("");
                password.setText("");
                jComboBox1.setSelectedIndex(0);
                id.requestFocus();
                }
              }
              
              
              }
              else{
              JOptionPane.showMessageDialog(rootPane, "Sorry...!!\nWrong Id...");
              }
              
              
          } catch (SQLException ex) {
              Logger.getLogger(Create_User_Pass.class.getName()).log(Level.SEVERE, null, ex);
          }
             
  
          
           
            
          }
     
          
          
          
         
      }
        
        
    }//GEN-LAST:event_createMouseClicked

    private void password1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_password1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_password1KeyTyped

    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked
  JOptionPane.showMessageDialog(rootPane, "User Name Is Empty"); if(user.getText().isEmpty()){
        JOptionPane.showMessageDialog(rootPane, "User Name Is Empty");
          user.requestFocus();
      
      }else if(password.getText().isEmpty()){
        JOptionPane.showMessageDialog(rootPane, "Password Is Empty");
          password.requestFocus();
      }else if(password1.getText().isEmpty()){
        JOptionPane.showMessageDialog(rootPane, "Old Password Is Empty");
          password1.requestFocus();
      }
          else{
        try {
            contest();
            String u="SELECT  `password` FROM `rmc_chemical_ltd`.`user_accounts` WHERE `username`='"+user.getText()+"'";
            st=ct.prepareCall(u);
            rs=st.executeQuery(u);
            if(rs.next()){
String upp="UPDATE `rmc_chemical_ltd`.`user_accounts` SET `password` = '"+password.getText()+"' WHERE  `username` = '"+user.getText()+"' AND `password` = '"+password1.getText()+"'";
                
                 ps = ct.prepareCall(upp);
                int m=ps.executeUpdate();
                if(m>0){
                JOptionPane.showMessageDialog(rootPane, "Password Changed....");
                user.setText("");
                password.setText("");
                password1.setText("");
              user.requestFocus();
                
                
                
                }
                
                
                
            }else{
              JOptionPane.showMessageDialog(rootPane,"Wrong Old Password...!!!!");
                password1.requestFocus();
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(Create_User_Pass.class.getName()).log(Level.SEVERE, null, ex);
        }
      
      
      
      
      
      
      
      
      
      
      }
        
        
        
    }//GEN-LAST:event_updateMouseClicked

    private void updateKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_updateKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateKeyPressed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        if(cu.getText().equalsIgnoreCase("create")){ 
            cu.setText("update");
            user.requestFocus();
            jLabel3.setText("Update Password");
                jLabel9.setVisible(false);
         id.setVisible(false);
         create.setVisible(false); 
         
           jLabel8.setVisible(true);
         password1.setVisible(true);
         update.setVisible(true); 
           jLabel6.setText("New Password");
        }else{
            cu.setText("create");
           
            jLabel3.setText("Create User Account");
                jLabel9.setVisible(true);
         id.setVisible(true);
         create.setVisible(true); 
         
           jLabel8.setVisible(false);
         password1.setVisible(false);
         update.setVisible(false); 
        jLabel6.setText("Password");
         id.requestFocus();
        }

    }//GEN-LAST:event_jLabel7MouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
       
    }//GEN-LAST:event_jComboBox1ActionPerformed
 
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Create_User_Pass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Create_User_Pass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Create_User_Pass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Create_User_Pass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Create_User_Pass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel create;
    private javax.swing.JLabel cu;
    private javax.swing.JTextField id;
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
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField password;
    private javax.swing.JPasswordField password1;
    private javax.swing.JLabel update;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
