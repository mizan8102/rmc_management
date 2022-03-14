 
package report;
 
 
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


public class Sales_report_Bill_product_ extends javax.swing.JFrame {
   connection_class con;
   double lt=0;
    static String h;
    public Sales_report_Bill_product_(String string) {
        initComponents();
        con=new connection_class();
        show_date(); 
        //
       h=string;
        show_customer();
        
    }

    private Sales_report_Bill_product_() {
   initComponents();  }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        voucher_combo = new javax.swing.JComboBox<>();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        date_lab = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        customer_combo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Customer Name  :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 50, 140, 20);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Voucher No  :");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(200, 50, 170, 20);

        voucher_combo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        voucher_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        voucher_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voucher_comboActionPerformed(evt);
            }
        });
        jPanel1.add(voucher_combo);
        voucher_combo.setBounds(200, 70, 170, 30);

        jDateChooser1.setDateFormatString("yyyy-MM-dd");
        jDateChooser1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jDateChooser1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser1PropertyChange(evt);
            }
        });
        jPanel1.add(jDateChooser1);
        jDateChooser1.setBounds(1180, 40, 180, 30);

        date_lab.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        date_lab.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(date_lab);
        date_lab.setBounds(1180, 40, 170, 30);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Product ID", "Product Name", "Purchase Price", "Sales Price", "Quantity", "Total Price"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 112, 1330, 370);

        customer_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customer_comboActionPerformed(evt);
            }
        });
        jPanel1.add(customer_combo);
        customer_combo.setBounds(20, 70, 170, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("*Bill Wise Sales Product Report");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 0, 370, 40);

        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/house.png"))); // NOI18N
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel23);
        jLabel23.setBounds(1190, 0, 50, 40);

        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/printer (1).png"))); // NOI18N
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel24);
        jLabel24.setBounds(1240, 0, 40, 40);

        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/iconfinder_1054931_zoom out_minimize_reduce_icon_32px.png"))); // NOI18N
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel25MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel25);
        jLabel25.setBounds(1280, 0, 40, 40);

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

        setSize(new java.awt.Dimension(1368, 754));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
public void show_date() {
        Date dt = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
  ((JTextField) jDateChooser1.getDateEditor().getUiComponent()).setText(""+df.format(dt));
  date_lab.setText(""+df.format(dt));
 }

void find_all_Emplye(){
        try {
             
            voucher_combo.removeAllItems();
            voucher_combo.addItem("Select");
            con.contest();
            String select="  SELECT `bill` FROM `rmc_chemical_ltd`.`sales` WHERE `customerName`='"+customer_combo.getSelectedItem()+"'GROUP BY  `bill`  ORDER BY `bill` DESC";
            con.st = con.ct.prepareCall(select);
            con.rs = con.st.executeQuery(select);
            while(con.rs.next()){ 
           voucher_combo.addItem(""+con.rs.getString(1));
           
            }
        } catch (SQLException ex) {
            Logger.getLogger(Sales_report_Bill_product_.class.getName()).log(Level.SEVERE, null, ex);
        }

} 
   
    
     
     void Show_Today_Data(){
      
         try {
             
             if(voucher_combo.getSelectedIndex()>0){
           double total=0;
           String bill=(String) voucher_combo.getSelectedItem();
                String customer=customer_combo.getSelectedItem().toString();
           DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
           dt.setRowCount(0);
           SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
           String date1 = sd.format(jDateChooser1.getDate());
           String select="SELECT `date`, `p_id`,`p_name`, `p_price`,`s_price`,`quantity`, `total` FROM `rmc_chemical_ltd`.`sales`WHERE `bill`='"+bill+"' AND `customerName`='"+customer+"'";
           con.contest();
           con.st = con.ct.prepareCall(select);
           con.rs = con.st.executeQuery(select);
           while (con.rs.next()) {
            dt.addRow(new Object[]{con.rs.getDate(1),con.rs.getString(2),con.rs.getString(3),con.rs.getString(4),con.rs.getString(5),con.rs.getString(6),con.rs.getString(7)});
           total=Double.parseDouble(con.rs.getString(7))+total;
            }
          total=Math.round(total*100.0)/100.0;
             }
       } catch (SQLException ex) {
           Logger.getLogger(Sales_report_Bill_product_.class.getName()).log(Level.SEVERE, null, ex);
       }

}   
     
    private void voucher_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voucher_comboActionPerformed
Show_Today_Data();
    }//GEN-LAST:event_voucher_comboActionPerformed

 
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
           Logger.getLogger(Sales_report_Bill_product_.class.getName()).log(Level.SEVERE, null, ex);
       }


} 
int Check_Text(){
    int a=0;
      if(customer_combo.getSelectedIndex()<=0){
    JOptionPane.showMessageDialog(this, "Customer Name IS Empty....");
    customer_combo.requestFocus(); 
    }else if(voucher_combo.getSelectedIndex()<=0){
    JOptionPane.showMessageDialog(this, "Employe Name IS Empty....");
    voucher_combo.requestFocus(); 
    }  else if (((JTextField) jDateChooser1.getDateEditor().getUiComponent()).getText().isEmpty()) {
          JOptionPane.showMessageDialog(this, "Date Is Empty");
            jDateChooser1.requestFocus();
        } else {
        a=1;
        
    }
    
    
    
return a;}

  void clearDatafor_com(){

               
                jDateChooser1.setVisible(true);  
                customer_combo.setEditable(true);
                voucher_combo.setEditable(true);
                 
                customer_combo.setSelectedIndex(0);
                voucher_combo.setSelectedIndex(0);
                 
                show_date();
               
                DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
                dt.setRowCount(0);
  
  
  
  }
  

 
  
  void clear_in_data(){
        
             
                jDateChooser1.setVisible(false);
                customer_combo.setEditable(false);
                voucher_combo.setEditable(false);
               
              
}
  
    private void jDateChooser1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser1PropertyChange
   if (!((JTextField) jDateChooser1.getDateEditor().getUiComponent()).getText().isEmpty()) {
            
               DateFormat df = new SimpleDateFormat("yyyy-MM-dd");

        date_lab.setText(""+df.format(jDateChooser1.getDate()));}
    }//GEN-LAST:event_jDateChooser1PropertyChange

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel dt=(DefaultTableModel) jTable1.getModel();
        /*id_no.setText(dt.getValueAt(jTable1.getSelectedRow(), 1).toString());
        product_name_combo.setSelectedItem(dt.getValueAt(jTable1.getSelectedRow(), 2).toString());
        product_price_txt.setText(dt.getValueAt(jTable1.getSelectedRow(), 3).toString());
        salse_price_txt.setText(dt.getValueAt(jTable1.getSelectedRow(), 4).toString());
        quantity_txt.setText(dt.getValueAt(jTable1.getSelectedRow(), 5).toString());
        total_txt.setText(dt.getValueAt(jTable1.getSelectedRow(), 6).toString());*/
    }//GEN-LAST:event_jTable1MouseClicked

    private void customer_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customer_comboActionPerformed
find_all_Emplye();
    }//GEN-LAST:event_customer_comboActionPerformed

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        demo ob=new demo(h);
        ob.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel23MouseClicked

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
        /*  MessageFormat header=new MessageFormat("Hello");
        MessageFormat footer=new MessageFormat("Hello2");

        try {
            jTable1.print(JTable.PrintMode.NORMAL,header,footer);
        } catch (PrinterException ex) {

            JOptionPane.showMessageDialog(this,"Failde");

        }
        */
    }//GEN-LAST:event_jLabel24MouseClicked

    private void jLabel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseClicked

        this.setExtendedState(Sales_report_Bill_product_.ICONIFIED);
    }//GEN-LAST:event_jLabel25MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel9MouseClicked
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sales_report_Bill_product_().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> customer_combo;
    private javax.swing.JLabel date_lab;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JComboBox<String> voucher_combo;
    // End of variables declaration//GEN-END:variables

}
