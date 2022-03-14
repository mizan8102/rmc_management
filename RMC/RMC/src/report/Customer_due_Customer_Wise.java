 
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
 import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
 

public class Customer_due_Customer_Wise extends javax.swing.JFrame {
   connection_class con,con2;
      String st="";
    static String h;
    public Customer_due_Customer_Wise(String string) {
        initComponents();
        con=new connection_class();
        con2=new connection_class();
        show_date();
        //old_data_show_table();
       
        show_customer();//
        h=string;
    }

    private Customer_due_Customer_Wise() {
   initComponents();}
    
    
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
           Logger.getLogger(Customer_due_Customer_Wise.class.getName()).log(Level.SEVERE, null, ex);
       }


}
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        date_lab = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        customer_combo = new javax.swing.JComboBox<>();
        mobile = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        month_nsme_lbl = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setLayout(null);

        date_lab.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        date_lab.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        date_lab.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                date_labPropertyChange(evt);
            }
        });
        jPanel1.add(date_lab);
        date_lab.setBounds(1180, 50, 180, 30);

        jDateChooser1.setDateFormatString("yyyy-MM-dd");
        jDateChooser1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jDateChooser1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser1PropertyChange(evt);
            }
        });
        jPanel1.add(jDateChooser1);
        jDateChooser1.setBounds(1180, 50, 180, 30);

        customer_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customer_comboActionPerformed(evt);
            }
        });
        jPanel1.add(customer_combo);
        customer_combo.setBounds(270, 60, 250, 30);

        mobile.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mobileKeyReleased(evt);
            }
        });
        jPanel1.add(mobile);
        mobile.setBounds(520, 60, 240, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("*Customer Due ( Customer Wise ) Report");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 0, 430, 40);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Customer Name", "Mobile", "Bill No", "Delivery Place", "Event", "Total LTR", "Before Due", "Total", "Final Amount", "Paid", "Due"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(40, 110, 1300, 390);

        month_nsme_lbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        month_nsme_lbl.setText("Month");
        jPanel1.add(month_nsme_lbl);
        month_nsme_lbl.setBounds(40, 60, 150, 30);

        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/printer (1).png"))); // NOI18N
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel24);
        jLabel24.setBounds(1240, 0, 40, 40);

        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/house.png"))); // NOI18N
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel23);
        jLabel23.setBounds(1190, 0, 50, 40);

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
        jPanel1.setBounds(0, 0, 1370, 730);
        setJMenuBar(menuBar);

        setSize(new java.awt.Dimension(1368, 744));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
public void show_date() {
        Date dt = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
  ((JTextField) jDateChooser1.getDateEditor().getUiComponent()).setText(""+df.format(dt));
  date_lab.setText(""+df.format(dt));
  date_lab.setVisible(false);
 }

 void Name_wise_Data_show(){
       try {
           double d=0,b=0;
           DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
           dt.setRowCount(0);
           
            String ss="SELECT  `phone` FROM `rmc_chemical_ltd`.`customer_info` WHERE `name`='"+customer_combo.getSelectedItem()+"'";  
            con.contest();
           con.st = con.ct.prepareCall(ss);
           con.rs = con.st.executeQuery(ss);
           if(con.rs.next()){
           mobile.setText(""+con.rs.getString(1));
            }
           
           String s="SELECT `date`,`bill`,`delivery_place`,`event`,`total_ltr`,`total_amount`,`final_amount`,`paid`,`customer` FROM `rmc_chemical_ltd`.`sales_account` WHERE `customer`='"+customer_combo.getSelectedItem()+"'";
           con.contest();
           con.st = con.ct.prepareCall(s);
           con.rs = con.st.executeQuery(s);
           while(con.rs.next()){
                b=Double.parseDouble(con.rs.getString(7))-Double.parseDouble(con.rs.getString(6));
               
               d=Double.parseDouble(con.rs.getString(7))-Double.parseDouble(con.rs.getString(8));
                d=Math.round(d*100.0)/100.0;
                 b=Math.round(b*100.0)/100.0;
                 
                 
              dt.addRow(new Object[]{con.rs.getDate(1),con.rs.getString(9),mobile.getText(),con.rs.getString(2),con.rs.getString(3),con.rs.getString(4),con.rs.getString(5),b,con.rs.getString(6),con.rs.getString(7),con.rs.getString(8),d});
           }  
           
           
           
        
           
       } catch (SQLException ex) {
           Logger.getLogger(Customer_due_Customer_Wise.class.getName()).log(Level.SEVERE, null, ex);
       }

}
 
 
 
 void Number_wise_Data_show(){
       try {
          
           
         String ss="SELECT  `name` FROM `rmc_chemical_ltd`.`customer_info`WHERE `phone`='"+mobile.getText()+"'";  
            con.contest();
           con.st = con.ct.prepareCall(ss);
           con.rs = con.st.executeQuery(ss);
           if(con.rs.next()){
           customer_combo.setSelectedItem(""+con.rs.getString(1));
           
           
           }
           
       } catch (SQLException ex) {
           Logger.getLogger(Customer_due_Customer_Wise.class.getName()).log(Level.SEVERE, null, ex);
       }

}
    private void jDateChooser1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser1PropertyChange
          if (!((JTextField) jDateChooser1.getDateEditor().getUiComponent()).getText().isEmpty()) {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");

        date_lab.setText(""+df.format(jDateChooser1.getDate()));}
    }//GEN-LAST:event_jDateChooser1PropertyChange
 
    private void customer_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customer_comboActionPerformed
     Name_wise_Data_show();
    }//GEN-LAST:event_customer_comboActionPerformed

    private void date_labPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_date_labPropertyChange
   if (!((JTextField) jDateChooser1.getDateEditor().getUiComponent()).getText().isEmpty()) {
            
             
           try {
           double d=0,b=0;
           DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
           dt.setRowCount(0);
             SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM");
           String date1 = sd.format(jDateChooser1.getDate());
           
           
             SimpleDateFormat sd1 = new SimpleDateFormat("MM");
           String date2 = sd1.format(jDateChooser1.getDate());
           
          if(date2.equals("01")){ 
          month_nsme_lbl.setText("January");
          }else if(date2.equals("02")){ 
          month_nsme_lbl.setText("February");
          }else if(date2.equals("03")){ 
          month_nsme_lbl.setText("March");
          }else if(date2.equals("04")){ 
          month_nsme_lbl.setText("April");
          }else if(date2.equals("05")){ 
          month_nsme_lbl.setText("May");
          }else if(date2.equals("06")){ 
          month_nsme_lbl.setText("June");
          }else if(date2.equals("07")){ 
          month_nsme_lbl.setText("July");
          }else if(date2.equals("08")){ 
          month_nsme_lbl.setText("August");
          }else if(date2.equals("09")){ 
          month_nsme_lbl.setText("September");
          }else if(date2.equals("10")){ 
          month_nsme_lbl.setText("October");
          }else if(date2.equals("11")){ 
          month_nsme_lbl.setText("November");
          }else if(date2.equals("12")){ 
          month_nsme_lbl.setText("December");
          }
           String s=" SELECT `date`,`bill`,`delivery_place`,`event`,`total_ltr`,`total_amount`,`final_amount`,`paid`,`customer`,`customer` FROM `rmc_chemical_ltd`.`sales_account` WHERE `customer`='"+customer_combo.getSelectedItem()+"' AND `date`LIKE'"+date1+"%'";
           con.contest();
           con.st = con.ct.prepareCall(s);
           con.rs = con.st.executeQuery(s);
           while(con.rs.next()){
                b=Double.parseDouble(con.rs.getString(7))-Double.parseDouble(con.rs.getString(6));
               
               d=Double.parseDouble(con.rs.getString(7))-Double.parseDouble(con.rs.getString(8));
                d=Math.round(d*100.0)/100.0;
                 b=Math.round(b*100.0)/100.0;
              dt.addRow(new Object[]{con.rs.getDate(1),con.rs.getString(9),con.rs.getString(2),con.rs.getString(3),con.rs.getString(4),con.rs.getString(5),b,con.rs.getString(6),con.rs.getString(7),con.rs.getString(8),d});
          
             
             
           }  
           
           
          
           
       } catch (SQLException ex) {
           Logger.getLogger(Customer_due_Customer_Wise.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
        
        
        
    }//GEN-LAST:event_date_labPropertyChange

    private void mobileKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mobileKeyReleased
        Number_wise_Data_show();
    }//GEN-LAST:event_mobileKeyReleased

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

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        demo ob=new demo(h);
        ob.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel23MouseClicked

    private void jLabel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseClicked

        this.setExtendedState(Customer_due_Customer_Wise.ICONIFIED);
    }//GEN-LAST:event_jLabel25MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel9MouseClicked
  
    
    
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Customer_due_Customer_Wise.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customer_due_Customer_Wise.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customer_due_Customer_Wise.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customer_due_Customer_Wise.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
         
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customer_due_Customer_Wise().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> customer_combo;
    private javax.swing.JLabel date_lab;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JTextField mobile;
    private javax.swing.JLabel month_nsme_lbl;
    // End of variables declaration//GEN-END:variables

}
