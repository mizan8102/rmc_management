 
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
 

public class Customer_due extends javax.swing.JFrame {
   connection_class con;
      String st="";
    static String h;
    public Customer_due(String string) {
        initComponents();
        con=new connection_class();
        show_date();
        
         old_data_show_table();
       h=string;
    }

    private Customer_due() {
   initComponents(); 
    
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
        month_nsme_lbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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
        date_lab.setBounds(1180, 40, 180, 30);

        jDateChooser1.setDateFormatString("yyyy-MM-dd");
        jDateChooser1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jDateChooser1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser1PropertyChange(evt);
            }
        });
        jPanel1.add(jDateChooser1);
        jDateChooser1.setBounds(1180, 40, 180, 30);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Customer Name", "Bill No", "Delivery Place", "Event", "Total LTR", "Before Due", "Total", "Final Amount", "Paid", "Due"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(40, 100, 1300, 400);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("*Customer Due");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 0, 210, 40);

        month_nsme_lbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        month_nsme_lbl.setText("Month");
        jPanel1.add(month_nsme_lbl);
        month_nsme_lbl.setBounds(40, 60, 150, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(1080, 500, 260, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Total Paid : ");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(820, 500, 260, 40);

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
        jPanel1.setBounds(0, 0, 1370, 680);
        setJMenuBar(menuBar);

        setSize(new java.awt.Dimension(1384, 742));
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
           double d=0;
           DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
           dt.setRowCount(0);
           String s=" SELECT `date`,`bill`,`delivery_place`,`event`,`total_ltr`,`total_amount`,`final_amount`,`paid`,`customer`,`customer` FROM `rmc_chemical_ltd`.`sales_account` ";
           con.contest();
           con.st = con.ct.prepareCall(s);
           con.rs = con.st.executeQuery(s);
           while(con.rs.next()){
               
               d=Double.parseDouble(con.rs.getString(7))-Double.parseDouble(con.rs.getString(8));
                d=Math.round(d*100.0)/100.0;
             dt.addRow(new Object[]{con.rs.getDate(1),con.rs.getString(9),con.rs.getString(2),con.rs.getString(3),con.rs.getString(4),con.rs.getString(5),con.rs.getString(6),con.rs.getString(7),con.rs.getString(8),d});
          
             
           }  
           
           
           
         
           
       } catch (SQLException ex) {
           Logger.getLogger(Customer_due.class.getName()).log(Level.SEVERE, null, ex);
       }

}
    private void jDateChooser1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser1PropertyChange
           if (!((JTextField) jDateChooser1.getDateEditor().getUiComponent()).getText().isEmpty()) {
       DateFormat df = new SimpleDateFormat("yyyy-MM-dd");

        date_lab.setText(""+df.format(jDateChooser1.getDate()));}
    }//GEN-LAST:event_jDateChooser1PropertyChange
 
    private void date_labPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_date_labPropertyChange
         if (!((JTextField) jDateChooser1.getDateEditor().getUiComponent()).getText().isEmpty()) {
            
       
           try {
           double d=0,b=0,t_pad=0;
            jLabel1.setText("");
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
           String s=" SELECT `date`,`bill`,`delivery_place`,`event`,`total_ltr`,`total_amount`,`final_amount`,`paid`,`customer`,`customer` FROM `rmc_chemical_ltd`.`sales_account`WHERE   `date`LIKE'"+date1+"%'";
           con.contest();
           con.st = con.ct.prepareCall(s);
           con.rs = con.st.executeQuery(s);
           while(con.rs.next()){
               b=Double.parseDouble(con.rs.getString(7))-Double.parseDouble(con.rs.getString(6)); 
               d=Double.parseDouble(con.rs.getString(7))-Double.parseDouble(con.rs.getString(8));
                d=Math.round(d*100.0)/100.0;
                 b=Math.round(b*100.0)/100.0;
                 t_pad=Double.parseDouble(con.rs.getString(8))+t_pad;
                 t_pad=Math.round(t_pad*100.0)/100.0;
              dt.addRow(new Object[]{con.rs.getDate(1),con.rs.getString(9),con.rs.getString(2),con.rs.getString(3),con.rs.getString(4),con.rs.getString(5),b,con.rs.getString(6),con.rs.getString(7),con.rs.getString(8),d});
            } jLabel1.setText(""+t_pad);
           
           
          
           
       } catch (SQLException ex) {
           Logger.getLogger(Customer_due.class.getName()).log(Level.SEVERE, null, ex);
       }
        
         }
        
        
    }//GEN-LAST:event_date_labPropertyChange

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

        this.setExtendedState(Customer_due.ICONIFIED);
    }//GEN-LAST:event_jLabel25MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel9MouseClicked
  
    
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customer_due().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel date_lab;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel month_nsme_lbl;
    // End of variables declaration//GEN-END:variables

}
