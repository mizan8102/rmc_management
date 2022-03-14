 
package report;
 
import Main_PAck.connection_class; 
import Main_PAck.demo;
import Main_PAck.demo_user1;
 
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
 

public class Con_ENg_Comission_IncentiveShow extends javax.swing.JFrame {
   connection_class con;
    static String h;
    public Con_ENg_Comission_IncentiveShow(String string) {
        initComponents();
        con=new connection_class();
        show_date();
        Data_SHow_All();
        h=string;
      //  Employe_name_show();
    }

    private Con_ENg_Comission_IncentiveShow() {
  initComponents(); }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        degignation_combo = new javax.swing.JComboBox<>();
        mobile_txt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        con_eng_namecombo = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        month_nsme_lbl = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
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

        jDateChooser1.setDateFormatString("yyyy-MM-dd");
        jDateChooser1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jDateChooser1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser1PropertyChange(evt);
            }
        });
        jPanel1.add(jDateChooser1);
        jDateChooser1.setBounds(1190, 50, 180, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Mobile  :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(370, 80, 140, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Designation  :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 80, 140, 20);

        degignation_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Contructor", "Engineer", "Other's" }));
        degignation_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                degignation_comboActionPerformed(evt);
            }
        });
        jPanel1.add(degignation_combo);
        degignation_combo.setBounds(20, 100, 170, 30);

        mobile_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mobile_txtKeyReleased(evt);
            }
        });
        jPanel1.add(mobile_txt);
        mobile_txt.setBounds(370, 100, 140, 30);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Designation", "Name", "Mobile", "Profession", "Catagory", "Details", "Amount"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 202, 1330, 360);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("*Con/Eng Comission Incentive report");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(10, 0, 360, 40);

        con_eng_namecombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        con_eng_namecombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                con_eng_namecomboActionPerformed(evt);
            }
        });
        jPanel1.add(con_eng_namecombo);
        con_eng_namecombo.setBounds(190, 100, 170, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Name  :");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(190, 80, 140, 20);

        month_nsme_lbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        month_nsme_lbl.setText("Month");
        jPanel1.add(month_nsme_lbl);
        month_nsme_lbl.setBounds(20, 170, 150, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel3);
        jLabel3.setBounds(1090, 560, 260, 40);

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

        setSize(new java.awt.Dimension(1368, 735));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 public void show_date() {
        Date dt = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
  ((JTextField) jDateChooser1.getDateEditor().getUiComponent()).setText(""+df.format(dt));
 }
 int auth_test(){
   int a=0;
    if (degignation_combo.getSelectedIndex()<=0) {
        JOptionPane.showMessageDialog(this, "Select Designation ...");
        degignation_combo.requestFocus();
      }else if (con_eng_namecombo.getSelectedIndex()<=0) {
        JOptionPane.showMessageDialog(this, "Select Name ...");
        degignation_combo.requestFocus();
      }else if (mobile_txt.getText().isEmpty()) { 
           JOptionPane.showMessageDialog(this, "Mobile Number is Empty...");
            mobile_txt.requestFocus();
    } else{
    a=1; 
    } 
return a;}
    private void degignation_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_degignation_comboActionPerformed
  Employe_name_show();
    //Employe_details_show();
 
    }//GEN-LAST:event_degignation_comboActionPerformed

    private void con_eng_namecomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_con_eng_namecomboActionPerformed
   
        Employe_details_show();
    
    }//GEN-LAST:event_con_eng_namecomboActionPerformed

    private void mobile_txtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mobile_txtKeyReleased
       
    }//GEN-LAST:event_mobile_txtKeyReleased

    private void jDateChooser1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser1PropertyChange
   if (!((JTextField) jDateChooser1.getDateEditor().getUiComponent()).getText().isEmpty()) {
            
               Data_SHow_date();}
    }//GEN-LAST:event_jDateChooser1PropertyChange

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

        this.setExtendedState(Con_ENg_Comission_IncentiveShow.ICONIFIED);
    }//GEN-LAST:event_jLabel25MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel9MouseClicked
  
   void DataClear(){
    degignation_combo.setSelectedIndex(0);
    mobile_txt.setText("");
    
    show_date();
   // show_id();
    Data_SHow_All();
     
      }
   
   
    void Data_SHow_All(){
       try {
           double to=0;
           DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
           dt.setRowCount(0);
           String select=" SELECT  `date`,`designation`,`name`,`mobile`,`professon`,`catagory`,`details`,`amount`FROM `rmc_chemical_ltd`.`comisin_incentive_con_eng`";
           con.contest();
           con.st = con.ct.prepareCall(select);
           con.rs = con.st.executeQuery(select);
           while (con.rs.next()) {
            
            dt.addRow(new Object[]{con.rs.getDate(1),con.rs.getString(2),con.rs.getString(3),con.rs.getString(4),con.rs.getString(5),con.rs.getString(6),con.rs.getString(7),con.rs.getString(8)});
                  to=Double.parseDouble(con.rs.getString(8))+to;
              
              } to=Math.round(to*100.0)/100.0; 
              
              jLabel3.setText(""+to);
       } catch (SQLException ex) {
           Logger.getLogger(Cash_Ammount.class.getName()).log(Level.SEVERE, null, ex);
       }
      
     }
   void Data_SHow_date(){
       try { 
           double to=0;
           
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
           if(degignation_combo.getSelectedIndex()>0 && con_eng_namecombo.getSelectedIndex()>0&& !mobile_txt.getText().isEmpty())
            {
                to=0;
              String select=" SELECT  `date`,`designation`,`name`,`mobile`,`professon`,`catagory`,`details`,`amount`FROM `rmc_chemical_ltd`.`comisin_incentive_con_eng` WHERE `date`LIKE'"+date1+"%' AND `designation`='"+degignation_combo.getSelectedItem()+"' AND`name`='"+con_eng_namecombo.getSelectedItem()+"'";
           con.contest();
           con.st = con.ct.prepareCall(select);
           con.rs = con.st.executeQuery(select);
           while (con.rs.next()) {
               
            dt.addRow(new Object[]{con.rs.getDate(1),con.rs.getString(2),con.rs.getString(3),con.rs.getString(4),con.rs.getString(5),con.rs.getString(6),con.rs.getString(7),con.rs.getString(8)});
to=Double.parseDouble(con.rs.getString(8))+to;
              
              } to=Math.round(to*100.0)/100.0; 
              
              jLabel3.setText(""+to);    
                
           }else{ 
               to=0;
           String select=" SELECT  `date`,`designation`,`name`,`mobile`,`professon`,`catagory`,`details`,`amount`FROM `rmc_chemical_ltd`.`comisin_incentive_con_eng` WHERE `date`LIKE'"+date1+"%'";
           con.contest();
           con.st = con.ct.prepareCall(select);
           con.rs = con.st.executeQuery(select);
           while (con.rs.next()) {
               
            dt.addRow(new Object[]{con.rs.getDate(1),con.rs.getString(2),con.rs.getString(3),con.rs.getString(4),con.rs.getString(5),con.rs.getString(6),con.rs.getString(7),con.rs.getString(8)});

             to=Double.parseDouble(con.rs.getString(8))+to;
              
              } to=Math.round(to*100.0)/100.0; 
              
              jLabel3.setText(""+to);}
       } catch (SQLException ex) {
           Logger.getLogger(Cash_Ammount.class.getName()).log(Level.SEVERE, null, ex);
       }
      
     }
   void Data_SHow(){
       try {
           double to=0;
           DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
           dt.setRowCount(0);
           
           
           
           String select=" SELECT  `date`,`designation`,`name`,`mobile`,`professon`,`catagory`,`details`,`amount`FROM `rmc_chemical_ltd`.`comisin_incentive_con_eng` where `designation`='"+degignation_combo.getSelectedItem()+"'AND`name`='"+con_eng_namecombo.getSelectedItem()+"'AND`mobile`='"+mobile_txt.getText()+"'";
           con.contest();
           con.st = con.ct.prepareCall(select);
           con.rs = con.st.executeQuery(select);
           while (con.rs.next()) {
               
            dt.addRow(new Object[]{con.rs.getDate(1),con.rs.getString(2),con.rs.getString(3),con.rs.getString(4),con.rs.getString(5),con.rs.getString(6),con.rs.getString(7),con.rs.getString(8)});

             to=Double.parseDouble(con.rs.getString(8))+to;
              
              } to=Math.round(to*100.0)/100.0; 
              
              jLabel3.setText(""+to);
       } catch (SQLException ex) {
           Logger.getLogger(Cash_Ammount.class.getName()).log(Level.SEVERE, null, ex);
       }
      
     }
   
     void Employe_name_show(){
       try {
           
           con_eng_namecombo.removeAllItems();
           con_eng_namecombo.addItem("Select");
           String select=" SELECT `name` FROM `rmc_chemical_ltd`.`contructor_engineeer` WHERE `designation` ='"+degignation_combo.getSelectedItem()+"' ORDER BY `name` ASC";
           con.contest();
           con.st = con.ct.prepareCall(select);
           con.rs = con.st.executeQuery(select);
           while (con.rs.next()) {
               con_eng_namecombo.addItem(""+con.rs.getString(1));
        
              }
       } catch (SQLException ex) {
           Logger.getLogger(Cash_Ammount.class.getName()).log(Level.SEVERE, null, ex);
       }
      
     }
     
     
      void Employe_details_show(){
       try { 
       
           mobile_txt.setText("");
           String select=" SELECT `phone`FROM `rmc_chemical_ltd`.`contructor_engineeer` WHERE `designation` ='"+degignation_combo.getSelectedItem()+"' AND `name`='"+con_eng_namecombo.getSelectedItem()+"'";
           con.contest();
           con.st = con.ct.prepareCall(select);
           con.rs = con.st.executeQuery(select);
           while (con.rs.next()) {
             mobile_txt.setText(""+con.rs.getString(1));
              
              }
           
           
           Data_SHow();
           
           
           
       } catch (SQLException ex) {
           Logger.getLogger(Cash_Ammount.class.getName()).log(Level.SEVERE, null, ex);
       }
      
     }
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Con_ENg_Comission_IncentiveShow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Con_ENg_Comission_IncentiveShow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Con_ENg_Comission_IncentiveShow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Con_ENg_Comission_IncentiveShow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Con_ENg_Comission_IncentiveShow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> con_eng_namecombo;
    private javax.swing.JComboBox<String> degignation_combo;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JTextField mobile_txt;
    private javax.swing.JLabel month_nsme_lbl;
    // End of variables declaration//GEN-END:variables

}
