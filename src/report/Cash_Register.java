 
package report;
  
import Main_PAck.connection_class;  
import Main_PAck.demo;
import Main_PAck.demo_user1;
import java.awt.Font;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;  
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel; 

public class Cash_Register extends javax.swing.JFrame {
   connection_class con;
    static String h;
    public Cash_Register(String string) {
        initComponents(); 
        show_date();
        con=new connection_class(); 
        jRadioButton1.setVisible(false);
        jRadioButton2.setVisible(false);
        jRadioButton3.setVisible(false);
     
        jTable1.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD,12)); 
       h=string;
 
    }

    private Cash_Register() {
   initComponents();  }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        month_nsme_lbl = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
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
        jDateChooser1.setBounds(1170, 40, 190, 30);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Voucher No", "Sales Details", "Ammount"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 100, 1340, 490);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(1080, 590, 260, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("*Cash Register Report (Cash & Sales Wise)");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 0, 390, 40);

        month_nsme_lbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        month_nsme_lbl.setText("Month");
        jPanel1.add(month_nsme_lbl);
        month_nsme_lbl.setBounds(20, 44, 150, 30);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jRadioButton1.setText("Cash");
        jPanel1.add(jRadioButton1);
        jRadioButton1.setBounds(200, 50, 70, 31);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jRadioButton2.setText("Bank");
        jPanel1.add(jRadioButton2);
        jRadioButton2.setBounds(270, 50, 80, 31);

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jRadioButton3.setText("Bkash");
        jPanel1.add(jRadioButton3);
        jRadioButton3.setBounds(350, 50, 90, 31);

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
        jPanel1.setBounds(0, 0, 1370, 740);
        setJMenuBar(menuBar);

        setSize(new java.awt.Dimension(1368, 746));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 public void show_date() {
        Date dt = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
  ((JTextField) jDateChooser1.getDateEditor().getUiComponent()).setText(""+df.format(dt));
 }
    private void jDateChooser1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser1PropertyChange
     if (!((JTextField) jDateChooser1.getDateEditor().getUiComponent()).getText().isEmpty()) {
            
       
        try {
           double  d=0;
           String ss="";
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
           String s=" SELECT  `date`,`details`,`status`,`amount`FROM `rmc_chemical_ltd`.`cash` WHERE `date`LIKE '"+date1+"%' AND `details`LIKE 'Sales%'";
           con.contest();
           con.st = con.ct.prepareCall(s);
           con.rs = con.st.executeQuery(s);
           while(con.rs.next()){
               ss=con.rs.getString(2);
               String a[]=ss.split("-");
               ss=a[1];
               String ss1=con.rs.getString(3)+" - "+con.rs.getString(2);
              d=Double.parseDouble(con.rs.getString(4))+d;
              
            dt.addRow(new Object[]{con.rs.getDate(1),ss,ss1,con.rs.getString(4)});
            } 
           jLabel1.setText(""+d);
           
       } catch (SQLException ex) {
           Logger.getLogger(Cash_Register.class.getName()).log(Level.SEVERE, null, ex);
       }
       
       
       
       
        }
        
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

        this.setExtendedState(Cash_Register.ICONIFIED);
    }//GEN-LAST:event_jLabel25MouseClicked

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
            java.util.logging.Logger.getLogger(Cash_Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cash_Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cash_Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cash_Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Cash_Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JLabel month_nsme_lbl;
    // End of variables declaration//GEN-END:variables

}
