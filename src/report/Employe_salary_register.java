 
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
 

public class Employe_salary_register extends javax.swing.JFrame {
   connection_class con;
   String st="";
 static String h;
    public Employe_salary_register(String string) {
        initComponents();
        con=new connection_class();
        show_date();
        //old_data_show_table(); 
        show_employe();
        //
        h=string;
    }

    private Employe_salary_register() {
  initComponents();  }
     
    void show_employe(){
       try {
           
           employe_combo.removeAllItems();
           employe_combo.addItem("Select");
           String s=" SELECT `name`  FROM `rmc_chemical_ltd`.`employe` ORDER BY `name` ASC";
           con.st = con.ct.prepareCall(s);
           con.rs = con.st.executeQuery(s);
           while (con.rs.next()) {   
           employe_combo.addItem(""+con.rs.getString(1)); 
           }
       } catch (SQLException ex) {
           Logger.getLogger(Employe_salary_register.class.getName()).log(Level.SEVERE, null, ex);
       }


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
        employe_combo = new javax.swing.JComboBox<>();
        mobile = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        position_txt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        salary_lbl = new javax.swing.JLabel();
        lebel_lebel = new javax.swing.JLabel();
        sal_comm_lbl = new javax.swing.JLabel();
        working_cost = new javax.swing.JLabel();
        total_lbl = new javax.swing.JLabel();
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
                "Pay Date", "Details", "Salary Amount", "Sales Commission", "Working Expenses"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(40, 100, 1300, 470);

        employe_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employe_comboActionPerformed(evt);
            }
        });
        jPanel1.add(employe_combo);
        employe_combo.setBounds(40, 60, 250, 30);

        mobile.setEditable(false);
        jPanel1.add(mobile);
        mobile.setBounds(740, 60, 240, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("*Employe Salary Register Report");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 0, 360, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText(" Mobile");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(740, 40, 240, 20);

        position_txt.setEditable(false);
        jPanel1.add(position_txt);
        position_txt.setBounds(300, 60, 430, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Name");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 40, 240, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Position");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(300, 40, 240, 20);

        salary_lbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        salary_lbl.setForeground(new java.awt.Color(255, 255, 255));
        salary_lbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        salary_lbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(salary_lbl);
        salary_lbl.setBounds(360, 570, 320, 30);

        lebel_lebel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lebel_lebel.setForeground(new java.awt.Color(255, 255, 255));
        lebel_lebel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lebel_lebel.setText("Total    :");
        jPanel1.add(lebel_lebel);
        lebel_lebel.setBounds(900, 610, 90, 30);

        sal_comm_lbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        sal_comm_lbl.setForeground(new java.awt.Color(255, 255, 255));
        sal_comm_lbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        sal_comm_lbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(sal_comm_lbl);
        sal_comm_lbl.setBounds(680, 570, 320, 30);

        working_cost.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        working_cost.setForeground(new java.awt.Color(255, 255, 255));
        working_cost.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        working_cost.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(working_cost);
        working_cost.setBounds(1000, 570, 330, 30);

        total_lbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        total_lbl.setForeground(new java.awt.Color(255, 255, 255));
        total_lbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        total_lbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.add(total_lbl);
        total_lbl.setBounds(1000, 610, 330, 30);

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
  date_lab.setText(""+df.format(dt));
  date_lab.setVisible(false);
 }

    
    void old_data_show_table(){
       try {
           double d=0,to=0;
           double sal=0,sal2=0;
           double sal_comm=0,sal_comm2=0;
           double workin_expenses=0,workin_expenses2=0;
           DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
           dt.setRowCount(0);
           String s=" SELECT `number`,`position`,`datee`,`type`, `ammount`,`details` FROM `rmc_chemical_ltd`.`employe_salary` WHERE `name`='"+employe_combo.getSelectedItem()+"' ";
           con.contest();
           con.st = con.ct.prepareCall(s);
           con.rs = con.st.executeQuery(s);
           while(con.rs.next()){
               mobile.setText(""+con.rs.getString(1));
               position_txt.setText(""+con.rs.getString(2));
               if(con.rs.getString(4).equals("Salary")){
               sal=Double.parseDouble(con.rs.getString(5));
               sal2=sal+sal2;
               sal_comm=0;
               workin_expenses=0;
               }else if(con.rs.getString(4).equals("Sales Commission")){
                sal_comm=Double.parseDouble(con.rs.getString(5));
                sal_comm2=sal_comm+sal_comm2;
                
                workin_expenses=0;
                sal=0;
               }else if(con.rs.getString(4).equals("Working Expenses")){
                workin_expenses=Double.parseDouble(con.rs.getString(5));
                workin_expenses2=workin_expenses+workin_expenses2;
                sal_comm=0;
                sal=0;
               }
               dt.addRow(new Object[]{con.rs.getDate(3),con.rs.getString(6),sal,sal_comm,workin_expenses,con.rs.getString(4)});
          
           }  
           sal2=Math.round(sal2*100.0)/100.0;
           workin_expenses2=Math.round(workin_expenses2*100.0)/100.0;
           sal_comm2=Math.round(sal_comm2*100.0)/100.0;
         salary_lbl.setText(""+sal2);
         sal_comm_lbl.setText(""+sal_comm2);
         working_cost.setText(""+workin_expenses2);
        to=sal2+sal_comm2+workin_expenses2;
        total_lbl.setText(""+to);
       } catch (SQLException ex) {
           Logger.getLogger(Employe_salary_register.class.getName()).log(Level.SEVERE, null, ex);
       }

}
    
    private void jDateChooser1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser1PropertyChange
        if (!((JTextField) jDateChooser1.getDateEditor().getUiComponent()).getText().isEmpty()) {
          DateFormat df = new SimpleDateFormat("yyyy-MM-dd");

        date_lab.setText(""+df.format(jDateChooser1.getDate()));}
    }//GEN-LAST:event_jDateChooser1PropertyChange
 
    private void employe_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employe_comboActionPerformed
     old_data_show_table();
        
    }//GEN-LAST:event_employe_comboActionPerformed

    private void date_labPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_date_labPropertyChange
   if (!((JTextField) jDateChooser1.getDateEditor().getUiComponent()).getText().isEmpty()) {
            
             
            try {
                
                SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM");
           String date1 = sd.format(jDateChooser1.getDate());
           double d=0,to=0;
           double sal=0,sal2=0;
           double sal_comm=0,sal_comm2=0;
           double workin_expenses=0,workin_expenses2=0;
           DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
           dt.setRowCount(0);
           String s=" SELECT `number`,`position`,`datee`,`type`, `ammount`,`details` FROM `rmc_chemical_ltd`.`employe_salary` WHERE `name`='"+employe_combo.getSelectedItem()+"' AND `datee` LIKE'"+date1+"%' ";
           con.contest();
           con.st = con.ct.prepareCall(s);
           con.rs = con.st.executeQuery(s);
           while(con.rs.next()){
               mobile.setText(""+con.rs.getString(1));
               position_txt.setText(""+con.rs.getString(2));
               if(con.rs.getString(4).equals("Salary")){
               sal=Double.parseDouble(con.rs.getString(5));
               sal2=sal+sal2;
               sal_comm=0;
               workin_expenses=0;
               }else if(con.rs.getString(4).equals("Sales Commission")){
                sal_comm=Double.parseDouble(con.rs.getString(5));
                sal_comm2=sal_comm+sal_comm2;
                
                workin_expenses=0;
                sal=0;
               }else if(con.rs.getString(4).equals("Working Expenses")){
                workin_expenses=Double.parseDouble(con.rs.getString(5));
                workin_expenses2=workin_expenses+workin_expenses2;
                sal_comm=0;
                sal=0;
               }
               dt.addRow(new Object[]{con.rs.getDate(3),con.rs.getString(6),sal,sal_comm,workin_expenses,con.rs.getString(4)});
          
           }  
           sal2=Math.round(sal2*100.0)/100.0;
           workin_expenses2=Math.round(workin_expenses2*100.0)/100.0;
           sal_comm2=Math.round(sal_comm2*100.0)/100.0;
         salary_lbl.setText(""+sal2);
         sal_comm_lbl.setText(""+sal_comm2);
         working_cost.setText(""+workin_expenses2);
        to=sal2+sal_comm2+workin_expenses2;
        total_lbl.setText(""+to);
       } catch (SQLException ex) {
           Logger.getLogger(Employe_salary_register.class.getName()).log(Level.SEVERE, null, ex);
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

        this.setExtendedState(Employe_salary_register.ICONIFIED);
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
            java.util.logging.Logger.getLogger(Employe_salary_register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employe_salary_register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employe_salary_register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employe_salary_register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Employe_salary_register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel date_lab;
    private javax.swing.JComboBox<String> employe_combo;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lebel_lebel;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JTextField mobile;
    private javax.swing.JTextField position_txt;
    private javax.swing.JLabel sal_comm_lbl;
    private javax.swing.JLabel salary_lbl;
    private javax.swing.JLabel total_lbl;
    private javax.swing.JLabel working_cost;
    // End of variables declaration//GEN-END:variables

}
