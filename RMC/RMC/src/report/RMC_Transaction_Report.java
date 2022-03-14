 
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

public class RMC_Transaction_Report extends javax.swing.JFrame {
   connection_class con;
      String st=""; 
    static String h;
    public RMC_Transaction_Report(String string) {
        initComponents();
        con=new connection_class();
        show_date();
        h=string;
        //old_data_show_table();
       
//        show_employe();
    }

    private RMC_Transaction_Report() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
   
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        date_lab = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        due = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        paid = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ltr = new javax.swing.JLabel();
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

        date_lab.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        date_lab.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        date_lab.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                date_labPropertyChange(evt);
            }
        });
        jPanel1.add(date_lab);
        date_lab.setBounds(1170, 50, 180, 30);

        jDateChooser1.setDateFormatString("yyyy-MM-dd");
        jDateChooser1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jDateChooser1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser1PropertyChange(evt);
            }
        });
        jPanel1.add(jDateChooser1);
        jDateChooser1.setBounds(1170, 50, 180, 30);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Voucher No", "Total ltr", "Delivery Place", "Total", "Final amount", "Deposit Amount", "Due", "Deposit System"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(40, 120, 1300, 380);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("*RMC Transaction Report Yearly");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 0, 360, 40);

        due.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        due.setForeground(new java.awt.Color(255, 255, 255));
        due.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        due.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel1.add(due);
        due.setBounds(1020, 530, 320, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Total Amount   :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(1020, 500, 150, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Total Diposit   :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(700, 500, 150, 30);

        paid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        paid.setForeground(new java.awt.Color(255, 255, 255));
        paid.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        paid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel1.add(paid);
        paid.setBounds(700, 530, 320, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Total LTR   :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(380, 500, 150, 30);

        ltr.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ltr.setForeground(new java.awt.Color(255, 255, 255));
        ltr.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ltr.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel1.add(ltr);
        ltr.setBounds(380, 530, 320, 30);

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

        setSize(new java.awt.Dimension(1368, 731));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
public void show_date() {
        Date dt = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        ((JTextField) jDateChooser1.getDateEditor().getUiComponent()).setText(""+df.format(dt));
        date_lab.setText(""+df.format(dt));
        date_lab.setVisible(false);
 }

    void old_data_show_table(){
        try {
             due.setText("");
          paid.setText("");
           double d=0,p=0,l=0;
           DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
           dt.setRowCount(0);
           SimpleDateFormat sd = new SimpleDateFormat("yyyy");
                String date1 = sd.format(jDateChooser1.getDate());
           String s=" SELECT `rmc_transection`.`date`,`rmc_transection`.`bill`,`rmc_transection`.`total_ltr`,`rmc_transection`.`delivery_place`,`rmc_transection`.`total_amount`,`rmc_transection`.`final_amount`,`rmc_transection`.`paid`,`rmc_transection`.`event` FROM `rmc_transection` where `rmc_transection`.`date` LIKE'"+date1+"%'";
           con.contest();
           con.st = con.ct.prepareCall(s);
           con.rs = con.st.executeQuery(s);
           while(con.rs.next()){  
               
               l=l+Double.parseDouble(con.rs.getString(3));
              p=p+ Double.parseDouble(con.rs.getString(7));
               d=Double.parseDouble(con.rs.getString(6))-Double.parseDouble(con.rs.getString(7));
         
              p=Math.round(p*100.0)/100.0; 
             d=Math.round(d*100.0)/100.0;  
             l=Math.round(l*100.0)/100.0; 
         dt.addRow(new Object[]{con.rs.getDate(1),con.rs.getString(2),con.rs.getString(3),con.rs.getString(4),con.rs.getString(5),con.rs.getString(6),con.rs.getString(7),d,con.rs.getString(8)});
          
             
           }  
          
          due.setText(""+d);
          paid.setText(""+p);
             ltr.setText(""+l);
       } catch (SQLException ex) {
           Logger.getLogger(RMC_Transaction_Report.class.getName()).log(Level.SEVERE, null, ex);
       }
      
}
    
    
    private void jDateChooser1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser1PropertyChange
          if (!((JTextField) jDateChooser1.getDateEditor().getUiComponent()).getText().isEmpty()) {
            
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");

        date_lab.setText(""+df.format(jDateChooser1.getDate()));}
    }//GEN-LAST:event_jDateChooser1PropertyChange
 
    private void date_labPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_date_labPropertyChange
   if (!((JTextField) jDateChooser1.getDateEditor().getUiComponent()).getText().isEmpty()) {
            
               old_data_show_table();
   }
        
    }//GEN-LAST:event_date_labPropertyChange

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

        this.setExtendedState(Product_buying.ICONIFIED);
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
            java.util.logging.Logger.getLogger(RMC_Transaction_Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RMC_Transaction_Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RMC_Transaction_Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RMC_Transaction_Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new RMC_Transaction_Report().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel date_lab;
    private javax.swing.JLabel due;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel ltr;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JLabel paid;
    // End of variables declaration//GEN-END:variables

}
