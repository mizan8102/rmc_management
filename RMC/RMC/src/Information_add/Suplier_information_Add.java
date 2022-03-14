 
package Information_add;
 
import Main_PAck.connection_class; 
import Main_PAck.demo;
import Main_PAck.demo_user1;
import Main_PAck.demo_user_F;
 
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel; 

public final class Suplier_information_Add extends javax.swing.JFrame {
  connection_class con;
  static String h;
    public Suplier_information_Add(String string) {
        initComponents(); 
             con=new connection_class();
             show_Id();
             show_date();
             show_Data_ALL();
             show_Data_combo(); 
             sh();
             h=string;
             jCheckBox1.setVisible(false);
jLabel8.setVisible(false);
ammount_txt.setVisible(false);

    }

    private Suplier_information_Add() {
   initComponents(); }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        phone_txt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        address_txt = new javax.swing.JTextField();
        name_txt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        details_txt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        add_button = new javax.swing.JButton();
        edit_button = new javax.swing.JButton();
        clear_button = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        Date_Lav = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        id_l = new javax.swing.JLabel();
        show_button = new javax.swing.JButton();
        delete_button = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        ammount_txt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
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

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Details                 :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(390, 120, 100, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Phone Number   :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(390, 90, 100, 30);

        phone_txt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(phone_txt);
        phone_txt.setBounds(490, 90, 230, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Address                    :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 120, 110, 30);

        address_txt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(address_txt);
        address_txt.setBounds(130, 120, 250, 30);

        name_txt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(name_txt);
        name_txt.setBounds(130, 90, 250, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Company Name     :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 90, 110, 30);

        details_txt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(details_txt);
        details_txt.setBounds(490, 120, 230, 30);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Company Name", "Address", "Phone  Number", "Details", "Date"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 172, 1340, 400);

        add_button.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        add_button.setText("Add");
        add_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(add_button);
        add_button.setBounds(241, 600, 160, 37);

        edit_button.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        edit_button.setText("Edit");
        edit_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(edit_button);
        edit_button.setBounds(400, 600, 160, 37);

        clear_button.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        clear_button.setText("Clear");
        clear_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(clear_button);
        clear_button.setBounds(730, 600, 170, 37);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox2);
        jComboBox2.setBounds(1130, 110, 210, 30);

        Date_Lav.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Date_Lav.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(Date_Lav);
        Date_Lav.setBounds(1160, 40, 200, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("ID");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(20, 50, 60, 30);

        id_l.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        id_l.setText("1");
        jPanel1.add(id_l);
        id_l.setBounds(80, 60, 250, 20);

        show_button.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        show_button.setText("Show");
        show_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(show_button);
        show_button.setBounds(900, 600, 170, 37);

        delete_button.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        delete_button.setText("Delete");
        delete_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(delete_button);
        delete_button.setBounds(560, 600, 170, 37);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("*Suplier Information Add");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(10, 0, 270, 40);

        ammount_txt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(ammount_txt);
        ammount_txt.setBounds(730, 110, 100, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Amount  :");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(730, 90, 100, 20);

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCheckBox1.setText("Previous Amount");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox1);
        jCheckBox1.setBounds(720, 60, 150, 23);

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
        jPanel1.setBounds(0, 0, 1360, 740);
        setJMenuBar(menuBar);

        setSize(new java.awt.Dimension(1359, 764));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

void show_Id(){
      try {
          int id=0;
          String select="SELECT `id`  FROM `rmc_chemical_ltd`.`Suplier_information`";
          con.contest();
          con.st = con.ct.prepareCall(select);
          con.rs = con.st.executeQuery(select);
          while(con.rs.next()){
          id=con.rs.getInt(1); 
           }
         id=id+1;
         id_l.setText(""+id);
           
      } catch (SQLException ex) {
          Logger.getLogger(Suplier_information_Add.class.getName()).log(Level.SEVERE, null, ex);
      }
        
    }
   
void show_Data_ALL(){
      try {
          jComboBox2.setSelectedIndex(0);
        DefaultTableModel dt=(DefaultTableModel) jTable1.getModel();
            dt.setRowCount(0);
          String select="  SELECT`id`,`name`,`address`,`phone`,`details`,`date` FROM `rmc_chemical_ltd`.`Suplier_information`";
          con.contest();
          con.st = con.ct.prepareCall(select);
          con.rs = con.st.executeQuery(select);
          while(con.rs.next()){
            dt.addRow(new Object[]{con.rs.getString(1),con.rs.getString(2),con.rs.getString(3),con.rs.getString(4),con.rs.getString(5),con.rs.getDate(6)});
           
           }
         
           
      } catch (SQLException ex) {
          Logger.getLogger(Suplier_information_Add.class.getName()).log(Level.SEVERE, null, ex);
      }
        
    }
     
void show_Data_One(){
      try {
           if(jComboBox2.getSelectedIndex()>0){
        DefaultTableModel dt=(DefaultTableModel) jTable1.getModel();
            dt.setRowCount(0);
          String select=" SELECT`id`,`name`,`address`,`phone`,`details`,`date` FROM `rmc_chemical_ltd`.`Suplier_information`  where `name`='"+jComboBox2.getSelectedItem()+"'";
          con.contest();
          con.st = con.ct.prepareCall(select);
          con.rs = con.st.executeQuery(select);
          while(con.rs.next()){
            dt.addRow(new Object[]{con.rs.getString(1),con.rs.getString(2),con.rs.getString(3),con.rs.getString(4),con.rs.getString(5),con.rs.getDate(6)});
           
           }
         
           } 
      } catch (SQLException ex) {
          Logger.getLogger(Suplier_information_Add.class.getName()).log(Level.SEVERE, null, ex);
      }
        
    }
     
     void show_Data_combo(){
      try {
         
        jComboBox2.removeAllItems();
        jComboBox2.addItem("Select");
          String select="SELECT `name` FROM `rmc_chemical_ltd`.`Suplier_information` ORDER BY `name` ASC";
          con.contest();
          con.st = con.ct.prepareCall(select);
          con.rs = con.st.executeQuery(select);
          while(con.rs.next()){
            jComboBox2.addItem(""+con.rs.getString(1));
          
         
          }
      } catch (SQLException ex) {
          Logger.getLogger(Suplier_information_Add.class.getName()).log(Level.SEVERE, null, ex);
      }
        
    }
     public void show_date() {
        Date dt = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
  Date_Lav.setText(""+df.format(dt));
 }
     
     void Clear_All_Data(){
        DefaultTableModel dt=(DefaultTableModel) jTable1.getModel();
            dt.setRowCount(0);
            name_txt.setText("");
              address_txt.setText("");
                details_txt.setText("");
                  phone_txt.setText("");
                
                   jComboBox2.setSelectedIndex(0);
                   name_txt.setEditable(true);
                   show_Id();
                   
    }
     
    int CheckEmptyData(){
        int i=0;
        if(name_txt.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Name Is Empty");
            name_txt.requestFocus(); 
        }else if(address_txt.getText().isEmpty()){
        JOptionPane.showMessageDialog(this, "Address Is Empty");
            address_txt.requestFocus();  
        }else if(details_txt.getText().isEmpty()){
        JOptionPane.showMessageDialog(this, "Email  Is Empty");
            details_txt.requestFocus();  
        }else if(phone_txt.getText().isEmpty()){
        JOptionPane.showMessageDialog(this, "Phone Number Is Empty");
            phone_txt.requestFocus();  
        } else{
            i=1;
        }
  return i;  }
  
   
   
    
    void Dataadd(){
       
            try { 
                
                
             if(CheckEmptyData()==1){
                con.contest();
                String id=id_l.getText();
                String name=name_txt.getText();
                String phone=phone_txt.getText();
                String address=address_txt.getText();
                String detailse=details_txt.getText();
                String date=Date_Lav.getText();
                
                
                
                 String chek_id="SELECT `id`,`name` FROM `rmc_chemical_ltd`.`Suplier_information` WHERE `id`='"+id_l.getText()+"' OR `name`='"+name_txt.getText()+"'";
                 con.contest();
          con.st = con.ct.prepareCall(chek_id);
          con.rs = con.st.executeQuery(chek_id);
          if(con.rs.next()){
          JOptionPane.showMessageDialog(this, "This Name Already Submitted....\nPlease Change Name");
          }else{
                String insert="INSERT INTO `rmc_chemical_ltd`.`Suplier_information`(`id`,`name`,`address`,`phone`,`details`,`date`)VALUES ('"+id+"','"+name+"','"+address+"','"+phone+"','"+detailse+"','"+date+"') ";
                int   result=con.st.executeUpdate(insert);
                if(result>0){
                JOptionPane.showMessageDialog(this, "Data Add Success");
                    Clear_All_Data();
                    show_Id();
                    show_Data_ALL();
                }else{
                     JOptionPane.showMessageDialog(this, "Data Add Failed");
                }
                
                
                
               }}
            
            
            
            
            } catch (SQLException ex) {
                Logger.getLogger(Suplier_information_Add.class.getName()).log(Level.SEVERE, null, ex);
            }
             
    }
    void DataEdit(){
       
            try { 
                
                
             if(CheckEmptyData()==1){
                con.contest();
                String id=id_l.getText();
                String name=name_txt.getText();
                String phone=phone_txt.getText();
                String address=address_txt.getText();
                String details=details_txt.getText();
                String date=Date_Lav.getText();
                 String insert="  UPDATE `rmc_chemical_ltd`.`Suplier_information` SET  `address` = '"+address+"', `phone` = '"+phone+"',`details` = '"+details+"',`date` = '"+date+"' WHERE `id` = '"+id+"'  AND `name` = '"+name+"'";
                int   result=con.st.executeUpdate(insert);
                if(result>0){
                JOptionPane.showMessageDialog(this, "Data Edit Success");
                    Clear_All_Data();
                    show_Id();
                    show_Data_ALL();
                }else{
                     JOptionPane.showMessageDialog(this, "Data Edit Failed");
                }
                
                
                
               }
            
            
            
            
            } catch (SQLException ex) {
                Logger.getLogger(Suplier_information_Add.class.getName()).log(Level.SEVERE, null, ex);
            }
             
    }
      
    void DataDelete(){
       
            try { 
                
                
             if(CheckEmptyData()==1){
                con.contest();
                String id=id_l.getText();
                String name=name_txt.getText();
              
                
                String insert=" DELETE FROM `rmc_chemical_ltd`.`Suplier_information` WHERE `id` = '"+id+"' AND `name` = '"+name+"'";
                int   result=con.st.executeUpdate(insert);
                if(result>0){
                JOptionPane.showMessageDialog(this, "Data Delete Success");
                    Clear_All_Data();
                    show_Id();
                    show_Data_ALL();
                }else{
                     JOptionPane.showMessageDialog(this, "Data Delete Failed");
                }
                
                
                
               }
            
            
            
            
            } catch (SQLException ex) {
                Logger.getLogger(Suplier_information_Add.class.getName()).log(Level.SEVERE, null, ex);
            }
             
    }
    
    private void add_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_buttonActionPerformed
        Dataadd();
    }//GEN-LAST:event_add_buttonActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
     
        DefaultTableModel dt=(DefaultTableModel) jTable1.getModel();
        id_l.setText(dt.getValueAt(jTable1.getSelectedRow(), 0).toString());
         name_txt.setText(dt.getValueAt(jTable1.getSelectedRow(), 1).toString());
          address_txt.setText(dt.getValueAt(jTable1.getSelectedRow(), 2).toString());
           phone_txt.setText(dt.getValueAt(jTable1.getSelectedRow(), 3).toString()); 
        details_txt.setText(dt.getValueAt(jTable1.getSelectedRow(), 4).toString());
         
        name_txt.setEditable(false);
        
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void clear_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_buttonActionPerformed
        Clear_All_Data();
    }//GEN-LAST:event_clear_buttonActionPerformed

    private void show_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_buttonActionPerformed
     show_Data_ALL();
    }//GEN-LAST:event_show_buttonActionPerformed

    private void edit_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_buttonActionPerformed
        DataEdit();
    }//GEN-LAST:event_edit_buttonActionPerformed

    private void delete_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_buttonActionPerformed
        DataDelete();
    }//GEN-LAST:event_delete_buttonActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        show_Data_One();
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        sh();
    }//GEN-LAST:event_jCheckBox1ActionPerformed

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

        this.setExtendedState(Suplier_information_Add.ICONIFIED);
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel9MouseClicked
void sh(){
    //o0 and 1 diye korte hobe
if(jCheckBox1.isSelected()){
jLabel8.setVisible(false);
ammount_txt.setVisible(false); 

}else{
    jLabel8.setVisible(true);
ammount_txt.setVisible(true);

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
            java.util.logging.Logger.getLogger(Suplier_information_Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Suplier_information_Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Suplier_information_Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Suplier_information_Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Suplier_information_Add().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Date_Lav;
    private javax.swing.JButton add_button;
    private javax.swing.JTextField address_txt;
    private javax.swing.JTextField ammount_txt;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton clear_button;
    private javax.swing.JButton delete_button;
    private javax.swing.JTextField details_txt;
    private javax.swing.JButton edit_button;
    private javax.swing.JLabel id_l;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JTextField name_txt;
    private javax.swing.JTextField phone_txt;
    private javax.swing.JButton show_button;
    // End of variables declaration//GEN-END:variables

}
