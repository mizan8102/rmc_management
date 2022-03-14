 
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

public class Bkash_Amount extends javax.swing.JFrame {
   connection_class con;
    String e="";
    static String h;
   public  Bkash_Amount(String string) {
        initComponents();
        con=new connection_class();
        show_date();
        Data_SHow_All();
        h=string;
    }

    private Bkash_Amount() {
  initComponents();  }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        ammount_txt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        detailse_txt = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Name_txt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        bkash_txt = new javax.swing.JTextField();
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

        jDateChooser1.setDateFormatString("yyyy-MM-dd");
        jDateChooser1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(jDateChooser1);
        jDateChooser1.setBounds(1180, 40, 180, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Amount :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 110, 60, 30);

        ammount_txt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(ammount_txt);
        ammount_txt.setBounds(80, 110, 220, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Details   :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(310, 110, 60, 30);

        detailse_txt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(detailse_txt);
        detailse_txt.setBounds(370, 110, 220, 30);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioButton1.setText("Credit");
        jPanel1.add(jRadioButton1);
        jRadioButton1.setBounds(610, 80, 70, 30);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioButton2.setText("Debit");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton2);
        jRadioButton2.setBounds(680, 80, 60, 30);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Event", "Name", "Bkash Number", "Details", "Amount"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 175, 1330, 370);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(750, 80, 140, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("*Bkash");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 0, 210, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Name      :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 70, 60, 30);

        Name_txt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(Name_txt);
        Name_txt.setBounds(80, 70, 220, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Bkash Number   :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(310, 70, 100, 30);

        bkash_txt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(bkash_txt);
        bkash_txt.setBounds(410, 70, 180, 30);

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
        jPanel1.setBounds(0, 0, 1370, 740);
        setJMenuBar(menuBar);

        setSize(new java.awt.Dimension(1368, 743));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 public void show_date() {
        Date dt = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
  ((JTextField) jDateChooser1.getDateEditor().getUiComponent()).setText(""+df.format(dt));
 }
     
    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    int Check_Text(){
      e="";
        int i=0; 
        if(jRadioButton1.isSelected()){
            e="Credit";
        }else if(jRadioButton2.isSelected()){
            e="Debit";
        }else{
        e="";
        }
        
        if(Name_txt.getText().isEmpty()){
        JOptionPane.showMessageDialog(this, "Ammount is Empty");
        Name_txt.requestFocus();
    }else  if(bkash_txt.getText().isEmpty()){
        JOptionPane.showMessageDialog(this, "Details is Empty");
        bkash_txt.requestFocus();
    }else if(ammount_txt.getText().isEmpty()){
        JOptionPane.showMessageDialog(this, "Ammount is Empty");
        ammount_txt.requestFocus();
    }else  if(detailse_txt.getText().isEmpty()){
        JOptionPane.showMessageDialog(this, "Details is Empty");
        detailse_txt.requestFocus();
    }else if(e.equals("")){
     JOptionPane.showMessageDialog(this, "Please Select  Credit Or Debit"); 
      }else{
    i=1;
    
    } 
    return i;} 
    
    void Data_Clear(){
    ammount_txt.setText("");
    detailse_txt.setText("");
     Name_txt.setText("");
    bkash_txt.setText("");
    buttonGroup1.clearSelection();
    DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
    dt.setRowCount(0);
    show_date();
        Data_SHow_All();
    
    }
    
     void Data_SHow_All(){
       try {
           DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
           dt.setRowCount(0);
           String select="SELECT`date`,`name`,`mobile`,`details`,`status`,`amount`FROM `rmc_chemical_ltd`.`bkash`";
           con.contest();
           con.st = con.ct.prepareCall(select);
           con.rs = con.st.executeQuery(select);
           while (con.rs.next()) {
               
            dt.addRow(new Object[]{con.rs.getDate(1),con.rs.getString(2),con.rs.getString(3),con.rs.getString(4),con.rs.getString(5),con.rs.getString(6)});
  }
       } catch (SQLException ex) {
           Logger.getLogger(Bkash_Amount.class.getName()).log(Level.SEVERE, null, ex);
       }
      
     }
    
    void Submit_Data(){
    if(Check_Text()==1){
        try {
             if(e.equals("Credit")){ 
            e="Debit";
            }else if(e.equals("Debit")){ 
            e="Credit";
            }
            String name=Name_txt.getText().toString();
            String bkas=bkash_txt.getText().toString();
             String ammount=ammount_txt.getText().toString();
            String details=detailse_txt.getText().toString();
            SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
            String date1 = sd.format(jDateChooser1.getDate());
            String insert="INSERT INTO `rmc_chemical_ltd`.`bkash` (`name`,`mobile`,`details`,`status`,`amount`,`date`)VALUES ('"+name+"','"+bkas+"','"+details+"','"+e+"','"+ammount+"','"+date1+"')";
            
            
            con.contest();
            int result = con.st.executeUpdate(insert);
            if (result > 0) {
             Submit_Data_CASH();
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Bkash_Amount.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
    
    }
    
    
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Submit_Data();
    }//GEN-LAST:event_jButton1ActionPerformed

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

        this.setExtendedState(Bkash_Amount.ICONIFIED);
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel9MouseClicked
 void Submit_Data_CASH(){
   
        try { 
           if(e.equals("Credit")){ 
            e="Debit";
            }else if(e.equals("Debit")){ 
            e="Credit";
            }
           
            
            String details="Bkash | "+Name_txt.getText().toString()+" | "+bkash_txt.getText().toString()+" | "+detailse_txt.getText().toString();
            String ammount=ammount_txt.getText().toString();
             SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
            String date1 = sd.format(jDateChooser1.getDate());
            String insert="INSERT INTO `rmc_chemical_ltd`.`cash`(`date`,`amount`,`status`,`details`)VALUES ('"+date1+"','"+ammount+"','"+e+"','"+details+"')";
            
            
            con.contest();
            int result = con.st.executeUpdate(insert);
            if (result > 0) {
            JOptionPane.showMessageDialog(this, "Submission Successful..!!!");
              Data_Clear();  
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Cash_Ammount.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(Bkash_Amount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bkash_Amount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bkash_Amount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bkash_Amount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Bkash_Amount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Name_txt;
    private javax.swing.JTextField ammount_txt;
    private javax.swing.JTextField bkash_txt;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField detailse_txt;
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
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}
