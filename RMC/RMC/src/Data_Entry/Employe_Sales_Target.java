 
package Data_Entry;
 
import static Data_Entry.Con_ENg_Comission_Incentive.h;
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
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel; 

public class Employe_Sales_Target extends javax.swing.JFrame {
   
    connection_class con;
    static String h;
    public Employe_Sales_Target(String string) {
        initComponents();
        con=new connection_class();
        show_date();
        show_employe();
        show_Product();
        show_target();
        h=string;
    }

    public Employe_Sales_Target() {
  initComponents();  }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        employe_name_combo = new javax.swing.JComboBox<>();
        e_id_lebel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        e_mobile_lebel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        targate_quan_txt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        product_combo = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setLayout(null);

        jDateChooser1.setDateFormatString("yyyy-MM-dd");
        jDateChooser1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(jDateChooser1);
        jDateChooser1.setBounds(1180, 60, 180, 30);

        employe_name_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        employe_name_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employe_name_comboActionPerformed(evt);
            }
        });
        jPanel1.add(employe_name_combo);
        employe_name_combo.setBounds(70, 90, 220, 30);

        e_id_lebel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        e_id_lebel.setForeground(new java.awt.Color(255, 255, 255));
        e_id_lebel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(e_id_lebel);
        e_id_lebel.setBounds(300, 90, 100, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Employe Name");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(70, 70, 220, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Employe ID");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(300, 70, 100, 20);

        e_mobile_lebel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        e_mobile_lebel.setForeground(new java.awt.Color(255, 255, 255));
        e_mobile_lebel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(e_mobile_lebel);
        e_mobile_lebel.setBounds(410, 90, 170, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Targate Quantity");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(300, 130, 170, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Employe mobile Number");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(410, 70, 170, 20);
        jPanel1.add(targate_quan_txt);
        targate_quan_txt.setBounds(300, 150, 200, 30);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employe Name", "Employe ID", "Employe Number", "Product Name", "Targate Quantity"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(70, 190, 1200, 390);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Product Name");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(70, 130, 220, 20);

        product_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        jPanel1.add(product_combo);
        product_combo.setBounds(70, 150, 220, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(510, 150, 90, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("*Employe Sales Target Add ");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(10, 0, 320, 40);

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
        jPanel1.setBounds(0, 0, 1370, 680);
        setJMenuBar(menuBar);

        setSize(new java.awt.Dimension(1384, 742));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void show_date() {
        Date dt = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
  ((JTextField) jDateChooser1.getDateEditor().getUiComponent()).setText(""+df.format(dt));
 }
 
 
    void show_employe(){
       try {
           employe_name_combo.removeAllItems();
           employe_name_combo.addItem("Select");
           String s=" SELECT  `name` FROM `rmc_chemical_ltd`.`employe`";
           con.contest();
           con.st = con.ct.prepareCall(s);
           con.rs = con.st.executeQuery(s);
           while(con.rs.next()){
           employe_name_combo.addItem(""+con.rs.getString(1));
           
           }
       } catch (SQLException ex) {
           Logger.getLogger(Employe_Sales_Target.class.getName()).log(Level.SEVERE, null, ex);
       }
 
 }
 
  
 
    void show_Product(){
       try {
           product_combo.removeAllItems();
           product_combo.addItem("Select");
           String s="SELECT  `p_name` FROM `rmc_chemical_ltd`.`pro_information`";
           con.contest();
           con.st = con.ct.prepareCall(s);
           con.rs = con.st.executeQuery(s);
           while(con.rs.next()){
           product_combo.addItem(""+con.rs.getString(1));
           
           }
       } catch (SQLException ex) {
           Logger.getLogger(Employe_Sales_Target.class.getName()).log(Level.SEVERE, null, ex);
       }
 
 }
    private void employe_name_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employe_name_comboActionPerformed
       try {
         
           String s=" SELECT `id`,`phone`  FROM `rmc_chemical_ltd`.`employe` WHERE  `name`='"+employe_name_combo.getSelectedItem()+"'";
           con.contest();
           con.st = con.ct.prepareCall(s);
           con.rs = con.st.executeQuery(s);
           while(con.rs.next()){
       e_id_lebel.setText(""+con.rs.getString(1));
                 e_mobile_lebel.setText(""+con.rs.getString(2));
           }
       } catch (SQLException ex) {
           Logger.getLogger(Employe_Sales_Target.class.getName()).log(Level.SEVERE, null, ex);
       }
    }//GEN-LAST:event_employe_name_comboActionPerformed
int auth_test(){
    int a=0;
if(employe_name_combo.getSelectedIndex()<=0){
    JOptionPane.showMessageDialog(this, "Please Select Employe Name....");
    employe_name_combo.requestFocus(); 
}else if(e_id_lebel.getText().isEmpty()){
    JOptionPane.showMessageDialog(this, "Employe Id Is Empty....");
    e_id_lebel.requestFocus(); 
}else if(e_mobile_lebel.getText().isEmpty()){
    JOptionPane.showMessageDialog(this, "Employe Mobile Number  Is Empty....");
    e_mobile_lebel.requestFocus(); 
}else if(product_combo.getSelectedIndex()<=0){
    JOptionPane.showMessageDialog(this, "Please Select Product Name....");
    product_combo.requestFocus(); 
}else if(targate_quan_txt.getText().isEmpty()){
    JOptionPane.showMessageDialog(this, "Targete Quantity Is Empty....");
    targate_quan_txt.requestFocus(); 
}else{
a=1;

}



return a;}
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(auth_test()==1){
            try {  
                String employe=employe_name_combo.getSelectedItem().toString();
                String em_id=e_id_lebel.getText().toString();
                String em_mobile=e_mobile_lebel.getText().toString();
                String target=targate_quan_txt.getText().toString();
                String product=product_combo.getSelectedItem().toString();
                SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
                String date1 = sd.format(jDateChooser1.getDate()); 
                String s=" INSERT INTO `rmc_chemical_ltd`.`employe_sales_target` (`id`, `name`,`phone`,`targate_quanty`,`month`,`p_name`)VALUES ('"+em_id+"',  '"+employe+"', '"+em_mobile+"', '"+target+"', '"+date1+"','"+product+"')";
                 
                int   result=con.st.executeUpdate(s);                
                if(result>0){
                   show_target();
                    employe_name_combo.setSelectedIndex(0);
                    e_id_lebel.setText("");
                    e_mobile_lebel.setText("");
                    product_combo.setSelectedIndex(0);
                    targate_quan_txt.setText("");
                 }
                
                
                
                
            } catch (SQLException ex) {
                Logger.getLogger(Employe_Sales_Target.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        
        
        
        }
        
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
 void show_target(){
       try {
           
           
           DefaultTableModel dt=(DefaultTableModel) jTable1.getModel();
           dt.setRowCount(0);
           String s=" SELECT  `name`,`id`, `phone`,`p_name`, `targate_quanty`,`month` FROM `rmc_chemical_ltd`.`employe_sales_target`";
           con.contest();
           con.st = con.ct.prepareCall(s);
           con.rs = con.st.executeQuery(s);
           while(con.rs.next()){
               dt.addRow(new Object[]{con.rs.getString(1),con.rs.getString(2),con.rs.getString(3),con.rs.getString(4),con.rs.getString(5),con.rs.getDate(6)});
               
           }
           
           
           
       } catch (SQLException ex) {
           Logger.getLogger(Employe_Sales_Target.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(Employe_Sales_Target.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employe_Sales_Target.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employe_Sales_Target.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employe_Sales_Target.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Employe_Sales_Target().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel e_id_lebel;
    private javax.swing.JLabel e_mobile_lebel;
    private javax.swing.JComboBox<String> employe_name_combo;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
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
    private javax.swing.JComboBox<String> product_combo;
    private javax.swing.JTextField targate_quan_txt;
    // End of variables declaration//GEN-END:variables

}
