 
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
 

public class Employe_Salery extends javax.swing.JFrame {
   connection_class con;
   static String h;
    public Employe_Salery(String string) {
        initComponents();
        con=new connection_class();
        show_date();
        Data_SHow_All();
        Employe_name_show();
        h=string;
    }

    private Employe_Salery() {
   initComponents();
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        employe_name = new javax.swing.JComboBox<>();
        position_txt = new javax.swing.JTextField();
        mobile_txt = new javax.swing.JTextField();
        type_combo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        amonut_txt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        detailse_txt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
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
        jDateChooser1.setBounds(1190, 50, 180, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Mobile  :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(200, 80, 140, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Employe Name :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 80, 140, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Position  :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(350, 80, 140, 20);

        employe_name.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        employe_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employe_nameActionPerformed(evt);
            }
        });
        jPanel1.add(employe_name);
        employe_name.setBounds(20, 100, 170, 30);
        jPanel1.add(position_txt);
        position_txt.setBounds(350, 100, 270, 30);
        jPanel1.add(mobile_txt);
        mobile_txt.setBounds(200, 100, 140, 30);

        type_combo.setEditable(true);
        type_combo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        type_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Salary", "Sales Commission", "Working Expenses", "Bonus" }));
        jPanel1.add(type_combo);
        type_combo.setBounds(20, 160, 170, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Catagory :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 140, 140, 20);
        jPanel1.add(amonut_txt);
        amonut_txt.setBounds(200, 160, 140, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Ammount  :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(200, 140, 140, 20);
        jPanel1.add(detailse_txt);
        detailse_txt.setBounds(350, 160, 270, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Month  :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(350, 140, 140, 20);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Submit ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(660, 161, 100, 30);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Employe Name", "Mobile", "Position", "Catagory", "Month", "Ammount"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 202, 1330, 360);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("*Employe Salary");
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
        jPanel1.setBounds(0, 0, 1370, 740);
        setJMenuBar(menuBar);

        setSize(new java.awt.Dimension(1367, 744));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(auth_test()==1){
            try {
                String e_name=employe_name.getSelectedItem().toString();
                String mobile=mobile_txt.getText();
                String details=detailse_txt.getText();
                String position=position_txt.getText();
                String type=type_combo.getSelectedItem().toString();
                String amount=amonut_txt.getText();
                SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
                String date1 = sd.format(jDateChooser1.getDate());

                String in=" INSERT INTO `rmc_chemical_ltd`.`employe_salary` (`name`,`number`,`position`,`type`,`details`,`ammount`,`datee`) VALUES ('"+e_name+"','"+mobile+"','"+position+"','"+type+"','"+details+"','"+amount+"','"+date1+"')";
                con.contest();
                int result = con.st.executeUpdate(in);
                if (result > 0){

                    Cash_or_BAnk_ENtry();
                }
            } catch (SQLException ex) {
                Logger.getLogger(Employe_Salery.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void employe_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employe_nameActionPerformed
        if(employe_name.getSelectedIndex()>0){Employe_details_show();}
    }//GEN-LAST:event_employe_nameActionPerformed

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
 public void show_date() {
        Date dt = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
  ((JTextField) jDateChooser1.getDateEditor().getUiComponent()).setText(""+df.format(dt));
 }int auth_test(){
    int a=0;
    if (employe_name.getSelectedIndex()<=0) {
        JOptionPane.showMessageDialog(this, "Select Employe Name...");
        employe_name.requestFocus();
      }else if (mobile_txt.getText().isEmpty()) { 
           JOptionPane.showMessageDialog(this, "Mobile Number is Empty...");
            mobile_txt.requestFocus();
    }else if (position_txt.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Position  is Empty...");
            position_txt.requestFocus();
      }else if (type_combo.getSelectedIndex()<=0) {
          JOptionPane.showMessageDialog(this, "Select Catagory  ...");
            type_combo.requestFocus();
        
    }else if (amonut_txt.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Amount is Empty...");
            amonut_txt.requestFocus();        
    }else if (detailse_txt.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Detailse is Empty...");
            detailse_txt.requestFocus();
        
    }else{
    a=1;
    
    } 
return a;}  void Cash_or_BAnk_ENtry(){
    try {  /*String status="";
               if(jRadioButton1.isSelected()){ 
               status="Cash";
               }else if(jRadioButton2.isSelected()){
                   status="Check"; 
               }else{
               status="";
               }*/
               
     String details="Employe - "+employe_name.getSelectedItem()+" - "+ type_combo.getSelectedItem()+" - "+detailse_txt.getText(); 
     String ammount=amonut_txt.getText();
     SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd"); 
     String date1 = sd.format(jDateChooser1.getDate());
    // String bname=bank_combo.getSelectedItem().toString();
     //String account=account_combo.getSelectedItem().toString();
     
   //  if(status.equals("Cash")){
         
             String ss=" INSERT INTO `rmc_chemical_ltd`.`cash`(`date`,`amount`,`status`,`details`)VALUES ('"+date1+"','"+ammount+"','Debit','"+details+"')";
             con.contest();
             
             int result = con.st.executeUpdate(ss);
             if (result > 0) { 
             
                   JOptionPane.showMessageDialog(this, "Submission Successful..!!!");
             DataClear();
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
  
   void DataClear(){
    employe_name.setSelectedIndex(0);
    mobile_txt.setText("");
    position_txt.setText("");
    type_combo.setSelectedIndex(0);
    amonut_txt.setText("");
    detailse_txt.setText("");
    show_date();
   // show_id();
    Data_SHow_All();
     
      }
   void Data_SHow_All(){
       try {
           DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
           dt.setRowCount(0);
           String select=" SELECT  `datee`,`name`,`number`,`position`,`type`,`details`,`ammount`FROM `rmc_chemical_ltd`.`employe_salary`";
           con.contest();
           con.st = con.ct.prepareCall(select);
           con.rs = con.st.executeQuery(select);
           while (con.rs.next()) {
               
            dt.addRow(new Object[]{con.rs.getDate(1),con.rs.getString(2),con.rs.getString(3),con.rs.getString(4),con.rs.getString(5),con.rs.getString(6),con.rs.getString(7)});

              }
       } catch (SQLException ex) {
           Logger.getLogger(Cash_Ammount.class.getName()).log(Level.SEVERE, null, ex);
       }
      
     }
  
     void Employe_name_show(){
       try {
           
           employe_name.removeAllItems();
           employe_name.addItem("Select");
           String select=" SELECT `name`  FROM `rmc_chemical_ltd`.`employe` ORDER BY `name` ASC";
           con.contest();
           con.st = con.ct.prepareCall(select);
           con.rs = con.st.executeQuery(select);
           while (con.rs.next()) {
               employe_name.addItem(""+con.rs.getString(1));
        
              }
       } catch (SQLException ex) {
           Logger.getLogger(Cash_Ammount.class.getName()).log(Level.SEVERE, null, ex);
       }
      
     }
     
     
      void Employe_details_show(){
       try {
          
           position_txt.setText(""); 
      mobile_txt.setText("");
           String select=" SELECT`phone`,`position`  FROM `rmc_chemical_ltd`.`employe` WHERE `name`='"+employe_name.getSelectedItem()+"' ";
           con.contest();
           con.st = con.ct.prepareCall(select);
           con.rs = con.st.executeQuery(select);
           while (con.rs.next()) {
               mobile_txt.setText(""+con.rs.getString(1));
             position_txt.setText(""+con.rs.getString(2));
              }
       } catch (SQLException ex) {
           Logger.getLogger(Cash_Ammount.class.getName()).log(Level.SEVERE, null, ex);
       }
      
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
            java.util.logging.Logger.getLogger(Employe_Salery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employe_Salery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employe_Salery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employe_Salery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Employe_Salery().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amonut_txt;
    private javax.swing.JTextField detailse_txt;
    private javax.swing.JComboBox<String> employe_name;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JTextField mobile_txt;
    private javax.swing.JTextField position_txt;
    private javax.swing.JComboBox<String> type_combo;
    // End of variables declaration//GEN-END:variables

}
