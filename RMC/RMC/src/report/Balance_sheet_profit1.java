package report;  
import Main_PAck.connection_class; 
import Main_PAck.demo_user1;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;  
import javax.swing.JTextField; 
public class Balance_sheet_profit1 extends javax.swing.JFrame {
connection_class con;
String e="";
SimpleDateFormat sf;
static String h;
public  Balance_sheet_profit1(String string) {
    initComponents();
        con=new connection_class();
        show_date();
        h=string;
       // show_test();
        
    }  
private Balance_sheet_profit1() {
  initComponents();  } 
void show_test(){
       try {
           Sales_pro_text.setText("0");
            Salse_text.setText("0"); 
           
                   Purchase_txt.setText("0");  
           
           double total;
           long cr=0,de=0,salse=0,purc=0;
            String mm="";
             SimpleDateFormat Month=new SimpleDateFormat("MM");
              SimpleDateFormat year=new SimpleDateFormat("yyyy"); 
              if(jRadioButton1.isSelected()){
             sf=new SimpleDateFormat("yyyy-MM");
             
              String m=Month.format(jDateChooser1.getDate());
               String y=year.format(jDateChooser1.getDate());
               switch (m) {
                   case "01":
                       mm="January";
                       break;
                   case "02":
                       mm="February";
                       break;
                   case "03":
                       mm="March";
                       break;
                   case "04":
                       mm="April";
                       break;
                   case "05":
                       mm="May";
                       break;
                   case "06":
                       mm="June";
                       break;
                   case "07":
                       mm="July";
                       break;
                   case "08":
                       mm="August";
                       break; 
                   case "09":
                       mm="September";
                       break;
                   case "10":
                       mm="October";
                       break;
                   case "11":
                       mm="November";
                       break;
                   case "12":
                       mm="December";
                       break;
                   default:
                       break;
               }
              
              jLabel1.setText("Balance Sheet "+mm+", "+y);
              
         }else  if(jRadioButton2.isSelected()){ 
              String y=year.format(jDateChooser1.getDate());
              sf=new SimpleDateFormat("yyyy");
                jLabel1.setText("Balance Sheet "+y);
         }
           String s="SELECT `sales_profit_final`.`date`,`sales_profit_final`.`p_price`,`sales_profit_final`.`s_price`,`sales_profit_final`.`profit` FROM `sales_profit_final` WHERE `sales_profit_final`.`date` LIKE '%"+sf.format(jDateChooser1.getDate())+"%' ";
           con.contest();
           con.st = con.ct.prepareCall(s);
           con.rs = con.st.executeQuery(s);
           while(con.rs.next()){
           salse=salse+Long.parseLong(con.rs.getString(3));
           cr=Long.parseLong(con.rs.getString(4))+cr; 
           Sales_pro_text.setText(""+cr);  
           Salse_text.setText(""+salse);  
           }  String Cost="SELECT  SUM(`amount`)FROM `rmc_chemical_ltd`.`cash` WHERE `details`  LIKE 'Cost%' AND `date`LIKE '%"+sf.format(jDateChooser1.getDate())+"%' ";
           con.contest(); 
           con.st = con.ct.prepareCall(Cost);
           con.rs = con.st.executeQuery(Cost);
           if(con.rs.next()){
               try{
           Utiliti_cost_txt.setText(""+con.rs.getString(1));
             de=Long.parseLong(con.rs.getString(1));
               
               }
               catch(Exception n){
              Utiliti_cost_txt.setText("0");
             de=0;
             }
           }
           
            String Comission="SELECT  SUM(`amount`) FROM `rmc_chemical_ltd`.`cash` WHERE `details`  LIKE 'Comission%' AND `date`LIKE '%"+sf.format(jDateChooser1.getDate())+"%' ";
           con.contest();
           con.st = con.ct.prepareCall(Comission);
           con.rs = con.st.executeQuery(Comission);
           if(con.rs.next()){
               try{
           Comission_txt.setText(""+con.rs.getString(1));
            de=Long.parseLong(con.rs.getString(1))+de;
            }
               catch(Exception n){
               Comission_txt.setText("0");
            de=0+de;
             }
           }
            String Employe="SELECT  SUM(`amount`) FROM `rmc_chemical_ltd`.`cash` WHERE `details`  LIKE 'Employe%' AND `date`LIKE '%"+sf.format(jDateChooser1.getDate())+"%' ";
           con.contest();
           con.st = con.ct.prepareCall(Employe);
           con.rs = con.st.executeQuery(Employe);
           if(con.rs.next()){
               try{
           Employe_txt.setText(""+con.rs.getString(1));
           de=Long.parseLong(con.rs.getString(1))+de;
               } catch(Exception n){
              Employe_txt.setText("0");
            de=0+de;
             }
           }
          
            String Expenditure="SELECT  SUM(`amount`) FROM `rmc_chemical_ltd`.`cash` WHERE `details`  LIKE 'Expenditure%' AND `date`LIKE '%"+sf.format(jDateChooser1.getDate())+"%' ";
           con.contest();
           con.st = con.ct.prepareCall(Expenditure);
           con.rs = con.st.executeQuery(Expenditure);
           if(con.rs.next()){
          try{ Expenditure_txt.setText(""+con.rs.getString(1));
              
           de=Long.parseLong(con.rs.getString(1))+de;
              
           } catch(Exception n){
              Expenditure_txt.setText("0");
            de=0+de;
             }
           }
           
           String Purchase="SELECT `total_pur_amount`.`date`,(`total_pur_amount`.`amount`-`total_pur_amount`.`dis`) AS `pur` FROM `total_pur_amount` WHERE  `date` LIKE '%"+sf.format(jDateChooser1.getDate())+"%' ";
           con.contest();
           con.st = con.ct.prepareCall(Purchase);
           con.rs = con.st.executeQuery(Purchase);
           while(con.rs.next()){
          
             purc=Long.parseLong(con.rs.getString(2))+purc;
           de=Long.parseLong(con.rs.getString(2))+de;
         Purchase_txt.setText(""+purc);  
           
           }
           /*
          String BAnk="SELECT SUM(`amount`) FROM `bank_data` WHERE `details`LIKE'Purchase%'  AND `date`LIKE '%"+sf.format(jDateChooser1.getDate())+"%' ";
           con.contest();
           con.st = con.ct.prepareCall(BAnk);
           con.rs = con.st.executeQuery(BAnk);
           if(con.rs.next()){ 
           bank_l.setText(""+con.rs.getString(1));
           de=Double.parseDouble(con.rs.getString(1))+de;
           }
           String Bkash="SELECT  `amount`FROM `rmc_chemical_ltd`.`bkash` WHERE `details` LIKE'Purchase%' AND `date`LIKE '%"+sf.format(jDateChooser1.getDate())+"%' ";
           con.contest();
           con.st = con.ct.prepareCall(Bkash);
           con.rs = con.st.executeQuery(Bkash);
           if(con.rs.next()){
           bkash_l.setText(""+con.rs.getString(1));
           de=Double.parseDouble(con.rs.getString(1))+de;
           }*/
          Total_Expences_txt.setText(""+de);
           Profit_txt.setText(""+cr);
           Expences_txt.setText(""+de);
           cr=cr-de;
           Final_Profit_txt.setText(""+cr);
           
           
           
       } catch (SQLException ex) {
           Logger.getLogger(Balance_sheet_profit1.class.getName()).log(Level.SEVERE, null, ex);
       }
    
   } 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Salse_text = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        Sales_pro_text = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        Comission_txt = new javax.swing.JTextField();
        Utiliti_cost_txt = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        Expenditure_txt = new javax.swing.JTextField();
        Employe_txt = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        Total_Expences_txt = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        Expences_txt = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        Profit_txt = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        Final_Profit_txt = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        Purchase_txt = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jDateChooser1.setDateFormatString("yyyy-MM-dd");
        jDateChooser1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jDateChooser1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser1PropertyChange(evt);
            }
        });
        jPanel1.add(jDateChooser1);
        jDateChooser1.setBounds(1180, 0, 180, 30);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton1.setText("Month");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton1);
        jRadioButton1.setBounds(1230, 90, 110, 25);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton2.setText("Year");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton2);
        jRadioButton2.setBounds(1230, 120, 110, 25);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Balance Sheet");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(100, 10, 1160, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("________________________________________________________________");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(110, 30, 1140, 30);

        Salse_text.setEditable(false);
        Salse_text.setBackground(new java.awt.Color(255, 255, 255));
        Salse_text.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Salse_text.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Salse_text.setText("0");
        jPanel1.add(Salse_text);
        Salse_text.setBounds(420, 120, 750, 30);

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(255, 255, 255));
        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jTextField2.setText("INCOME");
        jPanel1.add(jTextField2);
        jTextField2.setBounds(200, 80, 970, 40);

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(255, 255, 255));
        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField3.setText("Sales");
        jPanel1.add(jTextField3);
        jTextField3.setBounds(200, 120, 230, 30);

        jTextField4.setEditable(false);
        jTextField4.setBackground(new java.awt.Color(255, 255, 255));
        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField4.setText("Profite");
        jPanel1.add(jTextField4);
        jTextField4.setBounds(200, 150, 220, 30);

        Sales_pro_text.setEditable(false);
        Sales_pro_text.setBackground(new java.awt.Color(255, 255, 255));
        Sales_pro_text.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Sales_pro_text.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Sales_pro_text.setText("0");
        Sales_pro_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sales_pro_textActionPerformed(evt);
            }
        });
        jPanel1.add(Sales_pro_text);
        Sales_pro_text.setBounds(410, 150, 760, 30);

        jTextField6.setEditable(false);
        jTextField6.setBackground(new java.awt.Color(255, 255, 255));
        jTextField6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField6.setText("Comission & Incentitive");
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField6);
        jTextField6.setBounds(200, 300, 240, 30);

        jTextField7.setEditable(false);
        jTextField7.setBackground(new java.awt.Color(255, 255, 255));
        jTextField7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField7.setText("Utility Cost");
        jPanel1.add(jTextField7);
        jTextField7.setBounds(200, 270, 240, 30);

        Comission_txt.setEditable(false);
        Comission_txt.setBackground(new java.awt.Color(255, 255, 255));
        Comission_txt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Comission_txt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Comission_txt.setText("0");
        Comission_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Comission_txtActionPerformed(evt);
            }
        });
        jPanel1.add(Comission_txt);
        Comission_txt.setBounds(420, 300, 750, 30);

        Utiliti_cost_txt.setEditable(false);
        Utiliti_cost_txt.setBackground(new java.awt.Color(255, 255, 255));
        Utiliti_cost_txt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Utiliti_cost_txt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Utiliti_cost_txt.setText("0");
        jPanel1.add(Utiliti_cost_txt);
        Utiliti_cost_txt.setBounds(420, 270, 750, 30);

        jTextField10.setEditable(false);
        jTextField10.setBackground(new java.awt.Color(255, 255, 255));
        jTextField10.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jTextField10.setText("Expences");
        jPanel1.add(jTextField10);
        jTextField10.setBounds(200, 200, 970, 40);

        jTextField11.setEditable(false);
        jTextField11.setBackground(new java.awt.Color(255, 255, 255));
        jTextField11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField11.setText("Expenditure");
        jPanel1.add(jTextField11);
        jTextField11.setBounds(200, 360, 240, 30);

        jTextField12.setEditable(false);
        jTextField12.setBackground(new java.awt.Color(255, 255, 255));
        jTextField12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField12.setText("Employe");
        jPanel1.add(jTextField12);
        jTextField12.setBounds(200, 330, 240, 30);

        Expenditure_txt.setEditable(false);
        Expenditure_txt.setBackground(new java.awt.Color(255, 255, 255));
        Expenditure_txt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Expenditure_txt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Expenditure_txt.setText("0");
        jPanel1.add(Expenditure_txt);
        Expenditure_txt.setBounds(420, 360, 750, 30);

        Employe_txt.setEditable(false);
        Employe_txt.setBackground(new java.awt.Color(255, 255, 255));
        Employe_txt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Employe_txt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Employe_txt.setText("0");
        jPanel1.add(Employe_txt);
        Employe_txt.setBounds(420, 330, 750, 30);

        jTextField15.setEditable(false);
        jTextField15.setBackground(new java.awt.Color(255, 255, 255));
        jTextField15.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jTextField15.setText("Total");
        jPanel1.add(jTextField15);
        jTextField15.setBounds(200, 390, 240, 40);

        Total_Expences_txt.setEditable(false);
        Total_Expences_txt.setBackground(new java.awt.Color(255, 255, 255));
        Total_Expences_txt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Total_Expences_txt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Total_Expences_txt.setText("0");
        Total_Expences_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Total_Expences_txtActionPerformed(evt);
            }
        });
        jPanel1.add(Total_Expences_txt);
        Total_Expences_txt.setBounds(420, 390, 750, 40);

        jTextField17.setEditable(false);
        jTextField17.setBackground(new java.awt.Color(255, 255, 255));
        jTextField17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField17.setText("Expences");
        jPanel1.add(jTextField17);
        jTextField17.setBounds(200, 500, 240, 40);

        Expences_txt.setEditable(false);
        Expences_txt.setBackground(new java.awt.Color(255, 255, 255));
        Expences_txt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Expences_txt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Expences_txt.setText("0");
        jPanel1.add(Expences_txt);
        Expences_txt.setBounds(420, 500, 750, 40);

        jTextField19.setEditable(false);
        jTextField19.setBackground(new java.awt.Color(255, 255, 255));
        jTextField19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField19.setText("Profite");
        jPanel1.add(jTextField19);
        jTextField19.setBounds(200, 460, 240, 40);

        Profit_txt.setEditable(false);
        Profit_txt.setBackground(new java.awt.Color(255, 255, 255));
        Profit_txt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Profit_txt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Profit_txt.setText("0");
        jPanel1.add(Profit_txt);
        Profit_txt.setBounds(420, 460, 750, 40);

        jTextField21.setEditable(false);
        jTextField21.setBackground(new java.awt.Color(255, 255, 255));
        jTextField21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField21.setText("Net Income");
        jPanel1.add(jTextField21);
        jTextField21.setBounds(200, 540, 240, 40);

        Final_Profit_txt.setEditable(false);
        Final_Profit_txt.setBackground(new java.awt.Color(255, 255, 255));
        Final_Profit_txt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Final_Profit_txt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Final_Profit_txt.setText("0");
        Final_Profit_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Final_Profit_txtActionPerformed(evt);
            }
        });
        jPanel1.add(Final_Profit_txt);
        Final_Profit_txt.setBounds(420, 540, 750, 40);

        jTextField16.setEditable(false);
        jTextField16.setBackground(new java.awt.Color(255, 255, 255));
        jTextField16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField16.setText("Purchase");
        jPanel1.add(jTextField16);
        jTextField16.setBounds(200, 240, 240, 30);

        Purchase_txt.setEditable(false);
        Purchase_txt.setBackground(new java.awt.Color(255, 255, 255));
        Purchase_txt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Purchase_txt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Purchase_txt.setText("0");
        jPanel1.add(Purchase_txt);
        Purchase_txt.setBounds(420, 240, 750, 30);

        jButton5.setBackground(new java.awt.Color(102, 51, 0));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Home");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(1200, 40, 160, 40);

        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.add(jLabel3);
        jLabel3.setBounds(150, 70, 1040, 590);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1370, 700);
        setJMenuBar(menuBar);

        setSize(new java.awt.Dimension(1384, 742));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 public void show_date() {
        Date dt = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
  ((JTextField) jDateChooser1.getDateEditor().getUiComponent()).setText(""+df.format(dt));
 } 
    private void jDateChooser1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser1PropertyChange
    //   show_test();
    }//GEN-LAST:event_jDateChooser1PropertyChange

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
     show_test();
         
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        show_test();
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void Sales_pro_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sales_pro_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Sales_pro_textActionPerformed

    private void Comission_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Comission_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Comission_txtActionPerformed

    private void Total_Expences_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Total_Expences_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Total_Expences_txtActionPerformed

    private void Final_Profit_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Final_Profit_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Final_Profit_txtActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
Main_PAck.demo_user1 on=new demo_user1(h);
     on.setVisible(true);
     dispose();        
    }//GEN-LAST:event_jButton5ActionPerformed
 
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Balance_sheet_profit1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Balance_sheet_profit1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Balance_sheet_profit1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Balance_sheet_profit1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Balance_sheet_profit1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Comission_txt;
    private javax.swing.JTextField Employe_txt;
    private javax.swing.JTextField Expences_txt;
    private javax.swing.JTextField Expenditure_txt;
    private javax.swing.JTextField Final_Profit_txt;
    private javax.swing.JTextField Profit_txt;
    private javax.swing.JTextField Purchase_txt;
    private javax.swing.JTextField Sales_pro_text;
    private javax.swing.JTextField Salse_text;
    private javax.swing.JTextField Total_Expences_txt;
    private javax.swing.JTextField Utiliti_cost_txt;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton5;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}
