 
package Data_Entry;
 
import static Data_Entry.Con_ENg_Comission_Incentive.h;
import Main_PAck.connection_class;
import Main_PAck.demo; 
import Main_PAck.demo_user1;
import Main_PAck.demo_user_F;
 import cash.Cash_Ammount;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;  

public final class Cost_Add extends javax.swing.JFrame {
   connection_class con;
   int id=0;
   static String h;
    public Cost_Add(String string) {
        initComponents();
        con=new connection_class();
        jComboBox1.setEditable(true);
        show_date();
        Data_SHow_All();
        show_id();
        h=string;
    }

    private Cost_Add() {
        initComponents();   //To change body of generated methods, choose Tools | Templates.
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        details_txt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ammount_txt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
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

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Expenses  Details :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(220, 40, 130, 20);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Transport", "Lever", "Guest", "Electricity Bill", "Other's" }));
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(30, 60, 180, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Expenses Catagory :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 40, 180, 20);

        details_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                details_txtActionPerformed(evt);
            }
        });
        details_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                details_txtKeyReleased(evt);
            }
        });
        jPanel1.add(details_txt);
        details_txt.setBounds(220, 60, 190, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Amount :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(420, 40, 120, 20);

        ammount_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ammount_txtActionPerformed(evt);
            }
        });
        jPanel1.add(ammount_txt);
        ammount_txt.setBounds(420, 60, 190, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(770, 60, 100, 25);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SL", "Date", "Expenses Catagory", "Expenses Details", "Ammount"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 100, 1330, 490);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("*Other's Cost");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(10, 0, 210, 40);

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
        jPanel1.setBounds(0, 0, 1370, 730);
        setJMenuBar(menuBar);

        setSize(new java.awt.Dimension(1368, 731));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 public void show_date() {
        Date dt = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
  ((JTextField) jDateChooser1.getDateEditor().getUiComponent()).setText(""+df.format(dt));
 }
    private void ammount_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ammount_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ammount_txtActionPerformed
   
    int Check_Text(){
        int i=0;
    if(jComboBox1.getSelectedIndex()<=0){
        JOptionPane.showMessageDialog(this, "Please Select Cost Type");
    jComboBox1.requestFocus(); 
    }
    else if(details_txt.getText().isEmpty()){
      JOptionPane.showMessageDialog(this, "Cost Details is Empty");
    details_txt.requestFocus();  
    } else if(ammount_txt.getText().isEmpty()){
      JOptionPane.showMessageDialog(this, "Ammount is Empty");
    ammount_txt.requestFocus();  
    }
    else{
    i=1;
    }
    
   return i; }
    
    void show_id(){
       try {
           id=0;
           
           String select_id=" SELECT `id` FROM `cost_add`";
           con.contest(); 
           con.st = con.ct.prepareCall(select_id);
           con.rs = con.st.executeQuery(select_id);
           while(con.rs.next()) {
           id=con.rs.getInt(1);
           
           }
          
           id=id+1;
           
           
           
       } catch (SQLException ex) {
           Logger.getLogger(Cost_Add.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
    
    void Data_SHow_All(){
       try {
           DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
           dt.setRowCount(0);
           String select="SELECT  `id`,`date`,`type`,`details`,`amount` FROM `rmc_chemical_ltd`.`cost_add`";
           con.contest();
           con.st = con.ct.prepareCall(select);
           con.rs = con.st.executeQuery(select);
           while (con.rs.next()) {
               
            dt.addRow(new Object[]{con.rs.getString(1),con.rs.getDate(2),con.rs.getString(3),con.rs.getString(4),con.rs.getString(5)});

               
               
           }
       } catch (SQLException ex) {
           Logger.getLogger(Cash_Ammount.class.getName()).log(Level.SEVERE, null, ex);
       }
      
     }
    
    void DataClear(){
    jComboBox1.setSelectedIndex(0);
    details_txt.setText("");
    ammount_txt.setText("");
    show_date();
    show_id();
    Data_SHow_All();
     
      }
     void Cash_or_BAnk_ENtry(){
    try {  /*String status="";
               if(jRadioButton1.isSelected()){ 
               status="Cash";
               }else if(jRadioButton2.isSelected()){
                   status="Check"; 
               }else{
               status="";
               }*/
               
     String details="Cost - "+jComboBox1.getSelectedItem()+" - "+ details_txt.getText(); 
     String ammount=ammount_txt.getText();
     SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd"); 
     String date1 = sd.format(jDateChooser1.getDate());
    // String bname=bank_combo.getSelectedItem().toString();
     //String account=account_combo.getSelectedItem().toString();
     
   //  if(status.equals("Cash")){
         
             String ss=" INSERT INTO `rmc_chemical_ltd`.`cash`(`date`,`amount`,`status`,`details`)VALUES ('"+date1+"','"+ammount+"','Debit','"+details+"')";
             con.contest();
             
             int result = con.st.executeUpdate(ss);
             if (result > 0) { 
             DataClear();
                   JOptionPane.showMessageDialog(this, "Submission Successful..!!!");
             
             }else{
             JOptionPane.showMessageDialog(this, "Something was wrong in Cash");
             
            // }
         
     
    /* }else if(status.equals("Check")){
         
         if(bank_combo.getSelectedIndex()<=0){
         JOptionPane.showMessageDialog(this, "Please Select Bank Name....");
         bank_combo.requestFocus();
         }else if(account_combo.getSelectedIndex()<=0){
         JOptionPane.showMessageDialog(this, "Please Select Account Number ...");
         account_combo.requestFocus();
         }else{
         String s="INSERT INTO `rmc_chemical_ltd`.`bank_data`(`date`,`bank_name`,`bank_account`,`status`,`details`,`amount`)VALUES ('"+date1+"','"+bname+"','"+account+"','Debit','"+details+"','"+ammount+"')";
              int result = con.st.executeUpdate(s);
             if (result > 0) { 
              
                  JOptionPane.showMessageDialog(this, "Success.....");
             }else{
                 clear();
             
             }
         }*/
     
     }
     
     
     
               
               
       
       
       
    } catch (SQLException ex) {
             Logger.getLogger(Cost_Add.class.getName()).log(Level.SEVERE, null, ex);
         }   
       
    }
    void CostAdd(){
    
    
        
        if(Check_Text()==1){

            try {
                String costType=jComboBox1.getSelectedItem().toString();
                String detail=details_txt.getText();
                String ammount=ammount_txt.getText();
                SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
                String date1 = sd.format(jDateChooser1.getDate());
                con.contest();
                show_id();
                String insert=" INSERT INTO `rmc_chemical_ltd`.`cost_add`(`id`, `date`, `type`,`details`,`amount`)VALUES ('"+id+"', '"+date1+"','"+costType+"','"+detail+"','"+ammount+"');";
                con.contest();
                int result = con.st.executeUpdate(insert);
                if (result > 0) {
                  
                    Cash_or_BAnk_ENtry(); 
                }
            } catch (SQLException ex) {
                Logger.getLogger(Cost_Add.class.getName()).log(Level.SEVERE, null, ex);
            }


} 


    
    }
     
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        CostAdd();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void details_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_details_txtActionPerformed
       
    }//GEN-LAST:event_details_txtActionPerformed

    private void details_txtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_details_txtKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_details_txtKeyReleased

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

        this.setExtendedState(Con_ENg_Comission_Incentive.ICONIFIED);

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
            java.util.logging.Logger.getLogger(Cost_Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cost_Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cost_Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cost_Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new Cost_Add().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ammount_txt;
    private javax.swing.JTextField details_txt;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}
