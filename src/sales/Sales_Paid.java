 
package sales;
 
 
import Bill_Show.Demo1111;
import Bill_Show.Demo_Collection;
import Bill_Show.Demo_Pat;
import Main_PAck.connection_class;
import Main_PAck.demo;
import Main_PAck.demo_user1;
import Main_PAck.demo_user_F;
import purchase.*;
  
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
 

public class Sales_Paid extends javax.swing.JFrame {
   connection_class con;
      String st="";
    static String h;
    public Sales_Paid(String string) {
        initComponents();
        con=new connection_class();
        show_date();id_show();
        date_lab.setVisible(false);
        //old_data_show_table();
        bank_show(); 
        show_customer();
        h=string;
        jRadioButton4.setSelected(true);
    }

    private Sales_Paid() {
    initComponents();
        con=new connection_class();
        show_date();id_show();
        date_lab.setVisible(false);
        //old_data_show_table();
        bank_show(); 
        show_customer(); 
        jRadioButton4.setSelected(true);}

    void bank_show(){
   
              
               if(jRadioButton1.isSelected()){ 
             
                bank_lebel.setVisible(false);
                banka_lebel.setVisible(false);
                
                Name_txt.setVisible(false);
                bkash_txt.setVisible(false); 
               }else if(jRadioButton2.isSelected()){
                banka_lebel.setText("Bank Name :");
                bank_lebel.setText("Check Number :");
               
                bank_lebel.setVisible(true);
                banka_lebel.setVisible(true); 
                Name_txt.setVisible(true);
                bkash_txt.setVisible(true); 
               }else if(jRadioButton3.isSelected()){
                banka_lebel.setText("User Name :");
                bank_lebel.setText("Bkash Number :");
                Name_txt.setText("");
                bkash_txt.setText("");
                bank_lebel.setVisible(true);
                banka_lebel.setVisible(true);
               
                Name_txt.setVisible(true);
                bkash_txt.setVisible(true);  
               }else{
             
                bank_lebel.setVisible(false);
                banka_lebel.setVisible(false);
                
                Name_txt.setVisible(false);
                bkash_txt.setVisible(false); 
                
                
               }
               
               
      
}  
    
    
     void id_show(){
     long a=1601;
       try {
           con.contest();
           String s="SELECT  `bill` FROM `rmc_chemical_ltd`.`sales_account`";
           con.st = con.ct.prepareCall(s);
           con.rs = con.st.executeQuery(s);
           while(con.rs.next()){
               a=a+1; 
           }
          jTextField1.setText("CUM01-"+a);
           
       } catch (SQLException ex) {
           Logger.getLogger(Sales.class.getName()).log(Level.SEVERE, null, ex);
       }
     
 }
    void show_customer(){
       try {
           customer_combo.removeAllItems();
           customer_combo.addItem("Select");
           String s="SELECT `name` FROM `rmc_chemical_ltd`.`customer_info`";
           con.st = con.ct.prepareCall(s);
           con.rs = con.st.executeQuery(s);
           while (con.rs.next()) {
           customer_combo.addItem(""+con.rs.getString(1));
           
           }
       } catch (SQLException ex) {
           Logger.getLogger(Sales.class.getName()).log(Level.SEVERE, null, ex);
       }


}
   
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        O_due = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        paid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        due = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        bank_lebel = new javax.swing.JLabel();
        banka_lebel = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        customer_combo = new javax.swing.JComboBox<>();
        jRadioButton3 = new javax.swing.JRadioButton();
        bkash_txt = new javax.swing.JTextField();
        Name_txt = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        date_lab = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jRadioButton4 = new javax.swing.JRadioButton();
        menuBar = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Bill No", "Event", "Amount", "Discount", "Total", "Final Amount", "Paid", "Due"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(40, 140, 1300, 360);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Old Due :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(1070, 500, 60, 30);

        O_due.setEditable(false);
        O_due.setBackground(new java.awt.Color(255, 255, 255));
        O_due.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        O_due.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel1.add(O_due);
        O_due.setBounds(1130, 500, 210, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Paid       :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(1070, 530, 60, 30);

        paid.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        paid.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        paid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                paidKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                paidKeyReleased(evt);
            }
        });
        jPanel1.add(paid);
        paid.setBounds(1130, 530, 210, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Due       :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(1070, 560, 60, 30);

        due.setEditable(false);
        due.setBackground(new java.awt.Color(255, 255, 255));
        due.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        due.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        due.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dueActionPerformed(evt);
            }
        });
        jPanel1.add(due);
        due.setBounds(1130, 560, 210, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("*Voucher No :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 70, 130, 20);

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField1.setText("CUM01-1601");
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(40, 90, 170, 40);

        bank_lebel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bank_lebel.setText("Check No  :");
        jPanel1.add(bank_lebel);
        bank_lebel.setBounds(790, 80, 190, 20);

        banka_lebel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        banka_lebel.setText("Bank Name :");
        jPanel1.add(banka_lebel);
        banka_lebel.setBounds(510, 80, 260, 20);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jRadioButton1.setText("Cash");
        jRadioButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton1MouseClicked(evt);
            }
        });
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton1);
        jRadioButton1.setBounds(240, 90, 80, 31);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jRadioButton2.setText("Check");
        jRadioButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton2MouseClicked(evt);
            }
        });
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton2);
        jRadioButton2.setBounds(320, 90, 93, 30);

        customer_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customer_comboActionPerformed(evt);
            }
        });
        jPanel1.add(customer_combo);
        customer_combo.setBounds(40, 40, 250, 30);

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jRadioButton3.setText("Bkash");
        jRadioButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton3MouseClicked(evt);
            }
        });
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton3);
        jRadioButton3.setBounds(410, 90, 80, 31);

        bkash_txt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(bkash_txt);
        bkash_txt.setBounds(790, 100, 270, 30);

        Name_txt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(Name_txt);
        Name_txt.setBounds(510, 100, 270, 30);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel20.setText("* Sales  Collection");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(10, 0, 300, 40);

        date_lab.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        date_lab.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(date_lab);
        date_lab.setBounds(1190, 50, 160, 30);

        jDateChooser1.setDateFormatString("yyyy-MM-dd");
        jDateChooser1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jDateChooser1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser1PropertyChange(evt);
            }
        });
        jPanel1.add(jDateChooser1);
        jDateChooser1.setBounds(1190, 50, 180, 30);

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

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/iconfinder_1054931_zoom out_minimize_reduce_icon_32px.png"))); // NOI18N
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel14);
        jLabel14.setBounds(1280, 0, 40, 40);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/close (1).png"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel9);
        jLabel9.setBounds(1320, 0, 40, 40);

        jRadioButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioButton4.setText("Default Bill");
        jPanel1.add(jRadioButton4);
        jRadioButton4.setBounds(1070, 100, 85, 23);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1370, 730);
        setJMenuBar(menuBar);

        setSize(new java.awt.Dimension(1368, 735));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
public void show_date() {
        Date dt = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
  ((JTextField) jDateChooser1.getDateEditor().getUiComponent()).setText(""+df.format(dt));
  
 }


 
 void old_data_show_table(){
       try {
           double d=0;
           DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
           dt.setRowCount(0);
           String s=" SELECT `date`,`bill`,`event`,`amount`,`dis`,`total_amount`,`final_amount`,`paid`,`customer`FROM `rmc_chemical_ltd`.`sales_account` WHERE `customer`='"+customer_combo.getSelectedItem()+"'";
           con.contest();
           con.st = con.ct.prepareCall(s);
           con.rs = con.st.executeQuery(s);
           while(con.rs.next()){
               
               d=Double.parseDouble(con.rs.getString(7))-Double.parseDouble(con.rs.getString(8));
                d=Math.round(d*100.0)/100.0;
             dt.addRow(new Object[]{con.rs.getDate(1),con.rs.getString(2),con.rs.getString(3),con.rs.getString(4),con.rs.getString(5),con.rs.getString(6),con.rs.getString(7),con.rs.getString(8),d});
          
             
           }O_due.setText(""+d);
       } catch (SQLException ex) {
           Logger.getLogger(Sales_Paid.class.getName()).log(Level.SEVERE, null, ex);
       }

}
    private void dueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dueActionPerformed

    private void paidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_paidKeyReleased
      if(!O_due.getText().isEmpty() && !paid.getText().isEmpty()) {
      double deu_value=Double.parseDouble(O_due.getText());
      double paid_value=Double.parseDouble(paid.getText());
      deu_value=deu_value-paid_value;
       deu_value=Math.round(deu_value*100.0)/100.0;
       due.setText(""+deu_value);
      }
    }//GEN-LAST:event_paidKeyReleased

    private void jRadioButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton1MouseClicked

       

    }//GEN-LAST:event_jRadioButton1MouseClicked

    private void jRadioButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton2MouseClicked
        bank_show();
    }//GEN-LAST:event_jRadioButton2MouseClicked
int auth_test(){
    int i=0;
if(jTextField1.getText().isEmpty()){
JOptionPane.showMessageDialog(this, "Voucher No Is Empty.....");
jTextField1.requestFocus();
}else if(O_due.getText().isEmpty()){
JOptionPane.showMessageDialog(this, "Old Due Not Found.....");
O_due.requestFocus();
}else if(paid.getText().isEmpty()){
JOptionPane.showMessageDialog(this, "Paid Amount Is Empty.....");
paid.requestFocus();
}else if(due.getText().isEmpty()){
JOptionPane.showMessageDialog(this, "Due Amount Is Empty.....");
due.requestFocus();
}else {
 
if(jRadioButton1.isSelected()){
st="Cash";
}else if(jRadioButton2.isSelected()){
st="Check";
}else if(jRadioButton3.isSelected()){
st="Bkash";
}else{
st="NO";
}
if(st.equals("") || st.equals("NO")){
JOptionPane.showMessageDialog(this, "Please Select Cash Or Check");
}else{
i=1;
}


}


return i;}
    private void paidKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_paidKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
           
        if(auth_test()==1){
            try {
                
                
            
                String voucer=jTextField1.getText();
                String customer=customer_combo.getSelectedItem().toString();
                SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
                String date1 = sd.format(jDateChooser1.getDate());
                String amount="0";
                String dis="0";
                String t_amount="0";
                String final_amount=O_due.getText();
                String paid_am=paid.getText();
               
                String s=" INSERT INTO `rmc_chemical_ltd`.`sales_account`(`bill`,`customer`,`date`,`amount`,`dis`,`total_amount`,`final_amount`,`paid`,`event`,`delivery_place`,`total_ltr`)VALUES ('"+voucer+"','"+customer+"','"+date1+"','"+amount+"','"+dis+"','"+t_amount+"','"+final_amount+"','"+paid_am+"','"+st+"','No','0');";
                con.contest();
                
                int result = con.st.executeUpdate(s);
                if (result > 0) {
                    Cash_or_BAnk_ENtry();
                    
                    
                }  else{
                JOptionPane.showMessageDialog(this, "Something Wrong");
                }
            
            
            
            
            
            
            
            
            
            
            
            } catch (SQLException ex) {
                Logger.getLogger(Sales_Paid.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
        
        
        
        }
    }//GEN-LAST:event_paidKeyPressed

    private void customer_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customer_comboActionPerformed
     old_data_show_table();
    }//GEN-LAST:event_customer_comboActionPerformed

    private void jRadioButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton3MouseClicked
        bank_show();       // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3MouseClicked

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        bank_show();       // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        bank_show();        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed

        bank_show();       

    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
              if(jTextField1.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Pleae ENter Bill No......");  
            jTextField1.requestFocus();
        
        }else{
            try {
                String s=" SELECT  `bill` FROM `rmc_chemical_ltd`.`sales_account`  WHERE `bill` ='"+jTextField1.getText()+"'";
                con.st = con.ct.prepareCall(s);
                con.rs = con.st.executeQuery(s);
                if(con.rs.next()) {  
               JOptionPane.showMessageDialog(this,"The same Bill no cannot be added...... ");
               jTextField1.setText("");
               jTextField1.requestFocus();
                 
                }} catch (SQLException ex) {
                Logger.getLogger(Product_Purchase.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }
    }//GEN-LAST:event_jTextField1FocusLost

    private void jDateChooser1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser1PropertyChange
            if (!((JTextField) jDateChooser1.getDateEditor().getUiComponent()).getText().isEmpty()) {
      DateFormat df = new SimpleDateFormat("yyyy-MM-dd");

        date_lab.setText(""+df.format(jDateChooser1.getDate()));}
    }//GEN-LAST:event_jDateChooser1PropertyChange

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

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked

        this.setExtendedState(Product_Purchase.ICONIFIED);
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel9MouseClicked
  void Cash_or_BAnk_ENtry(){
    try {  String status="";
               if(jRadioButton1.isSelected()){ 
               status="Cash";
               }else if(jRadioButton2.isSelected()){
                   status="Check"; 
               }else if(jRadioButton3.isSelected()){
                   status="Bkash"; 
               }else{
               status="";
               }
               
     String details="Sales - "+jTextField1.getText()+" - Sales Due Collection"+" - "+customer_combo.getSelectedItem(); 
     String ammount=paid.getText();
     String username=Name_txt.getText();
     String bkasnumber=bkash_txt.getText();
     SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd"); 
     String date1 = sd.format(jDateChooser1.getDate()); 
     
     if(status.equals("Cash")){
         
             String ss=" INSERT INTO `rmc_chemical_ltd`.`cash`(`date`,`amount`,`status`,`details`)VALUES ('"+date1+"','"+ammount+"','Credit','"+details+"')";
             con.contest();
             
             int result = con.st.executeUpdate(ss);
             if (result > 0) { 
                              clear();
                  
             
             }else{
             JOptionPane.showMessageDialog(this, "Something was wrong in Cash");
             
             }
         
     
     }else if(status.equals("Check")){
         
           if(Name_txt.getText().isEmpty()){
         JOptionPane.showMessageDialog(this, "Bank Name Is Empty....");
         Name_txt.requestFocus();
         }else if(bkash_txt.getText().isEmpty()){
         JOptionPane.showMessageDialog(this, "Check Number Is Empty");
         bkash_txt.requestFocus();
         }else{ 
    details="Sales - "+jTextField1.getText()+" - Sales Due Collection"+" - "+customer_combo.getSelectedItem()+" - Check - "+Name_txt.getText()+" - "+bkash_txt.getText(); 
    String ss=" INSERT INTO `rmc_chemical_ltd`.`cash`(`date`,`amount`,`status`,`details`)VALUES ('"+date1+"','"+ammount+"','Credit','"+details+"')";
             con.contest();
             
             int result = con.st.executeUpdate(ss);
             if (result > 0) { 
                  clear(); 
             }else{
             JOptionPane.showMessageDialog(this, "Something was wrong in Check");
             
             }
         }
     
     }else if(status.equals("Bkash")){
          if(Name_txt.getText().isEmpty()){
         JOptionPane.showMessageDialog(this, "User Name Is Empty....");
         Name_txt.requestFocus();
         }else if(bkash_txt.getText().isEmpty()){
         JOptionPane.showMessageDialog(this, "Bkash Number Is Empty");
         bkash_txt.requestFocus();
         }else{
             
             details="Sales - "+jTextField1.getText()+" - Sales Due Collection"+" - "+customer_combo.getSelectedItem()+" - Bkash - "+Name_txt.getText()+" - "+bkash_txt.getText(); 
             String ss=" INSERT INTO `rmc_chemical_ltd`.`cash`(`date`,`amount`,`status`,`details`)VALUES ('"+date1+"','"+ammount+"','Credit','"+details+"')";
             con.contest();
             
             int result = con.st.executeUpdate(ss);
             if (result > 0) { 
                  clear(); 
             }else{
             JOptionPane.showMessageDialog(this, "Something was wrong in Bkash");
             
             }
             
       
         }
     }        
       
       
       
    } catch (SQLException ex) {
             Logger.getLogger(Product_Purchase.class.getName()).log(Level.SEVERE, null, ex);
         }   
       
    }
    void clear(){
        
      if(jRadioButton4.isSelected()){
      
       Bill_Show.Demo1111 ob=new Demo1111(jTextField1.getText());
                ob.setVisible(true);}
  else{
       Bill_Show.Demo_Pat ob=new Demo_Pat(jTextField1.getText());
                ob.setVisible(true); 
  }
         jTextField1.setText("");
        buttonGroup1.clearSelection();  
        bank_show();   
        O_due.setText("");
        paid.setText("");
        due.setText("");
        old_data_show_table();id_show();
         JOptionPane.showMessageDialog(this, "Success.....");
    
    
    }
    
    
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
            java.util.logging.Logger.getLogger(Sales_Paid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sales_Paid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sales_Paid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sales_Paid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sales_Paid().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Name_txt;
    private javax.swing.JTextField O_due;
    private javax.swing.JLabel bank_lebel;
    private javax.swing.JLabel banka_lebel;
    private javax.swing.JTextField bkash_txt;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> customer_combo;
    private javax.swing.JLabel date_lab;
    private javax.swing.JTextField due;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JTextField paid;
    // End of variables declaration//GEN-END:variables

     

}
