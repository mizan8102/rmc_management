 
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
 

public class Stock extends javax.swing.JFrame {
   connection_class con;
    static String h;
    public Stock(String string) {
        initComponents();
        con=new connection_class();
        show_date();
        show_stock();
        h=string;
    }

    private Stock() {
   initComponents(); }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
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
                "Product  Name", "Purchase Quantity ", "Sales Quantity", "Total"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(30, 102, 1310, 530);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("*Stock Report");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 0, 210, 40);

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(30, 60, 430, 40);

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

        setSize(new java.awt.Dimension(1368, 755));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        show_stock_search();
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jDateChooser1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser1PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooser1PropertyChange

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
 public void show_date() {
        Date dt = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
  ((JTextField) jDateChooser1.getDateEditor().getUiComponent()).setText(""+df.format(dt));
 }
 
 
 void show_stock(){ 
       try {
           double pu=0;
           double sa=0;
           
            DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
           dt.setRowCount(0);
           String s=" SELECT `stock`.`product_name`,`stock`.`pur`,`stock`.`sales` FROM`stock`";
           con.contest();
           con.st = con.ct.prepareCall(s);
           con.rs = con.st.executeQuery(s);
           while(con.rs.next()){
               try{
           pu=Double.parseDouble(con.rs.getString(2));
 
           sa=Double.parseDouble(con.rs.getString(3));
           sa=pu-sa;
             dt.addRow(new Object[]{con.rs.getString(1),con.rs.getString(2),con.rs.getString(3),sa});
          
               }catch(Exception e){
                   
                  pu=Double.parseDouble(con.rs.getString(2));
 
                 sa=0;
                sa=pu-sa;
             dt.addRow(new Object[]{con.rs.getString(1),con.rs.getString(2),con.rs.getString(3),sa});
           
                   
               }
           }
           
           
           
           
       } catch (SQLException ex) {
           Logger.getLogger(Stock.class.getName()).log(Level.SEVERE, null, ex);
       }
 
 
 
 } 
 void show_stock_search(){ 
       try {
           double pu=0;
           double sa=0;
           
            DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
           dt.setRowCount(0);
           String s=" SELECT `stock`.`product_name`,`stock`.`pur`,`stock`.`sales` FROM`stock` where  `stock`.`product_name`LIKE'"+jTextField1.getText()+"%'";
           con.contest();
           con.st = con.ct.prepareCall(s);
           con.rs = con.st.executeQuery(s);
           while(con.rs.next()){
               try{
           pu=Double.parseDouble(con.rs.getString(2));
 
           sa=Double.parseDouble(con.rs.getString(3));
           sa=pu-sa;
             dt.addRow(new Object[]{con.rs.getString(1),con.rs.getString(2),con.rs.getString(3),sa});
          
               }catch(Exception e){
                   
                  pu=Double.parseDouble(con.rs.getString(2));
 
                 sa=0;
                sa=pu-sa;
             dt.addRow(new Object[]{con.rs.getString(1),con.rs.getString(2),con.rs.getString(3),sa});
           
                   
               }
           } 
           
       } catch (SQLException ex) {
           Logger.getLogger(Stock.class.getName()).log(Level.SEVERE, null, ex);
       }
 
 
 
 } 
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Stock().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}
