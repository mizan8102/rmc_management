 
package Auth_test;

 
import Main_PAck.demo;
import Main_PAck.demo_user_F;
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
 
public class LogingPage extends javax.swing.JFrame {

 
    Connection ct=null;
    PreparedStatement ps=null;
    ResultSet rs=null;
    Statement st=null;
    public LogingPage() {
        initComponents();
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
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("All Kinds of Construction Chemical & Paints Manufacturer Company");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 100, 590, 20);

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

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Login");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel7);
        jLabel7.setBounds(220, 360, 120, 50);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("RMC CHEMICAL COMPANY LTD.");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 50, 600, 50);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("User Name");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(100, 190, 270, 40);

        user.setBackground(new java.awt.Color(255, 204, 153));
        user.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        user.setForeground(new java.awt.Color(255, 255, 255));
        user.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        user.setOpaque(false);
        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });
        user.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                userKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                userKeyTyped(evt);
            }
        });
        jPanel1.add(user);
        user.setBounds(100, 230, 390, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Password");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(100, 280, 270, 30);

        password.setBackground(new java.awt.Color(255, 204, 153));
        password.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        password.setForeground(new java.awt.Color(255, 255, 255));
        password.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        password.setOpaque(false);
        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordKeyPressed(evt);
            }
        });
        jPanel1.add(password);
        password.setBounds(100, 310, 390, 40);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Create New User Account");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8);
        jLabel8.setBounds(150, 410, 270, 22);

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "User", "Admin" }));
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(100, 150, 110, 30);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/22.jpeg"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 51, 0), 3));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 600, 520);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 610, 530);

        setSize(new java.awt.Dimension(600, 520));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
public void contest() {
        try {
            ct = DriverManager.getConnection("jdbc:mysql://localhost:3306/rmc_chemical_ltd", "root", "");
        } catch (SQLException ex) {
            Logger.getLogger(LogingPage.class.getName()).log(Level.SEVERE, null, ex);
        } }
    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
      dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        Create_User_Pass c=new Create_User_Pass();
        c.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
      if(user.getText().isEmpty()){
          JOptionPane.showMessageDialog(rootPane, "User Name Is Empty..");
      user.requestFocus();
      }else if(password.getText().isEmpty()){
          JOptionPane.showMessageDialog(rootPane, "Password Is Empty..");
      password.requestFocus();
      } else{
          if(jComboBox1.getSelectedIndex()==0)
          {
          try {
              String s="SELECT  `username`, `password` FROM `rmc_chemical_ltd`.`user_accounts` WHERE `username`='"+user.getText()+"' AND `password`='"+password.getText()+"' AND `status`='"+jComboBox1.getSelectedItem()+"'";
              contest();
              st=ct.prepareCall(s);
              rs=st.executeQuery(s);
              if(rs.next()){
              Main_PAck.demo_user_F hp=new demo_user_F("0");    
              hp.setVisible(true);
              dispose(); 
              }else{
              JOptionPane.showMessageDialog(rootPane, "User Or PassWord Is  Wrong....");
              
              
              }   } catch (SQLException ex) {
              Logger.getLogger(LogingPage.class.getName()).log(Level.SEVERE, null, ex);
          }
          
          
          }else{
           try {
              String s="SELECT  `username`, `password` FROM `rmc_chemical_ltd`.`user_accounts` WHERE `username`='"+user.getText()+"' AND `password`='"+password.getText()+"' AND `status`='"+jComboBox1.getSelectedItem()+"'";
              contest();
              st=ct.prepareCall(s);
              rs=st.executeQuery(s);
              if(rs.next()){
                  demo hp=new demo("1");
                     hp.setVisible(true);
                  dispose();
                  
              }else{
              JOptionPane.showMessageDialog(rootPane, "User Or PassWord Is  Wrong....");
              
              
              }   } catch (SQLException ex) {
              Logger.getLogger(LogingPage.class.getName()).log(Level.SEVERE, null, ex);
          }
           
          
          }    
      }
        
        
        
    }//GEN-LAST:event_jLabel7MouseClicked

    private void userKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_userKeyTyped

    private void userKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        password.requestFocus();
        
        }
        
        
        
    }//GEN-LAST:event_userKeyPressed

    private void passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyPressed
        // TODO add your handling code here:
         if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
    if(user.getText().isEmpty()){
          JOptionPane.showMessageDialog(rootPane, "User Name Is Empty..");
      user.requestFocus();
      }else if(password.getText().isEmpty()){
          JOptionPane.showMessageDialog(rootPane, "Password Is Empty..");
      password.requestFocus();
      } else{
          if(jComboBox1.getSelectedIndex()==0)
          {
          try {
              String s="SELECT  `username`, `password` FROM `rmc_chemical_ltd`.`user_accounts` WHERE `username`='"+user.getText()+"' AND `password`='"+password.getText()+"' AND `status`='"+jComboBox1.getSelectedItem()+"'";
              contest();
              st=ct.prepareCall(s);
              rs=st.executeQuery(s);
              if(rs.next()){
               demo hp=new demo((String) jComboBox1.getSelectedItem());          hp.setVisible(true);
                  dispose();
                  
              }else{
              JOptionPane.showMessageDialog(rootPane, "User Or PassWord Is  Wrong....");
              
              
              }   } catch (SQLException ex) {
              Logger.getLogger(LogingPage.class.getName()).log(Level.SEVERE, null, ex);
          } 
          }else{
           try {
              String s="SELECT  `username`, `password` FROM `rmc_chemical_ltd`.`user_accounts` WHERE `username`='"+user.getText()+"' AND `password`='"+password.getText()+"' AND `status`='"+jComboBox1.getSelectedItem()+"'";
              contest();
              st=ct.prepareCall(s);
              rs=st.executeQuery(s);
              if(rs.next()){
               demo hp=new demo((String) jComboBox1.getSelectedItem());      hp.setVisible(true);
                  dispose();
                  
              }else{
              JOptionPane.showMessageDialog(rootPane, "User Or PassWord Is  Wrong....");
              
              
              }   } catch (SQLException ex) {
              Logger.getLogger(LogingPage.class.getName()).log(Level.SEVERE, null, ex);
          } 
          }   
      }
         
        
        }
    }//GEN-LAST:event_passwordKeyPressed

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LogingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogingPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
