 
package Data_Entry;
 
import static Data_Entry.Con_ENg_Comission_Incentive.h;
import Information_add.Con_Eng__Add;
import Information_add.Customer_information_Add;
import Information_add.Employe_Add;
import Information_add.Product_information;
import Information_add.Suplier_information_Add;
import Main_PAck.connection_class; 
import Main_PAck.demo;
import Main_PAck.demo_user1;
import cash.Bank_Data;
import cash.Bkash_Amount;
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
 
 

public class Expenditure extends javax.swing.JFrame {
   connection_class con;
   int id=0;
    public Expenditure(String string) {
        initComponents();
        con=new connection_class();
        show_date();
        Data_SHow_All();
        show_id();
    }

    private Expenditure() {
   initComponents();   }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        details_txt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cost_txt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        asset_name_txt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ammount_txt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
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
        jDateChooser1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser1PropertyChange(evt);
            }
        });
        jPanel1.add(jDateChooser1);
        jDateChooser1.setBounds(1190, 40, 170, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Asset Details :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(220, 80, 140, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Asset Name :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 80, 200, 20);
        jPanel1.add(details_txt);
        details_txt.setBounds(220, 100, 190, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Bying Cost  :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(420, 80, 140, 20);

        cost_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cost_txtActionPerformed(evt);
            }
        });
        jPanel1.add(cost_txt);
        cost_txt.setBounds(420, 100, 190, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(820, 100, 100, 25);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SL", "Date", "Asset Name", "Asset Details", "Buying Cost", "Amount"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 150, 1330, 440);

        asset_name_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asset_name_txtActionPerformed(evt);
            }
        });
        jPanel1.add(asset_name_txt);
        asset_name_txt.setBounds(20, 100, 190, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Amount  :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(620, 80, 140, 20);

        ammount_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ammount_txtActionPerformed(evt);
            }
        });
        jPanel1.add(ammount_txt);
        ammount_txt.setBounds(620, 100, 190, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Total  :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(1080, 590, 50, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText(" ");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel6);
        jLabel6.setBounds(1134, 590, 210, 30);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Show All DATA");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(930, 100, 140, 25);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("*Expenditure Add");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(30, 0, 180, 40);

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

        setSize(new java.awt.Dimension(1368, 734));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 public void show_date() {
        Date dt = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
  ((JTextField) jDateChooser1.getDateEditor().getUiComponent()).setText(""+df.format(dt));
 }
    private void cost_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cost_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cost_txtActionPerformed
   
    int Check_Text(){
        int i=0;
    if(asset_name_txt.getText().isEmpty()){
        JOptionPane.showMessageDialog(this, "Please Select Asset Name");
    asset_name_txt.requestFocus(); 
    }
    else if(details_txt.getText().isEmpty()){
      JOptionPane.showMessageDialog(this, "Asset Details is Empty");
    details_txt.requestFocus();  
    } else if(cost_txt.getText().isEmpty()){
      JOptionPane.showMessageDialog(this, "Buying Cost is Empty");
    cost_txt.requestFocus();  
    } else if(ammount_txt.getText().isEmpty()){
      JOptionPane.showMessageDialog(this, "Amount is Empty");
    ammount_txt.requestFocus();  
    }
    else{
    i=1;
    }
    
   return i; }
    
    void show_id(){
       try {
           id=0;
           
           String select_id=" SELECT `id` FROM `expenditure`";
           con.contest(); 
           con.st = con.ct.prepareCall(select_id);
           con.rs = con.st.executeQuery(select_id);
           while(con.rs.next()) {
           id=con.rs.getInt(1);
           
           }
          
           id=id+1;
           
           
           
       } catch (SQLException ex) {
           Logger.getLogger(Expenditure.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
    
    void Data_SHow_All(){
       try {  jLabel6.setText("");
           double d=0;
           DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
           dt.setRowCount(0);
           String select=" SELECT `id`,`date`, `asset`,`detailse`,`buying_cost`,`amount` FROM `rmc_chemical_ltd`.`expenditure`";
           con.contest();
           con.st = con.ct.prepareCall(select);
           con.rs = con.st.executeQuery(select);
           while (con.rs.next()) {
               
            dt.addRow(new Object[]{ con.rs.getString(1),con.rs.getDate(2),con.rs.getString(3),con.rs.getString(4),con.rs.getString(5),con.rs.getString(6)});

               d=d+Double.parseDouble(con.rs.getString(6));
               
           }
            d=Math.round(d*100.0)/100.0;
           jLabel6.setText(""+d);
       } catch (SQLException ex) {
           Logger.getLogger(Cash_Ammount.class.getName()).log(Level.SEVERE, null, ex);
       }
      
     }
      
    void Data_SHow_today(){
       try {
           double d=0;
            jLabel6.setText("");
              SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd"); 
     String date1 = sd.format(jDateChooser1.getDate());
           DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
           dt.setRowCount(0);
           String select=" SELECT `id`,`date`, `asset`,`detailse`,`buying_cost`,`amount` FROM `rmc_chemical_ltd`.`expenditure` WHERE `date`='"+date1+"'";
           con.contest();
           con.st = con.ct.prepareCall(select);
           con.rs = con.st.executeQuery(select);
           while (con.rs.next()) {
               
            dt.addRow(new Object[]{ con.rs.getString(1),con.rs.getDate(2),con.rs.getString(3),con.rs.getString(4),con.rs.getString(5),con.rs.getString(6)});

               d=d+Double.parseDouble(con.rs.getString(6));
               
           }
            d=Math.round(d*100.0)/100.0;
           jLabel6.setText(""+d);
       } catch (SQLException ex) {
           Logger.getLogger(Cash_Ammount.class.getName()).log(Level.SEVERE, null, ex);
       }
      
     }
    
     void Data_SHow_month(){
       try {
           double d=0;  jLabel6.setText("");
              SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM"); 
     String date1 = sd.format(jDateChooser1.getDate());
           DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
           dt.setRowCount(0);
           String select=" SELECT `id`,`date`, `asset`,`detailse`,`buying_cost`,`amount` FROM `rmc_chemical_ltd`.`expenditure` WHERE `date`LIKE'"+date1+"%'";
           con.contest();
           con.st = con.ct.prepareCall(select);
           con.rs = con.st.executeQuery(select);
           while (con.rs.next()) {
               
            dt.addRow(new Object[]{ con.rs.getString(1),con.rs.getDate(2),con.rs.getString(3),con.rs.getString(4),con.rs.getString(5),con.rs.getString(6)});

               d=d+Double.parseDouble(con.rs.getString(6));
               
           }
            d=Math.round(d*100.0)/100.0;
           jLabel6.setText(""+d);
       } catch (SQLException ex) {
           Logger.getLogger(Cash_Ammount.class.getName()).log(Level.SEVERE, null, ex);
       }
      
     }
    void DataClear(){
    asset_name_txt.setText("");
    details_txt.setText("");
    cost_txt.setText("");
    ammount_txt.setText("");
    show_date();
    show_id();
    Data_SHow_today();
     
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
               
     String details="Expenditure - "+asset_name_txt.getText()+" - "+ details_txt.getText()+" - Buying Cost = "+cost_txt.getText()+" - Ammount ="+ammount_txt.getText(); 
     double ammount=Double.parseDouble(cost_txt.getText())+Double.parseDouble(ammount_txt.getText());
     SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd"); 
     String date1 = sd.format(jDateChooser1.getDate());
    // String bname=bank_combo.getSelectedItem().toString();
     //String account=account_combo.getSelectedItem().toString();
     
   //  if(status.equals("Cash")){
          ammount=Math.round(ammount*100.0)/100.0;
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
             Logger.getLogger(Expenditure.class.getName()).log(Level.SEVERE, null, ex);
         }   
       
    }
    void CostAdd(){
    
    
        
        if(Check_Text()==1){

            try {
                String asset=asset_name_txt.getText(); 
                String detail=details_txt.getText();
                String cost=cost_txt.getText();
                String ammount=ammount_txt.getText();
                SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
                String date1 = sd.format(jDateChooser1.getDate());
                con.contest();
                show_id();
                String insert=" INSERT INTO `rmc_chemical_ltd`.`expenditure` (`id`,`asset`,`detailse`,`buying_cost`,`amount`,`date`)  VALUES ('"+id+"','"+asset+"', '"+detail+"','"+cost+"', '"+ammount+"','"+date1+"')";
                con.contest();
                int result = con.st.executeUpdate(insert);
                if (result > 0) {
                  
                    Cash_or_BAnk_ENtry(); 
                }
            } catch (SQLException ex) {
                Logger.getLogger(Expenditure.class.getName()).log(Level.SEVERE, null, ex);
            }


} 


    
    }
     
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        CostAdd();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void asset_name_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asset_name_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_asset_name_txtActionPerformed

    private void ammount_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ammount_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ammount_txtActionPerformed

    private void jDateChooser1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser1PropertyChange
   if (!((JTextField) jDateChooser1.getDateEditor().getUiComponent()).getText().isEmpty()) {
            
       Data_SHow_month();}
    }//GEN-LAST:event_jDateChooser1PropertyChange

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Data_SHow_All();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        demo ob=new demo(h);
        ob.setVisible(true);
        dispose();
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
            java.util.logging.Logger.getLogger(Expenditure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Expenditure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Expenditure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Expenditure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Expenditure().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ammount_txt;
    private javax.swing.JTextField asset_name_txt;
    private javax.swing.JTextField cost_txt;
    private javax.swing.JTextField details_txt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}
