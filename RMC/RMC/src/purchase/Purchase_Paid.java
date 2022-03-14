 
package purchase;
 
 
import Main_PAck.connection_class;   
import Main_PAck.demo;
import Main_PAck.demo_user1;
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
 
 

public class Purchase_Paid extends javax.swing.JFrame {
   connection_class con;
      String st="";
      static int vou=1;
    static String h;
    public Purchase_Paid(String string) {
        initComponents();
        con=new connection_class();
        show_date();
        old_data_show_table();
        bank_show();
        Bank_Name_Show();
        show_Supplier();
        h=string;
    }

    private Purchase_Paid() {
  initComponents();   show_date();}
    
    
    
    void show_Supplier(){
       try {
           company_combo.removeAllItems();
           company_combo.addItem("Select");
           String s="SELECT `name` FROM `rmc_chemical_ltd`.`Suplier_information`";
           con.st = con.ct.prepareCall(s);
           con.rs = con.st.executeQuery(s);
           while (con.rs.next()) {
           company_combo.addItem(""+con.rs.getString(1));
           
           }
       } catch (SQLException ex) {
           Logger.getLogger(Purchase_Paid.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
 void Account_Number_Show(){
       try {
           account_combo.removeAllItems();
           account_combo.addItem("Select");
           con.contest();
           String select="SELECT  `account_number` FROM `rmc_chemical_ltd`.`bank_name` WHERE `bank_name`='"+bank_combo.getSelectedItem()+"'";
           con.st = con.ct.prepareCall(select);
           con.rs = con.st.executeQuery(select);
           while (con.rs.next()) {
             account_combo.addItem(""+con.rs.getString(1));
           
           }
       } catch (SQLException ex) {
           Logger.getLogger(Purchase_Paid.class.getName()).log(Level.SEVERE, null, ex);
       }
     
     
    
    } 
void Bank_Name_Show(){
       try {
           bank_combo.removeAllItems();
           bank_combo.addItem("Select");
           con.contest();
           String select="SELECT  `bank_name` FROM `rmc_chemical_ltd`.`bank_name` group by `bank_name`";
           con.st = con.ct.prepareCall(select);
           con.rs = con.st.executeQuery(select);
           while (con.rs.next()) {
             bank_combo.addItem(""+con.rs.getString(1));
           
           }
       } catch (SQLException ex) {
           Logger.getLogger(Purchase_Paid.class.getName()).log(Level.SEVERE, null, ex);
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
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();
        bank_combo = new javax.swing.JComboBox<>();
        banka_lebel = new javax.swing.JLabel();
        bank_lebel = new javax.swing.JLabel();
        account_combo = new javax.swing.JComboBox<>();
        Name_txt = new javax.swing.JTextField();
        bkash_txt = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        company_combo = new javax.swing.JComboBox<>();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        date_lab = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
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
        jLabel4.setBounds(290, 80, 160, 20);

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(290, 100, 200, 30);

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
        jRadioButton1.setBounds(510, 100, 80, 31);

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
        jRadioButton2.setBounds(590, 100, 93, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("*Purchase Due Paid");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(10, 0, 280, 40);

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
        jRadioButton3.setBounds(680, 100, 80, 31);

        bank_combo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bank_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        bank_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bank_comboActionPerformed(evt);
            }
        });
        jPanel1.add(bank_combo);
        bank_combo.setBounds(790, 100, 270, 30);

        banka_lebel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        banka_lebel.setText("Bank Name :");
        jPanel1.add(banka_lebel);
        banka_lebel.setBounds(790, 80, 260, 20);

        bank_lebel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bank_lebel.setText("Account Number :");
        jPanel1.add(bank_lebel);
        bank_lebel.setBounds(1060, 80, 270, 20);

        account_combo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        account_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        account_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                account_comboActionPerformed(evt);
            }
        });
        jPanel1.add(account_combo);
        account_combo.setBounds(1060, 100, 270, 30);

        Name_txt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(Name_txt);
        Name_txt.setBounds(790, 100, 270, 30);

        bkash_txt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(bkash_txt);
        bkash_txt.setBounds(1060, 100, 270, 30);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Company  Name  :");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(40, 80, 170, 20);

        company_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                company_comboActionPerformed(evt);
            }
        });
        jPanel1.add(company_combo);
        company_combo.setBounds(40, 100, 240, 30);

        jDateChooser1.setDateFormatString("yyyy-MM-dd");
        jDateChooser1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jDateChooser1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser1PropertyChange(evt);
            }
        });
        jPanel1.add(jDateChooser1);
        jDateChooser1.setBounds(1190, 40, 170, 30);

        date_lab.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        date_lab.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(date_lab);
        date_lab.setBounds(1190, 40, 170, 30);

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


void bank_hide(){
bank_lebel.setVisible(false);
banka_lebel.setVisible(false);
bank_combo.setVisible(false);
account_combo.setVisible(false);

}
    
  void old_data_show_table(){
       try {
           double d=0;
           DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
           dt.setRowCount(0);
           String s=" SELECT `date`,`bill`,`event`,`amount`,`dis`,`total_amount`,`final_amount`,`paid`FROM `rmc_chemical_ltd`.`purchase_account` WHERE `Company_Name`='"+company_combo.getSelectedItem()+"'";
           con.contest();
           con.st = con.ct.prepareCall(s);
           con.rs = con.st.executeQuery(s);
           while(con.rs.next()){
               
               d=Double.parseDouble(con.rs.getString(7))-Double.parseDouble(con.rs.getString(8));
                d=Math.round(d*100.0)/100.0;
             dt.addRow(new Object[]{con.rs.getDate(1),con.rs.getString(2),con.rs.getString(3),con.rs.getString(4),con.rs.getString(5),con.rs.getString(6),con.rs.getString(7),con.rs.getString(8),d});
          
             
           }O_due.setText(""+d);
       } catch (SQLException ex) {
           Logger.getLogger(Purchase_Paid.class.getName()).log(Level.SEVERE, null, ex);
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

        bank_hide();

    }//GEN-LAST:event_jRadioButton1MouseClicked

    private void jRadioButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton2MouseClicked
        bank_show();
    }//GEN-LAST:event_jRadioButton2MouseClicked
int auth_test(){
    int i=0;
if(jTextField1.getText().isEmpty()){
JOptionPane.showMessageDialog(this, "Voucher No Is Empty.....");
jTextField1.requestFocus();
}else if(company_combo.getSelectedIndex()<=0){
JOptionPane.showMessageDialog(this, "Company Name Is Empty.....");
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
                
                
            
                String comany=company_combo.getSelectedItem().toString();
                String voucer=jTextField1.getText();
                SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
                String date1 = sd.format(jDateChooser1.getDate());
                String amount="0";
                String dis="0";
                String t_amount="0";
                String final_amount=O_due.getText();
                String paid_am=paid.getText();
                
                String s="INSERT INTO `rmc_chemical_ltd`.`purchase_account` (`bill`,`date`, `amount`, `dis`, `total_amount`,`final_amount`,`paid`,`event`,`Company_Name`)VALUES ('"+voucer+"','"+date1+"','"+amount+"','"+dis+"','"+t_amount+"','"+final_amount+"','"+paid_am+"','"+st+"','"+comany+"')";
                con.contest();
                
                int result = con.st.executeUpdate(s);
                if (result > 0) {
                    Cash_or_BAnk_ENtry();
                    
                    
                }  
            
            
            
            
            
            
            
            
            
            
            
            } catch (SQLException ex) {
                Logger.getLogger(Purchase_Paid.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
        
        
        
        }
    }//GEN-LAST:event_paidKeyPressed

    private void jRadioButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton3MouseClicked
        bank_show();       // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3MouseClicked

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        bank_show();       // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
bank_show();        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void bank_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bank_comboActionPerformed
        Account_Number_Show();
    }//GEN-LAST:event_bank_comboActionPerformed

    private void account_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_account_comboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_account_comboActionPerformed
void bank_show(){
   
              
               if(jRadioButton1.isSelected()){ 
             
                bank_lebel.setVisible(false);
                banka_lebel.setVisible(false);
                bank_combo.setVisible(false);
                account_combo.setVisible(false);
                Name_txt.setVisible(false);
                bkash_txt.setVisible(false); 
               }else if(jRadioButton2.isSelected()){
                banka_lebel.setText("Bank Name :");
                bank_lebel.setText("Account Number :");
                bank_lebel.setVisible(true);
                banka_lebel.setVisible(true);
                bank_combo.setVisible(true);
                account_combo.setVisible(true);
                Name_txt.setVisible(false);
                bkash_txt.setVisible(false); 
               }else if(jRadioButton3.isSelected()){
                banka_lebel.setText("User Name :");
                bank_lebel.setText("Bkash Number :");
                bank_lebel.setVisible(true);
                banka_lebel.setVisible(true);
                bank_combo.setVisible(false);
                account_combo.setVisible(false);
                Name_txt.setVisible(true);
                bkash_txt.setVisible(true);  
               }else{
             
                bank_lebel.setVisible(false);
                banka_lebel.setVisible(false);
                bank_combo.setVisible(false);
                account_combo.setVisible(false);
                Name_txt.setVisible(false);
                bkash_txt.setVisible(false); 
               }
               
               
      
}  
    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
bank_show();        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void company_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_company_comboActionPerformed
       vou=1; old_data_show_table();        // TODO add your handling code here:
    }//GEN-LAST:event_company_comboActionPerformed

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
               if (company_combo.getSelectedIndex()<=0) {
            JOptionPane.showMessageDialog(this,"Please Select Company Name......");
          jTextField1.setText("");
            company_combo.requestFocus();
        }else if(jTextField1.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Pleae ENter Bill No......");  
            jTextField1.requestFocus();
        
        }else{
            try {
                String s=" SELECT`bill`,`Company_Name` FROM `rmc_chemical_ltd`.`purchase_account` WHERE `bill`='"+jTextField1.getText()+"'AND`Company_Name`='"+company_combo.getSelectedItem()+"'";
                con.st = con.ct.prepareCall(s);
                con.rs = con.st.executeQuery(s);
                if(con.rs.next()) { 
                
               JOptionPane.showMessageDialog(this,"The same Bill no cannot be added to the same company name...... ");
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
               
     String details="Purchase - "+jTextField1.getText()+" - Purchase Due Collection"+" - "+company_combo.getSelectedItem(); 
     String ammount=paid.getText();
        String name=Name_txt.getText();
           String number=bkash_txt.getText();
     SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd"); 
     String date1 = sd.format(jDateChooser1.getDate());
     String bname=bank_combo.getSelectedItem().toString();
     String account=account_combo.getSelectedItem().toString();
     
     if(status.equals("Cash")){
         
             String ss=" INSERT INTO `rmc_chemical_ltd`.`cash`(`date`,`amount`,`status`,`details`)VALUES ('"+date1+"','"+ammount+"','Debit','"+details+"')";
             con.contest();
             
             int result = con.st.executeUpdate(ss);
             if (result > 0) { 
             
                 clear();
             
             }else{
             JOptionPane.showMessageDialog(this, "Something was wrong in Cash");
             
             }
         
     
     }else if(status.equals("Check")){
         
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
                   
           clear();      }else{
             JOptionPane.showMessageDialog(this, "Something was wrong in Bank");
             
             
             }
         }
     
     }else if(status.equals("Bkash")){
         
         if(Name_txt.getText().isEmpty()){
         JOptionPane.showMessageDialog(this, "Please Enter User Name....");
         bank_combo.requestFocus();
         }else if(bkash_txt.getText().isEmpty()){
         JOptionPane.showMessageDialog(this, "Please Enter Bkash Number ...");
         account_combo.requestFocus();
         }else{
       String s="INSERT INTO `rmc_chemical_ltd`.`bkash`(`name`,`mobile`,`details`,`status`,`amount`,`date`)VALUES ('"+name+"','"+number+"','"+details+"','Debit','"+ammount+"','"+date1+"')";
                 int result = con.st.executeUpdate(s);
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
         jTextField1.setText("");
        buttonGroup1.clearSelection();
        bank_show();
        Name_txt.setText("");
        bkash_txt.setText("");
        O_due.setText("");
        paid.setText("");
        due.setText("");
        old_data_show_table();
        
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
            java.util.logging.Logger.getLogger(Purchase_Paid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Purchase_Paid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Purchase_Paid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Purchase_Paid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Purchase_Paid().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Name_txt;
    private javax.swing.JTextField O_due;
    private javax.swing.JComboBox<String> account_combo;
    private javax.swing.JComboBox<String> bank_combo;
    private javax.swing.JLabel bank_lebel;
    private javax.swing.JLabel banka_lebel;
    private javax.swing.JTextField bkash_txt;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> company_combo;
    private javax.swing.JLabel date_lab;
    private javax.swing.JTextField due;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JTextField paid;
    // End of variables declaration//GEN-END:variables

}
