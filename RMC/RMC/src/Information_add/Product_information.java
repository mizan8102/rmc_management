 
package Information_add;
 
 
import Main_PAck.connection_class;  
import Main_PAck.demo;
import Main_PAck.demo_user1;
import Main_PAck.demo_user_F;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel; 
 

public class Product_information extends javax.swing.JFrame {
   connection_class con;
   static String h;
    public Product_information(String string) {
        initComponents();
        con=new connection_class();
        show_date();
        find_all();
        h=string;
    }

    private Product_information() {
   initComponents(); }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        p_name_txt = new javax.swing.JTextField();
        s_price_txt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        p_price_txt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setLayout(null);

        jDateChooser1.setDateFormatString("yyyy-MM-dd");
        jDateChooser1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(jDateChooser1);
        jDateChooser1.setBounds(1180, 50, 180, 30);

        p_name_txt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        p_name_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p_name_txtMouseClicked(evt);
            }
        });
        jPanel1.add(p_name_txt);
        p_name_txt.setBounds(110, 150, 200, 30);

        s_price_txt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        s_price_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                s_price_txtMouseClicked(evt);
            }
        });
        s_price_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                s_price_txtKeyTyped(evt);
            }
        });
        jPanel1.add(s_price_txt);
        s_price_txt.setBounds(110, 250, 200, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Sales Price");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(110, 230, 170, 20);

        p_price_txt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        p_price_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p_price_txtMouseClicked(evt);
            }
        });
        p_price_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                p_price_txtKeyTyped(evt);
            }
        });
        jPanel1.add(p_price_txt);
        p_price_txt.setBounds(110, 200, 200, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Purchase Price");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(110, 180, 170, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Product Name ");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(110, 130, 170, 20);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SL", "Product Name", "Purchase Price", "Sales Price"
            }
        ));
        jTable1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTable1FocusGained(evt);
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(460, 110, 610, 380);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Product Search");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(470, 70, 110, 30);

        jTextField5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField5FocusGained(evt);
            }
        });
        jTextField5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField5MouseClicked(evt);
            }
        });
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField5KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField5KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField5KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField5);
        jTextField5.setBounds(580, 70, 470, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(130, 320, 130, 40);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("*Product Information");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(10, 0, 280, 40);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/house.png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel10);
        jLabel10.setBounds(1190, 0, 50, 40);

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/printer (1).png"))); // NOI18N
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel12);
        jLabel12.setBounds(1240, 0, 40, 40);

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/iconfinder_1054931_zoom out_minimize_reduce_icon_32px.png"))); // NOI18N
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel13);
        jLabel13.setBounds(1280, 0, 40, 40);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/close (1).png"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel9);
        jLabel9.setBounds(1320, 0, 40, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1370, 750);
        setJMenuBar(menuBar);

        setSize(new java.awt.Dimension(1368, 745));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 public void show_date() {
        Date dt = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
  ((JTextField) jDateChooser1.getDateEditor().getUiComponent()).setText(""+df.format(dt));
 }
    private void p_name_txtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_name_txtMouseClicked
        p_name_txt.setText("");
    }//GEN-LAST:event_p_name_txtMouseClicked

    private void s_price_txtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_s_price_txtMouseClicked
        s_price_txt.setText("");
    }//GEN-LAST:event_s_price_txtMouseClicked

    private void s_price_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_s_price_txtKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE|| c==KeyEvent.VK_SPACE)) {
            evt.consume();
        }
    }//GEN-LAST:event_s_price_txtKeyTyped

    private void p_price_txtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_price_txtMouseClicked
        // TODO add your handling code here:
        p_price_txt.setText("");
    }//GEN-LAST:event_p_price_txtMouseClicked

    private void p_price_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_p_price_txtKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE|| c==KeyEvent.VK_SPACE)) {
            evt.consume();
        }
    }//GEN-LAST:event_p_price_txtKeyTyped

    private void jTable1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTable1FocusGained

    }//GEN-LAST:event_jTable1FocusGained

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        DefaultTableModel dt=(DefaultTableModel) jTable1.getModel();
        p_name_txt.setText(dt.getValueAt(jTable1.getSelectedRow(), 1).toString());
       
        p_price_txt.setText(dt.getValueAt(jTable1.getSelectedRow(), 2).toString());
        s_price_txt.setText(dt.getValueAt(jTable1.getSelectedRow(), 3).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTextField5FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField5FocusGained
        // TODO add your handling code here:
        if(jTextField5.getText().equals("Madecine Search")){

            jTextField5.setText("");
        }
    }//GEN-LAST:event_jTextField5FocusGained

    private void jTextField5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField5MouseClicked
        // TODO add your handling code here:
        if(jTextField5.getText().equals("Madecine Search")){
            jTextField5.setText("");
        }
    }//GEN-LAST:event_jTextField5MouseClicked

     
    void find(){
       try {
             int count=0;
            DefaultTableModel dt=(DefaultTableModel) jTable1.getModel();
               dt.setRowCount(0);
            con.contest();
            String select="SELECT  `p_name`, `p_price`,`s_price` FROM `rmc_chemical_ltd`.`pro_information` where `p_name`LIKE'"+jTextField5.getText()+"%'";
            con.st = con.ct.prepareCall(select);
            con.rs = con.st.executeQuery(select);
            while(con.rs.next()){ 
            count=count+1;
            dt.addRow(new Object[]{count,con.rs.getString(1),con.rs.getString(2),con.rs.getString(3)});
            }
        } catch (SQLException ex) {
            Logger.getLogger(Product_information.class.getName()).log(Level.SEVERE, null, ex);
        }

}
    
    
    
        void find_all(){
        try {
             int count=0;
            DefaultTableModel dt=(DefaultTableModel) jTable1.getModel();
               dt.setRowCount(0);
            con.contest();
            String select="SELECT  `p_name`, `p_price`,`s_price` FROM `rmc_chemical_ltd`.`pro_information`";
            con.st = con.ct.prepareCall(select);
            con.rs = con.st.executeQuery(select);
            while(con.rs.next()){ 
            count=count+1;
            dt.addRow(new Object[]{count,con.rs.getString(1),con.rs.getString(2),con.rs.getString(3)});
            }
        } catch (SQLException ex) {
            Logger.getLogger(Product_information.class.getName()).log(Level.SEVERE, null, ex);
        }

}
    private void jTextField5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            find();
        }

    }//GEN-LAST:event_jTextField5KeyPressed

    private void jTextField5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5KeyTyped
    int auth_test(){
    int r=0;
if(p_name_txt.getText().isEmpty()){
    JOptionPane.showMessageDialog(this, "Product Name is empty....");
    p_name_txt.requestFocus(); 
}else if(p_price_txt.getText().isEmpty()){
    JOptionPane.showMessageDialog(this, "Purchase Price is empty....");
    p_price_txt.requestFocus(); 
}else if(s_price_txt.getText().isEmpty()){
    JOptionPane.showMessageDialog(this, "Sales Price is empty....");
    p_price_txt.requestFocus();  
}else {
    
    
        try {
            con.contest();
            String select=" SELECT `p_name` FROM `pro_information` WHERE `p_name`='"+p_name_txt.getText()+"'";
            con.st = con.ct.prepareCall(select);
            con.rs = con.st.executeQuery(select);
            if(con.rs.next()){ 
                JOptionPane.showMessageDialog(this, "This Product Name already Submitted...\n Please Change Name..");
                p_name_txt.requestFocus();
            }else{
            r=1;
            }
            
           
        } catch (SQLException ex) {
            Logger.getLogger(Product_information.class.getName()).log(Level.SEVERE, null, ex);
        }
}
 
return r;

}

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        if(auth_test()==1){
            try {
                String pname=p_name_txt.getText().toString();
                String pprice=p_price_txt.getText().toString();
                String sprice=s_price_txt.getText().toString();
                SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
                String date1 = sd.format(jDateChooser1.getDate());
                String s="INSERT INTO `rmc_chemical_ltd`.`pro_information` (`p_name`,`p_price`,`s_price`,`date`) VALUES ('"+pname+"', '"+pprice+"', '"+sprice+"', '"+date1+"')";
               con.contest();
                int result = con.st.executeUpdate(s);
                if(result>0){
                    JOptionPane.showMessageDialog(this, "Data Submit Success...."); 
                    p_name_txt.setText("");
                    p_price_txt.setText("");
                    s_price_txt.setText("");
                    p_name_txt.requestFocus();
                    jTextField5.setText("");  
                    find_all();
                }
            } catch (SQLException ex) {
                Logger.getLogger(Product_information.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyReleased
        find();
    }//GEN-LAST:event_jTextField5KeyReleased

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
 if(h.equals("0")){
         demo_user_F ob=new demo_user_F(h);
           ob.setVisible(true);
    dispose();
     }   else{
        
        demo ob=new demo(h);
    ob.setVisible(true);
    dispose();}
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        /*  MessageFormat header=new MessageFormat("Hello");
        MessageFormat footer=new MessageFormat("Hello2");

        try {
            jTable1.print(JTable.PrintMode.NORMAL,header,footer);
        } catch (PrinterException ex) {

            JOptionPane.showMessageDialog(this,"Failde");

        }
        */
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked

        this.setExtendedState(Product_information.ICONIFIED);
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel9MouseClicked
 
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
            java.util.logging.Logger.getLogger(Product_information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Product_information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Product_information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Product_information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Product_information().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JTextField p_name_txt;
    private javax.swing.JTextField p_price_txt;
    private javax.swing.JTextField s_price_txt;
    // End of variables declaration//GEN-END:variables

}
