 
package cash;
 
import Main_PAck.connection_class; 
import Main_PAck.demo;
import Main_PAck.demo_user1;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel; 
 

public class Bank_Data extends javax.swing.JFrame {
    connection_class con;
    String  e="";
    static String h;
    public Bank_Data(String string) {
        initComponents();
        con=new connection_class();
        show_date(); 
        Data_Show_All();
        show_orNot();
        h=string;
    }

    private Bank_Data() {
   initComponents(); }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bank_name_txt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        account_number_txt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        account_combo = new javax.swing.JComboBox<>();
        bank_combo = new javax.swing.JComboBox<>();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        deatils_txt = new javax.swing.JTextField();
        ammount_txt = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        Catgory_combo = new javax.swing.JComboBox<>();
        previus_amount = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bank Name :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(250, 80, 190, 20);

        bank_name_txt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(bank_name_txt);
        bank_name_txt.setBounds(250, 100, 190, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Account Number :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(250, 130, 190, 20);

        account_number_txt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(account_number_txt);
        account_number_txt.setBounds(250, 150, 190, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(280, 200, 130, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Bank Name :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(530, 80, 80, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Account Number :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(530, 130, 190, 20);

        account_combo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        account_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        jPanel1.add(account_combo);
        account_combo.setBounds(530, 150, 190, 30);

        bank_combo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bank_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        bank_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bank_comboActionPerformed(evt);
            }
        });
        jPanel1.add(bank_combo);
        bank_combo.setBounds(530, 100, 190, 30);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioButton1.setText("Credit");
        jPanel1.add(jRadioButton1);
        jRadioButton1.setBounds(590, 200, 70, 23);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioButton2.setText("Debit");
        jPanel1.add(jRadioButton2);
        jRadioButton2.setBounds(660, 200, 70, 23);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Details :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(730, 80, 80, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Ammount :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(730, 130, 190, 20);

        deatils_txt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(deatils_txt);
        deatils_txt.setBounds(730, 100, 280, 30);

        ammount_txt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(ammount_txt);
        ammount_txt.setBounds(730, 150, 280, 30);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("Submit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(740, 200, 180, 30);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Catagory", "Bank Name", "Account Number", "Event", "Details", "Amount"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 260, 1330, 320);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("*Bank Data");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(10, 0, 210, 40);

        jDateChooser1.setDateFormatString("yyyy-MM-dd");
        jPanel1.add(jDateChooser1);
        jDateChooser1.setBounds(1190, 50, 170, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Catagory");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(50, 80, 80, 20);

        Catgory_combo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Catgory_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "My Bank", "Supplier Bank", "Customer Bank", "Personal Bank" }));
        Catgory_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Catgory_comboActionPerformed(evt);
            }
        });
        jPanel1.add(Catgory_combo);
        Catgory_combo.setBounds(50, 100, 190, 30);

        previus_amount.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(previus_amount);
        previus_amount.setBounds(50, 150, 190, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Previous Amount :");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(50, 130, 190, 20);

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

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/close (1).png"))); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel11);
        jLabel11.setBounds(1320, 0, 40, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1370, 730);
        setJMenuBar(menuBar);

        setSize(new java.awt.Dimension(1368, 733));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void show_date() {
        Date dt = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
  ((JTextField) jDateChooser1.getDateEditor().getUiComponent()).setText(""+df.format(dt));
 }
    int check_Text1(){
        int i=0;
        if(Catgory_combo.getSelectedIndex()<=0){
        JOptionPane.showMessageDialog(this, "Ctagory Is Empty");
        bank_name_txt.requestFocus();
    }else if(bank_name_txt.getText().isEmpty()){
        JOptionPane.showMessageDialog(this, "Bank NAme Is Empty");
        bank_name_txt.requestFocus();
    }else  if(account_number_txt.getText().isEmpty()){
        JOptionPane.showMessageDialog(this, "Account Number Is Empty");
        account_number_txt.requestFocus();
    }else{
    i=1; 
    } 
        
    return i;}
    
    
       int check_Text2(){
        int i=0;
        
        e="";
        if(jRadioButton1.isSelected()){
        e="Credit";
        }else if(jRadioButton2.isSelected()){
        e="Debit";
        }else{
        e="";}
        
    if(bank_combo.getSelectedIndex()<=0){
        JOptionPane.showMessageDialog(this, "Please Select Bank Name");
        bank_combo.requestFocus();
    }else  if(account_combo.getSelectedIndex()<=0){
        JOptionPane.showMessageDialog(this, "Please Select Account Number");
        account_combo.requestFocus();
    }else if(deatils_txt.getText().isEmpty()) {
     JOptionPane.showMessageDialog(this, "Detailse Is Empty");
        deatils_txt.requestFocus(); 
    } 
    else if(e.equals("")) {
     JOptionPane.showMessageDialog(this, "Please select Credit or Debit");
       } 
    else{
    i=1; 
    }
     
    return i;}
    
    void Clear_All_DAta(){ 
        
       
        previus_amount.setText("");
        Catgory_combo.setSelectedIndex(0);
        bank_name_txt.setText("");
        account_number_txt.setText("");
        bank_combo.removeAllItems();
        account_combo.removeAllItems();
        deatils_txt.setText("");
        ammount_txt.setText("");
        buttonGroup1.clearSelection(); 
        DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
        dt.setRowCount(0);
        show_date();
        Data_Show_All();
        Bank_Name_Show();
         
    }
    
    void Bank_Name_Show(){
       try {
           
           bank_combo.removeAllItems();
           bank_combo.addItem("Select");
           con.contest();
           String select="SELECT  `bank_name` FROM `rmc_chemical_ltd`.`bank_name` WHERE `catagory`='"+Catgory_combo.getSelectedItem()+"' group by `bank_name` ";
           con.st = con.ct.prepareCall(select);
           con.rs = con.st.executeQuery(select);
           while (con.rs.next()) {
             bank_combo.addItem(""+con.rs.getString(1));
           
           }
       } catch (SQLException ex) {
           Logger.getLogger(Bank_Data.class.getName()).log(Level.SEVERE, null, ex);
       }
     
     
    
    }
    
    void Account_Number_Show(){
       try {
           account_combo.removeAllItems();
           account_combo.addItem("Select");
           con.contest();
           String select="SELECT  `account_number` FROM `rmc_chemical_ltd`.`bank_name` WHERE `bank_name`='"+bank_combo.getSelectedItem()+"' AND `catagory`='"+Catgory_combo.getSelectedItem()+"'";
           con.st = con.ct.prepareCall(select);
           con.rs = con.st.executeQuery(select);
           while (con.rs.next()) {
             account_combo.addItem(""+con.rs.getString(1));
           
           }
       } catch (SQLException ex) {
           Logger.getLogger(Bank_Data.class.getName()).log(Level.SEVERE, null, ex);
       }
     
     
    
    }
    
    void Data_Show_All(){
       try {
           DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
           dt.setRowCount(0);
           con.contest();
           String select="SELECT `date`, `bank_name`,  `bank_account`,`status`,`details`,`amount`,`catagory` FROM `rmc_chemical_ltd`.`bank_data`";
           con.st = con.ct.prepareCall(select);
           con.rs = con.st.executeQuery(select);
           while (con.rs.next()) {
               
               dt.addRow(new Object[]{con.rs.getDate(1),con.rs.getString(7),con.rs.getString(2),con.rs.getString(3),con.rs.getString(4),con.rs.getString(5),con.rs.getString(6)});
           }
       } catch (SQLException ex) {
           Logger.getLogger(Bank_Data.class.getName()).log(Level.SEVERE, null, ex);
       }
     
     
    
    }
    
    
    void Add_Bank_Name(){
    if(check_Text1()==1){
        try {
            String bn=bank_name_txt.getText().toString();
            String acc=account_number_txt.getText().toString();
            String cata=Catgory_combo.getSelectedItem().toString();
            SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
            String date1 = sd.format(jDateChooser1.getDate());
            String insert=" INSERT INTO `rmc_chemical_ltd`.`bank_name` (`bank_name`,`account_number`, `date`,`catagory`)VALUES ('"+bn+"',  '"+acc+"', '"+date1+"','"+cata+"')";
            con.contest();
            
            int result = con.st.executeUpdate(insert);
            if (result > 0) {
                       
         
              if(Catgory_combo.getSelectedIndex()==1 || Catgory_combo.getSelectedIndex()==4 ){ 
                if(previus_amount.getText().isEmpty()){
                        JOptionPane.showMessageDialog(this,"Previous Amount Is EMpty........");

                }else{
                  String insert2="INSERT INTO `rmc_chemical_ltd`.`bank_data` (`date`,`bank_name`,`bank_account`,`status`,`details`,`amount`,`catagory`) VALUES ('"+date1+"','"+bn+"','"+acc+"', 'Credit','Previous Amount','"+previus_amount.getText()+"','"+Catgory_combo.getSelectedItem()+"')";
            con.contest(); 
            int result2 = con.st.executeUpdate(insert2);
                      if (result2> 0) { 
                JOptionPane.showMessageDialog(this, "Submission Successful..fhfg!!!");
             Clear_All_DAta();
                      
                      }  
                      }}else{
              
              
                     JOptionPane.showMessageDialog(this, "Submission Successful..!!!");
             Clear_All_DAta();}
              
          
            }
        } catch (SQLException ex) {
            Logger.getLogger(Bank_Data.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    
    
    }
    
    
    }
    
      void Add_Bank_Ammount(){
    if(check_Text2()==1){
        try {
            String bn=bank_combo.getSelectedItem().toString();
            String acc=account_combo.getSelectedItem().toString();
            String detai=deatils_txt.getText().toString();
            String ammount =ammount_txt.getText().toString();
             
            SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
            String date1 = sd.format(jDateChooser1.getDate());
            
            
            if(e.equals("Credit")){ 
            e="Debit";
            }else if(e.equals("Debit")){ 
            e="Credit";
            }
            String insert="INSERT INTO `rmc_chemical_ltd`.`bank_data` (`date`,`bank_name`,`bank_account`,`status`,`details`,`amount`,`catagory`) VALUES ('"+date1+"','"+bn+"','"+acc+"', '"+e+"','"+detai+"','"+ammount+"','"+Catgory_combo.getSelectedItem()+"')";
            con.contest(); 
            int result = con.st.executeUpdate(insert);
            if (result > 0) {
                Submit_Data();
          Clear_All_DAta();
          
            }
        } catch (SQLException ex) {
            Logger.getLogger(Bank_Data.class.getName()).log(Level.SEVERE, null, ex);
        } 
    
    }
    
    
    }
 void Submit_Data(){
   
        try { 
           if(e.equals("Credit")){ 
            e="Debit";
            }else if(e.equals("Debit")){ 
            e="Credit";
            }
            String ammount=ammount_txt.getText().toString();
            String details="Bank | "+Catgory_combo.getSelectedItem()+" | "+bank_combo.getSelectedItem()+" | "+account_combo.getSelectedItem().toString()+" | "+deatils_txt.getText();
            SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
            String date1 = sd.format(jDateChooser1.getDate());
            String insert="INSERT INTO `rmc_chemical_ltd`.`cash`(`date`,`amount`,`status`,`details`)VALUES ('"+date1+"','"+ammount+"','"+e+"','"+details+"')";
            
            
            con.contest();
            int result = con.st.executeUpdate(insert);
            if (result > 0) {
            JOptionPane.showMessageDialog(this, "Submission Successful..!!!");
               
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Cash_Ammount.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Add_Bank_Name();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void bank_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bank_comboActionPerformed
        Account_Number_Show();
    }//GEN-LAST:event_bank_comboActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
Add_Bank_Ammount();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void Catgory_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Catgory_comboActionPerformed
        Bank_Name_Show();
        show_orNot();
    }//GEN-LAST:event_Catgory_comboActionPerformed

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

        this.setExtendedState(Bank_Data.ICONIFIED);
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel11MouseClicked
 void show_orNot(){
 
  if(Catgory_combo.getSelectedIndex()==1 || Catgory_combo.getSelectedIndex()==4 ){ 
        jLabel9.setVisible(true);
        previus_amount.setVisible(true);
        }
  else {
       jLabel9.setVisible(false);
        previus_amount.setVisible(false);
 }}
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
            java.util.logging.Logger.getLogger(Bank_Data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bank_Data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bank_Data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bank_Data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bank_Data().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Catgory_combo;
    private javax.swing.JComboBox<String> account_combo;
    private javax.swing.JTextField account_number_txt;
    private javax.swing.JTextField ammount_txt;
    private javax.swing.JComboBox<String> bank_combo;
    private javax.swing.JTextField bank_name_txt;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField deatils_txt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JTextField previus_amount;
    // End of variables declaration//GEN-END:variables

}
